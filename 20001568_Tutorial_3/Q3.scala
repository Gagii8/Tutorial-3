object Q3{
    def volume(r: Double): Double ={
        4*math.Pi*r*r*r/3
    }

    @main
    def Test():Unit ={
        println(volume(5));
    }
}