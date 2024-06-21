package com.cibertec.repository;

import java.util.List;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import com.cibertec.entity.Libro;


public interface LibroRepository extends MongoRepository<Libro, String> {

    @Query("{ 'categories' : { $regex: ?0, $options: 'i' } }")
    public abstract List<Libro> listaLibrosPorCategoria(String categories);


}


