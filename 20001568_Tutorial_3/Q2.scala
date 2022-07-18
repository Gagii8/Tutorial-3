object Q2{
    def farenheit(celcius:Double): Double ={
        celcius*1.8000 + 32
    }

    @main
    def Test(): Unit ={
        println(farenheit(35));
    }
}