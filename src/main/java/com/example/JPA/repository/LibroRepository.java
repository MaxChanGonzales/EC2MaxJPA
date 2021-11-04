/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.JPA.repository;

import com.example.JPA.entity.Libro;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author Max
 */
public interface LibroRepository extends JpaRepository<Libro, Integer>{
    
}
