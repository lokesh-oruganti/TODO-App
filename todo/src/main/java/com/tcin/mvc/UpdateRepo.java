package com.tcin.mvc;

import org.springframework.data.repository.CrudRepository;
import com.tcin.mvc.model.Todo;


public interface UpdateRepo extends CrudRepository<Todo, Integer>{

}
  