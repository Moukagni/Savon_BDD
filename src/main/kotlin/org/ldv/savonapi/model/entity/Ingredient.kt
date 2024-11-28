package org.ldv.savonapi.model.entity

import jakarta.persistence.*

@Entity
class Ingredient(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id:Long?,
    var nom:String?=null,
    var sopa:Float,
    var iode:Float,
    var isn:Float,
    var douceur:Float,
    var lavant:Float,
    var volMousse:Float,
    var tenueMousse:Float,
    var durete:Float,
    var solubiliter:Float,
    var sechage:Float,
)
{

}