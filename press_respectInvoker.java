



public class press_respectInvoker implements Invoker {

    private Bartender bartender;
    
    public press_respectInvoker(Bartender bartender){
        this.bartender = bartender;
    }
    
    @Override
    public void execute() {
        System.out.println("Bartender: Are you ok cowboy?");
        System.out.println("Bartender: Are you ok man?");
        System.out.println("Bartender: Oh!");
        System.out.println("Bartender: It was too much for you....");
        System.out.println("Cowboy is dead! GAME OVER");
    }
    
}
