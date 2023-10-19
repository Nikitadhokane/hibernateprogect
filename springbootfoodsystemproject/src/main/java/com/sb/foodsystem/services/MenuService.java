package com.sb.foodsystem.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sb.foodsystem.dao.MenuRepository;
import com.sb.foodsystem.entity.Menu;

@Service
public class MenuService {
	
	@Autowired
	private MenuRepository menuRepository;
	
	public List<Menu> getAllMenuItems()
	{
		return menuRepository.findAll();	
		
	}
	
	public Menu getMenuById(String id)
	{
		Optional<Menu>menu=menuRepository.findById(id);
		return menu.orElse(null);
	}
	
	public Menu createMenuItem(Menu menu)
	{
		return menuRepository.save(menu);
	}
	
	public Menu updateMenuItem(String id, Menu menu)
	{
		if(menuRepository.existsById(id))
		{
			menu.setItem(id);
			return menuRepository.save(menu);
		}
		else
		{
			throw new RuntimeException("MenuItem Not Found With Id:"+id);
		}
	}
	
	
	

}
