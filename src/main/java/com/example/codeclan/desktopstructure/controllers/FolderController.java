package com.example.codeclan.desktopstructure.controllers;


import com.example.codeclan.desktopstructure.models.Folder;
import com.example.codeclan.desktopstructure.models.User;
import com.example.codeclan.desktopstructure.repositories.FolderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;


@RestController
@RequestMapping(value="/folders")
public class FolderController {

    @Autowired
    FolderRepository folderRepository;

    @GetMapping
    public ResponseEntity<List<Folder>> getAllFolders(){
        return new ResponseEntity<>(folderRepository.findAll(), HttpStatus.OK);
    }

    @GetMapping(value="/{id}")
    public ResponseEntity<Optional<Folder>> getFolder(@PathVariable Long id){
        return new ResponseEntity<>(folderRepository.findById(id), HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity postUser(@RequestBody Folder folder){
        folderRepository.save(folder);
        return new ResponseEntity(folder, HttpStatus.CREATED);
    }
}
