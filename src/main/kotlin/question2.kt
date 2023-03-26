// QUESTION TWO
// WRITE A FUNCTION THAT TAKES IN A LIST OF STRINGS AND RETURNS THE LONGEST STRING IN THE LIST
fun main (){
    fun findLongestString(strings: List<String>): String? {
        var longest:String? = null
        for (string in strings){
            if (longest == null || string.length>longest.length) {
                longest =string
            }
        }
        return longest
    }
    val strings = listOf("pen", "eraser", "ruler", "ink", "pencil case", "textbook")
    val longest = findLongestString(strings)
    println(longest)
}