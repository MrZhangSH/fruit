package com.fruit.model.fruit;

import java.io.Serializable;

public class Fruit implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -7061083993003127703L;

	private Integer _id;

	private String name;

	public Integer get_id() {
		return _id;
	}

	public void set_id(Integer _id) {
		this._id = _id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
