package com.example.demo.services.impl;

import com.example.demo.models.Paises;
import com.example.demo.services.PaisesService;
import com.example.demo.repositories.PaisesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PaisesServiceImpl implements PaisesService {

    @Autowired
    private PaisesRepository paisesRepository;

    @Override
    public List<Paises> getAllPaises() {
        return paisesRepository.findByAll();
    }

    @Override
    public Optional<Paises> getPaisById(Integer id) {
        return paisesRepository.findById(id);
    }

    @Override
    public void savePais(Paises pais) {
        paisesRepository.save(pais);
    }

    @Override
    public void deletePais(Integer id) {
        paisesRepository.deleteById(id);
    }
}