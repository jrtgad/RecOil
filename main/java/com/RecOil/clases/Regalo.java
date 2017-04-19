package com.RecOil.clases;

import java.io.Serializable;

public class Regalo implements Serializable {
	private String _id;
	private String producto;
	private int puntos;

	public String get_id() {
		return _id;
	}

	public void set_id(final String _id) {
		this._id = _id;
	}

	public String getProducto() {
		return producto;
	}

	public void setProducto(final String producto) {
		this.producto = producto;
	}

	public int getPuntos() {
		return puntos;
	}

	public void setPuntos(final int puntos) {
		this.puntos = puntos;
	}

}
