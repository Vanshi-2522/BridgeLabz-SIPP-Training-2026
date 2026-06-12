// package core-java-practice.gcr-codebase.String-practice.level1;
import java.util.*;

public class NullException {
    public static void main(String args[]){
        generateException();

        handleException();
    }

    public static void generateException(){
        String s = null;
        System.out.println(s.length());
    }
    public static void handleException(){
        String s = null;

        try{
            System.out.println(s.length());
        } catch(NullPointerException e){
            System.out.println("Null Pointer Exception caught...");
        }
    }
}
