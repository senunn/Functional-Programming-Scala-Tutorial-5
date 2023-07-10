object q3 extends App {
    def addition(x:Int):Int = {
        if (x <= 0){
            0
        }
        else{
            x + addition(x-1)
        }
    }

    println(addition(5))
}