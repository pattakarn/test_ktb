package io.assignment.stockvaluebackend.repository;

import org.springframework.data.repository.CrudRepository;

import io.assignment.stockvaluebackend.model.StockDB;

public interface StockRepository extends CrudRepository<StockDB, Long> {
    
}
