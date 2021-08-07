package com.example.Parts_Directory_API.controller;

import com.example.Parts_Directory_API.pojo.Piece;
import com.example.Parts_Directory_API.service.PartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RequestMapping("jibri/api/parts")
@RestController
public class Controller {

    private final PartService service;

    @Autowired
    public Controller(PartService service){
        this.service = service;
    }

    @PostMapping
    public void addPart(@RequestBody Piece piece){
        service.addPart(piece);
    }

    @GetMapping
    public List<Piece> getAllParts(){
        return service.getAllParts();
    }

    @GetMapping(path = "{id}")
    public Piece getPartById(@PathVariable("id") UUID id){
        return service.getPartById(id).orElse(null);
    }

    @DeleteMapping(path = "{id}")
    public void deletePartById(UUID id) {
        service.deletePart(id);
    }

    @PutMapping(path = "{id}")
    public void updatePart(@PathVariable("id") UUID id, Piece pieceToUpdate){
        service.updatePart(id, pieceToUpdate);
    }

}
