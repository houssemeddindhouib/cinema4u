package org.example.cinema.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Movie {
    private int id;
    private String title;
    private int year;
}
