package com.project.revision.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
@Entity

public class Product {
private String p_name;

@GeneratedValue(strategy=GenerationType.AUTO)
@Id
private long  Id;
private String email;
private String password;
public String getP_name() {
	return p_name;
}
public void setP_name(String p_name) {
	this.p_name = p_name;
}
public long getId() {
	return Id;
}
public void setId(long id) {
	Id = id;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}

}
