package com.santana.socialnetwork.server.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.santana.socialnetwork.model.Post;

@Repository
public interface PostRepository extends CrudRepository<Post, Long> {
	
	Page<Post> findByEmail(String email);
}
