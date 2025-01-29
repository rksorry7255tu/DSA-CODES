import java.util.Scanner;

public class DigitalCircuitSimulator {

   
    public static int andGate(int input1, int input2) {
        return input1 & input2; 
    }

    public static void main(String[] args) {
        Scanner sca = new Scanner(System.in);

        int A,B,C;
        
       
        System.out.print("enter the number of clock cycles: ");
        int clockCycles = sca.nextInt();
        sca.nextLine(); 

        
        for (int cycle = 0; cycle < clockCycles; cycle++) {
            System.out.print("enter inputs for cycle " + (cycle + 1) );
            String line = sca.nextLine();
            String[] tokens = line.split(" ");

            
            A = Integer.parseInt(tokens[1]); 
            B = Integer.parseInt(tokens[3]); 

            
            C = andGate(A, B);

            
            System.out.println("output after cycle " + (cycle + 1) + ": A=" + A + ", B=" + B + ", C=" + C);
        }

        sca.close();
    }
}