package com.example.demo.services.impl;
import com.example.demo.services.ProcedenciasService;
import com.example.demo.models.Procedencias;
import com.example.demo.repositories.ProcedenciasRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProcedenciasServiceImpl implements ProcedenciasService {

    private final ProcedenciasRepository procedenciasRepository;

    @Autowired
    public ProcedenciasServiceImpl(ProcedenciasRepository procedenciasRepository) {
        this.procedenciasRepository = procedenciasRepository;
    }

    @Override
    public List<Procedencias> findAll() {
        return procedenciasRepository.findAll();
    }

    @Override
    public Optional<Procedencias> findById(Integer id) {
        return procedenciasRepository.findById(id);
    }

    @Override
    public Procedencias save(Procedencias procedencia) {
        return procedenciasRepository.save(procedencia);
    }

    @Override
    public void deleteById(Integer id) {
        procedenciasRepository.deleteById(id);
    }
}
