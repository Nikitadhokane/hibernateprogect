package com.sb.foodsystem.entity;

import javax.persistence.Entity;
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
@Table(name="Login_Details")
public class Login {
	
	private String username;
    private String password;
	
    
    
    
    
    
    

    

       
}


