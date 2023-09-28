package com.project.hibernateproject3;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity(name="Product_Details")
@Table(name="Product_Info")

public class Product {
	
	@Id
	@Column(name="Product_ID")
	private int pid;
	@Column(name="Product_Name")
	private String pname;
	@Column(name="Product_Price")
	private int pprice;
	public Product(int pid, String pname, int pprice) {
		super();
		this.pid = pid;
		this.pname = pname;
		this.pprice = pprice;
	}
	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public int getPprice() {
		return pprice;
	}
	public void setPprice(int pprice) {
		this.pprice = pprice;
	}
	
	

}
