package com.kelvin.dsvendas.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.kelvin.dsvendas.dtos.SaleSumDTO;
import com.kelvin.dsvendas.dtos.SaleSucessDTO;
import com.kelvin.dsvendas.entity.Sale;

@Repository
public interface SaleRepository extends JpaRepository<Sale, Integer>{
	
	@Query("SELECT new com.kelvin.dsvendas.dtos.SaleSumDTO(obj.seller, SUM(obj.amount))"
			+ " FROM Sale AS obj GROUP BY obj.seller")
	List<SaleSumDTO> amountGroupedBySeller();
	
	@Query("SELECT new com.kelvin.dsvendas.dtos.SaleSucessDTO(obj.seller, SUM(obj.visited),  SUM(obj.deals))"
			+ " FROM Sale AS obj GROUP BY obj.seller")
	List<SaleSucessDTO> sucessGroupedBySeller();

}
