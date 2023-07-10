object q2 extends App{
    def GCD(a:Int, b:Int):Int = b match{
        case 0 => a
        case x if x>=a => GCD(x,a)
        case _ => GCD(b,a%b)
    }
    def checkPrime(p:Int, n:Int = 2):Boolean = n match{
        case x if(x == p) => true
        case x if(GCD(p,x) > 1) => false
        case x => checkPrime(p,x+1)
    }


  def primeSeq(x: Int): Unit = {
    if (x > 1) {
      primeSeq(x - 1)
      if (checkPrime(x)) {
        println(x)
      }
    }
  }

    println(primeSeq(10))
}