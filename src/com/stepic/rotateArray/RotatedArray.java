package com.stepic.rotateArray;

public class RotatedArray {


         private static int[] incomingArray(){
            int[] a = {2,3,4,5};
            return a;
        }

        private static void displayInitialArray(){
            int b[] = incomingArray();
            System.out.println("Initial array is: ");
            for (int aB : b) {
                System.out.print(aB + "\t");
            }
        }

        private static void displayRotatedArray(){
            int[] b = incomingArray();

            for (int g = 0; g < b.length/2; g++ ){
                int temp = b[g];
                b[g] = b[(b.length -1) - g];
                b[b.length -1 - g] = temp;
            }
            System.out.println("Rotated array is: ");
            for (int aB : b) {
                System.out.print(aB + "\t");
            }
        }

        public static void main(String[] args) {
            displayInitialArray();
            System.out.println();
            displayRotatedArray();
        }
}
