package com.guang;

/**
 * @version V1.0
 * @author: LuoGuang
 * @Package com.guang
 * @Description:
 * @date: 2018/11/12 14:39
 */
public class Node {

    Object object;

    Node next;

    public Node() {
    }

    public Node(Object object) {
        this.object = object;
    }

    public Node(Object object, Node next) {
        this.object = object;
        this.next = next;
    }
}
