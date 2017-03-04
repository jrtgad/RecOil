package com.RecOil.rest.dto;

import com.RecOil.repositories.User;

public class UserDTO {
	private String id;
	private Boolean activo;
	private Boolean autorizado;
	private String foto;

	public UserDTO(final User user) {
		this.id = user.get_id();
		this.activo = user.getActivo();
		this.autorizado = user.getAutorizado();
		this.foto = user.getFoto();
	}

	public User toUser() {
		final User user = new User();
		user.set_id(this.getId());
		user.setActivo(this.getActivo());
		user.setAutorizado(this.getAutorizado());
		user.setFoto(this.getFoto());
		return user;
	}

	public String getId() {
		return id;
	}

	public void setId(final String id) {
		this.id = id;
	}

	public Boolean getActivo() {
		return activo;
	}

	public void setActivo(final Boolean activo) {
		this.activo = activo;
	}

	public Boolean getAutorizado() {
		return autorizado;
	}

	public void setAutorizado(final Boolean autorizado) {
		this.autorizado = autorizado;
	}

	public String getFoto() {
		return foto;
	}

	public void setFoto(final String foto) {
		this.foto = foto;
	}

}
