import java.time.LocalTime

fun main(args: Array<String>) {
    println("Enter your age")
    var age = readLine()?.toIntOrNull()
    if (age == null){
        println("Invalid input")
    }else{
        var yearBorn = getCurrentYear() -age
        println("You were born in $yearBorn")
    }
}
fun getCurrentYear(): Int {
    return java.time.LocalDate.now().year
}