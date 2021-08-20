package io.github.julianjupiter.springbootjpamanytoone.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import io.github.julianjupiter.springbootjpamanytoone.domain.Book;

public interface BookRepository extends JpaRepository<Book, Long> {
    Iterable<Book> findByCategoryName(String category);
}
