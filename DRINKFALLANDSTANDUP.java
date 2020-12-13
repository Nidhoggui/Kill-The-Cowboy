

import java.util.Random;
import java.util.Scanner;

public class DRINKFALLANDSTANDUP {

    
    public static void main(String[] args) {
        Random random = new Random();
        Scanner sc = new Scanner(System.in);
        
        Cowboy cowboy = new Cowboy();
        Bartender bartender = new Bartender(cowboy);
        
        Invoker drink = new to_drinkInvoker(cowboy);
        Invoker refuel = new refuelInvoker(bartender);
        Invoker woke_up = new hey_broInvoker(bartender);
        Invoker f = new press_respectInvoker(bartender);
        Invoker faint = new to_faintInvoker(cowboy);
        
        int choice = 0;
        
        System.out.println();
        System.out.println("| | / (_) | | | | | |          /  __ \\             | |                ");
        System.out.println("| |/ / _| | | | |_| |__   ___  | /  \\/ _____      _| |__   ___  _   _ ");
        System.out.println("|    \\| | | | | __| '_ \\ / _ \\ | |    / _ \\ \\ /\\ / / '_ \\ / _ \\| | | |");
        System.out.println("| |\\  \\ | | | | |_| | | |  __/ | \\__/\\ (_) \\ V  V /| |_) | (_) | |_| |");
        System.out.println("\\_| \\_/_|_|_|  \\__|_| |_|\\___|  \\____/\\___/ \\_/\\_/ |_.__/ \\___/ \\__, |");
        System.out.println("                                                                 __/ |");
        System.out.println("                                                                |___/");
        System.out.println();
        
        do{
        System.out.println("                      Press 1 to play");
        choice = sc.nextInt();
        if(choice==1){
            drink.execute();
        }
        
        if(cowboy.isFull_glass()==false){
            refuel.execute();
        }
        if(cowboy.getCups()==3){
            faint.execute();
            int number = random.nextInt(100);
            if(number>=35){
                woke_up.execute();
            }else{
                f.execute();
                choice = 2;
            }
        }
        }while(choice!=2);
    }
    
}
