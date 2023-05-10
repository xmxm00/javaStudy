package week4.listnode;

public class ArrayStack {
    private final int LENGTH = 30;
    private int[] arr = new int[LENGTH];
    private int length = -1;

    public void push(int data){
        if(length >= LENGTH){
            throw new ArrayIndexOutOfBoundsException("Out of index");
        }
        arr[++length] = data;
    }

    public int pop(){
        if(length <= -1){
            throw new ArrayIndexOutOfBoundsException("Out of index");
        }
        return arr[length--];
    }

    public void printStack() {
        for(int i=0; i<=length; i++){
            System.out.println("" + (i + 1) + "번째 요소: " + arr[i]);
        }
    }
}
