package com.example.bdd.model.dao

import com.example.bdd.model.entity.Mention
import org.springframework.data.jpa.repository.JpaRepository

interface MentionDAO:JpaRepository<com.example.bdd.model.entity.Mention,Long> {
}