



public class hey_broInvoker implements Invoker {
    
    private Bartender bartender;
    
    public hey_broInvoker(Bartender bartender){
        this.bartender = bartender;
    }

    @Override
    public void execute() {
       System.out.println("Bartender: Are you ok cowboy?");
        bartender.getClient().setWake_up(true);
        System.out.println("Cowboy: I'm fine. Give me another one!");
        bartender.getClient().setCups(0);
        System.out.println("The cowboy woke up!");
    }
    
}
