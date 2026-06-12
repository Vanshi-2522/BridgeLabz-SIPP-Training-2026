// package core-java-practice.gcr-codebase.String-practice.level1;
import java.util.*;

public class IndexOutOfBounds {
    public static void main(String args[]){
        generateException();

        handleException();
    }

    public static void generateException(){
        Scanner sc = new Scanner(System.in);

        System.out.println("Write String: ");
        String s = sc.next();

        System.out.println("Write index: ");
        int idx = sc.nextInt();

        System.out.println(s.charAt(idx));
    }
    public static void handleException(){

        Scanner sc = new Scanner(System.in);
        System.out.println("Write String: ");
        String s = sc.next();

        System.out.println("Write index: ");
        int idx = sc.nextInt();

        try{
        System.out.println(s.charAt(idx));
        } catch(StringIndexOutOfBoundsException e){
            System.out.println("Index Out Of Bounds Exception caught...");
        }
    }
}
