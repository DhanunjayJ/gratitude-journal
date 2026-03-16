package com.dhanunjay.gratitude_journal;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;



@RestController
@RequestMapping("/api/entries")
@CrossOrigin(origins="*")
public class GratitudeEntryController {
    private final GratitudeEntryRepository repository;

    public GratitudeEntryController (GratitudeEntryRepository repository){
        this.repository = repository;
    }

    @GetMapping
    public List<GratitudeEntity> getAll(){
        return repository.findAll();
    }

    @PostMapping
    public GratitudeEntity create(@RequestBody GratitudeEntity entry){
        return repository.save(entry);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete (@PathVariable Long id){
        repository.deleteById(id);
        return ResponseEntity.noContent().build();
    }
}
