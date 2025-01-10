public class SelectionSort{
    public static void main (String [] args){
        double [] doubleArray = {13, 14, 12, 16, 15, 17, 12};
        
        int steps = 0;
        int min; //Index of the smallest element in the current iteration
        double tempDouble;
        for (int i = 0; i < doubleArray.length; i++){
            steps++;
            min = i;
            for (int j = i + 1; j < doubleArray.length; j++){
                if (doubleArray[min] > doubleArray[j]) {
                    min = j;
                }
                steps++;
            }

            tempDouble = doubleArray[i];
            doubleArray[i] = doubleArray[min];
            doubleArray[min] = tempDouble;
            steps += 3;
        }

        for (double j : doubleArray){
            System.out.println(j);
        }
        System.out.println("STEPS USED: " + steps);
    }
}