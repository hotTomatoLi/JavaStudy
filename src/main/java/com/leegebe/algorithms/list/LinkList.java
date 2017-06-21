package com.leegebe.algorithms.list;

/**
 * 链表实现
 * 实现列表转置
 */
public class LinkList {

    private Node root;

    public void reverseList(){
        Node father = root;
        Node son = root.getNext();
        while (son != null){
            Node grandSon = son.getNext();
            son.setNext(father);
            father = son;
            son = grandSon;
        }
        root.setNext(null);
        root = father;
    }

    public void printList(){
        Node index = root;
        while (index != null){
            System.out.print(index.getData() + "#");
            index = index.getNext();
        }
        System.out.println();
    }

    public static void main(String[] args){
        LinkList linkList = new LinkList();
        Node root = new Node(0);
        Node one = new Node(1);
        Node two = new Node(2);
        Node three = new Node(3);
        Node four = new Node(4);
        Node five = new Node(5);

        four.setNext(five);
        three.setNext(four);
        two.setNext(three);
        one.setNext(two);
        root.setNext(one);

        linkList.setRoot(root);
        linkList.printList();
        linkList.reverseList();
        linkList.printList();
    }

    public Node getRoot() {
        return root;
    }

    public void setRoot(Node root) {
        this.root = root;
    }
}
