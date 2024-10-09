package leetcode.string

fun main(args: Array<String>) {

    fun findLongestSubString(s: String): Int {
        var maxLength = 0
        val visitedChars = mutableMapOf<Char, Int>()

        // Right pointer moves to the right side
        var left = 0
        for (right in s.indices) {
            val currentCharacter = s[right] // Get the right pointer character

            // If there's a duplicate in the map
            if (visitedChars.containsKey(currentCharacter) && visitedChars[currentCharacter]!! >= left) {
                // Shift left pointer to slide
                left = visitedChars[currentCharacter]!! + 1
            }

            // Update maxLength
            maxLength = maxOf(maxLength, right - left + 1)
            // Update the visited characters map
            visitedChars[currentCharacter] = right
        }

        return maxLength
    }

    var s = "abcabcbb"
    println(findLongestSubString(s))
}
