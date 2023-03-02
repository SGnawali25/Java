package Homework;

public class Recursion {
    public static void findInd(int arr[],int key, int index){
        if (index == arr.length){
            return;
        }

        if (arr[index] == key){
            System.out.print(index + " ");
        }
        
        findInd(arr, key, index + 1);

    } 

    public static void main(String[] args){
        int arr[] = {0,5,2,6,4,2,7,8,2,2,9};
        findInd(arr, 2,0);
    }
}
