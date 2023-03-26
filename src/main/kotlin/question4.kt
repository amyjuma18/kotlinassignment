// QUESTION FOUR
// WRITE A FUNCTION THAT TAKES IN A LIST OF INTEGERS AND RETURNS THE SUM OF ALL THE EVEN NUMBERS IN THE LIST
fun main (){
    fun sumOEvenNumbers(numbers: List<Int>):Int{
        var sum = 0
        for (number in numbers) {
            if (number % 2 == 0) {
                sum += number
            }
        }
        return sum
    }
    val numbers = listOf(31, 32, 33, 34, 35, 36, 37, 38, 39, 40)
    val sumOfEvens = sumOEvenNumbers(numbers)
    println(sumOfEvens)
}