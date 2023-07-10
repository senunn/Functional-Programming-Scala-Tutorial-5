object q5 extends App{
    def isEven(x:Int):Boolean = {
        x%2 == 0
    }
    def additionEvens(x:Int):Int = {
       if(x > 0)
       { if(isEven(x) )
        {
            x + additionEvens(x-1)
        }
        else{
            additionEvens(x-1)
        }}else
         {0}
    }

    println(additionEvens(10))
}