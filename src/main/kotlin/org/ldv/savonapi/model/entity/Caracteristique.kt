package org.ldv.savonapi.model.entity

import jakarta.persistence.*

@Entity
class Caracteristique(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id:Long? = null,
    var nom:String? = null,

    @OneToMany(mappedBy = "caracteristique")
    var mention: MutableList<Mention> = mutableListOf()

) {

}