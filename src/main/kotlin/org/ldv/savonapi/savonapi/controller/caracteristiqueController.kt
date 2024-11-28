package org.ldv.savonapi.savonapi.controller
import org.ldv.savonapi.model.dao.CaracteristiqueDAO
import org.ldv.savonapi.model.entity.Caracteristique
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/api/caracteristiques")
class caracteristiqueController(val caracteristiqueDAO: CaracteristiqueDAO) {

    @GetMapping
    fun getAllCaracteristiques(): List<Caracteristique> = caracteristiqueDAO.findAll()

    @GetMapping("/{id}")
    fun getCaracteristiqueById(@PathVariable id: Long): ResponseEntity<Caracteristique> {
        val caracteristique = caracteristiqueDAO.findById(id)
        return if (caracteristique.isPresent) {
            ResponseEntity.ok(caracteristique.get())
        } else {
            ResponseEntity.notFound().build()
        }
    }

    @PostMapping
    fun createCaracteristique(@RequestBody caracteristique: Caracteristique): ResponseEntity<Caracteristique> {
        val savedCaracteristique = caracteristiqueDAO.save(caracteristique)
        return ResponseEntity.ok(savedCaracteristique)
    }

    @PutMapping("/{id}")
    fun updateCaracteristique(
        @PathVariable id: Long,
        @RequestBody caracteristique: Caracteristique
    ): ResponseEntity<Caracteristique> {
        return if (caracteristiqueDAO.existsById(id)) {
            val updatedCaracteristique = caracteristiqueDAO.save(caracteristique)
            ResponseEntity.ok(updatedCaracteristique)
        } else {
            ResponseEntity.notFound().build()
        }
    }

    @DeleteMapping("/{id}")
    fun deleteCaracteristique(@PathVariable id: Long): ResponseEntity<Void> {
        return if (caracteristiqueDAO.existsById(id)) {
            caracteristiqueDAO.deleteById(id)
            ResponseEntity.noContent().build()
        } else {
            ResponseEntity.notFound().build()
        }
    }
}
