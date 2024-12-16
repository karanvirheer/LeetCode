/*
 * @lc app=leetcode id=707 lang=java
 *
 * [707] Design Linked List
 */

// @lc code=start
class MyLinkedList {

    class Node {
        int val;
        Node next;

        public Node(int val) {
            this.val = val;
        }
    }

    private Node head;
    private Node tail;
    private int size;

    public MyLinkedList() {
        head = null;
        tail = null;
        size = 0;
    }

    public int get(int index) {
        if (index >= size) {
            return -1;
        }

        Node node = head;
        for (int i = 0; i < index; i++) {
            node = node.next;
        }

        return node.val;
    }

    public void addAtHead(int val) {
        Node node = new Node(val);
        node.next = head;
        head = node;
        if (tail == null) {
            tail = head;
        }
        size++;
    }

    public void addAtTail(int val) {
        if (head == null) {
            addAtHead(val);
            return;
        }
        Node node = new Node(val);
        tail.next = node;
        tail = tail.next;
        size++;
    }

    public void addAtIndex(int index, int val) {
        // no node inserted
        if (index > size) {
            return;
            // add as tail
        } else if (index == size) {
            addAtTail(val);
            return;
            // add as head
        } else if (index == 0) {
            addAtHead(val);
            return;
            // add at center
        } else {
            Node node = head;
            Node newNode = new Node(val);
            for (int i = 0; i < index - 1; i++) {
                node = node.next;
            }
            // _ -> 3 -> 4
            newNode.next = node.next;
            // 1 -> 2 -> _
            node.next = newNode;
            size++;
        }
    }

    public void deleteAtIndex(int index) {
        // check valid
        if (index >= size) {
            return;
        }
        // delete head
        if (index == 0) {
            head = head.next;
            if (size == 1) { // Handle case when list becomes empty
                tail = null;
            }
        } else {
            Node node = head;
            for (int i = 0; i < index - 1; i++) {
                node = node.next;
            }
            node.next = node.next.next;
            if (index == size - 1) { // If deleting the last element
                tail = node;
            }
        }
        size--;
    }
}

/**
 * Your MyLinkedList object will be instantiated and called as such:
 * MyLinkedList obj = new MyLinkedList();
 * int param_1 = obj.get(index);
 * obj.addAtHead(val);
 * obj.addAtTail(val);
 * obj.addAtIndex(index,val);
 * obj.deleteAtIndex(index);
 */
// @lc code=end
