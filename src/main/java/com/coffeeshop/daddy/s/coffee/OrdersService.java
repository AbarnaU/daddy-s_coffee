package com.coffeeshop.daddy.s.coffee;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class OrdersService {
	
	@Autowired
	private OrdersRepository orepo;
	
	public List<Orders> listAll(){
		return orepo.findAll();
	}
	
	public Orders get(Integer id) {
		return orepo.findById(id).get();
	}
	
	public void save(Orders orders) {
		orepo.save(orders);
	}

}
