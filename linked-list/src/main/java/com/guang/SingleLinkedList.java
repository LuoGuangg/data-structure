package com.guang;

/**
 * @version V1.0
 * @author: LuoGuang
 * @Package com.guang
 * @Description:
 * @date: 2018/11/12 14:38
 */
public class SingleLinkedList implements List{

    private Node node = new Node();

    private int size = 0;

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size != 0;
    }

    @Override
    public boolean contains(Object var1) {
        return false;
    }

    @Override
    public boolean add(Object object) {
        return add(size,object);
    }

    @Override
    public boolean add(int index, Object object) {

        Node newNode = new Node(object);
        Node oldNode = node;
        for (int i = 0; i < index; i++){
            oldNode = oldNode.next;
        }

        newNode.next = oldNode.next;
        oldNode.next = newNode;
        size++;
        return true;
    }

    @Override
    public Object get(int index) {
        Node oldNode = node.next;
        for (int i = 0; i < index; i++){
            oldNode = oldNode.next;
        }
        return oldNode.object;
    }

    @Override
    public boolean remove(Object var1) {
        return false;
    }

    @Override
    public String toString() {

        StringBuffer sb = new StringBuffer("[");
        Node n = node.next;
        while (n != null){
            sb.append(n.object);
            n = n.next;
            if (n != null){
                sb.append(",");
            }
        }
        sb.append("]");
        return sb.toString();
    }
}
