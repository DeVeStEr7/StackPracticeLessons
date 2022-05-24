package StackGame;

public class MyStackNode<T> {

    T data;
    MyStackNode next;

    public MyStackNode(T data) {
        this.data = data;
    }

    public MyStackNode(T data, MyStackNode<T> next) {
        this.data = data;
        this.next = next;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public MyStackNode getNext() {
        return next;
    }

    public void setNext(MyStackNode next) {
        this.next = next;
    }
}
