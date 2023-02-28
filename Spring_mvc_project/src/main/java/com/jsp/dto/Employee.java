package com.jsp.dto;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Employee 
{
@Id
private int id;
private String name;
private String about;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getabout() {
	return about;
}
public void setabout(String about) {
	this.about = about;
}


}
