package leetcode.string

fun main(args: Array<String>) {

    fun addBinary(a: String, b: String): String {
        var stringBuilder = StringBuilder()
        var aLength = a.length - 1
        var bLength = b.length - 1
        var carry = 0
        while (aLength >= 0 || bLength >= 0) {
            var sum = carry
            if (aLength >= 0) sum += a[aLength] - '0'
            if (bLength >= 0) sum += b[bLength] - '0'
            stringBuilder.insert(0, sum % 2)
            carry = sum / 2
            aLength--
            bLength--
        }
        if (carry != 0) stringBuilder.insert(0, carry)
        return stringBuilder.toString()
    }

    var a = "11"
    var b = "1"
    println(addBinary(a, b))
}