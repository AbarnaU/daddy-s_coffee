package com.coffeeshop.daddy.s.coffee;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
@Transactional
public class CoffeeService {

	@Autowired
	private CoffeeRepository repo;
	
	public List<Coffee> listAll(){
		return repo.findAll();
	}
	
	public Coffee get(Integer id) {
		return repo.findById(id).get();
	}
	
	public void save(Coffee coffee) {
		repo.save(coffee);
	}
	
	
	
	
}
