import java.util.*;
import java.io.*;
import java.lang.*;

class Input{
    public static void main(String[] args){
        int array[]={1,2,3,4,5};
        int length=5;
        Scanner in =new Scanner(System.in);
        System.out.println("Enter the element to insert in array:");
        int x=in.nextInt();
        System.out.println("Enter the index:");
        int index=in.nextInt();

        for(int i=length;i<index;i--){
            array[i]=array[i-1];       //Shifting
        }
        array[index]=x;                //Inserting element at certain index
        length++;

        //Print array
        System.out.println(Arrays.toString(array));
    }
}

