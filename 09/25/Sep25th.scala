object Sep25th {
  def main(args: Array[String]):Unit = {
    val num1: Option[Int] = Some(100)
    val none: Option[Int] = None
    
    println(optionQuestion1(num1))
    println(optionQuestion1(none))
    
  }


  def optionQuestion1(num: Option[Int]):Int = {
    num.getOrElse(2)
  }

}
//1 Option[Int]型である、numが引数として渡されるメソッドoptionQuestion1があります。Someの場合はその値を、Noneの場合は０を返却するメソッドを、getOrElseメソッドを使って作成してください。

  

    

//2 Option[Int]型である、numが引数として渡されるoptionQuestion2メソッドがあります。Someの場合はその値に3を足したSome[Int]を、Noneの場合はそのままNoneを返却するメソッドを、mapメソッドを使って作成してください。


//3 val strOpt: Option[String] = Some("") を定義し、それに対してisEmpty, isDefined を実行した場合にどのような挙動をするか確かめてください。

//4 Option[Option[Int]]型である、numが引数として渡されるoptionQuestion4メソッドがあります。Someの場合はその値を2倍したSome[Int]を、Noneの場合はそのままNoneを返却するメソッドを作成してください。


























