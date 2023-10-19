package com.sb.foodsystem.entity;

import java.sql.Time;

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
@Table(name="Payment_Details")
public class Payment {
	
	@Id
	private int id;
	private int amount;
	private Time time;
	
	
	
	

}
