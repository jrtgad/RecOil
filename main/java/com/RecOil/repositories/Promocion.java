package com.RecOil.repositories;

public class Promocion {
	private String _id;
	private String empresa;
	private int descuento;

	public String get_id() {
		return _id;
	}

	public void set_id(final String _id) {
		this._id = _id;
	}

	public String getEmpresa() {
		return empresa;
	}

	public void setEmpresa(final String empresa) {
		this.empresa = empresa;
	}

	public int getDescuento() {
		return descuento;
	}

	public void setDescuento(final int descuento) {
		this.descuento = descuento;
	}
}
