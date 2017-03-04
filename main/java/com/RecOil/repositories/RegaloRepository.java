package com.RecOil.repositories;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.RecOil.clases.Regalo;

public interface RegaloRepository extends MongoRepository<Regalo, String> {

	public Regalo findBy_id(String _id);

	public List<Regalo> findByProducto(String producto);

	public List<Regalo> findByPuntos(int puntos);

}