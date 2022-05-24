package StackGame;

public class MyStack<T> {

    MyStackNode<T> top;
    MyStackNode<T> bottom;


    public MyStack() {

    }

    public void push(T data) {  //place a node on top
        if(isEmpty()) {
            top = new MyStackNode<T>(data, bottom);
        }
        else{
            MyStackNode<T> newNode = new MyStackNode<T>(data,top);
            top = newNode;
        }
    }

    public T pop() {            // removes top node
        if(isEmpty()) {
            return null;
        }
        T dataToReturn = top.getData();
        MyStackNode<T> newTopNode = top;
        newTopNode = top.getNext();
        top.setNext(null);
        top = newTopNode;
        return dataToReturn;
    }

    public T peek() {     // peek the top card
        if(isEmpty()) {
            return null;
        }
        return top.getData();
    }

    public boolean isEmpty() {  // if the stack is empty
        return top == null;
    }
}
