
package Class;
public class Car {        
    private String mark;
    private String model;
    private String color;
    private int millage;
    private int price;

    //default constructor
 Car(){      
    mark="Suzuki";
    model="SX4";
    color="White";
    millage=10500;
    price=4500;
    
 }
    //parameter constructor
  Car(String mark, String model, String color, int millage, int price){ 
  this.mark=mark;
  this.model=model;
  this.color=color;
  this.millage=millage;
  this.price=price;
          
  }
  
    //display function
  public void display(){  
      System.out.println("Mark : "+mark+"\nModel : "+model+"\nColor : "+color+"\nMillage : "+millage+"\nPrice : "+price);
  
  
  }
  
}