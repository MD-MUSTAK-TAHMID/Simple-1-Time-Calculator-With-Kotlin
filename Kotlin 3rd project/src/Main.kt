fun main() {
    println("Enter The Fist Number")
    var firstNum = readln().toInt()
    println("Enter Action (*, /, +, -)")
    var Action = readln()
    println("Enter The Second Number")
    var SecondNum = readln().toInt()

    if (Action == "+"){
        var Result = firstNum + SecondNum
        println("The Resul is: $Result ")
    }else if (Action == "-"){
        var Result = firstNum - SecondNum
        println("The Resul is: $Result ")
    }else if (Action == "/") {
        var Result = firstNum / SecondNum
        println("The Resul is: $Result ")
    }else if (Action == "*"){
        var Result = firstNum * SecondNum
        println("The Resul is: $Result ")
    }else{
        println("Enter A Proper Action")
    }
}