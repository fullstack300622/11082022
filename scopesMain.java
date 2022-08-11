import java.util.Arrays;
import java.util.Scanner;

//scope
public class Main {
    public static void main(String[] args) {
//        int x = 5;
//        getNumber(x);
//        System.out.println(x);


//        Person p = new Person();

//        Scanner s = new Scanner(System.in);
//        s.nextInt();

        int [] myArr = {2,3,5};
        int [][] matrix = {{2,4},{5,7}};
//        getArray(myArr);
//      String string = Arrays.toString(myArr);
//        System.out.println(string);

        System.out.println(Arrays.toString(myArr));
        String s = Arrays.deepToString(matrix);
        System.out.println(Arrays.deepToString(matrix));

//        System.out.println(Math.);
//        for (int i = 0; i < myArr.length; i++) {
//            System.out.println(myArr[i]);
//        }

        //
    }

    public static void getArray(int[] xxx){
//        System.out.println(Arrays.toString(xxx));
        xxx[0]=5;

//        System.out.println(Arrays.toString(xxx));
    }

    public static void getNumber(int x) {
        x = 30;
    }
}
