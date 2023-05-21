package week5;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class BinaryTreeTest {
    BinaryTree btree;
    Node root;

    @BeforeEach
    void init() {
        btree = new BinaryTree();
        Node node11 = new Node(11);
        Node node10 = new Node(10);
        Node node9 = new Node(9);
        Node node8 = new Node(8);
        Node node7 = new Node(7);
        Node node6 = new Node(6, node10, node11);
        Node node5 = new Node(5, null, node9);
        Node node4 = new Node(4, node7, node8);
        Node node3 = new Node(3, null, node6);
        Node node2 = new Node(2, node4, node5);
        root = new Node(1, node2, node3);
    }

    @Test
    void bfsTest() {
        Assertions.assertThat(btree.bfs(root)).isEqualTo(11);
    }

    @Test
    void dfsTest() {
        Assertions.assertThat(btree.dfs(root)).isEqualTo(11);
    }

}