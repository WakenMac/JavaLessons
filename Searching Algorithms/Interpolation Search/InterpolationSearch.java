public class InterpolationSearch {
    
    private int low, high, position, iterations, target;
    private int [] array;

    public int interpolationSearch(int [] array, int target){
        prepareVariables(array, target);

        //If low (lowest index) is higher than the highest index, then the target is not an element of the array passed
        while(low <= high && target >= array[low] && target <= array[high]){
            if (low == high){
                if (array[low] == target){
                    System.out.println("Iteration #" + iterations + ", Target found in index: " + low);
                    return array[low];
                }
                System.out.println("Element: " + target + ", is not found in the array");
                return Integer.MAX_VALUE;
            }

            findPosition();
            if (target == array[position]){
                System.out.println("Iteration #" + iterations + ", Target found in index: " + position);
                return array[position];
            }
            
            else if (target < array[position]){
                System.out.println("Iteration #" + iterations + ", Target not found in index: " + position);
                high = position - 1;
            }
            
            else if (target > array[position]){
                System.out.println("Iteration #" + iterations + ", Target not found in index: " + position);
                low = position + 1;
            }
            
            iterations++;
        }

        System.out.println("Element: " + target + ", is not found in the array");
        return Integer.MIN_VALUE;
    }

    private void prepareVariables(int [] array, int target){
        this.array = array;
        this.target = target;
        iterations = 1;
        low = 0;
        high = this.array.length - 1;
    }

    private void findPosition(){
        int bounds = target - array[low];
        int range_value = array[high] - array[low];
        int range_index = high - low;

        System.out.println("Bounds: " + bounds + "\nRange_Value: " + range_value + "\nRange_Index: " + range_index);

        position = (int) low + ((bounds * range_index) / range_value);
    }

    public static void main (String [] args){
        InterpolationSearch searchAlgo = new InterpolationSearch();

        int counter = 0;
        int [] myArray = new int[100000 / 2];
        for (int i = 0; i < 100000; i+= 2){
            myArray[counter++] = i;
        }

        searchAlgo.interpolationSearch(myArray, 7238);
    }

}
