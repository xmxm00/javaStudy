package week4.listnode;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ArrayStackTest {
    private ArrayStack arrayStack;

    @BeforeEach
    void init() {
        arrayStack = new ArrayStack();
        for(int i=0; i<5; i++){
            arrayStack.push(i+1);
        }
    }

//    @AfterEach
    void printStack() {
        System.out.println("테스트 종료");
        arrayStack.printStack();
    }

    @Test
    void pushTest(){
        arrayStack.push(100);
    }

    @Test
    void popTest() {
        Assertions.assertThat(arrayStack.pop()).isEqualTo(5);
    }

    @Test
    void pushErrorTest() {
        for(int i=0; i<25; i++){
            arrayStack.push(101 + i);
        }
        Assertions.assertThatThrownBy(() -> {
            arrayStack.push(1000);
        }).isInstanceOf(ArrayIndexOutOfBoundsException.class);
    }

    @Test
    void popErrorTest() {
        for(int i=0; i<5; i++){
            arrayStack.pop();
        }
        Assertions.assertThatThrownBy(() -> arrayStack.pop()).isInstanceOf(ArrayIndexOutOfBoundsException.class);
    }
}