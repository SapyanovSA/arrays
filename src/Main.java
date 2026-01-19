//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //Task 1
        System.out.println("Task 1");
        int[] intArray = new int[]{1, 2, 3};
        float[] floatArray = {1.57f, 7.654f, 9.986f};
        boolean[] booleanArray = {false, true};
        //Task 2
        System.out.println("Task 2");
        for (int index = 0; index < intArray.length; index++) {
            if (index == intArray.length - 1) {
                System.out.println(intArray[index]);
                break;
            } else {
                System.out.print(intArray[index] + ", ");
            }
        }
        for (int index = 0; index < floatArray.length; index++) {
            if (index == floatArray.length - 1) {
                System.out.println(floatArray[index] + " ");
                break;
            } else {
                System.out.print(floatArray[index] + ", ");
            }
        }
        for (int index = 0; index < booleanArray.length; index++) {
            if (index == booleanArray.length - 1) {
                System.out.println(booleanArray[index] + " ");
                break;
            } else {
                System.out.print(booleanArray[index] + ", ");
            }
        }
        //Task 3
        System.out.println("Task 3");
        for (int index = intArray.length - 1; index >= 0; index--) {
            if (index == 0) {
                System.out.println(intArray[index] + " ");
                break;
            }
            System.out.print(intArray[index] + ", ");
        }
        for (int index = floatArray.length - 1; index >= 0; index--) {
            if (index == 0) {
                System.out.println(floatArray[index] + " ");
                break;
            }
            System.out.print(floatArray[index] + ", ");
        }
        for (int index = booleanArray.length - 1; index >= 0; index--) {
            if (index == 0) {
                System.out.println(booleanArray[index]);
                break;
            }
            System.out.print(booleanArray[index] + ", ");
        }
        //Task 4
        System.out.println("Task 4");
        int[] arr = {1, 3, 5, 7, 9};
        for (int index = 0; index < arr.length; ++index) {
            if (arr[index] % 2 != 0) {
                ++arr[index];
            }
            if (index == arr.length - 1) {
                System.out.println(arr[index]);
            } else {
                System.out.print(arr[index] + ", ");
            }
        }
    }
}