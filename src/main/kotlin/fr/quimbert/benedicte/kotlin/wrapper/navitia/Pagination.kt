package fr.quimbert.benedicte.kotlin.wrapper.navitia

import com.google.gson.annotations.SerializedName

data class Pagination(
    @SerializedName("start_page")
    val startPage: Int,
    @SerializedName("items_on_page")
    val itemsOnPage: Int,
    @SerializedName("items_per_page")
    val itempsPerPage: Int,
    @SerializedName("total_result")
    val totalResult: Int) {

}