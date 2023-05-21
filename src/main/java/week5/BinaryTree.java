package week5;

import java.util.ArrayList;
import java.util.List;

public class BinaryTree {
    public int bfs(Node node) {
        int count = 0;
        List<Node> nodes = new ArrayList<>();
        nodes.add(node);
        Node cur;
        while(!nodes.isEmpty()){
            cur = nodes.get(0);
            System.out.println(cur.getNum());
            nodes.remove(0);
            if (cur.getLeft() != null) {
                nodes.add(cur.getLeft());
            }
            if (cur.getRight() != null) {
                nodes.add(cur.getRight());
            }
            count++;
        }

        return count;
    }

    public int dfs(Node node) {
        System.out.println(node.getNum());
        int result = 0;
        if (node.getLeft() != null) {
            result += dfs(node.getLeft());
        }
        result++;
        if (node.getRight() != null) {
            result += dfs(node.getRight());
        }
        return result;
    }
}
