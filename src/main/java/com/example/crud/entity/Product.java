package com.example.crud.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "PRODUCTS")
public class Product {
	@Id
	@GeneratedValue
	private int id;
	private String name;
	private int quantity;
	private double price;
}
