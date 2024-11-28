package org.ldv.savonapi.model.dao

import org.springframework.data.jpa.repository.JpaRepository

interface IngredientDAO:JpaRepository<org.ldv.savonapi.model.entity.Ingredient,Long> {
}