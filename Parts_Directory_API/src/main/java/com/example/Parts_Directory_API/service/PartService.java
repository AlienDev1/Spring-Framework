package com.example.Parts_Directory_API.service;

import com.example.Parts_Directory_API.dao.PartDao;
import com.example.Parts_Directory_API.pojo.Piece;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class PartService {

    private final PartDao partDao;

    @Autowired
    public PartService(@Qualifier("mysql") PartDao partDao){
        this.partDao = partDao;
    }

    //Adds to DB
    public int addPart(Piece piece){
        return partDao.insertParts(piece);
    }

    //Returns List of Parts
    public List<Piece> getAllParts(){
        return partDao.selectAllParts();
    }

    //Returns Specified Piece
    public Optional<Piece> getPartById(UUID id){
        return partDao.selectPartById(id);
    }

    //Removes Piece from DB
    public int deletePart(UUID id){
        return partDao.deletePartById(id);
    }

    //Changes Piece
    public int updatePart(UUID id, Piece newPiece){
        return partDao.updatePartById(id, newPiece);
    }
}
