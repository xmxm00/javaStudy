package week4.listnode;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ArrayStackTest {
    private ArrayStack arrayStack;

    @BeforeEach
    void init() {
        arrayStack = new ArrayStack();
        for(int i=1; i<6; i++){
            arrayStack.push(i);
        }
    }

    @AfterEach
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

}