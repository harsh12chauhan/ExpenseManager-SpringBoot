package com.expensemgr.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.expensemgr.dto.ExpenseDTO;
import com.expensemgr.services.ExpenseServices;

@RestController
@RequestMapping("/expense")
public class ExpenseController {
	
	@Autowired
	ExpenseServices expense;
	
	//getAllExpense
	@GetMapping("/all")
	public List<ExpenseDTO> getAllExpenseDetails(){
		return expense.getAllExpenses();
	}
	
	//getExpenseById
	@GetMapping("/{id}")
	public ExpenseDTO getExpenseDetailsById(@PathVariable int id){
		return expense.getExpenseById(id);
	}

//	//createNewExpense
//	@PostMapping("/create")
//	public void creatExpense(@RequestBody Expense expense){
//		
//	}
//	//updateExpense
//	@PutMapping("/{id}")
//	public void updateExpense(@PathVariable int id){
//		
//	}
//	//deleteExpense
//	@DeleteMapping("/{id}")
//	public void deleteExpense(@PathVariable int id){
//		
//	}
	
	@GetMapping("/testing")
	public String testing() {
		return "working good !";
	}
}
