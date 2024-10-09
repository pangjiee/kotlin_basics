fun main(args: Array<String>) {

    // variables
    var testVar: Int = 2 // can choose to specify datatype (Optional)
    var testVarFloat = 2F
    var testVarLong = 23456789L
    var testVar1 = "String"
    var testBoolean = false

    val testConstantValue = "test" // val if for constant/final variables

    // array
    val array: Array<Int> = arrayOf<Int>()
    val array2 = arrayOf(1, 2, 3, 4, 5)
    val array3 = ArrayList<String>()
    array3.add("test");
    array3.add("test2")
    // println(array.size)
    // println(array2.size)
    // println(array3.get(1))

    // list
    val list = mutableListOf<String>("list_1", "list_2", "list_3")
    list.add("list_4")
    list.forEach() { nums ->
        // println(nums)
    }

    // map
    val map = mutableMapOf<String, Int>()
    map["John"] = 30
    map["Alice"] = 25
    map["Bob"] = 15
    val johnAge = map["John"]
    // println("John's age is $johnAge")
    map.keys.forEach {
        // name -> println(name)
    }
    for ((name, age) in map) {
        // println("$name is $age years old")
    }

    // if else
    var testIfElse = 1
    var res = if (testIfElse == 1) {
        testIfElse = 2
    } else {
        testIfElse = 3
    }
    // println(testIfElse)

    testIfElse = 10000
    // no switch statment use when
    when (testIfElse) {
        in 1..10 -> { // range
            println("1")
        }

        2 -> {
            println("2")
        }

        3 -> {
            println("3")
        }

        else -> {
            println("not found")
        }

    }

    // range
    /*
      1..10
      1 until 10
      10 downTo 1
      ..< --> to replace until keyword
     */
    (1..10 step 5).forEach {
        it
        // println(it)
    }

    // iterator
    val iterList = (1..5).toList()
    //println(iterList.listIterator().next()) // get next value kotli
    //println(iterList.li stIterator().hasNext()) // returns boolean

    // interListWithIndex() prints out index with value
    for (i in iterList) {
        // println(i)
    }

    iterList.forEach {value-> println(value)}

    var i = 0
    while (i <5){
        println(i)
        i++
    }

}