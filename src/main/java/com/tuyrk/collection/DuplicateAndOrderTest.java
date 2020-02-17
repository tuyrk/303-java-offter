package com.tuyrk.collection;

import java.util.*;

/**
 * User: 涂元坤
 * Mail: 766564616@qq.com
 * Create: 2019/3/21 23:08 星期四
 * Description:
 */
public class DuplicateAndOrderTest {
    public static void main(String[] args) {
        List linkedList = new LinkedList();
        linkedList.add("111");
        linkedList.add("333");
        linkedList.add("222");
        linkedList.add("444");
        linkedList.add("555");
        linkedList.add("111");
        System.out.println(linkedList);

        Set treeSet = new TreeSet();
        treeSet.add("111");
        treeSet.add("333");
        treeSet.add("222");
        treeSet.add("444");
        treeSet.add("555");
        treeSet.add("111");
        System.out.println(treeSet);

    }
}
