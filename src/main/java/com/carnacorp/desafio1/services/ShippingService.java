package com.carnacorp.desafio1.services;

import org.springframework.stereotype.Service;

import com.carnacorp.desafio1.entities.Order;

@Service
public class ShippingService {

	public double shipment(Order order) {

		double shipment = 0.00;

		if (order.getBasic() < 100.00) {
			shipment = 20.00;
		} else if (order.getBasic() < 200.00) {
			shipment = 12.00;
		}

		return shipment;
	}
}
