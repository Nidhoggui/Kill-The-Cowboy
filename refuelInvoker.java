



public class refuelInvoker implements Invoker {
    private Bartender bartender;
    
    public refuelInvoker(Bartender bartender){
        this.bartender = bartender;
    }

    @Override
    public void execute() {
        System.out.println("Bartender: The usual?");
        System.out.println("Cowboy: Of corse...");
        bartender.getClient().setFull_glass(true);
    }
    
    
}
