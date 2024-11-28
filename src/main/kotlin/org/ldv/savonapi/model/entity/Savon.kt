package org.ldv.savonapi.model.entity

import jakarta.persistence.*

@Entity

class Savon(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id:Long?,
    var nom:String,
    var type:String,
    var poids:Float,
    var prix: Float,
    var description: String
)
{
}