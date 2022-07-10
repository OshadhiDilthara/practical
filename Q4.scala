

object Q4 {
  def main(args: Array[String]){
    var x: Int=40
    var y: Int=30
    def normalPay(x:Int):Double=x*250
    def OTPay(y:Int):Double=y*85
    def grossSalary(x:Int,y:Int):Double=normalPay(x)+OTPay(y)
    def tax(grossSalary:Double):Double=grossSalary*0.12
    def netSalary(x:Int,y:Int):Double=grossSalary(x,y)-tax(grossSalary(x,y))
    
    println(netSalary(x,y))
    
  }
}