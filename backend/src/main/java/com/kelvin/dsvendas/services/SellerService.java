package com.kelvin.dsvendas.services;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kelvin.dsvendas.dtos.SellerDTO;
import com.kelvin.dsvendas.entity.Seller;
import com.kelvin.dsvendas.repositories.SellerRepository;

@Service
public class SellerService {
	
	@Autowired
	private SellerRepository repository;
	
	public List<SellerDTO> findAll(){
		List<Seller> list = repository.findAll();
		return list.stream().map(x -> new SellerDTO(x)).collect(Collectors.toList());
	}

}
