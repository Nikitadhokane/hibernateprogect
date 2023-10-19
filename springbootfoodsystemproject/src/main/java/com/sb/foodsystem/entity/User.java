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
@Table(name="User_Details")
public class User {
	
	@Id
    private String username;
    private String password;
    private String firstname;
    private String lastname;
    private String email;
    private String address;
    private int contact;
    
    
	
	
	
	
    
    
   

}
