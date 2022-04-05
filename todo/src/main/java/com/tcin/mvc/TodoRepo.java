package com.tcin.mvc;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.tcin.mvc.model.Todo;


@Repository
public interface TodoRepo extends JpaRepository<Todo, Integer> {

	List<Todo> findByintro(String intro);

	List<Todo> findBypriorityOrderByTidDesc(int priority);

	List<Todo> deleteByintro(String intro);
	
	

}
