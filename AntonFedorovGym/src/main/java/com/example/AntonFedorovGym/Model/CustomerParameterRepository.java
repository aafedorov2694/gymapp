package com.example.AntonFedorovGym.Model;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

public interface CustomerParameterRepository extends CrudRepository<CustomerParameter, Long> {
	List<CustomerParameter> findById(@Param("paramId") long paramId);
}
