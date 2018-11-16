package com.guang;

import java.util.Collection;
import java.util.Iterator;

/**
 * @version V1.0
 * @author: LuoGuang
 * @Package com.guang
 * @Description:
 * @date: 2018/11/12 14:35
 */
public interface List {

    int size();

    boolean isEmpty();

    boolean contains(Object object);

    boolean add(Object object);

    boolean add(int index, Object object);

    Object get(int index);

    boolean remove(Object var1);

}
