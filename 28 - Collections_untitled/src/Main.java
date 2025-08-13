class Node {
    int value;
    Node next;

    public Node(int value) {
        this.value = value;
    }
}

class MyLinkedList {
    Node head;

    public void add(int value) {
        if (head == null) {
            head = new Node(value);
        } else {
            Node tmp = head;
            while (tmp.next != null) {
                tmp = tmp.next;
            }
            tmp.next = new Node(value);
        }
    }

    public void addStart(int value) {
        Node node = new Node(value);
        node.next = head;
        head = node;
    }

    public void removeByIndex(int index) {
        if (head == null || index < 0) {
            return;
        }
        if (index == 0) {
            head = head.next;
        }
        Node tmp = head;
        int count = 0;
        while (tmp.next != null) {
            if (count + 1 == index) {
                tmp.next = tmp.next.next;
            }
            tmp = tmp.next;
            count++;
        }
    }

    public int getByIndex(int index) {
        Node tmp = head;
        int count = 0;
        while (tmp != null) {
            if (count++ == index) {
                return tmp.value;
            }
            tmp = tmp.next;
        }
        return -1;
    }

    // 1)    public boolean isEmpty()                         [] => true
    public boolean isEmpty() {
        return head == null;
    }
    // 2)   public int size()
    public int size() {
        Node tmp = head;
        int count = 0;
        while (tmp != null) {
            count++;
            tmp = tmp.next;
        }
        return count;
    }

    // 3)    public boolean contains(int value)               10,20,10,20,30 => 10 => true
    public boolean contains(int value) {
        Node tmp = head;
        while (tmp != null) {
            if (tmp.value == value) {
                return true;
            }
            tmp = tmp.next;
        }
        return false;
    }

    // 4)   public int removeByFirstValue(int value)         10,20,10,20,30 => 10 => 20,10,20,30
    public int removeByFirstValue(int value) {
        if (head == null) {
            return -1;
        }
        if (head.value == value) {
            head = head.next;
            return value;
        }
        Node tmp = head;
        Node prev = null;
        while (tmp != null && tmp.value != value) {
            prev = tmp;
            tmp = tmp.next;
        }
        if (tmp == null) {
            return -1;
        }
        prev.next = tmp.next;
        return value;
    }
    // 5)   public int removeByAllValue(int value)           10,20,10,20,30 => 10 => 20,20,30
    public void removeByAllValue(int value) {
        if (head == null) {
            return;
        }
        while (head != null && head.value == value) {
            head = head.next;
        }
        Node tmp = head;
        Node prev = null;
        while (tmp != null) {
            if (tmp.value == value) {
                prev.next = tmp.next;
            } else {
                prev = tmp;
            }
            tmp = tmp.next;
        }
    }
    // 6)   public void addByIndex(int index, int value)     10,20,10,20,30 =>1, 5 => 10,5,20,10,20,30
    public void addByIndex(int index, int value) {
        Node node = new Node(value);
        if (index <= 0) {
            node.next = head;
            head = node;
            return;
        }
        Node tmp = head;
        int tmpIndex = 0;
        while (tmp != null && tmpIndex < index - 1) {
            tmp = tmp.next;
            tmpIndex++;
        }
        if (tmp == null) {
            if (head == null) {
                head = node;
            } else {
                Node tail = head;
                while (tail.next != null) {
                    tail = tail.next;
                }
                tail.next = node;
            }
            return;
        }
        node.next = tmp.next;
        tmp.next = node;
    }

    public void print() {
        Node tmp = head;
        while (tmp != null) {
            System.out.print(tmp.value + " ");
            tmp = tmp.next;
        }
        System.out.println();
    }

}


public class Main {
    public static void main(String[] args) {
        MyLinkedList myLinkedList = new MyLinkedList();
//        System.out.println(myLinkedList.isEmpty());
        myLinkedList.add(10);
        myLinkedList.add(20);
        myLinkedList.add(30);
        myLinkedList.add(40);
        myLinkedList.add(20);
//        myLinkedList.removeByFirstValue(20);
//        System.out.println(myLinkedList.contains(20));
//        System.out.println(myLinkedList.isEmpty());
//        myLinkedList.print();
//        System.out.println(myLinkedList.size());
//        myLinkedList.removeByAllValue(20);
//        myLinkedList.addByIndex(1,300);
        myLinkedList.print();


    }
}