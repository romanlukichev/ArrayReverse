package oop.practice;

public class Main {

    public static void main(String[] args) {

       int[] myArray = { 0 , 1 , 2 , 3 , 4 , 5 , 6 , 7 , 8 , 9 , 9 , 9 };

        for(int i=0 ; i<myArray.length; i++){
            System.out.print(" " + myArray[i]);
        }

        invert(myArray);
        //invertRec(myArray,0);

        System.out.println(" ");

        for(int i=0 ; i<myArray.length; i++){
            System.out.print(" " + myArray[i]);
        }



    }

    public static void invert(int data[]) {


        System.out.println( "\n mid point index is  " + data.length / 2);
        System.out.println( "\n mid point data  is  " + data[data.length / 2]);

        for (int k = 0; k < data.length / 2; k++) {
            int tmp = data[ k ];
            data[ k ] = data[ data.length - 1 - k ];
            data[ data.length - 1 - k ] = tmp;
        }
    }

    public static void invertRec(int data[], int k) {
        if (k < data.length / 2) {
            int tmp = data[k];
            data[k] = data[data.length - 1  - k];
            data[data.length - 1  - k] = tmp;
            invertRec(data, k + 1);
        }
    }

}
