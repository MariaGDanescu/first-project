package com.buyIT.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.buyIT.web.service.TodoShoppingService;

@Controller
@SessionAttributes("name")
/**
 * 
 * @author MariaDanescu
 *
 */
public class TodoShoppingController {
	
	@Autowired
	TodoShoppingService service;
	
	@RequestMapping(value="/list-products", method = RequestMethod.GET)
	public String showTodos(ModelMap model){
		String name = (String) model.get("name");
		model.put("products", service.retrieveProducts(name));
		return "list-products";
	}
}
