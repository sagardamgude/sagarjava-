package com.example.demo.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.demo.Repository.OrderRepository;
import com.example.demo.Service.OrderService;
import com.example.demo.entity.Order;


public class orderServiceimpl implements OrderService {
	@Autowired
	OrderRepository or;

	@Override
	public Order createOrder(Order o) {
		return or.save(o);
	}

	@Override
	public Order getorder(int id) {
		return or.findById(id).get();
	}

	@Override
	public String deleteOrder(int id) {
		or.deleteById(id);
		return "your order is deleted";
	}

	@Override
	public Order updateOrder(int id, Order st) {
		Order s = or.findById(id).get();
		s.setOrder_name(s.getOrder_name());
		s.setOrder_date(s.getOrder_date());
		s.setShippingCharge(s.getShippingCharge());
		return or.save(s);

	}

}
