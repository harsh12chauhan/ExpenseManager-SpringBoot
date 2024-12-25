package com.expensemgr.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.expensemgr.entity.Expense;

@Repository
public interface CategoryRepository extends CrudRepository<Expense, Integer> {
 //custom queries can be written here...
}
