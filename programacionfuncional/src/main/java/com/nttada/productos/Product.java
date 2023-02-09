package com.nttada.productos;

import java.math.BigDecimal;

class Product {
	
	public String name;
	public BigDecimal price;
	public Tax tax;

	Product(String name, BigDecimal price, Tax tax) {
		this.name = name;
		this.price = price;
		this.tax = tax;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public BigDecimal getPrice() {
		return price;
	}

	public void setPrice(BigDecimal price) {
		this.price = price;
	}

	public Tax getTax() {
		return tax;
	}

	public void setTax(Tax tax) {
		this.tax = tax;
	}
	
	
}
