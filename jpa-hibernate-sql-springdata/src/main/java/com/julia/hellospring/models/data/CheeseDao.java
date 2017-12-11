/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.julia.hellospring.models.data;

import com.julia.hellospring.models.Cheese;
import javax.transaction.Transactional;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author julia
 */
//it stores Cheese objects and its key is Integers(id)
@Repository
@Transactional
public interface CheeseDao extends CrudRepository<Cheese,Integer>{
    
}
