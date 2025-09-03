import java.util.Scanner;
public class Main{
    public static void main(String [] args){
        Scanner input = new Scanner(System.in);
        int num = 0; //Set this as zero to avoid error because the java program is expecting a value for the variable
        String answer;
        
        do{
            System.out.print("Enter an integer (0 to exit):");
            
            if (input.hasNextInt()){ //This will check the token on the scanner if it's a integer or not. If not the program will go  to the else condition
                num = input.nextInt();
            
                if (num == 0){
                    System.out.println("Exiting program...");
                    break;
                }
                if (num % 2 == 0){
                    System.out.println(num + " is even ");
                }else{
                    System.out.println(num + " is odd ");
                }
            }else{
                System.out.println("Invalid number, enter whole number..");
                input.next();
            } 
            System.out.println("Do you want to continue? (Yes or No)");
            answer = input.next();
        }while(answer.equalsIgnoreCase("Yes"));
    }
}
