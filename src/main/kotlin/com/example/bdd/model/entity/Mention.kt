package com.example.bdd.model.entity

import jakarta.persistence.*

@Entity
class Mention (
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id:Long? = null,
    var nom:String? = null,
    var soreMin:Float? = null,
    var scoreMax:Float? = null,

    @ManyToMany(mappedBy = "mention")
    var caractéristique: MutableList<com.example.bdd.model.entity.Caractéristique>? = mutableListOf()


 ){
}