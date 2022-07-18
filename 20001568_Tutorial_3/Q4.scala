object Q4{
    def amount(x:Int):Double ={
        x*24.95
    }

    def discount(amount : Double): Double ={
        amount*0.4
    }

    def shippingamount(x:Int): Double ={
        if(x>50){
            50*3 + (x-50)*0.75
        }
        else{
            x*3
        }
    }

    @main
    def Test() :Unit ={
        println(amount(60) + shippingamount(60) - discount(amount(60)))
    }
}