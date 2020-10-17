package com.cts.MLEU.BookRestFulServices.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cts.MLEU.BookRestFulServices.Model.Book;

public interface BookRepository extends JpaRepository<Book, Long>{

}
