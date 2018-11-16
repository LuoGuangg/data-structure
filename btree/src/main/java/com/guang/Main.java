package com.guang;

/**
 * @version V1.0
 * @author: LuoGuang
 * @Package com.guang
 * @Description:
 * @date: 2018/11/16 22:01
 */
public class Main {
    
    public static void main(String[] args){  

        Node node5 = new Node(5);
        Node node4 = new Node(4,null,node5);


        Node node3 = new Node(3);
        Node node7 = new Node(7);
        Node node6 = new Node(6,null,node7);
        Node node2 = new Node(2,node3,node6);


        Node node1 = new Node(1,node4,node2);

        BinaryTree bt = new LinkedBinaryTree(node1);

        System.out.println(bt.isEmpty());
        System.out.println(bt.size());
        System.out.println(bt.getHeight());
        System.out.println(bt.findKey(5));

        bt.preOrderTraverse();
        bt.inOrderTraverse();
        bt.postOrderTraverse();
        bt.levelOrderByStack();
    }
}
