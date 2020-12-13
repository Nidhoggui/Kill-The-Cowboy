


public class to_faintInvoker implements Invoker {
    
    private Cowboy cowboy;
    
    public to_faintInvoker(Cowboy cowboy){
        this.cowboy = cowboy;
    }

    @Override
    public void execute() {
        System.out.println("Cowboy: Oh f@#... ");
        System.out.println("   .-'\"'-.");
        System.out.println("  / `. ,' \\");
        System.out.println(" |  ,' `.  |");
        System.out.println(" |   ___   |");
        System.out.println(" \\ ( . ) /");
        System.out.println("   '-.:.-'");
        System.out.println("     .:.");
        System.out.println("     :::");
        System.out.println("     :::");
        System.out.println("     :::");
        System.out.println("     :::");
        System.out.println("      '");
        System.out.println("...");
        System.out.println("<(X.X )>");
        System.out.println("The cowboy is feinted...");
        cowboy.setWake_up(false);
    }
    
}
