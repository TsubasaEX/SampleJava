import java.util.Scanner;
import javax.swing.JOptionPane;

public class HelloWorld {

    public static void main(String[] args){
        System.out.println("Hello World!!");

//        Scanner input = new Scanner(System.in);
//        System.out.print("input a:");
//        int a = input.nextInt();
//        System.out.printf("a: %d\n", a);
//
//        System.out.print("input b:");
//        double b = input.nextDouble();
//        System.out.println("b: "+b);
//
//        input.nextLine();  // Consume newline left-over
//        System.out.print("input c:");
//        String c = input.nextLine();
//        System.out.println("c: "+c);

        String name =JOptionPane.showInputDialog("What is your name?");
        String message = String.format("Welcome, %s, to JAVA Programming!!",name);
        JOptionPane.showMessageDialog(null,message);
    }


}
