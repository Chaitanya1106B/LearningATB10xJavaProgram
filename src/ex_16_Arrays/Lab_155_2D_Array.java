package ex_16_Arrays;

public class Lab_155_2D_Array {
    public static void main(String[] args) {
        int [][] array_2d =  new int[3][3];

        array_2d[0][0] = 90;  // row * column
        array_2d[0][1] = 91;
        array_2d[0][2] = 92;
        // array_2d[0][3] = 93; -- Array out of index

        array_2d[1][0] = 1;
        array_2d[1][1] = 3;
        array_2d[1][2] = 5;

        array_2d[2][0] = 2;
        array_2d[2][1] = 4;
        array_2d[2][2] = 6;

//        90 91 92
//        1  3  5
//        2  4  6

    }
}
