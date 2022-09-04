package com.homeinsurance.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.homeinsurance.model.Property;

@Repository
public interface PropertyRepository extends JpaRepository<Property, Integer> {

	Property findByInsuranceId(int insuranceId);

	Property findByBuyerId(int insuranceId);

	List<Property> findByInsuranceName(String insuranceName);

	List<Property> findByBuyerNmae(String buyerName);

}
