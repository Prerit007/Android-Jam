fun main(args: Array<String>) {
  val n = 40

  if (n%5 == 0 && n%11 == 0)
    println("$n is divisible by 5 and 11")
  else
    println("$n is not divisible by 5 and 11")
}