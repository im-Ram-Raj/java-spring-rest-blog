package com.pluralsight.blog.data;

import com.pluralsight.blog.model.Author;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

@Component
public interface AuthorRepository extends JpaRepository<Author, Long>{
	
	public List<Author> findByLastname(String lastname);
}