package com.coffeeshop.daddy.s.coffee;

import java.util.List;
import java.util.NoSuchElementException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OrdersController {

	@Autowired
	private OrdersService oserv;
	
	@GetMapping("/Orders")
	public List<Orders> list(){
		return oserv.listAll();
	}
	
	@GetMapping("/Orders/{id}")
	public ResponseEntity<Orders> get(@PathVariable Integer id){
		try {
			Orders orders = oserv.get(id);
			return new ResponseEntity<Orders> (orders,HttpStatus.OK);
		}catch (NoSuchElementException e) {
	        return new ResponseEntity<Orders>(HttpStatus.NOT_FOUND);
		}	  
	}
	
	@PostMapping("/Orders")
	public void add(@RequestBody Orders orders) {
		oserv.save(orders);
	}
	
}
