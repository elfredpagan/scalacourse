package recfun
import common._

object Main {
  def main(args: Array[String]) {
    println("Pascal's Triangle")
    for (row <- 0 to 10) {
      for (col <- 0 to row)
        print(pascal(col, row) + " ")
      println()
    }
  }
  
  /**
   * Exercise 1
   */
  def pascal(c: Int, r: Int): Int = {
    if(c < 0)
      0
    else if(c > r)
      0
    else if (r == 0) 
      1
    else
      pascal(c - 1, r - 1) + pascal(c, r-1)
  }
    

  /**
   * Exercise 2
   */
  def balance(chars: List[Char]): Boolean = {
    def isBalanced(count: Int, chars: List[Char]): Boolean = {
      if(count == -1) return false
      chars match {
        case head :: tail =>
          head match {
            case '(' => isBalanced(count + 1, tail)
            case ')' => isBalanced(count - 1, tail)
            case _ => isBalanced(count, tail)
          }
        case List() => count == 0
      }
    }
    isBalanced(0, chars)
  }

  /**
   * Exercise 3
   */
  def countChange(money: Int, coins: List[Int]): Int = {
  }
}
