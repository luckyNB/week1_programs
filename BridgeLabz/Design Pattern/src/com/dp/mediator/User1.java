package com.dp.mediator;

//This is a class.  

public class User1 extends Participant {  
      
    private String name;  
    private ApnaChatShop chat;  
      
    @Override  
    public void sendMsg(String msg) {  
    chat.showMsg(msg,this);  
          
    }  
  
    @Override  
    public void setname(String name) {  
        this.name=name;  
    }  
  
    @Override  
    public String getName() {  
        return name;  
    }  
      
    public User1(ApnaChatShop chat){  
        this.chat=chat;  
    }     
      
}// End of the User1 class.  