
object ticketprice extends App{

 def Attendence(ticketPrice:Int)= 120+(15-ticketPrice)/5*20;
 def income(ticketPrice:Int)= ticketPrice*Attendence(ticketPrice);
 def expense(ticketPrice:Int)=500+Attendence(ticketPrice)*3;
 def profit(ticketPrice:Int)=income(ticketPrice)-expense(ticketPrice);

 println("Profit for when ticketPrice=5/=" +profit(5));
 println("Profit for when ticketPrice=10/=" +profit(10));
 println("Profit for when ticketPrice=15/=" +profit(15));
 println("Profit for when ticketPrice=25/=" +profit(25));



}