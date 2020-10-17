package com.cts.MLEU.BookRestFulServices.Controller;

import java.util.Map;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.cts.MLEU.BookRestFulServices.Exceptions.BookNotFoundException;
import com.cts.MLEU.BookRestFulServices.Exceptions.BookUnSupportedFieldPatchException;
import com.cts.MLEU.BookRestFulServices.Model.Book;
import com.cts.MLEU.BookRestFulServices.Repository.BookRepository;

@RestController
public class BookController {

	@Autowired
	private BookRepository bookRepository;

	@GetMapping("/books")
	public ResponseEntity<Object> findAll() {
		return new ResponseEntity<>(bookRepository.findAll(), HttpStatus.OK);
	}

	@ResponseStatus(HttpStatus.CREATED)
	@PostMapping("/books")
	public Book newBook(@RequestBody Book newBook) {
		return bookRepository.save(newBook);
	}

	@GetMapping("/books/{id}")
	public ResponseEntity<Object> findOne(@PathVariable Long id) {
		Optional<Book> book = bookRepository.findById(id);
		if (!book.isPresent())
			throw new BookNotFoundException(id);
		else {
			bookRepository.findById(id);
			return new ResponseEntity<>(book, HttpStatus.OK);
		}
		
	}

	@PutMapping("/books/{id}")
	public Book updateBook(@RequestBody Book newBook, @PathVariable Long id) {

		return bookRepository.findById(id).map(x -> {
			x.setName(newBook.getName());
			x.setAuthor(newBook.getAuthor());
			x.setPrice(newBook.getPrice());
			return bookRepository.save(x);
		}).orElseGet(() -> {
			newBook.setId(id);
			return bookRepository.save(newBook);
		});
	}

	@PatchMapping("/books/{id}")
	public Book patch(@RequestBody Map<String, String> update, @PathVariable("id") Long id) {

		return bookRepository.findById(id).map(x -> {
			String author = update.get("author");
			if (!author.isEmpty()) {
				x.setAuthor(author);
				return bookRepository.save(x);
			} else {
				throw new BookUnSupportedFieldPatchException(update.keySet());
			}
		}).orElseGet(() -> {
			throw new BookNotFoundException(id);
		});
	}

	@DeleteMapping("/books/{id}")
	public ResponseEntity<Object> deleteBook(@PathVariable("id") Long id) {
		Optional<Book> book = bookRepository.findById(id);
		if (!book.isPresent())
			throw new BookNotFoundException(id);
		else {
			bookRepository.deleteById(id);
			return new ResponseEntity<>("Deleted Successfully", HttpStatus.OK);
		}

	}
}
