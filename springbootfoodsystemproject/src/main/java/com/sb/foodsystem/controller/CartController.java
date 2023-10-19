package com.sb.foodsystem.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sb.foodsystem.entity.Cart;
import com.sb.foodsystem.services.CartService;

@RestController
@RequestMapping("/cart")
public class CartController {
	
@Autowired
private CartService cartService;

@GetMapping("/{id}")
public ResponseEntity<Cart>getCartById(@PathVariable Long id)
{
	    Cart cart=cartService.getCartById(id);
		if(cart!=null)
		{
			return ResponseEntity.status(HttpStatus.OK).build();
			
		}
		else
		{
			return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
		}
	
}

@PostMapping
public ResponseEntity<Cart> createCart(@RequestBody Cart cart)
{
	Cart newCart =cartService.createCart(cart);
	return ResponseEntity.status(HttpStatus.CREATED).build();
}

@PutMapping("/{id}")
public ResponseEntity<Cart>updateCart(@PathVariable Long id, @RequestBody Cart cart)
{
	try
	{
		Cart updatedCart =cartService.updateCart(id, cart);
		return ResponseEntity.status(HttpStatus.OK).build();
	}
	catch(RuntimeException e)
	{
		return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
	}
}



}
