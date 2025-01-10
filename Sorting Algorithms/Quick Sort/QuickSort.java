import java.util.Random;
import java.util.random.*;

public class QuickSort {
    int comparisons, swaps, pointer, temp;
    Integer [] array;

    //O(n log n)
    public QuickSort(){
        this.comparisons = this.swaps = this.pointer = 0;
    }

    public void quickSort(Integer [] myArray, int start, int end){
        if (end <= start) //Base case
            return;
        
        int pivot = partition(myArray, start, end);
        quickSort(myArray, start, pivot - 1);
        quickSort(myArray, pivot + 1, end);
    }

    public int partition(Integer [] myArray, int start, int end){
        int pivot = myArray[end];
        int i = start - 1;

        for (int j = start; j <= end - 1; j++){
            comparisons++;
            if(myArray[j] < pivot){
                i++;
                swap(i, j, myArray);
                swaps++;
                continue;
            }
        }
        i++;
        swap(i, end, myArray);

        return i;
    }

    public void swap(int index1, int index2, Integer [] referenceArray){
        temp = referenceArray[index1];
        referenceArray[index1] = referenceArray[index2];
        referenceArray[index2] = temp;
    }

    public <T> void printArray(T [] array){
        for (int i = 0; i < array.length; i++)
            System.out.print(array[i] + " ");
        System.out.println("\nComparisons: " + comparisons + "\nSwaps: " + swaps);
    }

    public static void main(String [] args){
        Random random = new Random();
        QuickSort sort = new QuickSort();
        Integer [] myArray = {1, 6, 2, 4, 3, 8, 0, 9, 5, 7, 10, 15, 14, 16, 13, 11, 12, 20, 18, 19, 17}; //Length 13

        myArray = new Integer[1000];
        for (int i = 0; i < 1000; i++)
            myArray[i] = (Integer) random.nextInt(1000); 
        
        myArray = new Integer[3];
        myArray[0] = 7;
        myArray[1] = 8;
        myArray[2] = 4;

        sort.quickSort(myArray, 0, myArray.length - 1);
        sort.printArray(myArray);
    }
}
