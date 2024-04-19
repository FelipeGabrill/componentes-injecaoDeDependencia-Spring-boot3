package com.devsuperior.desafio.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Getter
@Setter
public class Order {

	private Integer code;
	private Double basic;
	private Double discount;
	
	public Order() {
	}
	
	
	
}
