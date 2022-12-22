package com.example.demo.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Service.OrderService;
import com.example.demo.entity.Order;

@RestController
public class OrderCOntroller {

	@Autowired(required = true)
	OrderService or;
	@Autowired
	Order o;
	@PostMapping("/order")
	public Order createStudent(@RequestBody Order st)
	{
		or.createOrder(st);
		return st;
	}
}
