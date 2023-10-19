package com.sb.foodsystem.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sb.foodsystem.dao.CartRepository;
import com.sb.foodsystem.entity.Cart;

@Service
public class CartService {
	@Autowired
	private CartRepository cartRepository;
	
	public Cart getCartById(Long id)
	{
		Optional<Cart> cart=cartRepository.findById(id);
		return cart.orElse(null);
				
	}
	
	public Cart createCart(Cart cart)
	{
		return cartRepository.save(cart);
	}
	
	public Cart updateCart(Long id, Cart cart)
	{
		if(cartRepository.existsById(id))
		{
			cart.setId(id);
			return cartRepository.save(cart);
		}
		else
		{
			throw new RuntimeException("cart not found with id:"+id);
		}
	}

	

}
