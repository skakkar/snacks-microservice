package com.example.snacksmicroservice.service;

import com.example.snacksmicroservice.dto.SnackDTO;
import com.example.snacksmicroservice.model.Snack;
import com.example.snacksmicroservice.repository.SnackRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class SnackService {

    @Autowired
    SnackRepository snackRepository;

    public Snack createSnack(SnackDTO snackDTO) {
        Snack snack = new Snack(snackDTO.getName());
        return snackRepository.save(snack);
    }

    public Snack getSnackById(Integer id){

        Optional<Snack> retrievedSnack =  snackRepository.findById(id);

        if(!retrievedSnack.isPresent()) {
            throw new RuntimeException(String.format("Snack of id %d not found", id));
        }

        return retrievedSnack.get();
    }

    public List<Snack> getAllSnacks() {
        return snackRepository.findAll();
    }
}
