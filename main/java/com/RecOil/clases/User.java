package com.RecOil.clases;

import org.springframework.data.annotation.Id;

public class User {
	@Id
	private String _id;
	private Boolean activo;
	private Boolean autorizado;
	private String foto;

	public String get_id() {
		return _id;
	}

	public void set_id(final String _id) {
		this._id = _id;
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
