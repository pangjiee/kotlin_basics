package leetcode.string

fun main(args: Array<String>) {
    fun findLargestCommonPrefix(a: Array<String>): String {
        var res = StringBuilder()
        a.sort()
        val firstWord = a[0]
        val lastWord = a[a.size - 1]
        val minLength = minOf(firstWord.length, lastWord.length)

        for (i in 0..<minLength) {
            if (firstWord[i] != lastWord[i]) {
                return res.toString()
            }
            res.append(firstWord[i])
        }
        return res.toString()
    }

    var strs = arrayOf("flower", "flow", "flight")
    println(findLargestCommonPrefix(strs))

}
