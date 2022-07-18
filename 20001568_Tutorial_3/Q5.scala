object Q5{
    def easy(x: Int):Int ={
        x*8
    }

    def tempo(y:Int): Int ={
        y*7
    }

    @main
    def Test(): Unit ={
        println(easy(2) + tempo(3) + easy(2));
    }
}