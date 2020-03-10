package designpatterns;

public interface Command {
	 public void execute();
}
class Heater
{ 
    public void on() 
    { 
        System.out.println("Heater is on"); 
    } 
    public void off() 
    { 
        System.out.println("Heater is off"); 
    } 
} 
class HeaterOnCommand implements Command 
{ 
    Heater heater; 
  
    // The constructor is passed the light it 
    // is going to control. 
    public HeaterOnCommand(Heater heater) 
    { 
       this.heater = heater; 
    } 
    public void execute() 
    { 
       heater.on(); 
    } 
} 
class HeaterOffCommand implements Command 
{ 
    Heater heater; 
    public HeaterOffCommand(Heater heater) 
    { 
        this.heater = heater; 
    } 
    public void execute() 
    { 
         heater.off(); 
    } 
} 
class Television
{ 
    public void on() 
    { 
        System.out.println("Stereo is on"); 
    } 
    public void off() 
    { 
        System.out.println("Stereo is off"); 
    } 
    public void setCD() 
    { 
        System.out.println("Stereo is set " + 
                           "for CD input"); 
    } 
    public void setDVD() 
    { 
        System.out.println("Stereo is set"+ 
                         " for DVD input"); 
    } 
    public void setOTT() 
    { 
        System.out.println("Stereo is set" + 
                           " for OTT platforms"); 
    } 
    public void setVolume(int volume) 
    { 
       // code to set the volume 
       System.out.println("Stereo volume set"
                          + " to " + volume); 
    } 
} 
class TelevisionOffCommand implements Command 
{ 
    Television tele; 
    public TelevisionOffCommand(Television tele) 
    { 
        this.tele = tele; 
    } 
    public void execute() 
    { 
       tele.off(); 
    } 
} 
class StereoOnWithCDCommand implements Command 
{ 
     Television tele; 
     public StereoOnWithCDCommand(Television tele) 
     { 
         this.tele = tele;
     } 
     public void execute() 
     { 
         tele.on(); 
         tele.setCD(); 
         tele.setVolume(11); 
     } 
} 
class SimpleRemoteControl 
{ 
    Command slot;  
  
    public SimpleRemoteControl() 
    { 
    } 
  
    public void setCommand(Command command) 
    { 
      
        slot = command; 
    } 
  
    public void buttonWasPressed() 
    { 
        slot.execute(); 
    } 
} 