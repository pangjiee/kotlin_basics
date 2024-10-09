package leetcode.string

fun main(args: Array<String>) {

    fun findStringInString(hayStack: String, needle: String): Int {
        for (i in 0..hayStack.length - needle.length) {
            if (hayStack[i] == needle[i]) {
                if (hayStack.substring(i, i + needle.length) == needle) {
                    return i
                }
            }
        }
        return -1
    }


    val hayStack = "leetcode"
    val needle = "leeto"
    println(findStringInString(hayStack, needle))


}
