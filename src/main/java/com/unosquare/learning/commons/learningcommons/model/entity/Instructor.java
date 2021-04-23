package com.unosquare.learning.commons.learningcommons.model.entity;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "instructors")
public class Instructor extends Person {

	private Long salary;
	@OneToMany
	private Set<Course> courses;
	
	public Long getSalary() {
		return salary;
	}

	public void setSalary(Long salary) {
		this.salary = salary;
	}

	private static final long serialVersionUID = -6378586931253369795L;

}
