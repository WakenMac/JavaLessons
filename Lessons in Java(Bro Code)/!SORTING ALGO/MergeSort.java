public class MergeSort{

    static int comparisons = 0, steps = 0;
    public static void main (String [] args){
        int [] array = {1, 6, 2, 4, 3, 8, 0, 9, 5, 7, 10, 15, 14, 16, 13, 11, 12, 20, 18, 19, 17};

        split(array);

        for (int i : array){
            System.out.print(i + " ");
        }
        System.out.println("\nSteps: " + steps + "\nComparisons: " + comparisons);
    }

    private static void split (int [] array){
        if (array.length <= 1){
            return;
        }

        //INDICES
        int middle = (int) array.length / 2;
        int [] leftSide = new int [middle];
        int [] rightSide = new int [array.length - middle];

        //SPLITTING
        int i = 0, j = 0;
        for (i = 0; i < array.length; i++){
            steps++;
            if (i < middle){
                leftSide[i] = array[i];
            }   else {
                    rightSide[j] = array[i];
                    j++;
                }
        }

        split(leftSide);
        split(rightSide);
        merge(leftSide, rightSide, array);
    }

    private static void merge (int [] leftSide, int [] rightSide, int [] array){
        //INDICES
        int i = 0, l = 0, r = 0;

        while (l < leftSide.length && r < rightSide.length){
            comparisons++;
            if (leftSide[l] < rightSide[r]){
                array[i] = leftSide[l];
                i++;
                l++;
            }   else {
                    array[i] = rightSide[r];
                    i++;
                    r++;
                }
        }

        while (l < leftSide.length){
            comparisons++;
            array[i] = leftSide[l];
            i++;
            l++;
        }

        while (r < rightSide.length){
            comparisons++;
            array[i] = rightSide[r];
            i++;
            r++;
        }
    }
}