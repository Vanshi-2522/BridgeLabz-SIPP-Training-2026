import java.util.*;

public class NumberFormat {
    public static void main(String args[]){
        generateException();
        handleException();
    }

    public static void generateException(){
        Scanner sc = new Scanner(System.in);
        String text = sc.next();

        System.out.println(Integer.parseInt(text));
    }

    public static void handleException(){
        Scanner sc = new Scanner(System.in);
        String text = sc.next();

        try{
            System.out.println(Integer.parseInt(text));
        } catch(NumberFormatException e){
            System.out.println("Number Format Exception caught...");
        } catch(RuntimeException e){
            System.out.println("Runtime Exception caught...");
        }
    }
}