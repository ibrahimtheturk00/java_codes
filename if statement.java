import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter your age");
            int age = scanner.nextInt();
            if(age >= 75){
                System.out.println("You are too old.");
            }
            else if(age >= 18){
                System.out.println("You are an adult");
            }
            else{
                System.out.println("You are very young to continue");
            }
        }
    }