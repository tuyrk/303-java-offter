package com.tuyrk.collection;

import java.util.HashSet;
import java.util.Set;

/**
 * User: 涂元坤
 * Mail: 766564616@qq.com
 * Create: 2019/3/21 23:19 星期四
 * Description:
 */
public class Customer implements Comparable {
    private String name;
    private int age;

    public Customer(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Customer)) {
            return false;
        }

        final Customer other = (Customer) obj;
        if (this.name.equals(other.name) && this.age == other.age) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public int compareTo(Object o) {
        Customer other = (Customer) o;

        //先按照name属性排序
        if (this.name.compareTo(other.name) > 0) {
            return 1;
        }
        if (this.name.compareTo(other.name) < 0) {
            return -1;
        }

        //再按照age属性排序
        if (this.age > other.age) {
            return 1;
        }
        if (this.age < other.age) {
            return -1;
        }

        return 0;
    }

    @Override
    public int hashCode() {
        int result;
        result = (name == null ? 0 : name.hashCode());
        result = 29 * result + age;
        return result;
    }

    public static void main(String[] args) {
        Set<Customer> set = new HashSet<>();
        Customer customer2 = new Customer("Tom", 16);
        Customer customer1 = new Customer("Tom", 15);
        set.add(customer1);
        set.add(customer2);
        System.out.println(set);

        for (Customer customer : set) {
            System.out.println(customer.name + " " + customer.age);
        }
    }
}
