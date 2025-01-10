public class DoubleSelectionSort{
    int comparisons, swaps, left, right, min, max, temp;
    Integer [] array;

    //O(n log n)
    public DoubleSelectionSort(){
        this.comparisons = this.swaps = this.min = this.max = this.left = this.right = 0;
    }

    public void doubleSelectionSort(Integer [] myArray, boolean increasing){
        this.array = myArray;
        left = 0;
        right = myArray.length - 1;

        while (left < right){
            min = left;
            max = right;

            for (int i = left; i <= right; i++){
                comparisons++;
                if (myArray[i] > myArray[max])
                    max = i;
                if (myArray[i] < myArray[min])
                    min = i;
            }

            if (min != left){
                swap(min, left);
                swaps++;

                if(max == left)
                    max = min;
            }
            
            if (max != right){
                swap(max, right);
                swaps++;
            }
            
            left++;
            right--;
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
        System.out.println("\nComparisons: " + comparisons + "\nSwaps: " + swaps);
    }

    public static void main(String [] args){
        DoubleSelectionSort sort = new DoubleSelectionSort();
        Integer [] myArray = {1, 6, 2, 4, 3, 8, 0, 9, 5, 7, 10, 15, 14, 16, 13, 11, 12, 20, 18, 19, 17}; //Length 20

        sort.doubleSelectionSort(myArray, true);
        sort.printArray(myArray);
    }
}
