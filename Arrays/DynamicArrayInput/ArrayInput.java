import java.util.*;
import java.io.*;
import java.lang.*;

class Input{
    public static void main(String[] args){
        Scanner in =new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int n=in.nextInt();
        
        //Creating array
        int array[]=new int[n];

        //Taking input in array
        System.out.println("Enter the values:");
        for(int i=0;i<n;i++){
            array[i]=in.nextInt();
        }
        
        //Print array
        System.out.println(Arrays.toString(array));
    }
}

