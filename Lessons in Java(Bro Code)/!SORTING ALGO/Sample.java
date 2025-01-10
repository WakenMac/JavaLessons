public class Sample {
    public class MergeSort {
        public static void main (String [] args){
            int [] array = {5, 4, 7, 3, 8, 9, 1, 2, 6};
    
            merge_Sort(array);
    
            for (int i : array){
                System.out.print(i + " ");
            }
        }
    
        private static void merge_Sort(int [] array){
            int length = array.length;
            if (length <= 1) return;
    
            //INDICES
            int middle = length / 2;
            int [] leftArray = new int [middle];
            int [] rightArray = new int [length - middle];
    
            int i = 0; //Left array
            int j = 0; //Right array
    
            //SPLITTING
            for (i = 0; i < length; i++){
                if (i < middle){
                    leftArray[i] = array[i];
                }   else {
                        rightArray[j] = array[i];
                        j++;
                    }
            }
    
            merge_Sort(leftArray); //Completes left (return)
            merge_Sort(rightArray); //Completes right (return)
            merge(leftArray, rightArray, array); //(completes merge)
        }
    
        private static void merge (int [] leftArray, int [] rightArray, int [] array){
            
            //INDICES
            int leftSize = array.length / 2;
            int rightSize = array.length - leftSize;
            int i = 0, l = 0, r = 0;
    
            while (l < leftSize && r < rightSize){
                if (leftArray[l] < rightArray[r]){
                    array[i] = leftArray[l];
                    i++;
                    l++;
                }   else {
                        array[i] = rightArray[r];
                        i++;
                        r++;
                    }
            }
    
            while (l < leftSize){
                array[i] = leftArray[l];
                i++;
                l++;
            }
    
            while (r < rightSize){
                array[i] = rightArray[r];
                i++;
                r++;
            }
        }
    }
    
}