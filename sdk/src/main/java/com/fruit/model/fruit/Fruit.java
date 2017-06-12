package com.fruit.model.fruit;

import java.io.Serializable;
import java.math.BigDecimal;
import java.math.BigInteger;

public class Fruit implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -7061083993003127703L;

	private BigInteger _id;

	private String fruitName;

	private String categoryCode;

	private BigDecimal listPrice;

	private BigDecimal sellingPrice;

	public BigInteger get_id() {
		return _id;
	}

	public void set_id(BigInteger _id) {
		this._id = _id;
	}

	public String getFruitName() {
		return fruitName;
	}

	public void setFruitName(String fruitName) {
		this.fruitName = fruitName;
	}

	public String getCategoryCode() {
		return categoryCode;
	}

	public void setCategoryCode(String categoryCode) {
		this.categoryCode = categoryCode;
	}

	public BigDecimal getListPrice() {
		return listPrice;
	}

	public void setListPrice(BigDecimal listPrice) {
		this.listPrice = listPrice;
	}

	public BigDecimal getSellingPrice() {
		return sellingPrice;
	}

	public void setSellingPrice(BigDecimal sellingPrice) {
		this.sellingPrice = sellingPrice;
	}
}
