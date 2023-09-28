package com.project.hibernateproject3;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;


@Entity(name="Customer_Details") //we are declaring the entity file
@Table(name="Customer_Info") //giving the name to the table
public class Customer {
	
	@Id //to set the primary key
	@Column(name="Customer_ID")
	private int cid;
	@Column(name="Customer_Name")
	private String cname;
	@Column(name="Customer_Age")
	private int cage;
	
	@OneToOne //one to one connection
	@JoinColumn(name="Product_id")
	private Product prod;
	
	
    // creating Constructors
	public Customer(int cid, String cname, int cage, Product prod) {
		super();
		this.cid = cid;
		this.cname = cname;
		this.cage = cage;
		this.prod = prod;
	}

	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getCid() {
		return cid;
	}

	public void setCid(int cid) {
		this.cid = cid;
	}

	public String getCname() {
		return cname;
	}

	public void setCname(String cname) {
		this.cname = cname;
	}

	public int getCage() {
		return cage;
	}

	public void setCage(int cage) {
		this.cage = cage;
	}

	public Product getProd() {
		return prod;
	}

	public void setProd(Product prod) {
		this.prod = prod;
	}
	
	

}
