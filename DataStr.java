import java.io.LineNumberReader;
import java.util.*;
import java.lang.Math;
public class DataStr{

    public static void create (int numbers[]){
        //pass by reference as well as create an array
        Scanner input = new Scanner(System.in);
        int count = 0;
        for (int i = 0; i < numbers.length; i++){
            if (numbers[i] == 0){
                numbers[i] = input.nextInt();
                count++;
            }
            if (count == 3){
                break;
            }
        }        
        
    }
    

    public static int binarysearch(int arr[],int key){
        int start = 0, end = arr.length - 1;
        while (start <= end){
            int mid = (start + end)/2;
            if (arr[mid] == key){
                return mid;
            }else if (arr[mid] > key){
                end = mid -1;
            }else {
                start = mid + 1;
            }

        }
        return -1;
    }

    public static int largest(int arr[]){
        int largest = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++){
            if (arr[i] > largest){
                largest = arr[i];
            }
        }
        return largest;

    }
    public static void pairs(int arr[]){
        for (int i = 0; i < arr.length - 1; i++){
            for (int j = i + 1; j < arr.length; j++){
                System.out.print("(" + arr[i] + "," + arr[j] + ") ");
            }
            System.out.println();
        }
    }

    //Run time of this algorithm is o(n^3) and space complexity is O(1)
    public static void maximum_subarrays_sum(int arr[]){
        int max_sum = Integer.MIN_VALUE;
        for(int start = 0; start < arr.length; start++){
            for (int end = start; end < arr.length; end++){
                int current_sum = 0;
                for (int i = start; i <= end ; i++){
                    current_sum += arr[i];
                }
                if (current_sum > max_sum){
                    max_sum = current_sum;
                }
            }
        }
        System.out.println("The maximum sum of the subarray of given array is " + max_sum);
    }

    //Runtime of this algorithm is O(n^2) and space complexity is O(N)
    public static void prefix_subarrays(int arr[]){
        int prefix_arr[] = new int[arr.length];
        prefix_arr[0] = arr[0];
        for(int index = 1; index < arr.length; index++){
            int total = prefix_arr[index-1] + arr[index];
            prefix_arr[index] = total;
        }
        int max_sum = Integer.MIN_VALUE;
        for(int start = 0; start < arr.length ; start++ ){
            for (int end = start; end < arr.length; end++){
                int current_sum = start == 0? prefix_arr[end]: prefix_arr[end] -prefix_arr[start - 1];
                if (current_sum > max_sum){
                    max_sum = current_sum;
                }
            }
        }
        System.out.println("The maximum sum of the subarray of given array is " + max_sum);
    }


    //This is the optimized way to do the prefix sum using kadane's algorithm where time complexity will be O(N)
    //Space complexity will be O(1)

    public static void kadane_alg(int arr[]) {
        int max_sum = Integer.MIN_VALUE;
        int current_sum = 0;
        for (int index = 0; index < arr.length; index++){
            current_sum += arr[index];
            if (max_sum < current_sum){
                max_sum = current_sum;
            }
            if (current_sum < 0){
                current_sum = 0;
            }
        }
        System.out.println("The maximum sum of the subarray of given array is " + max_sum);
    }


    //Optimized solution for trapping rainwater dsa problems

    public static void trap_water(int height[]){
        int height_len = height.length;
        //determining the left boundary
        int left_bound[] = new int[height_len];
        left_bound[0] = height[0];
        for (int i = 1; i < height_len; i ++){
            int new_bound = Math.max(height[i], left_bound[i-1]);
            left_bound[i] = new_bound;
        }

        //determining the right boundary
        int right_bound[] = new int[height_len];
        right_bound[height_len - 1] = height[height_len - 1];
        for (int j = height_len - 2; j >= 0; j--){
            int new_bound = Math.max(right_bound[j+1], height[j]);
            right_bound[j] = new_bound;
        }

        //Finding the water level and trapped water
        int trapped_water = 0;
        for (int index = 0; index < height_len; index++){
            int water_level = Math.min(left_bound[index], right_bound[index]);
            int temp_trap_water = water_level - height[index];
            trapped_water += temp_trap_water > 0 ? temp_trap_water : 0;
            
        }

        System.out.println(trapped_water);
    }

    //This prints the arr
    public static void printArr(int arr[]){
        for (int i = 0; i <arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    //Sorting an arr using bubblesort method
    public static void bubbleSort(int arr[], boolean Type){
        if (Type){
            for (int i = 0; i < arr.length - 1; i++ ){
                for (int j = 0; j < arr.length-1-i; j++){
                    if (arr[j] > arr[j+1]){
                        int temp = arr[j];
                        arr[j] = arr[j + 1];
                        arr[j+1] = temp;
                    }
                }
            }
        }else{
            for (int i = 0; i < arr.length - 1; i++ ){
                for (int j = 0; j < arr.length-1-i; j++){
                    if (arr[j] < arr[j+1]){
                        int temp = arr[j];
                        arr[j] = arr[j + 1];
                        arr[j+1] = temp;
                    }
                }
            }
        }
        
    }

    //Selection Sort
    public static void selectionSort(int arr[]){
        for (int i = 0; i < arr.length -1; i++){
            int minPos = i;
            for (int j = i + 1; j < arr.length ; j++){
                if (arr[j] < arr[minPos]){
                    minPos = j;
                }
            }
            int temp = arr[minPos];
            arr[minPos] = arr[i];
            arr[i] = temp; 
        }
    }

    //Insertion sort
    public static void insertionSort(int arr[]){
        if (arr.length <= 1){
            return;
        }
        for (int i = 1; i < arr.length; i++){
            int curr = arr[i];
            int prev = i - 1;
            while (prev >= 0 && arr[prev] > curr){
                arr[prev + 1] = arr[prev];
                prev--;
            }
            arr[prev+1] = curr;
            
        }
    }

    //Counting Sort
    public static void countingSort(int arr[]){
        int largest = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++){
            largest = Math.max(largest, arr[i]);
        }

        int count[] = new int[largest + 1];

        for(int i = 0; i< arr.length; i++){
            count[arr[i]]++;
        }

        //This formula is doing actual sorting
        int j = arr.length - 1;
        for (int i = 0; i < count.length ; i++){
            while (count[i] > 0){
                arr[j] = i;
                count[i]--;
                j--;
            }
        }
    }

    public static int frequency(int arr[][], int key){
        int total_count = 0;
        for (int i = 0; i < arr.length; i++){
            for (int j= 0; j < arr[0].length;j++){
                if (arr[i][j]==key){
                    total_count++;
                }
            }
        }
        System.out.println("The frequency of number " + key + " in given array is " + total_count);
        return total_count;
    }

    //finding the sum of second row
    public static void secondRowSum(int arr[][]){

        int totalSum = 0;
        if (arr.length <= 1){
            System.out.println("Please provide a matrix with at least 2 rows.");
        }else{
            for (int i = 0; i < arr[1].length; i++){
                totalSum += arr[1][i];
        }
        System.out.println("The total sum of element in second row is " + totalSum);
    }
    }

    public static void transpose(int arr[][]){
        printMatrix(arr);
        System.out.println();
        int newRow = arr[0].length;
        int newCol = arr.length;
        int tMatrix[][] = new int[newRow][newCol];

        for (int i = 0; i < arr.length; i++){
            for (int j= 0; j < arr[0].length;j++){
                tMatrix[j][i] = arr[i][j];
            }
        }

        printMatrix(tMatrix);

    }

    public static void printMatrix(int arr[][]){
        for (int i = 0; i < arr.length; i++ ){
            printArr(arr[i]);
        }
    }



    //Main Functions starts from here



    
    public static void main(String[] args){

        //Creation of an array
        // int marks[] = {97,98,96};
        // String fruits[] = {"apple", "banana", "mango"};
        // char apl[] = {'s', 'a', 'n', 'd', 'e', 's', 'h'};

        //Creation of an array by defining the size at first
        //This also shows the pass by reference is applies in array
        // int numbers[] = new int[50];
        // create(numbers);
        // for(int i = 0; i < numbers.length; i++){
        //     System.out.print(numbers[i] + " ");
        // }

        // int arr[] = {5,4,1,3,2};
        // int key = 19;
        // System.out.println("The index of " + key + " is " + binarysearch(arr, key));
        // System.out.println("The largest number is " + largest(arr));
        // pairs(arr);
        
        // maximum_subarrays_sum(arr);

        // prefix_subarrays(arr);
        
        // kadane_alg(arr);
        
        // trap_water(arr);
        
        //for ascending order type true for descending order type false
        // bubbleSort(arr, true);
        // printArr(arr);

        // selectionSort(arr);
        // printArr(arr);

        // insertionSort(arr);
        // printArr(arr);


        //Inbuilt sorting method first of all import java.util.Arrays ;
        // Arrays.sort(arr);
        // printArr(arr);

        //This method sort an array from start index to end index where end index is exclusive
        // Arrays.sort(arr,0,3);
        // printArr(arr);

        //To reverse we must also import java.util.Collections;
        //To use this method the data type of the array must be Integer rather than integer
        // Arrays.sort(arr, Collections.reverseOrder());
        // printArr(arr);

        // countingSort(arr);
        // printArr(arr);
        

        //Two-d array

        //first defining a two d array and then assigning value to its cell

        // int matrix[][] = new int[2][3];
        // Scanner input = new Scanner(System.in);

        // for (int i = 0 ; i < matrix.length; i++){
        //     for (int j = 0; j < matrix[0].length; j++){
        //         matrix[i][j] = input.nextInt();
        //     }
        // }

        // for (int i = 0 ; i < matrix.length; i++){
        //     for (int j = 0; j < matrix[0].length; j++){
        //         System.out.println("The element at (" + i + " , "  + j + ") is " + matrix[i][j]);
        //     }
        // }


        //defining two d matrix initially

        //counting the frequency of an element in two d array
        // int matrix[][] = {{4,7,8},{8,8,7}};
        // frequency(matrix, 7);

        //find the sum of all the elements in the second row of given two d array
        // int arr[][] = {{1,4,9},{11,4,3},{2,2,3}};
        // secondRowSum(arr);

        //finding the transpose of a matrix
        int arr[][] = {{1,2,3},{4,5,6}};
        transpose(arr);


    }
}