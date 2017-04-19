package com.RecOil.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.RecOil.clases.Promocion;
import com.RecOil.repositories.PromocionRepository;

public class PromocionController {
	@Autowired
	PromocionRepository promocionRepository;

	@RequestMapping("/obtenerPromociones")
	public List<Promocion> obtenerPromociones() {
		return promocionRepository.findAll();
	}

	@RequestMapping("/comprobarPromocion")
	public Promocion comprobarRegalo(
			@RequestParam(value = "_id", required = true) final String _id,
			final Model model) {
		model.addAttribute("_id", _id);

		return promocionRepository.findBy_id(_id);
	}

	@RequestMapping("/addRegalo")
	public void addRegalo(
			@RequestParam(value = "empresa", required = true) final String empresa,
			@RequestParam(value = "descuento", required = true) final int descuento) {
		final Promocion promocion = new Promocion();
		promocion.setEmpresa(empresa);
		promocion.setDescuento(descuento);
		promocionRepository.save(promocion);
	}
}
