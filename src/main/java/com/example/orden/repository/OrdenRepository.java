package com.example.orden.repository;

import com.example.orden.entities.Orden;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Repository extends JpaRepository <Orden, Long> {
}
