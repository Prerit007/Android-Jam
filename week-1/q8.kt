fun main() 
{
  val a=4
  var fac=1
  var sum=0

  for(j in 1..a)
  {
  for(i in 1..j)
   {
    fac*=i
    }
    sum+=fac
    fac=1
  }

  println("Sum of factorials : $sum")
}