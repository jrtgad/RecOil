package com.RecOil.repositories;

import java.io.Serializable;
import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.RecOil.clases.Promocion;

public interface PromocionRepository extends
MongoRepository<Promocion, Serializable> {
	public Promocion findBy_id(String _id);

	public Promocion findByEmpresa(String empresa);

	public List<Promocion> findByDescuento(int descuento);
}