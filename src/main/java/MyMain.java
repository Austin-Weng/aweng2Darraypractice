import java.util.ArrayList;

public class MyMain {

    // Returns the number of odd numbers in mat
    public static int countOdds(int[][] mat) {
        int oddCount = 0;
        for (int row = 0; row < mat.length; row++) {
            for (int col = 0; col < mat[0].length; col++) {
                if (mat[row][col] % 2 != 0) {
                    oddCount++;
                }
            }
        }
        return oddCount;
    }

    // Returns the largest value in mat
    public static int findLargest(int[][] mat) {
        int largestNum = Integer.MIN_VALUE;
        for (int[] row : mat) {
            for (int cell : row) {
                if (cell >= largestNum) {
                    largestNum = cell;
                }
            }
        }
        return largestNum;
    }

    // Write a method that "left-shifts" each row in a 2D array.
    // This means that for each row, all the numbers should be
    // shifted to the left by 1, with wraparound (the first value
    // should wrap around to the last entry in the row)
    public static int[][] leftShift(int[][] mat) {
        for (int[] row : mat){
            int first = row[0];
            for (int i = 0; i < row.length; i++){
                if (i == row.length-1) {
                    row[i] = first;
                } else {
                    row[i] = row[i+1];
                }
            }
        }
        return mat;
    }

    // Creates a 2D array of size arraySize x arraySize
    // where each value is each to the sum of its row and col indexes
    public static int[][] arrayBuilder(int arraySize) {
        int[][] newArray = new int[arraySize][arraySize];
        for (int row = 0; row < arraySize; row++){
            for (int col = 0; col < arraySize; col++){
                newArray[row][col] = row + col;
            }
        }
        return newArray;
    }










    // Methods for the homework:

    // Returns the mean of the 2D array mat
    public static double mean(double[][] mat) {
        int size = mat.length * mat[0].length;
        double sum = 0;
        for (double[] row : mat){
            for (double col : row){
                sum += col;
            }
        }
        sum = sum/size;
        return sum;
    }

    // Returns the median of the 2D array mat
    // Remember that the array is sorted!
    public static double median(double[][] mat) {
        ArrayList<Double> newArr = new ArrayList<Double>();
        for (double[] row : mat) {
            for (double col : row){
                newArr.add(col);
            }
        }
        if (newArr.size() % 2 == 1) {
            return newArr.get(newArr.size()/2);
        } else {
            double first = newArr.get(newArr.size()/2);
            double last = newArr.get((newArr.size()/2) -1);
            return (first + last)/2;
        }

    }


    // Returns the mode of the 2D array mat
    // Remember that the array is sorted!
    public static double mode(double[][] mat) {
        double num = mat[0][0];
        int numOfNum = 0;
        double mostNum = mat[0][0];
        int mostNumOf = 0;
        for (double[] row : mat) {
            for (int col = 0; col < mat[0].length; col++){
                if (row[col] != num){
                    if (numOfNum > mostNumOf) {
                        mostNumOf = numOfNum;
                        mostNum = row[col-1];
                    }
                    num = row[col];
                    numOfNum = 0;
                    num = row[col];
                }
                numOfNum++;
            }
        }
        return mostNum;
    }


    public static void main(String[] args) {
        // Write some code here to test your methods!
    }
}
