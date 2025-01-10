public class BubbleSort {

    int comparisons, swaps;

    public BubbleSort(){
        this.comparisons = this.swaps = 0;
    }

    //Sorts the array in increasing/decreasing order (based on @param increasing)
    public int [] bubbleSort(Integer [] refArray, boolean increasing){
        if (refArray == null)
            return null;
        
        for (int i = 0; i < refArray.length; i++){
            for (int j = 0; j < refArray.length - 1; j++){
                comparisons++;
                if (refArray[j] < refArray[j + 1] && increasing){
                    int temp = refArray[j];
                    refArray[j] = refArray[j+ 1];
                    refArray[j + 1] = temp;
                    swaps++;
                }

                else if ((refArray[j] > refArray[j + 1]) && !increasing){
                    int temp = refArray[j];
                    refArray[j] = refArray[j+ 1];
                    refArray[j + 1] = temp;
                    swaps++;
                }
            }
        }

        return null;
    }

    public <T> void printArray(T [] array){
        for (int i = 0; i < array.length; i++)
            System.out.print(array[i] + " ");
        System.out.println("\nComparisons: " + comparisons + "\nSwaps: " + swaps);
    }

    public static void main(String [] args){
        BubbleSort sort = new BubbleSort();
        Integer [] myArray = {2, 5, 3, 7, 9, 1, 0, 4, 7, 2, 11, 15, 3};

        sort.bubbleSort(myArray, false);
        sort.printArray(myArray);
    }
}
