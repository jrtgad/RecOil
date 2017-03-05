package com.RecOil.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.RecOil.clases.User;
import com.RecOil.repositories.UserRepository;

@Controller
public class UserController {

	@Autowired
	UserRepository userRepository;

	@RequestMapping("/comprobarUsuario")
	public User comprobarUsuario(
			@RequestParam(value = "_id", required = true) final String _id,
			final Model model) {
		model.addAttribute("_id", _id);

		return userRepository.findBy_id(_id);
	}
}
