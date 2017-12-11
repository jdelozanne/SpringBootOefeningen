/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.demo.models.data;

import com.example.demo.models.Product;
import javax.transaction.Transactional;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author julia
 */
@Repository
@Transactional
public interface ProductDao extends CrudRepository <Product, Integer> {
    
}
