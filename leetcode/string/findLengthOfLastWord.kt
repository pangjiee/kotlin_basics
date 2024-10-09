package leetcode.string

fun main(args: Array<String>) {

    fun findLengthOfLastWord(s: String): Int {
        var res = StringBuilder()
        var t = s.trim()
        for (i in t.length - 1 downTo 0) {
            if (t[i].isLetter()) {
                res.append(t[i])
            } else {
                break
            }
        }
        return res.length
    }

    var s = "   Hello   World  "
    println(findLengthOfLastWord(s))

}