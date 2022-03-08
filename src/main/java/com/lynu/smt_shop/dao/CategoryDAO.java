package com.lynu.smt_shop.dao;
  
import com.lynu.smt_shop.pojo.Category;
import org.springframework.data.jpa.repository.JpaRepository;
 

public interface CategoryDAO extends JpaRepository<Category,Integer> {
}