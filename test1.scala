

object test1 {
  def main(args: Array[String]){
    def attendees(ticketPrice:Int):Int = 120 + (15-ticketPrice)/5*20;

    def revenue(ticketPrice:Int):Int = attendees(ticketPrice) * ticketPrice;

    def cost(ticketPrice:Int):Int = 500+ 3* attendees(ticketPrice);

    def profit(ticketPrice:Int):Int = revenue(ticketPrice) - cost(ticketPrice);
    
    // Assumptions : ticket price can not be decreased less than 10 and increased more than 1000 
    var ticketprice:Int = 10;
    var bestTprice:Int=0;
    var maxProfit:Int =0;

   for(ticketprice<-10 to 1000){
         if(profit(ticketprice)> maxProfit){
            maxProfit= profit(ticketprice);
            bestTprice=ticketprice;
         } 
    }

   printf("Best Ticket Price : %d",bestTprice);


  }
}