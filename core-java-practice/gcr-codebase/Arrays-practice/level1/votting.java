import java.util.*;
public class votting{
public static void main(String args[]){
    int age[]= new int[10];

    Scanner sc = new Scanner(System.in);
    System.out.println("Write age");
    for(int i=0;i<age.length;i++){
        
        age[i] = sc.nextInt();
    }

    for(int i=0;i<age.length;i++){
        if(age[i]<=0){
            System.out.println("age:" + age[i] + " Invalid Age");
        }else if(age[i]>=18){
            System.out.println("age:" + age[i] + " can vote");
        }else{
            System.out.println( "age:" + age[i] + " cannot vote");
        }
    }

}}