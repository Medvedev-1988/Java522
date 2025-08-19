// public static void printArr( int[] arr,int size)
// {
//
//     //nujno napisat cerez rekursiyu
//     //for ispolzovat nelzya
// }
//
//
//
// int[] arr = {1,3,4,5,6,7};
//
// printArr(  arr, arr.length)
//
// //result : 1,3,4,5,6,7
public class Main {
    public static void printArray(int[] arr, int size) {
        if (size == 0) {
            return;
        }
        printArray(arr, size);
        System.out.print(arr[size -1] + " ");
    }

    public static void main(String[] args) {
        int[] arr = {1, 3, 4, 5, 6, 7};
        printArray(arr, arr.length);
    }
}