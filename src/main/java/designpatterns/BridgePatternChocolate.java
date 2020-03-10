package designpatterns;
interface Workshop 
{ 
    abstract public void work(); 
} 
  

public abstract class BridgePatternChocolate {
	protected Workshop workShop1; 
    protected Workshop workShop2; 
  
    protected BridgePatternChocolate(Workshop workShop1, Workshop workShop2) 
    { 
        this.workShop1 = workShop1; 
        this.workShop2 = workShop2; 
    } 
  
    abstract public void manufacture(); 
}
class Kitkat extends  BridgePatternChocolate{ 
    public Kitkat(Workshop workShop1, Workshop workShop2) 
    { 
        super(workShop1, workShop2); 
    } 
  
   
    public void manufacture() 
    { 
        System.out.print("Kitkat "); 
        workShop1.work(); 
        workShop2.work(); 
    } 
} 
class DairyMilk extends BridgePatternChocolate { 
    public DairyMilk(Workshop workShop1, Workshop workShop2) 
    { 
        super(workShop1, workShop2); 
    } 
  
    public void manufacture() 
    { 
        System.out.print("DairyMilk "); 
        workShop1.work(); 
        workShop2.work(); 
    } 
} 
class Produce implements Workshop { 
    public void work() 
    { 
        System.out.print("Produced"); 
    } 
} 
class Assemble implements Workshop { 
    public void work() 
    { 
        System.out.print(" And"); 
        System.out.println(" Assembled."); 
    } 
} 