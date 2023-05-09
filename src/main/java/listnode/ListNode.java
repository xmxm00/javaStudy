package listnode;

public class ListNode {
    private Integer num;
    private ListNode nextNode;

    public ListNode() {
        this.num = null;
        this.nextNode = null;
    }

    public ListNode(int num) {
        this.num = num;
        this.nextNode = null;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public ListNode getNextNode() {
        return nextNode;
    }

    public void setNextNode(ListNode nextNode) {
        this.nextNode = nextNode;
    }

    public static int length(ListNode head) {
        ListNode node = head;
        int result = 0;
        while(node.getNextNode() != null){
            result++;
            node = node.getNextNode();
        }
        return result;
    }

    public ListNode add(ListNode head, ListNode nodeToAdd, int position) {
        int listLength = ListNode.length(head);
        ListNode node = head;

        if (position > listLength + 1 || position < 1){
            throw new IndexOutOfBoundsException("위치 값 (" + position + ")은 허용되지 않습니다.");
        }

        if (position < listLength + 1){
            for(int i = 1; i < position; i++){
                node = node.getNextNode();
            }
            nodeToAdd.setNextNode(node.getNextNode());
            node.setNextNode(nodeToAdd);
        } else if (position == listLength + 1) { // 마지막에 추가
            while(node.getNextNode() != null){
                node = node.getNextNode();
            }
            node.setNextNode(nodeToAdd);
        }
        return nodeToAdd;

    }

    public ListNode remove(ListNode head, int positionToRemove) {
        int listLength = ListNode.length(head);
        ListNode node = head;

        if (positionToRemove > listLength){
            throw new IndexOutOfBoundsException("위치 값 (" + positionToRemove + ")은 허용되지 않습니다.");
        }

        for(int i = 1; i < positionToRemove; i++) {
            node = node.getNextNode();
        }
        ListNode nodeToRemove = node.getNextNode();
        node.setNextNode(nodeToRemove.getNextNode());
        nodeToRemove.setNextNode(null);
        return nodeToRemove;
    }

    public boolean contains(ListNode head, ListNode nodeToCheck) {
        ListNode node = head;
        while(node.getNextNode() != null){
            if (nodeToCheck.getNum() == node.getNum()) {
                return true;
            }
            node = node.getNextNode();
        }
        return false;
    }
}

