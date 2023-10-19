package com.sb.foodsystem.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@NoArgsConstructor
@AllArgsConstructor
@Data
@ToString
@Entity
@Table(name="Cart_Details")
public class Cart {
	
	@Id
	private Long id;
	private int quantity;
	

	
	
	
	
	
	
	
}
	
	
	
	
    