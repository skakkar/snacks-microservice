package com.example.snacksmicroservice.controller;

import com.example.snacksmicroservice.dto.SnackDTO;
import com.example.snacksmicroservice.model.Snack;
import com.example.snacksmicroservice.service.SnackService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class SnacksController {

    @Autowired private SnackService snackService;

    @GetMapping(path="snacks/{snackId}", produces = "application/json")
    public Snack getSnacksById(@PathVariable Integer snackId){
//        SnackDTO snackDTO = new SnackDTO();
//        snackDTO.setId(snackId);
//        snackDTO.setName("Snicker");
        Snack snack = snackService.getSnackById(snackId);
        return snack;
    }

    @GetMapping(path = "snacks")
    public List<Snack> getAllSnacks() {
        return snackService.getAllSnacks();
    }

    @PostMapping(path = "snacks")
    public Snack createSnack(@RequestBody SnackDTO snackDto) {
        return snackService.createSnack(snackDto);
    }
}
