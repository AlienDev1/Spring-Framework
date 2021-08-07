package com.example.Parts_Directory_API.pojo;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.persistence.*;
import java.util.UUID;

@Entity
@Table(name = "piece")
public class Piece {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private final int id;

    @Column(name = "name")
    private final String name;

    public Piece(@JsonProperty("id") int id, @JsonProperty("name") String name){
        this.id = id;
        this.name = name;
    }

    public int getId(){
        return id;
    }
    public String getName(){
        return name;
    }

    @Override
    public String toString(){
        return "Piece{" +
                "id = " + id +
                ", name = " + name +
                "}";
    }
}
