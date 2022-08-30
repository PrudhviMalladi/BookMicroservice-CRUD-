package com.Project3.Book.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Project3.Book.model.Book;

@Repository
public interface BookRepo extends JpaRepository<Book, Integer > {

}
