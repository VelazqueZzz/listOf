fun main() {
    val perPortion = listOf(2, 50, 15)

    print("Введите количество порций: ")
    val portions = readln().toInt()

    val total = perPortion.map { it * portions }

    println("На $portions порций вам понадобится: Яиц – ${total[0]} шт., молока – ${total[1]} мл, сливочного масла – ${total[2]} гр.")
}