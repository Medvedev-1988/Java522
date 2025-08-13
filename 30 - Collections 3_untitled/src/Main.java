import java.util.ArrayList;
import java.util.List;

class MyList {
    int size;
    int capacity;
    int[] arr;

    {
        size = 0;
        capacity = 4;
        arr = new int[capacity];
    }

    public void addIndex(int index, int value) {
//        if(index<0||index>size){
//            throw new Exception("Неверный индекс.");
//        }
        if (index < 0) {
            addStart(value);
        } else if (index >= size) {
            add(value);
        } else {
            increaseArr();
            for (int i = size - 1, j = size; i >= 0; i--, j--) {
                arr[j] = arr[i];
                if (i == index) {
                    arr[i] = value;
                    break;
                }
            }
            size++;

        }
    }

    private void increaseArr() {
        if (size >= capacity) {
            int tmp = capacity;
            capacity = capacity * 2 + 2;
            System.out.println("Увеличение CAPACITY (" + tmp + " => " + capacity + ")  ");

        }
        int[] result = new int[capacity];
        for (int i = 0; i < size; i++) {
            result[i] = arr[i];
        }
        arr = result;
    }

    private void decreaseArr() {
        if (size <= capacity / 4) {
            int tmp = capacity;
            capacity = capacity / 2 - 2;
            System.out.println("Уменьшение CAPACITY (" + tmp + " => " + capacity + ")  ");
            int[] result = new int[capacity];
            for (int i = 0; i < size; i++) {
                result[i] = arr[i];
            }

            arr = result;
        }

    }

    public void add(int value) {
        increaseArr();
        arr[size] = value;
        size++;
    }

    public void addStart(int value) {
        increaseArr();
        for (int i = size; i > 0; i--) {
            arr[i] = arr[i - 1];
        }
        arr[0] = value;
        size++;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public int size() {
        return size;
    }

    public boolean contains(int value) {
        for (int i = 0; i < size; i++) {
            if (arr[i] == value) {
                return true;
            }
        }
        return false;
    }

    public int containsCount(int value) {
        int count = 0;
        for (int i = 0; i < size; i++) {
            if (arr[i] == value) {
                count++;
            }
        }

        return count;
    }

    public void removeByFirstValue(int value) {
        if (contains(value)) {
            boolean isOne = true;
            int[] result = new int[arr.length - 1];
            for (int i = 0, j = 0; i < arr.length; i++) {
                if (arr[i] == value && isOne) {
                    isOne = false;
                    continue;
                }
                result[j++] = arr[i];
            }

            arr = result;
            size--;
            decreaseArr();
        }

    }

    // Задание: Реализовать метод public void removeByAllValue(int value) с capacity
    public void removeByAllValue(int value) {
        int newSize = 0;
        for (int i = 0; i < size; i++) {
            if (arr[i] != value) {
                arr[newSize] = arr[i];
                newSize++;
            }
        }
        size = newSize;
        decreaseArr();
    }

    public void print() {
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }
    }

}

public class Main {
    public static void main(String[] args) {
        MyList myList = new MyList();
        myList.add(10);
        myList.add(20);
        myList.add(30);
//        myList.addStart(100);
//        myList.addIndex(1, 0);
//        myList.print();
//        System.out.println(myList.isEmpty());
//        System.out.println(myList.size());
//        System.out.println(myList.contains(40));
//        myList.removeByFirstValue(30);
//        myList.print();
//        myList.removeByAllValue(20);
//        myList.print();
//        String str = "Dmitriy";
//       for (int i = 0; i < 18; i++) {
//            myList.add(i);
//        }
//        myList.print();
//        System.out.println();
//        for (int i = 0; i < 65; i++) {
//            myList.removeByAllValue(i);
//        }
//        myList.print();
    }
}