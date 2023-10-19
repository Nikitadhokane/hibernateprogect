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
@Table(name="Menu_Table")
public class Menu {
	
	@Id
    private Long id;
    private String item;
    private int price;
    private int quantity;
	
    
	
	
    
    
    
    
   

}
