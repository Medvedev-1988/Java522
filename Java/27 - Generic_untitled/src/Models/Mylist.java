package Models;

public class Mylist {
    int size;
    int[] arr;

    {
        size = 0;
        arr = new int[size];
    }

    public void addEnd(int value) {
        int[] tmp = new int[arr.length + 1];
        for (int i = 0; i < arr.length; i++) {
            tmp[i] = arr[i];
        }
        tmp[size] = value;
        arr = tmp;
        size++;
    }


    public void addStart(int value) {
        int[] tmp = new int[arr.length + 1];
        for (int i = size; i > 0; i--) {
            tmp[i] = arr[i - 1];
        }
        tmp[0] = value;
        arr = tmp;
        size++;
    }

    public void add(int index, int value) {
        int[] tmp = new int[arr.length + 1];
        for (int i = 0; i < index; i++) {
            tmp[i] = arr[i];
        }
        tmp[index] = value;
        for (int i = index; i < arr.length; i++) {
            tmp[i+1] = arr[i];
        }
        arr=tmp;
    }

    public void print() {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
