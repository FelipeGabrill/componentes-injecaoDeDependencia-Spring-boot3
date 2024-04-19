package com.devsuperior.desafio.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.devsuperior.desafio.entities.Order;

@Service
public class OrderService {

	@Autowired
	private ShippingService shippingService;
	
	public double total(Order order) {
		double discount = (order.getDiscount() / 100) * order.getBasic();
		double basicPrice = order.getBasic() - discount;
		order.setBasic(basicPrice);
		return basicPrice + shippingService.shipment(order);
	}
	
}
