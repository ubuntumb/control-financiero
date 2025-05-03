package com.example.demo.services;

import com.example.demo.models.Procedencias;
import java.util.List;
import java.util.Optional;

public interface ProcedenciasService {
    List<Procedencias> findAll();
    Optional<Procedencias> findById(Integer id);
    Procedencias save(Procedencias procedencia);
    void deleteById(Integer id);
}
