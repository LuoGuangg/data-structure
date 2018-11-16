package com.guang;

/**
 * @version V1.0
 * @author: LuoGuang
 * @Package com.guang
 * @Description:
 * @date: 2018/11/12 14:55
 */
public class Main {

    public static void main(String[] args){
        List list = new SingleLinkedList();

        list.add(1);
        list.add(2);
        list.add(4);
        list.add(5);
        list.add(2,5);
        System.out.println("LuoGuang:Main.main():"+list.size());
        System.out.println("LuoGuang:Main.main():"+list);
    }
}
