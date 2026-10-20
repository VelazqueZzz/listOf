
fun main() {
    val ingredients = mutableListOf("Капуста", "Картошка", "Свекла")
    println("В рецепте есть базовые ингредиенты: ${ingredients.joinToString (", ")}")
    println("Желаете добавить еще?")
    val new = readln()
    if (new.equals("да", ignoreCase=true)) {
        println("Какой ингредиент вы хотите добавить?")
        val newIngredients = readln()
        ingredients.add (newIngredients)
    }else return

println("Теперь в рецепте есть следующие ингредиенты: ${ingredients.joinToString (", ")}")

}