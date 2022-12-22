package com.example.demo.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.NonNull;
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "Customer_DETAILS")
public class Customer {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@NonNull
	private int customer_id;
	private String customer_name ;
	private String Customer_contact;
	private String Customer_address;
	

}
