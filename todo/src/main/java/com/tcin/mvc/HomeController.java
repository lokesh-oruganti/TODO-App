package com.tcin.mvc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import com.tcin.mvc.model.Todo;

@Controller
public class HomeController {
	
	@Autowired
	TodoRepo repo;
	
	@Autowired
	UpdateRepo ur;
	
	@ModelAttribute
	public void modelData(Model m) {
		m.addAttribute("tasks", repo.count());
	}
	
	@RequestMapping("/")
	public String home() {
		return "display";
	}
	
	@PostMapping(value="addTask")
	public String addTask(@ModelAttribute Todo t) {
		repo.save(t);
		
		return "addtask";
	}
	@GetMapping("getTasks")
	public String getTasks(Model m) {
		
		m.addAttribute("result", repo.findAll()); 
		return "showtask";
	}
	@SuppressWarnings("deprecation")
	@GetMapping("getTask")
	public String getTask(@RequestParam int tid, Model m) {
		
		m.addAttribute("result", repo.getOne(tid)); 
		return "showtask";
	}
	@GetMapping("getTaskByName")
	public String getTaskByName(@RequestParam String intro, Model m) {
		
		m.addAttribute("result", repo.findByintro(intro)); 
		return "showtask";
	}
	@GetMapping("getTaskByPriority")
	public String getTaskByPriority(@RequestParam int priority, Model m) {
		
		m.addAttribute("result", repo.findBypriorityOrderByTidDesc(priority)); 
		return "showtask";
	}
	@SuppressWarnings("deprecation")
	@RequestMapping("deleteTask")
	public String deleteTask(@RequestParam int tid,Model m) {
		m.addAttribute("result", repo.getOne(tid));
		repo.deleteById(tid);
		return "delete";
		
	}
	@RequestMapping("updateTask")
	public String updateTask(@RequestParam int tid,@RequestParam String intro,@RequestParam int priority,@RequestParam String description,Model m,@ModelAttribute Todo t) {
		Todo tasks = repo.getById(tid);
		tasks.setIntro(intro);
		tasks.setDescription(description);
		tasks.setPriority(priority);
		//repo.save(tasks);
		repo.saveAndFlush(tasks);
		return "updateTask";
	}
	
}
 