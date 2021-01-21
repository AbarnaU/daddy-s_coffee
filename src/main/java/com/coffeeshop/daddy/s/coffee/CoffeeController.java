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
public class CoffeeController {

	@Autowired
	private CoffeeService serv;
	
	@GetMapping("/Coffees")
	public List<Coffee> list(){
		return serv.listAll();
	}
	
	@GetMapping("/Coffees/{id}")
	public ResponseEntity<Coffee> get(@PathVariable Integer id){
		try {
			Coffee coffee = serv.get(id);
			return new ResponseEntity<Coffee> (coffee,HttpStatus.OK);
		}catch (NoSuchElementException e) {
	        return new ResponseEntity<Coffee>(HttpStatus.NOT_FOUND);
		}	  
	}
	
	@PostMapping("/Coffees")
	public void add(@RequestBody Coffee coffee) {
		serv.save(coffee);
	}
	
}
