// Задание: Реализовать 2 метода
//
//public void addSart(int value){
//
//}
//public void add(int index , int value){
//
//}

import Models.Mylist;

public class Main {
    public static void main(String[] args) {
        Mylist mylist = new Mylist();
        mylist.addStart(1);
        mylist.addStart(2); //  реализовываем метод public void addStart
        mylist.addStart(3); //   реализовываем метод public void addStart
        mylist.add(2,0); // реализовываем метод public void add
        mylist.print();
    }
}