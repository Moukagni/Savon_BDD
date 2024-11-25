package com.example.bdd.model.entity

import jakarta.persistence.*

@Entity
class Ingrédient(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id:Int? = null,
    var corpsGras:String? = null,
    var iode:Float,
    var ins:Float,
    var sopa:Float,
    var douceur:Float,
    var lavant:Float,
    var volMousse:Float,
    var tenueMousse:Float,
    var durete:Float,
    var solubiliter:Float,
    var sechage:Float

) {

}