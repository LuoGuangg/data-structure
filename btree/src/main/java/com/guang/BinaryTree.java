package com.guang;

/**
 * @version V1.0
 * @author: LuoGuang
 * @Package com.guang
 * @Description:
 * @date: 2018/11/16 21:55
 */
public interface BinaryTree {

    /**
     * 是否空数
     * @return
     */
    boolean isEmpty();

    /**
     * 树节点数量
     * @return
     */
    int size();

    /**
     * 获取二叉树高度
     * @return
     */
    int getHeight();

    /**
     * 查找指定节点
     * @return
     */
    Node findKey(int value);

    /**
     * 前序遍历
     * @return
     */
    void preOrderTraverse();


    /**
     * 中序遍历
     * @return
     */
    void inOrderTraverse();

    /**
     * 后序遍历
     * @return
     */
    void postOrderTraverse();

    /**
     * 层次遍历
     */
    void levelOrderByStack();
}
