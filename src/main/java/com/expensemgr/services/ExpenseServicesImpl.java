package com.expensemgr.services;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.expensemgr.dto.ExpenseDTO;
import com.expensemgr.entity.Expense;
import com.expensemgr.repositories.CategoryRepository;

@Service
public class ExpenseServicesImpl implements ExpenseServices {
	
	@Autowired
	CategoryRepository repository;
	
	@Override
	public ExpenseDTO getExpenseById(int id) {
		Optional<Expense> optExpense = repository.findById(id);
		if(optExpense.isPresent()) {
			Expense entityExpense  = optExpense.get();
			ExpenseDTO dto = new ExpenseDTO();
			BeanUtils.copyProperties(entityExpense,dto);
			return dto;
		}
		return null;
	}

	@Override
	public List<ExpenseDTO> getAllExpenses() {
		Iterator<Expense> iter = repository.findAll().iterator();
		ArrayList<ExpenseDTO> finalList = new ArrayList<>();
		
		while(iter.hasNext()) {
			Expense entityExpense = iter.next();
			ExpenseDTO dto = new ExpenseDTO();
			BeanUtils.copyProperties(entityExpense,dto);
			finalList.add(dto);
		}
		
		return finalList;
	}

	@Override
	public void createExpense() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updateExpense() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteExpense() {
		// TODO Auto-generated method stub
		
	}


}
