package org.ldv.savonapi.model.dao

import org.springframework.data.jpa.repository.JpaRepository

interface CaracteristiqueDAO:JpaRepository<org.ldv.savonapi.model.entity.Caracteristique,Long> {
}