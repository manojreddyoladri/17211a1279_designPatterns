package designpatterns;
interface Flight{  
    String getFlightName();  
}  
class AirIndia implements Flight{  
    private final String FNAME;  
    public AirIndia(){  
           FNAME="AIRINDIA BANK";  
   }  
   public String getFlightName() {  
             return FNAME;  
   }  
}  
class SpiceJet implements Flight{  
    private final String FNAME;  
    public SpiceJet(){  
           FNAME="SPICEJET FLIGHT";  
   }  
   public String getFlightName() {  
             return FNAME;  
   }  
}  
class StarAir implements Flight{  
    private final String FNAME;  
    public StarAir(){  
           FNAME="STARAIR FLIGHT";  
   }  
   public String getFlightName() {  
             return FNAME;  
   }  
}  
abstract class Departures{  
	   protected int price;  
	   abstract void getPricePerDist(int price);  
	   public void calculateTotalAmount(int dist)  
	   {  
	   int amount;
	   amount = price*dist;
	  
	System.out.println("The total amount for your journey is "+amount);     
	 }  
	}
class Internationals extends Departures{  
    public void getPricePerDist(int r){  
        price=r;  
   }  
}
class Domestic extends Departures{  
    public void getPricePerDist(int r){  
        price=r;  
   }  
}
public abstract class AbstractFactory {
	public abstract Flight getFlight(String flight);  
	public abstract Departures getDeparture(String departure);
}
class FlightFactory extends AbstractFactory{  
	   public Flight getFlight(String flight){  
	      if(flight == null){  
	         return null;  
	      }  
	      if(flight.equalsIgnoreCase("AirIndia")){  
	         return new AirIndia();  
	      } else if(flight.equalsIgnoreCase("SpiceJet")){  
	         return new SpiceJet();  
	      } else if(flight.equalsIgnoreCase("StarAir")){  
	         return new StarAir();  
	      }  
	      return null;  
	   }  
	  public Departures getDeparture(String departure) {  
	      return null;  
	   }  
	}
class DepartureFactory extends AbstractFactory{  
    public Flight getFlight(String flight){  
         return null;  
   }  
 
public Departures getDeparture(String departure){  
if(departure == null){  
  return null;  
}  
if(departure.equalsIgnoreCase("Internationals")){  
  return new Internationals();  
} 
else if(departure.equalsIgnoreCase("Domestic")){  
  return new Domestic();  
} 
return null;  
}  

}
class FactoryCreator {  
    public static AbstractFactory getFactory(String choice){  
     if(choice.equalsIgnoreCase("Flight")){  
        return new FlightFactory();  
     } else if(choice.equalsIgnoreCase("Departures")){  
        return new DepartureFactory();  
     }  
     return null;  
  }  
}