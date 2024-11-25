package com.example.bdd.model.dao

import com.example.bdd.model.entity.Caractéristique
import org.springframework.data.jpa.repository.JpaRepository

interface CaractéristiqueDAO:JpaRepository<com.example.bdd.model.entity.Caractéristique,Long> {
}