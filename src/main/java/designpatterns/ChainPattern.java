package designpatterns;


class StockPoint 
{ 
    private double points; 
  
    public StockPoint(double points) 
    { 
        this.points = points; 
    } 
  
    public double getPoints() 
    { 
        return points; 
    } 
  
} 
public interface ChainPattern {
	 public abstract void setNext(ChainPattern nextInChain); 
	    public abstract void process(StockPoint request); 
}
  
class NegativePoints implements ChainPattern 
{ 
    private ChainPattern nextInChain; 
  
    public void setNext(ChainPattern c) 
    { 
        nextInChain = c; 
    } 
  
    public void process(StockPoint request) 
    { 
        if (request.getPoints() < 0) 
        { 
            System.out.println("NegativePoints : " + request.getPoints()); 
        } 
        else
        { 
            nextInChain.process(request); 
        } 
    } 
} 
  
class ZeroPoints implements ChainPattern
{ 
      
    private ChainPattern nextInChain; 
  
    public void setNext(ChainPattern c) 
    { 
        nextInChain = c; 
    } 
  
    public void process(StockPoint request) 
    { 
        if (request.getPoints() == 0) 
        { 
            System.out.println("ZeroProcessor : " + request.getPoints()); 
        } 
        else
        { 
            nextInChain.process(request); 
        } 
    } 
} 
  
class PositivePoints implements ChainPattern
{ 
  
    private ChainPattern nextInChain; 
  
    public void setNext(ChainPattern c) 
    { 
        nextInChain = c; 
    } 
  
    public void process(StockPoint request) 
    { 
        if (request.getPoints() > 0) 
        { 
            System.out.println("PositiveProcessor : " + request.getPoints()); 
        } 
        else
        { 
            nextInChain.process(request); 
        } 
    } 
} 