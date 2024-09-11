//Задача 2.
//Создать приложение, которое подсчитывает количество различных символов во введенной строке. Символы в ответе расположить в алфавитном порядке.

fun main() {

    println("Введите строку символов:")
    val inputVal = readln()

    var countChar = 1
    var previousChar = inputVal[0]

    for (i in 1 .. inputVal.length - 1) {
        if (previousChar == inputVal[i]) {
            countChar+=1
            previousChar = inputVal[i]
        }
        else {
            if (countChar>1) {
                println( previousChar + " - " + countChar)
            }
            else {
                println( previousChar + " - 1" )
            }
            countChar = 1
            previousChar = inputVal[i]
        }

    }

    if (countChar>1) {
        println( previousChar + " - " + countChar)
    }
    else {
        println( previousChar + " - 1" )
    }

}