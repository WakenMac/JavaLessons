public class BinarySearch {
    
    private int iterations, low, high, mid;

    public int binarySearch(int [] array, int target){
        prepareVariables(array.length);

        //If low (lowest index) is higher than the highest index, then the target is not an element of the array passed
        while(low <= high){
            prepareMidValue();
            if (target == array[mid]){
                System.out.println("Iteration #" + iterations + ", Target found in index: " + mid);
                return array[mid];
            }
            
            else if (target < array[mid]){
                System.out.println("Iteration #" + iterations + ", Target not found in index: " + mid);
                high = mid - 1;
            }
            
            else if (target > array[mid]){
                System.out.println("Iteration #" + iterations + ", Target not found in index: " + mid);
                low = mid + 1;
            }
            
            iterations++;
        }

        return Integer.MIN_VALUE;
    }

    private void prepareVariables(int arrayLength){
        iterations = 0;
        low = 0;
        high = arrayLength - 1;
    }

    private void prepareMidValue(){
        mid = low + (high - low) / 2;
    }

    public static void main (String [] args){
        BinarySearch searchAlgo = new BinarySearch();

        int [] myArray = new int[100000000];
        for (int i = 0; i < 100000000; i++){
            myArray[i] = i + 1;
        }

        searchAlgo.binarySearch(myArray, 345876);
    }
}
