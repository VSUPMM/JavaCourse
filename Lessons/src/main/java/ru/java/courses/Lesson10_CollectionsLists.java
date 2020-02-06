package ru.java.courses;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Lesson10_CollectionsLists {

    /**
     * В этом методе необходимо реализовать:
     * 1. На вход получаем список чисел
     * 2. Удаляем все дубли
     * 3. Сортируем список по возрастанию
     * 4. Преобразуем числа в строки
     * <p>
     * Подсказки:
     * Collections.sort() - сортировка
     * Удалять элементы из итерируемого списка нельзя - выпадет исключение
     */
    public static List<String> task1(List<Integer> source) {
        List<Integer> newList = new ArrayList<>();
        for (Integer el :source) {
            if (!newList.contains(el)) {
                newList.add(el);
            }
        }
        Collections.sort(newList);
        List<String> newListString = new ArrayList<>();
        for (Integer el :newList) {
            newListString.add(String.valueOf(el));
        }
        return newListString;
    }

    /**
     * В этом методе необходимо реализовать следующий алгоритм:
     * 1. Получаем на входе массив чисел
     * 2. Преобразовываем его к списку
     * 4. Все четные числа увеличиваем на единицу
     * 5. Возвращаем кусок списка с 3-го по 7-й элемент
     * <p>
     * Подсказка: на входе может быть любое количество чисел
     */
    public static List<Integer> task2(Integer... array) {
        List<Integer> outLst = Arrays.asList(array);
        for (Integer el:outLst) {
            if (el % 2 == 0){
                outLst.set(outLst.indexOf(el), el+1);
            }
        }
        if (outLst.size() < 7)
            return outLst.subList(3,outLst.size());
        else
            return outLst.subList(3,8);
    }
}
