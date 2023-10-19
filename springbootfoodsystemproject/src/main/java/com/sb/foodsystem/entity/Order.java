package com.sb.foodsystem.entity;

import java.util.Date;

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
@Table(name="Order_Table")
public class Order {
	
	@Id
	private int id;
	private Date orderDate;
	private int total_amount;
	private String userId;
	private String status;
	
	
	
	
	

}
