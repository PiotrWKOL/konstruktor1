import java.util.Scanner

class Event(
    var name: String = "brak",
    var day: Int = 1,
    var month: Int = 1,
    var year: Int = 2015,
    var hour: Int = 12,
    var minutes: Int = 0
) {
    fun load() {
        val scanner = Scanner(System.`in`)
        println("\nNazwa wydarzenia: ")
        name = scanner.next()
        println("\nDzien: ")
        day = scanner.nextInt()
        println("\nMiesiac: ")
        month = scanner.nextInt()
        println("\nRok: ")
        year = scanner.nextInt()
        println("\nGodzina: ")
        hour = scanner.nextInt()
        println("\nMinut: ")
        minutes = scanner.nextInt()
    }

    fun show() {
        println("$name $day.$month.$year $hour:$minutes")
    }
}

fun main() {
    val w1 = Event()

    w1.show()
}
