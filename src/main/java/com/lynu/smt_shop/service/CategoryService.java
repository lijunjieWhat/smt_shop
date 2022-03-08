package com.lynu.smt_shop.service;

import java.util.List;

import com.lynu.smt_shop.dao.CategoryDAO;
import com.lynu.smt_shop.pojo.Category;
import com.lynu.smt_shop.utils.Page4Navigator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;


@Service
public class CategoryService {
    @Autowired
    CategoryDAO categoryDAO;

    public Page4Navigator<Category> list(int start, int size, int navigatePages) {
        Sort sort = Sort.by(Sort.Direction.DESC, "id");
        PageRequest pageRequest = PageRequest.of(start, size, sort);

        Page<Category> pageFromJPA = categoryDAO.findAll(pageRequest);
        List<Category> all = categoryDAO.findAll();
        return new Page4Navigator<>(pageFromJPA,navigatePages);
    }

    public List<Category> list() {
        Sort sort = Sort.by(Sort.Direction.DESC, "id");
        return categoryDAO.findAll(sort);
    }


}
