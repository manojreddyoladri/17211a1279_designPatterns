package designpatterns;
import java.io.*;
public class Main {

	public static void main(String[] args)throws IOException {
		// TODO Auto-generated method stub
		System.out.println("Implementing Factory Method pattern");
		FactoryMethod costumeFactory = new FactoryMethod();  
        
	      System.out.print("Enter the name of costume for which the bill will be generated: ");  
	      BufferedReader br=new BufferedReader(new InputStreamReader(System.in));  
	  
	      String costumeName=br.readLine();  
	      System.out.print("Enter the number of costumes for bill will be calculated: ");  
	      int costumeCount=Integer.parseInt(br.readLine());  
	  
	      Costume p = costumeFactory.getCostume(costumeName);  
	      //call getRate() method and calculateBill()method of DomesticPaln.  
	  
	       System.out.print("Bill amount for "+costumeName+" of  "+costumeCount+" costumes is: ");  
	           p.getPrice();  
	           p.calculateBill(costumeCount);  
	     System.out.println("Implementing Abstract Factory Pattern");
	     System.out.print("Enter the name of Flight: ");  
	      String flightName=br.readLine();  
	  
	System.out.print("\n");  
	System.out.print("Enter the kind of departure like Internationals or Domestic: ");  
	  
	String departuresName=br.readLine();  
	AbstractFactory flightFactory = FactoryCreator.getFactory("Flight");  
	Flight f=flightFactory.getFlight(flightName);  
	  
	System.out.print("\n");  
	System.out.print("Enter the price per dist for "+f.getFlightName()+ ": ");  
	  
	int price=Integer.parseInt(br.readLine());  
	System.out.print("\n");  
	System.out.print("Enter the dist you want to travel: ");  
	  
	int dist=Integer.parseInt(br.readLine());  
	System.out.print("\n");    
	System.out.println("you are travelling in "+ f.getFlightName());  
	  
	AbstractFactory departureFactory = FactoryCreator.getFactory("Departures");  
	           Departures d=departureFactory.getDeparture(departuresName);  
	           d.getPricePerDist(price);  
	           d.calculateTotalAmount(dist);
	System.out.println("Implementing Adapter pattern with the credit card example");
	CreditCard targetInterface=new AdapterBankCustomer();  
	  targetInterface.giveBankDetails();  
	  System.out.println(targetInterface.getCreditCard()); 
	System.out.println("Implementing Bridge pattern with the example of production and assemble of different kind of chocolates");
	BridgePatternChocolate chocolate1 = new Kitkat(new Produce(), new Assemble()); 
    chocolate1.manufacture(); 
    BridgePatternChocolate chocolate2 = new DairyMilk(new Produce(), new Assemble()); 
    chocolate2.manufacture(); 
    System.out.println("Implementing Chain of responsibility pattern with the example of stock market points");
    ChainPattern c1 = new NegativePoints(); 
    ChainPattern c2 = new ZeroPoints(); 
    ChainPattern c3 = new PositivePoints(); 
    c1.setNext(c2); 
    c2.setNext(c3); 

    //calling chain of responsibility 
    c1.process(new StockPoint(1.25)); 
    c1.process(new StockPoint(-0.5)); 
    c1.process(new StockPoint(0)); 
    c1.process(new StockPoint(2.2));
    System.out.println("Implementing Command Pattern with the example of home automation");
    SimpleRemoteControl remote = 
            new SimpleRemoteControl(); 
    Heater heater = new Heater(); 
    Television tele = new Television(); 

  // we can change command dynamically 
  remote.setCommand(new
              HeaterOnCommand(heater)); 
  remote.buttonWasPressed(); 
  remote.setCommand(new
          StereoOnWithCDCommand(tele)); 
  remote.buttonWasPressed(); 
  remote.setCommand(new
             TelevisionOffCommand(tele)); 
  remote.buttonWasPressed(); 
	}

}
