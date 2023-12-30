package basics_24rdDec;

public class Lab0110 {
    public static void main(String[] args) {

//        ID Array --> int[] arr = new int[3];
//
//        2D Array -->  int arr2 [][] = new int[3][3];
//
//        1st Row

        int[] a = {1,2,3};

        int[][] arr = new int[3][3];
        int arr2 [][] = new int[3][3];

        arr [0][0] = 12;
        arr [0][1] = 42;
        arr [0][2] = 54;

        arr [1][0] = 96;
        arr [1][1] = 72;
        arr [1][2] = 86;

        arr [2][0] = 88;
        arr [2][1] = 75;
        arr [2][2] = 65;

        for (int i=0; i<a.length;i++){
            for (int j=0; j<arr[i].length; j++){
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println("");
        }


    }
}
