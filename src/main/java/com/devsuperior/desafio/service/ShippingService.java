package com.devsuperior.desafio.service;

import org.springframework.stereotype.Service;

import com.devsuperior.desafio.entities.Order;

@Service
public class ShippingService {

	public double shipment(Order order) {	
	double basicPrice = order.getBasic();
		if (basicPrice <= 100.0) {
			return 20.00;
		}
		if (basicPrice >= 100 && basicPrice <= 200.0) {
			return 12.00;
		}
		
		return 0.00;
	}
}
