
fun main() {
    val perPortion = arrayOf(2, 50, 15)
    print("Введите количество порций: ")
    val portions = readln().toInt()

    val eggs = perPortion[0] * portions
    val milk = perPortion[1] * portions
    val butter = perPortion[2] * portions

    println("На $portions порций вам понадобится: Яиц – $eggs шт., молока – $milk мл, сливочного масла – $butter гр.")
}