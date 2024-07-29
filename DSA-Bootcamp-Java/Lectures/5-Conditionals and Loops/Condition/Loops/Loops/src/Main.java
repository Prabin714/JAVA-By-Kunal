import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scc = new Scanner(System.in);
        System.out.print("Please Enter your name :");
        String name = scc.next();
        System.out.print("How many times do you want to Print Your name :");
        int num = scc.nextInt();
        for(int i=0; i<num; i++){
            System.out.println("Your name is :"+name);
        }
    }
}