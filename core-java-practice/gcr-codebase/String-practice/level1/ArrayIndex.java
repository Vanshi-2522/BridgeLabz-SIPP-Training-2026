import java.util.*;

public class ArrayIndex {
    public static void main(String args[]){
        generateException();
        handleException();
    }

    public static void generateException(){
        Scanner sc = new Scanner(System.in);

        String arr[] = new String[3];

        for(int i = 0; i < 3; i++){
            arr[i] = sc.next();
        }

        System.out.println(arr[5]);
    }

    public static void handleException(){
        Scanner sc = new Scanner(System.in);

        String arr[] = new String[3];

        for(int i = 0; i < 3; i++){
            arr[i] = sc.next();
        }

        try{
            System.out.println(arr[5]);
        } catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Array Index Out Of Bounds Exception caught...");
        } catch(RuntimeException e){
            System.out.println("Runtime Exception caught...");
        }
    }
}