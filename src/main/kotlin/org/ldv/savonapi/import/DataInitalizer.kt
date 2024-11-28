package org.ldv.savonapi.import
import org.ldv.savonapi.model.entity.Caracteristique
import org.ldv.savonapi.model.entity.Ingredient
import org.springframework.boot.CommandLineRunner
import org.springframework.stereotype.Component

@Component
class DataInitializer (val ingredientDAO: org.ldv.savonapi.model.dao.IngredientDAO, val caracteristiqueDAO: org.ldv.savonapi.model.dao.CaracteristiqueDAO, val mentionDAO: org.ldv.savonapi.model.dao.MentionDAO) : CommandLineRunner {
    override fun run(vararg args: String?) {
        //Pour importer les ingredients
        if (ingredientDAO.count() == 0L) { // Éviter les doublons
            var huileOlive = Ingredient(1,
                "Huile d'olive",
                189f,
                78f,
                111f,
                9.26f,
                10.192f,
                9.838f,
                9.152f,
                10.144f,
                9.298f,
                10.194f
            )
            var ingredients = listOf(huileOlive)
            ingredientDAO.saveAll(ingredients)
        }
        if (caracteristiqueDAO.count() == 0L) {
            Caracteristique(1, "sopa")
            Caracteristique(2, "iode")
            Caracteristique(3, "isn")
            Caracteristique(4, "douceur")
            Caracteristique(5, "lavant")
            Caracteristique(6, "volMousee")
            Caracteristique(7, "tenueMousse")
            Caracteristique(8, "durete")
            Caracteristique(9, "solubiliter")
            Caracteristique(10, "sechage")

            var caracteristique = listOf<Caracteristique>()
            caracteristiqueDAO.saveAll(caracteristique)

        }
    }
}