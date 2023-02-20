package org.example;

/**Разработать программу, имитирующую поведение коллекции HashSet.
В программе содать метод add добавляющий элемент, и метод позволяющий выводить эллементы коллекции в консоль.
Формат данных Integer.*/


import java.util.HashMap;
public class HomeWork06 {
    private static HashMap<Integer,Object> hm  = new HashMap<>();
    private static final Object OBJ = new Object();
    public static void main(String[] args) {
        add(5);
        add(3);
        add(5);
        add(5);
        add(9);
        add(12);
        add(8);
        System.out.println(getStr());
    }
    private static String getStr() {
        return hm.keySet().toString();
    }
    private static void add(Integer num) {
        hm.put(num, OBJ);
    }
}