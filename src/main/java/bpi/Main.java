package bpi;

import java.util.Scanner;

import bpi.fsm.DivideByThreeFSM;
import bpi.fsm.NotBinaryException;

public class Main {
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Awaiting your input. eg \"1110011\". Type \"q\" to exit.");
        
        while (true) {
            String input = scanner.next();
            if (input.equalsIgnoreCase("q")) {
            	scanner.close();
                System.exit(0);
            }
            try {
                DivideByThreeFSM fsm = new DivideByThreeFSM();
                System.out.println("> " + fsm.calcRemainder(input));
            } catch(NotBinaryException e) {
                System.out.println("> " + e.getMessage());
            }
        }
    }
}
