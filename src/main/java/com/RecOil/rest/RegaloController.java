package com.RecOil.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.RecOil.clases.Regalo;
import com.RecOil.repositories.RegaloRepository;

@Controller
public class RegaloController {
	@Autowired
	RegaloRepository regaloRepository;

	@RequestMapping("/obtenerRegalos")
	public List<Regalo> obtenerRegalos() {
		return regaloRepository.findAll();
	}

	@RequestMapping("/comprobarRegalo")
	public Regalo comprobarRegalo(
			@RequestParam(value = "_id", required = true) final String _id,
			final Model model) {
		model.addAttribute("_id", _id);

		return regaloRepository.findBy_id(_id);
	}

	@RequestMapping("/addRegalo")
	public void addRegalo(
			@RequestParam(value = "nombre", required = true) final String nombre,
			@RequestParam(value = "puntos", required = true) final int puntos) {
		final Regalo regalo = new Regalo();
		regalo.setProducto(nombre);
		regalo.setPuntos(puntos);
		regaloRepository.save(regalo);
	}
}
