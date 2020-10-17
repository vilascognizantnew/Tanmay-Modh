package com.cts.MLEU.BookRestFulServices.Exceptions;

public class BookNotFoundException extends RuntimeException {
	
	public BookNotFoundException(Long id) {
		super("Book id Not Found: "+id);
	}

}
