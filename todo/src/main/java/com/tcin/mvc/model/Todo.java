package com.tcin.mvc.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Todo {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private int tid;
	private String intro;
	private String description;
	private int priority;
	public int getTid() {
		return tid;
	}
	public void setTid(int tid) {
		this.tid = tid;
	}
	
	public Todo() {
		
	}
	/**
	 * @param tid
	 * @param intro
	 * @param description
	 * @param priority
	 */
	public Todo(int tid, String intro, String description, int priority) {
		super();
		this.tid = tid;
		this.intro = intro;
		this.description = description;
		this.priority = priority;
	}
	public String getIntro() {
		return intro;
	}
	public void setIntro(String intro) {
		this.intro = intro;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public int getPriority() {
		return priority;
	}
	public void setPriority(int priority) {
		this.priority = priority;
	}
	@Override
	public String toString() {
		return "Todo [tid=" + tid + ", introduction=" + intro + ", description=" + description + ", priority=" + priority + "]";
	}
	
	
}
