package userRegistration.AlgorithPrograms;

import java.util.*;

public class BubbleSort {
    
    /**
     * sort method to sort an array in ascending
     * @param arr is an integer array
     */
    public static void bubbleSort(int[] array)
    {
        int n = array.length;
        int temp = 0;
        for(int i=0; i < n-1; i++){
            for(int j=0; j < n-1; j++){
                if(array[j] > array[j+1]){
                    //swap elements
                    temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
            }       
        }
       for(int print : array) {
    	   System.out.println(print);
       }
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array");
        int size = sc.nextInt();
        System.out.println("Enter array elements");
        int[] myArray = new int[size] ;
        
        for(int i=0;i<myArray.length;i++) {
            myArray[i] = sc.nextInt();
        }
        sc.close();
        bubbleSort(myArray);
    }
}
