package com.expensemgr.services;

import java.util.List;

import com.expensemgr.dto.ExpenseDTO;

public interface ExpenseServices {
	public ExpenseDTO getExpenseById(int id);
	public List<ExpenseDTO> getAllExpenses();
	public void createExpense();
	public void updateExpense();
	public void deleteExpense();
}
