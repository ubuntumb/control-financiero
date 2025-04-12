package com.example.demo.services.impl;

import com.example.demo.models.Paises;
import com.example.demo.repositories.PaisesRepository;
import com.example.demo.services.PaisesService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class PaisesServiceImpl implements PaisesService {

    private final PaisesRepository paisesRepository;

    @Override
    public List<Paises> getAllPaises() {
        return paisesRepository.findAllPaises();
    }
}
