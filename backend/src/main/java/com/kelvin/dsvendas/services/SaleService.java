package com.kelvin.dsvendas.services;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.kelvin.dsvendas.dtos.SaleDTO;
import com.kelvin.dsvendas.entity.Sale;

import com.kelvin.dsvendas.repositories.SaleRepository;
import com.kelvin.dsvendas.repositories.SellerRepository;

@Service
public class SaleService {
	
	@Autowired
	private SaleRepository repository;
	
	@Autowired
	private SellerRepository sellerRepository;
	
	@Transactional(readOnly = true) //para reduzir as requisições JPA 
	public Page<SaleDTO> findAll(Pageable pageable){
		sellerRepository.findAll(); //para reduzir as requisições JPA 
		Page<Sale> list = repository.findAll(pageable);
		return list.map(x -> new SaleDTO(x));
	}

}
