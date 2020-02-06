package ru.java.courses;

import java.lang.reflect.Array;
import java.util.*;
import java.util.Map.Entry;
import java.util.stream.Collectors;
import javax.swing.tree.TreeCellEditor;

public class Lesson11to12_SetMap {

    public static class User{

        private String name;
        private int age;
        private String phone;

        public User(String name, int age) {
            this.name = name;
            this.age = age;
        }

        public User(String phone) {
            this.phone = phone;
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

        public String getPhone() {
            return phone;
        }

        public void setPhone(String phone) {
            this.phone = phone;
        }


        @Override
        public boolean equals(Object o){
             if (!(o instanceof User)) {
                return false;
            }
            User user = (User) o;
            return user.getAge()==this.getAge()
                    && user.getName() == this.getName();
        }

        @Override
        public int hashCode() {
             return Objects.hash(this.name,this.age);
        }
    }

    /**
     * В этом методе необходимо реализовать:
     * 1. На вход получаем коллекцию пользователей
     * 2. Удаляем все дубли (одинаковое имя и возраст)
     * 3. Сортируем по имени и возрасту
     * 4. Возвращаем последнего пользователя
     */
    public static User task1 (Collection<User> source) {
        List<User> list = new ArrayList<>();
        Set<User> set= new HashSet<User>();
        set.addAll(source);
        list.addAll(set);

        list.sort(Comparator.comparing(User::getName).thenComparing(User::getAge));

        final Iterator itr = list.iterator();
        Object curElement = itr.next();
        while(itr.hasNext()) {
            curElement = itr.next();
        }
        return (User)curElement;
    }

    /**
     * В этом методе необходимо реализовать следующий алгоритм:
     * 1. На вход получаем коллекцию пользователей
     * 2. Преобразовываем его в справочник [номер телефона -> пользователь]
     * 3. Один номер телефона на одного пользователя
     * 4. Вернуть количество записей в справочнике
     */
    public static int task2(Collection<User> source) {
        Map<String,User> map = new HashMap<>();
        for (User el: source) {
            map.put(el.phone,el);
        }
        return map.size();
    }


    /**
     * В этом методе необходимо реализовать следующий алгоритм:
     * 1. На вход получаем список названий книг
     * 2. Распределяем книги по полкам так, чтобы на каждой полке было примерно одинаковое количество книг
     * 3. Все книги должны быть отсортированы по алфавиту с первой до последней полки
     * 4. Количество полок константное - 5 штук
     * 5. Вернуть книги распределенные по полкам
     *
     * Нумерация полок начинается с единицы!
     */
    public static Map task3(Collection<String> source) {
        Map<Integer, List<String>> map = new HashMap<>();
        List<String> source2 = new ArrayList<>(source);

        int step = source2.size() / 5;
        Collections.sort(source2);
        for (String name: source2) {
            int cur = (source2.indexOf(name) / step % 5) + 1;
            List<String> lst = map.get(cur);
            if (lst == null) {
                lst = new ArrayList();
            }
            lst.add(name);
            map.put(cur, lst);
        }

        return map;
    }


    /**
     * В этом методе необходимо реализовать следующий алгоритм:
     * 1. На вход получаем книги, распределенные по полкам
     * 5. Вернуть справочник [название книги -> номер полки]
     */
    public static Map task4(Map<Integer, String> source) {
        Map<String, Integer> map = new HashMap<>();
        for (Map.Entry<Integer, String> entry: source.entrySet()) {
           map.put(entry.getValue(),entry.getKey());
        }
        return map;
    }
}
