import java.io.PrintStream;
import java.util.Date;
import java.util.Scanner;

public class CheckCollatz extends Thread{
    PrintStream out;
	Scanner in;

	public CheckCollatz () {
		out = new PrintStream(System.out);
		in = new Scanner(System.in);
	}


    public void run(){
        public void Check() {
            out.printf("Enter a positive integer: ");
            int variable1 = in.nextInt();
            
            out.printf("%d ", variable1);
            while (variable1 != 1) {
                int variable2 = variable1 % 2;

                if (variable2 == 0) {
                    variable1 = (variable1 / 2);
                } else {
                    variable1 = (3 * variable1 + 1);
                }
                out.printf("%d ", variable1);
            }
        
        }
    }

	public static void main(String[] argv) {
        long start_time = new Date().getTime();
		new CheckCollatz().Check();
        long end_time = new Date().getTime();
        System.out.println(); System.out.println("Ellapsed time: " + (end_time-start_time) + "ms");
	}
}
