package com.dev.microservices.currencyexchangeservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.dev.microservices.currencyexchangeservice.ExchangeValue;
@Repository
public interface ExchangeRepository extends JpaRepository<ExchangeValue, Long> {
	
	ExchangeValue findByFromAndTo(String from , String to);
	
}
