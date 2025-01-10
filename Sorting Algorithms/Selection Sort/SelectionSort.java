public class SelectionSort {
    int comparisons, swaps, reference, temp;

    //O(n log n)
    public SelectionSort(){
        this.comparisons = this.swaps =  this.reference = this.temp = 0;
    }

    //Gets the maximum / minimum version of 
    public void selectionSort(Integer [] myArray, boolean increasing){
        for (int i = 0; i < myArray.length; i++){
            reference = i;
            for (int j = i; j < myArray.length; j++){
                comparisons++;
                if (myArray[reference] < myArray[j] && increasing){
                    reference = j;
                    swaps++;
                }

                else if (myArray[reference] > myArray[j] && !increasing){
                    reference = j;
                    swaps++;
                }
            }

            temp = myArray[i];
            myArray[i] = myArray[reference];
            myArray[reference] = temp;
        }
    }

    public <T> void printArray(T [] array){
        for (int i = 0; i < array.length; i++)
            System.out.print(array[i] + " ");
        System.out.println("\nComparisons: " + comparisons + "\nSwaps: " + swaps);
    }

    public static void main(String [] args){
        SelectionSort sort = new SelectionSort();
        Integer [] myArray = {2, 5, 3, 7, 9, 1, 0, 4, 7, 2, 11, 15, 3}; //Length 13

        sort.selectionSort(myArray, true);
        sort.printArray(myArray);
    }
}
