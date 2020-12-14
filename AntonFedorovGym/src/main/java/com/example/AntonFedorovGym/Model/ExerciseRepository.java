package com.example.AntonFedorovGym.Model;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface ExerciseRepository extends CrudRepository<Exercise,Long> {
	List<Exercise> findByName(@Param("name") String name);

}
