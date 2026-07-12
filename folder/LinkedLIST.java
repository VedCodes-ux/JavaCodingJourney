package folder;
class node{
    int data;
    node next;
    node(int data){
        this.data = data;
        this.next = null;
    }
}
class LINKEDLIST{
    node head;
    node tail;
    int size;

    void display(){
        node temp = head;
        while(temp != null){
            System.out.println(temp.data + "---->");
            temp = temp.next;
        }
    }
    void addatH(int data){
        node temp = new node(data);
        if(head == null){
            tail = head = temp;
        }
        else{
            temp.next = head;
            head = temp;
        }
        size++;
    }
    void addatT(int data){
        node temp = new node(data);
        if(tail == null){
            head = tail = temp;
        }
        else{
            tail.next = temp;
            tail = temp;
        }
        size++;
    }
    int get(int idx){
        node temp = head;
        for (int i = 0; i < idx; i++) {
            temp = temp.next;
        }
        return temp.data;
    }
 void deleteatH(){
    if(head == null){
        tail = null;
        System.out.println("the list is empty");
        return;
    }
    head = head.next;
    if(head == null){
        tail = null;
    }
    size--;
}
void insert(int data , int idx){
    if(idx < 0 || idx > size){
        System.out.println("invalid idx");
        return;
    }
    if(idx == 0){
        addatH(data);
        return;
    }
    if(idx == size){
        addatT(data);
        return;
    }
    node temp = head;
    for (int i = 0; i < idx-1; i++) {
        temp = temp.next;
    }
    node t = new node(data);
    t.next = temp.next;
    temp.next = t;
    size++;
}
void delete(int idx){
    if(idx < 0 || idx >= size){
        System.out.println("invalid index");
        return;
    }
    if(idx == 0){
        deleteatH();
        return;
    }
    node temp = head;
    for (int i = 0; i < idx-1; i++) {
        temp = temp.next;
    }
    temp.next = temp.next.next;
    if(idx == size-1){
        tail = temp;
    }
    size--;
}
}

public class LinkedLIST {
    public static void main(String[] args) {
        LINKEDLIST ll = new LINKEDLIST();
        ll.addatH(50);
        ll.addatH(40);
        ll.addatH(30);
        ll.addatH(20);
        ll.addatH(10);
        ll.addatT(60);
        ll.insert(25,2);
        ll.display();
    }
}
