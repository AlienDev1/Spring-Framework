package com.example.Parts_Directory_API.dao;

import com.example.Parts_Directory_API.pojo.Piece;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface PartDao {

    int insertParts(UUID id, Piece piece);
    default int insertParts(Piece piece){
        UUID id = UUID.randomUUID();
        return insertParts(id, piece);
    }

    List<Piece> selectAllParts();
    Optional<Piece> selectPartById(UUID id);

    int deletePartById(UUID id);
    int updatePartById(UUID id, Piece piece);
}
