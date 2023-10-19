package com.sb.foodsystem.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
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
@Table(name="Admin_Details")
public class Admin {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	private String username;
	private String password;
	private String email;
	private int contact;
	
	


}
