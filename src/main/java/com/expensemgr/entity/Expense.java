package com.expensemgr.entity;

import java.sql.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="expenses")
public class Expense {

	@Id
	@Column(name="expenceid")
	int expenseid;	
	
	@Column(name="userid")
	int userid;
	
	@Column(name="categoryid")
	int categoryid;
	
	@Column(name="expensename")
	String expenseName;

	@Column(name="expensedescription")
	String expenseDescription;
	
	@Column(name="expenseamount")
	String expenseAmount;
	
	@Column(name="expensemode")
	String expensemode;
	
	@Column(name="expensedate")
	Date expenseDate;

	public int getExpenseid() {
		return expenseid;
	}

	public void setExpenseid(int expenseid) {
		this.expenseid = expenseid;
	}

	public int getUserid() {
		return userid;
	}

	public void setUserid(int userid) {
		this.userid = userid;
	}

	public int getCategoryid() {
		return categoryid;
	}

	public void setCategoryid(int categoryid) {
		this.categoryid = categoryid;
	}

	public String getExpenseName() {
		return expenseName;
	}

	public void setExpenseName(String expenseName) {
		this.expenseName = expenseName;
	}

	public String getExpenseDescription() {
		return expenseDescription;
	}

	public void setExpenseDescription(String expenseDescription) {
		this.expenseDescription = expenseDescription;
	}

	public String getExpenseAmount() {
		return expenseAmount;
	}

	public void setExpenseAmount(String expenseAmount) {
		this.expenseAmount = expenseAmount;
	}

	public String getExpensemode() {
		return expensemode;
	}

	public void setExpensemode(String expensemode) {
		this.expensemode = expensemode;
	}

	public Date getExpenseDate() {
		return expenseDate;
	}

	public void setExpenseDate(Date expenseDate) {
		this.expenseDate = expenseDate;
	}

	
}
