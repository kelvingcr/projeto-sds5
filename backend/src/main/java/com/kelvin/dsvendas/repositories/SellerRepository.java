package com.kelvin.dsvendas.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.kelvin.dsvendas.entity.Seller;

@Repository
public interface SellerRepository extends JpaRepository<Seller, Integer>{

}
