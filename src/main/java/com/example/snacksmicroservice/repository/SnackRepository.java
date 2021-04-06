package com.example.snacksmicroservice.repository;

import com.example.snacksmicroservice.model.Snack;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SnackRepository extends JpaRepository<Snack, Integer>{
}
