package com.dp.mediator;

public class MediatorDPDemo {  
     
   public static void main(String args[])  
   {  
         
         ApnaChatShop chat = new ApnaChatRoomImpl();  
     
         User1 u1=new User1(chat);  
         u1.setname("Ajay");  
         u1.sendMsg("Hi Ajay! how are you?");  
       
               
         User2 u2=new User2(chat);  
         u2.setname("Vijay");  
         u2.sendMsg("I am Fine ! You tell?");  
   }  
 
}// End of the MediatorPatternDemo class.  