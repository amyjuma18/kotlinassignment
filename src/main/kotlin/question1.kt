// QUESTION ONE
// WRITE A FUNCTION THAT TAKES IN TWO INTEGERS AND RETURNS THE SUM OF ALL THE NUMMBERS BETWEEN THEM(INCLUSIVE).
// For example, if the function is called within 3 and 8, it should return 33 (3+4+5+6+7+8=33)
fun  main () {
    fun sumBetweenNumbers(x: Int, y: Int): Int {
        var sum = 0
        for (z in x..y) {
            sum += z
        }
        return sum
    }
    val result = sumBetweenNumbers(2, 5)
    println(result)
}


