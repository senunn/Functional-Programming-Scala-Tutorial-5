object q4 extends App{
    def evenOrodd(s:Int):String = s match{
        case 1 => "Odd"
        case 0 => "Even"
        case _ => evenOrodd(s-2)
    }

    println(evenOrodd(7))
}