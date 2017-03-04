package com.RecOil.repositories;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.RecOil.clases.User;

public interface UserRepository extends MongoRepository<User, String> {

	public User findBy_id(String _id);

	public List<User> findByAutorizado(Boolean autorizado);

	public List<User> findByActivo(Boolean autorizado);

}
