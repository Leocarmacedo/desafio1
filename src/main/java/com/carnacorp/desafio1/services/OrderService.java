package com.carnacorp.desafio1.services;

import org.springframework.stereotype.Service;

import com.carnacorp.desafio1.entities.Order;

@Service
public class OrderService {

	public double total(Order order) {

		return order.getBasic() - (order.getBasic() * (order.getDiscount() / 100));
	}

}
