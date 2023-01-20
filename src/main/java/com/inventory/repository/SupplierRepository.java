package com.inventory.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.inventory.entity.Supplier;

public interface SupplierRepository extends JpaRepository<Supplier, Integer>{

	public Supplier findByEmailId(String emailId);
}