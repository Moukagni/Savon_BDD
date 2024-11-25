package com.example.bdd.model.entity

import jakarta.persistence.*

@Entity
class Caractéristique(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id:Long? = null,
    var nom:String? = null,
    val description:String,

    @ManyToOne
    @JoinColumn(name = "mention")
    var mention: Mention? = null

) {
}