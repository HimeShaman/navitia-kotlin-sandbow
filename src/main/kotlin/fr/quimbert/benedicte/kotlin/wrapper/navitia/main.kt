package fr.quimbert.benedicte.kotlin.wrapper.navitia

import retrofit2.Response


fun main() {

    // Insérer ici la clé d'API Navitia
    val navitiaApiKey = "API_KEY_HERE";
    val linesService:LinesService = NavitiaServiceFactory().getLinesService();

    val response:Response<LinesResult> = linesService.findLines("fr-nw", navitiaApiKey)
        .execute()

    if(response.isSuccessful) {
        response.body()?.lines?.forEach {
            println("${it.code} / ${it.name}")
        }
    } else {
        print("Fail !!! ")
    }

}
