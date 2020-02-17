package com.tuyrk.collection;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * User: 涂元坤
 * Mail: 766564616@qq.com
 * Create: 2019/3/22 22:24 星期五
 * Description:
 */
public class SafeHashMapDemo {
    public static void main(String[] args) {
        Map hashMap = new HashMap();
        Map safeHashMap = Collections.synchronizedMap(hashMap);
        safeHashMap.put("aa", "1");
        safeHashMap.put("bb", "2");
        System.out.println(safeHashMap.get("bb"));
    }
}
