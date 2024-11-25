package com.example.bdd.model.entity

import jakarta.persistence.*

@Entity

class Savon(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var nom:String,
    var type:String,
    var poids:Float,
    var prix: Float,
    var description: String
)
{
}