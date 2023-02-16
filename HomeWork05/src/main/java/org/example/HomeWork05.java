package org.example;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Set;

/**Создать словарь HashMap. Обобщение <Integer, String>.
* Заполнить пятью ключами (индекс, ФИО+Возраст+Пол "Иванов Иван Иванович 28 м"), добавить ключь, если не было!)
Изменить значения сделав пол большой буквой.
Пройти по коллекции и вывести значения в формате Фамилия инициалы "Иванов И.И."
 *Сортировать значения по возрасту и вывести отсортированную коллекция как в четвёртом пункте.
 *   System.out.println("\033[34mОтсортированный список в порядке возрастания: " + list1 + "\033[0m");
 *
 *         removingMissingElements(list1, list2);
 *         System.out.println("\033[31mОкончательный список: " + list1 + "\033[0m");
 * */
public class HomeWork05 {
     public static void main(String[] args) throws Exception {
        Map<Integer, String> hashMap = new HashMap<>();
        hashMap.put(0, "Иванов Иван Иванович 32 м");
        hashMap.put(1, "Петрова Ирина Викторовна 23 ж");
        hashMap.put(2, "Котов Кот Котеевич 37 м");
        hashMap.put(3, "Васильев Василь Васильевич 54 м");
        hashMap.put(4, "Кукумберова Кукумба Кукумбовна 43 ж");

        for (Map.Entry<Integer, String> iterable_element : hashMap.entrySet()) {
            System.out.println("ключ: "+iterable_element.getKey()+" "+"значение: "+ iterable_element.getValue());
        }

        ArrayList<Integer> age = new ArrayList<>();
        ArrayList<String> family = new ArrayList<>();
        ArrayList<String> name = new ArrayList<>();
        ArrayList<String> soname = new ArrayList<>();
        LinkedList<Integer> index = new LinkedList<>();

        System.out.println("\033[32m\nЗначения 'пол' с большой буквы: \033[0m");
        Set<Integer> keySet = hashMap.keySet();
        for (int i = 0; i < keySet.size(); i++) {
            String [] string = (hashMap.get(keySet.toArray()[i]).split("\n"));
            for (int j = 0; j < string.length; j++) {
                String [] tmp = string[j].split(" ");
                System.out.println(tmp[0]+ " " + tmp[1] + " "+ tmp[2] +" "+ tmp[3]+" "+tmp[4].toUpperCase());
            }
        }

        for (int i = 0; i < keySet.size(); i++) {
            String [] string = (hashMap.get(keySet.toArray()[i]).split("\n"));
            for (int j = 0; j < string.length; j++) {
                String [] tmp = string[j].split(" ");
                index.add(i);
                age.add(Integer.valueOf(tmp[3]));
                family.add(tmp[0]+" ");
                name.add(tmp[1].charAt(0) + ".");
                soname.add(tmp[2].charAt(0) + ".");
            }
        }

        ArrayList<Integer> tmp = new ArrayList<>(age);
        Collections.sort(tmp);
        for (int i = 0; i < tmp.size(); i++) {
            int j = age.indexOf(tmp.get(i));
            index.set(i, j);
        }
        System.out.println("\033[35m\nКоллекция, отсортированная по возрасту: \033[0m");
        for (int i = 0; i < index.size(); i++) {
            //System.out.printf(family.get(index.get(i)));
            System.out.printf(family.get(index.get(i)));
            System.out.printf(name.get(index.get(i)));
            System.out.printf(soname.get(index.get(i)));
            System.out.println();
        }
    }
}
