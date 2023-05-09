package listnode;

public class ArrayStack {
    private int[] arr = new int[30];
    private int length = 0;

    public void push(int data){
        if(length > 29){
            throw new IllegalStateException("Out of index");
        }
        arr[length++] = data;
        if(length >= 30){
            length = 30;
        }
    }

    public int pop(){
        if(length <= 0){
            throw new IllegalStateException("Out of index");
        }
        return arr[--length];
    }

    public static void main(String[] args) {
        ArrayStack arrayStack = new ArrayStack();
        arrayStack.push(1);
        arrayStack.push(3);
        arrayStack.push(4);
        System.out.println(arrayStack.pop());
        System.out.println(arrayStack.pop());
        System.out.println(arrayStack.pop());
    }

}
