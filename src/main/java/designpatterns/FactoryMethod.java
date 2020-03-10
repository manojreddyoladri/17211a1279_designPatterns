package designpatterns;    
abstract class Costume{  
         protected double price;  
         abstract void getPrice();  
   
         public void calculateBill(int count){  
              System.out.println(count*price);  
          }  
}

class  Denim extends Costume{   
     public void getPrice(){  
         price=3500;              
    }  
}
class  Chinos extends Costume{  
	    public void getPrice(){   
	        price=2500;  
	   }   
}
class  Sweatshirt extends Costume{  
	    public void getPrice(){   
	        price=1500;  
	   }   
}
public class FactoryMethod {
	public Costume getCostume(String costumeType){  
        if(costumeType == null){  
         return null;  
        }  
      if(costumeType.equalsIgnoreCase("DENIM")) {  
             return new Denim();  
           }   
       else if(costumeType.equalsIgnoreCase("CHINOS")){  
            return new Chinos();  
        }   
      else if(costumeType.equalsIgnoreCase("SWEATSHIRT")) {  
            return new Sweatshirt();  
      }  
  return null;  
}  
}
