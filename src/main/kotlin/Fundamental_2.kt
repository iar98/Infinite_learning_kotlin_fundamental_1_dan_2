fun main() {
    str2()
}

// functions
fun setUser(name: String, age: Int):String {
    return "Nama kamu adalah $name, dan umur kamu $age tahun"
}

// if kondisi
fun ifkondisi(condition: Boolean) {
    if(condition){
        println("code block to be excecuted if condition is true")
    }else {
        println("code block to be excecuted if condition is false")
    }
}

// if ..else expressions
fun ifExp(timeOpen: Int, timeClose: Int, timeNow: Int) {
    val classStatus =
        if(timeNow >= timeClose) {
           println("Class already closed")
        }else if(timeNow >= timeOpen) {
            println("Class is open")
        }else{
            println("Class is not open yet")
        }
}

fun ifExp2(buka: Int, sekarang: Int) {
    val status =
        if(sekarang >= buka || sekarang < buka) "Sudah buka" else "Masih tutup"
    println(status)
}

// nullable types
fun nul(isi: String) {
    val text: String? = isi

    if(text != null) {
        println(text.length)
    }
}

// nullable safecalls
fun nul2() {
    val text: String? = null

    if(text != null) {
        println(text.length)
    }else{
        println(text?.length)
    }
}

// nullable elvis operator
fun nul3() {
    val text: String? = null

    if(text != null) {
        println(text.length)
    }else{
        println(text?.length ?: "Elvis")
    }
}

// save dan elvis nullable
fun nul4() {
    var dateOut: String? = null
    var status = "Booked"

    status = "Checkout"

    if(status.equals("Checkout")) {
        dateOut = "28/10/2022 12:15:00"
    }

    println(dateOut)
}

// string template
fun str() {
    // tanpa string template
    val company = "Infinite Learning"
    println("We are studying in " + company)
    println("==============================")
    // dengan string template
    val company2 = "Infinite Learning"
    println("We are studying in $company2")
}

// string curly brances
fun str2() {
    val score = 80
    println("Results: ${if(score >= 80) "You win!" else "Please try again!"}")
}