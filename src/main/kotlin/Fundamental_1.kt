fun main() {
    prim()
}

// menggunakan var dapat di rubah untuk valuenya atau nilainya
fun variableVar() {
    var company: String = "Infinite Learning"
    company = "Nongsa Digital"
    println(company)
}

// menggunakan val jika di rubah akan menyebabkan error
//fun variableVal() {
//    val company2: String = "Infinite Learning"
//    company2 = "Nongsa Digital"
//    println(company2)
//}

// increment dan decrement pada datas types char
fun incrementAndDecrement() {
    var grade = 'A'

    println("Grade = " + grade++)
    println("Grade = " + grade++)
    println("Grade = " + grade++)
    println("")
    println("Grade = " + grade--)
    println("Grade = " + grade--)
    println("Grade = " + grade--)
}

// string di baca sebagai array
fun cobaString() {
    val stringText = "Kotlin languange"
    val fristChar = stringText[0]

    println("Karakter pertama pada $stringText adalah $fristChar")
}

// String escaping karakter
fun cobaString2() {
    val stringText = "Kampus merdeka \nby \"Infinite Learning\""
    println(stringText)
}

// Raw string """"""
fun rawString() {
    val statement = """
        Belajar bahasa kotlin 
        =====================
        Di infinite learning 
        Bersama kampus merdeka
    """.trimIndent()

    println(statement)
}

// Data types Boolean
fun bol() {
    val x = false
    val y = true

    println("x && y = ${x && y}")
    println("x || y = ${x || y}")
    println("!y = $y")
}

// Data types Boolean Expression
fun bole() {
    val x = 50
    val y = 25

    println("x > y = ${x > y}")
    println("x < y = ${x < y}")
    println("x >= y = ${x >= y}")
    println("x <= y = ${x <= y}")
    println("x == y = ${x == y}")
    println("x != y = ${x != y}")
}

// Data types Boolean function
fun bole2() {
    val x: Boolean = true
    val y: Boolean = false
    val z: Boolean = true

    println("x.and(y) = ${x.and(y)}")
    println("x.or(y) = ${x.or(y)}")
    println("x.and(Z) = ${x.and(z)}")
}

// Data types Number
fun number() {
    val i: Int = 10_000
    val d: Double = 100.00
    val f: Float = 100.00f
    val l: Long = 100_000_0004L
    val s: Short = 10
    val b: Byte = Byte.MAX_VALUE

    println("Int value is = $i")
    println("Double value is = $d")
    println("Float value is = $f")
    println("Long value is = $l")
    println("Short value is = $s")
    println("Byte value is = $b")
}

// Data types Array
fun larik() {
    val arr = arrayOf<String>("satu", "dua", "tiga")

    println(arr[0])
    println(arr.get(1))
    println("=============")

    arr[0] = "angka 1"
    arr.set(1, "angka 2")

    println(arr[0])
    println(arr.get(1))
    println(arr.get(2))
}

// Primitive array
fun prim() {
    val intArray = intArrayOf(2, 9, 11, 15)
    intArray[2] = 30

    print("${intArray[0]}, ${intArray[1]}, ${intArray[2]}, ${intArray[3]}")
}