

public class to_drinkInvoker implements Invoker {
    private Cowboy cowboy;
    
    public to_drinkInvoker(Cowboy cowboy){
        this.cowboy = cowboy;
    }

    @Override
    public void execute() {
        System.out.println("Cowboy: Every hero deserves a rest...");
        cowboy.setFull_glass(false);
        int number_of_cups = cowboy.getCups();
        number_of_cups ++;
        cowboy.setCups(number_of_cups);
    }
    
    
}
