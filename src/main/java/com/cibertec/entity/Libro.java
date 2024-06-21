package com.cibertec.entity;

import org.springframework.data.mongodb.core.mapping.Document;
import lombok.Getter;
import lombok.Setter;
import java.util.List;

@Getter
@Setter
@Document(collection = "libro")
public class Libro {

	private int idLibro;
    private String title;
    private String isbn;
    private int pageCount;
    private String publishedDate;
    private String thumbnailUrl;
    private String shortDescription;
    private String longDescription;
    private String status;
    private List<String> authors;
    private List<String> categories;

}