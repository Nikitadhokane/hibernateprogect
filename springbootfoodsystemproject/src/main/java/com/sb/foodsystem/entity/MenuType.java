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
@Table(name="Menu_Type_Table")
public class MenuType {
	
	@Id
	private Long id;
	private String type_name;
	private String description;
	
		
	

}
