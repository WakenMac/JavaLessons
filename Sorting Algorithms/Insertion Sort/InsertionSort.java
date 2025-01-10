import java.util.Random;

public class InsertionSort {
    int comparisons, swaps, pointer, temp, steps;
    Integer [] array;

    //O(n log n)
    public InsertionSort(){
        this.comparisons = this.swaps = this.pointer = this.steps = 0;
    }

    public void insertionSort(Integer [] myArray, boolean increasing){
        this.array = myArray;
        for (int i = 1; i < myArray.length; i++){
            steps++;
            pointer = i - 1;
            temp = myArray[i];

            while (pointer >= 0){
                comparisons++;
                if (myArray[pointer] < temp)
                    break;
                swaps++;
                myArray[pointer + 1] = myArray[pointer];
                pointer--;
            }

            //This is the proper / cleaner version of the algorithm
            // while (pointer >= 0 && myArray[pointer] > temp){
            //     myArray[pointer + 1] = myArray[pointer];
            //     pointer--;
            // }

            myArray[pointer + 1] = temp;
        }
        
    }

    public void swap(int index1, int index2){
        temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }

    public <T> void printArray(T [] array){
        for (int i = 0; i < array.length; i++)
            System.out.print(array[i] + " ");
        System.out.println("\nComparisons: " + comparisons + "\nSwaps: " + swaps + "\nSteps: " + steps);
    }

    public static void main(String [] args){
        Random random = new Random();
        InsertionSort sort = new InsertionSort();
        Integer [] myArray = {1, 6, 2, 4, 3, 8, 0, 9, 5, 7, 10, 15, 14, 16, 13, 11, 12, 20, 18, 19, 17}; //Length 13

        myArray = new Integer[1000];
        for (int i = 0; i < 1000; i++)
            myArray[i] = (Integer) random.nextInt(1000); 

        sort.insertionSort(myArray, true);
        sort.printArray(myArray);
    }
}
