package com.example.demo.repositories;

import com.example.demo.models.Paises;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PaisesRepository extends CrudRepository<Paises, Integer> {

    @Query("SELECT p FROM Paises p")
    List<Paises> findByAll();
}