package com.example.Parts_Directory_API.pojo;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.UUID;

public class Part{

    private final UUID id;
    private final String name;

    public Part(@JsonProperty("id") UUID id, @JsonProperty("name") String name){
        this.id = id;
        this.name = name;
    }

    public UUID getId(){
        return id;
    }
    public String getName(){
        return name;
    }
}
