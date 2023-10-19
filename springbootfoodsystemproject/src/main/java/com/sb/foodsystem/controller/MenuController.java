package com.sb.foodsystem.controller;

import java.util.List;

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

import com.sb.foodsystem.entity.Menu;
import com.sb.foodsystem.services.MenuService;

@RestController
@RequestMapping("/menu")
public class MenuController {
	
	@Autowired
	private MenuService menuService;
	private Menu menu;
	
	@GetMapping
	public ResponseEntity<List<Menu>> getAllMenuItems()
	{
		List<Menu> menuItems = menuService.getAllMenuItems();
		return ResponseEntity.status(HttpStatus.OK).build();
	}
	
	@GetMapping("{id}")
	public ResponseEntity<Menu> getMenuById(@PathVariable String id)
	{
		Menu menu=menuService.getMenuById(id);
		if(menu!=null)
		{
			return ResponseEntity.status(HttpStatus.OK).build();
		}
		else
		{
			return ResponseEntity.status(HttpStatus.NOT_FOUND).build();		
			
		}
	}
	
	@PostMapping
	public ResponseEntity<Menu> createMenuItem(@RequestBody Menu menu)
	{
		Menu newMenuItem= menuService.createMenuItem(menu);
		return ResponseEntity.status(HttpStatus.CREATED).build();
	}
	
	@PutMapping("/{id}")
	public ResponseEntity<Menu> updateMenuItem(@PathVariable String id)
	{
		try
		{
			
			Menu updatedMenuItem=menuService.updateMenuItem(id,menu);
			return ResponseEntity.status(HttpStatus.OK).build();
			
		}
		catch(RuntimeException e)
		{
			return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
		}
	}
			
		
	

}
