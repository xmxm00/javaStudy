package week4.listnode;

public class ArrayStack {
    private final int LENGTH = 30;
    private int[] arr = new int[LENGTH];
    private int top = -1;

    public void push(int data){
        if(isFull()){
            throw new ArrayIndexOutOfBoundsException("Out of index");
        }
        arr[++top] = data;
    }

    public int pop(){
        if(isEmpty()){
            throw new ArrayIndexOutOfBoundsException("Out of index");
        }
        return arr[top--];
    }

    public void printStack() {
        for(int i=0; i<=top; i++){
            System.out.println("" + (i + 1) + "번째 요소: " + arr[i]);
        }
    }

    private boolean isFull(){
        if(top >= (LENGTH - 1)) return true;

        return false;
    }

    private boolean isEmpty(){
        if(top < 0) return true;

        return false;
    }
}
