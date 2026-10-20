
fun main() {
    val ingredients = listOf("Капуста","Картошка", "Свекла", "Лук")
    println("В рецепте есть следующие ингредиенты: ${ingredients.joinToString (", ")}")
    ingredients.forEach{ println(it) }

}