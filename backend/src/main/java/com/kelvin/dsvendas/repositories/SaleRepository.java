package com.kelvin.dsvendas.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.kelvin.dsvendas.entity.Sale;
import com.kelvin.dsvendas.entity.Seller;

@Repository
public interface SaleRepository extends JpaRepository<Sale, Integer>{

}
