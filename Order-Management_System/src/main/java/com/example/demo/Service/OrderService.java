package com.example.demo.Service;

import com.example.demo.entity.Order;

public interface OrderService {
	public Order createOrder(Order st);
	public Order getorder(int id);
	public String deleteOrder(int id);
	public Order updateOrder(int id,Order st);
	
}
