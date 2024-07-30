import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Salary:");
        int salary =sc.nextInt();

        if (salary > 10_000){
            salary=salary+2000;
            System.out.println("The new salary after bonus is :"+salary);
        }
        else if(salary >20_000){
            salary = salary+3000;
            System.out.println("The new salary after bonus is :"+salary);
        }
        else {
            salary+= 1000;
            System.out.println("The new salary after bonus is :"+salary);
        }
    }
}