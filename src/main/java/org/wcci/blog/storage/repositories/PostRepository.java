package org.wcci.blog.storage.repositories;

import org.springframework.data.repository.CrudRepository;
import org.wcci.blog.entities.Post;


public interface PostRepository extends CrudRepository<Post, Long>{


}
