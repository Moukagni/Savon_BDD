package com.example.bdd.model.dao

import com.example.bdd.model.entity.Ingrédient
import org.springframework.data.jpa.repository.JpaRepository

interface IngrédientDAO:JpaRepository<com.example.bdd.model.entity.Ingrédient,Long> {
}