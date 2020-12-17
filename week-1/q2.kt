fun main(){
  val num1 = 13
  val num2 = 11
  val num3 = 8

  if (num1 >= num2 && num1 >= num3)
    println("$num1 is the largest number")
  else if (num2 >= num1 && num2 >= num3)
    println("$num2 is the largest number")
  else
    println("$num3 is the largest number")  
}