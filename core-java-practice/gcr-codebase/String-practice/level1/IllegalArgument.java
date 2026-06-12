import java.util.*;

public class IllegalArgument {
    public static void main(String args[]){
        generateException();
        handleException();
    }

    public static void generateException(){
        Scanner sc = new Scanner(System.in);
        String s = sc.next();

        System.out.println(s.substring(5, 2));
    }

    public static void handleException(){
        Scanner sc = new Scanner(System.in);
        String s = sc.next();

        try{
            System.out.println(s.substring(5, 2));
        } catch(IllegalArgumentException e){
            System.out.println("Illegal Argument Exception caught...");
        } catch(RuntimeException e){
            System.out.println("Runtime Exception caught...");
        }
    }
}