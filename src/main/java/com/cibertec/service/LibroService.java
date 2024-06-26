package com.cibertec.service;

import java.util.List;

import com.cibertec.entity.Libro;


public interface LibroService {

    public abstract List<Libro> listaLibros();

	public abstract List<Libro> listaLibrosPorCategoria(String categories);
    
    public abstract List<Libro> listaLibrosPorCategorias(List<String> categories);
}
