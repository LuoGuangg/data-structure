package com.guang;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @version V1.0
 * @author: LuoGuang
 * @Package com.guang
 * @Description:
 * @date: 2018/11/16 22:01
 */
public class LinkedBinaryTree implements BinaryTree{

    private Node node;

    public LinkedBinaryTree(Node node) {
        this.node = node;
    }


    @Override
    public boolean isEmpty() {
        return node == null;
    }

    @Override
    public int size() {
        System.out.println("数量");
        return size(node);
    }

    private int size(Node node){
        if (node == null){
            return 0;
        }else{
            return size(node.leftChild)+size(node.rightChild)+1;
        }
    }

    @Override
    public int getHeight() {
        System.out.println("高度");
        return getHeight(node);
    }

    private int getHeight(Node node){
        if (node == null){
            return 0;
        }else{
            int rn = getHeight(node.rightChild);
            int ln = getHeight(node.leftChild);
            return (rn>ln?rn:ln)+1;
        }
    }


    @Override
    public Node findKey(int value) {
        System.out.println("搜索:" + value);
        return findKey(value,node);
    }

    private Node findKey(int val,Node node){
        if (node == null){
            return null;
        }else if (node != null && node.value.equals(val)){
            return node;
        }else{
            Node node1 = findKey(val,node.leftChild);
            Node node2 = findKey(val,node.rightChild);
            if (node1 != null && node1.value.equals(val)){
                return node1;
            }else if(node2 != null && node2.value.equals(val)){
                return node2;
            }else{
                return null;
            }
        }
    }


    @Override
    public void preOrderTraverse() {
        System.out.println("前序遍历");
        preOrderTraverse(node);
        System.out.println();
    }

    private void preOrderTraverse(Node node){
        if (node == null){
            return;
        }else{
            System.out.print(node.value+"   ");
            preOrderTraverse(node.leftChild);
            preOrderTraverse(node.rightChild);
        }
    }

    @Override
    public void inOrderTraverse() {
        System.out.println("中序遍历");
        inOrderTraverse(node);
        System.out.println();
    }

    private void inOrderTraverse(Node node){
        if (node == null){
            return;
        }else{
            inOrderTraverse(node.leftChild);
            System.out.print(node.value+"   ");
            inOrderTraverse(node.rightChild);
        }
    }
    @Override
    public void postOrderTraverse() {
        System.out.println("后序遍历");
        postOrderTraverse(node);
        System.out.println();
    }

    private void postOrderTraverse(Node node){
        if (node == null){
            return;
        }else{
            postOrderTraverse(node.leftChild);
            postOrderTraverse(node.rightChild);
            System.out.print(node.value+"   ");
        }
    }
    @Override
    public void levelOrderByStack() {
        System.out.println("层次遍历");
        if (node == null){
            return;
        }
        Queue<Node> queue = new LinkedList<>();
        queue.add(node);
        while (queue.size() > 0){
            int num = queue.size();
            for(int i = 0; i < num; i++){
                Node n = queue.poll();
                System.out.print(n.value+"   ");
                if (n.leftChild != null){
                    queue.add(n.leftChild);
                }
                if (n.rightChild != null){
                    queue.add(n.rightChild);
                }
            }
        }
    }
}
