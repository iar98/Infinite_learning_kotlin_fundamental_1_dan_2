package Data
import java.util.Scanner

fun inputAndOutput() {
    val scanner = Scanner(System.`in`)

    var ulangi = true
    while (ulangi) {
        println("========================")
        println("""
            Applikasi ini bertujuan untuk
            mengecek tipe data apa yang di gunakan
            pada kotlin dengan memasukan nilainya.
        """.trimIndent())
        print("Masukkan nilai data: ")

        val inputData = scanner.nextLine()

        val tipeData = if (inputData.matches(Regex("-?[0-9]+([.,][0-9]+)?([fF])?"))) {
            if (inputData.endsWith("f") || inputData.endsWith("F")) {
                "Float"
            } else {
                val inputWithoutSuffix = inputData.replace(Regex("[fF]$"), "")
                try {
                    val inputNumber = inputWithoutSuffix.replace(',', '.').toDouble()
                    if (inputWithoutSuffix.contains('.')) {
                        "Double"
                    } else {
                        when {
                            inputNumber >= Byte.MIN_VALUE && inputNumber <= Byte.MAX_VALUE -> "Byte"
                            inputNumber >= Short.MIN_VALUE && inputNumber <= Short.MAX_VALUE -> "Short"
                            inputNumber >= Int.MIN_VALUE && inputNumber <= Int.MAX_VALUE -> "Int"
                            inputNumber >= Long.MIN_VALUE && inputNumber <= Long.MAX_VALUE -> "Long"
                            inputNumber >= Float.MIN_VALUE.toDouble() && inputNumber <= Float.MAX_VALUE.toDouble() -> "Float"
                            else -> "Double"
                        }
                    }
                } catch (e: NumberFormatException) {
                    "Invalid"
                }
            }
        } else {
            when {
                inputData.length == 1 -> "Char"
                else -> "String"
            }
        }

        println("Tipe data Anda adalah: $tipeData")

        // Meminta masukan untuk melanjutkan atau tidak
        print("Apakah Anda ingin mengulanginya lagi (Y/N): ")
        val jawaban = scanner.nextLine()
        ulangi = (jawaban.equals("Y", ignoreCase = true))
    }

    scanner.close()
}


