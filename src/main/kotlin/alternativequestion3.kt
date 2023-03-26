// QUESTION 3
// WRITE A FUNCTION THAT TAKES IN A LIST OF INTEGERS AND RETURNS A LIST WITH ALL THE DUPLICATES REMOVED
fun main (){
    fun removeDuplicates(nums: List<Int>): List<Int> {
        return nums.distinct()
    }
    val nums = listOf(100, 102, 102, 113, 114, 114, 205)
    val uniqueNums = removeDuplicates(nums)
    println(uniqueNums) // [1, 2, 3, 4, 5]

}