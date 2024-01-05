package start.lesson5;

import java.util.Arrays;

public class Array {
    public static void main(String[] args) {
        int x =5;
        int y =10;
        int[] array = {x,y};
        int[] array1 = new int[2];
        array1[0] = array[0];
        array1[1] = array[1];
        array1[0] = 3;
        System.out.println(Arrays.toString(array));
        System.out.println(Arrays.toString(array1));
        var city ="Doha";
        String[] cites = {city};
        System.out.println(Arrays.toString(cites));

    }
}
