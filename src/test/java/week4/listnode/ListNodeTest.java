package week4.listnode;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import week4.listnode.ListNode;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

class ListNodeTest {

    public ListNode head = new ListNode();

    @BeforeEach
    void setUpHead() {
        for(int i=0; i<5; i++){
            head.add(head, new ListNode(ListNode.length(head) + 1), ListNode.length(head) + 1);
        }
    }

//    @AfterEach
    void printStatus() {
        System.out.println("테스트 종료");
        ListNode node = head;
        int index = 0;
        while(node.getNextNode() != null){
            node = node.getNextNode();
            System.out.println(++index + "번째: " + node.getNum());
        }
    }

    @Test
    void addMiddleTest(){
        int position = 3;
        ListNode addedNode = head.add(head, new ListNode(100), position);
        ListNode tmpNode = head;
        for(int i=1; i<position; i++){
            tmpNode = tmpNode.getNextNode();
        }

        assertThat(tmpNode.getNextNode()).isEqualTo(addedNode);
        System.out.println("Num: " + addedNode.getNum() + "\nNextNode: " + addedNode.getNextNode());
        assertThat(ListNode.length(head)).isEqualTo(6);
    }

    @Test
    void addLastTest(){
        int position = ListNode.length(head) + 1;
        ListNode addedNode = head.add(head, new ListNode(100), position);
        ListNode tmpNode = head;
        for(int i=1; i<position; i++){
            tmpNode = tmpNode.getNextNode();
        }

        assertThat(tmpNode.getNextNode()).isEqualTo(addedNode);
        System.out.println("Num: " + addedNode.getNum() + "\nNextNode: " + addedNode.getNextNode());
        assertThat(ListNode.length(head)).isEqualTo(6);
    }

    @Test
    void addErrorTest(){
        int position = 0;
        assertThatThrownBy(() -> { head.add(head, new ListNode(100), position); })
                .isInstanceOf(IndexOutOfBoundsException.class);
    }
}