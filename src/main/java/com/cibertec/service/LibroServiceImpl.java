package com.cibertec.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cibertec.entity.Libro;
import com.cibertec.repository.LibroRepository;

@Service
public class LibroServiceImpl implements LibroService {

    @Autowired
    private LibroRepository repository;

    @Override
    public List<Libro> listaLibros() {
        return repository.findAll();
    }
    
    @Override
    public List<Libro> listaLibrosPorCategoria(String categories) {
        return repository.listaLibrosPorCategoria(categories);
    }

    @Override
    public List<Libro> listaLibrosPorCategorias(List<String> categories) {
        return repository.listaLibrosPorCategorias(categories);
    }

}


