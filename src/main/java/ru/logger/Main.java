package ru.logger;

import ru.logger.Logger.Logger;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Logger logger = Logger.get();
        Scanner scanner = new Scanner(System.in);
        Random rnd = new Random();
        List<Integer> list = new ArrayList<>();

        logger.log("Запускаем программу!");
        logger.log("Просим пользователя ввести данные");
        System.out.println("Введите размер списка: ");
        int size = Integer.parseInt(scanner.nextLine());

        System.out.println("Введите верхнюю границу для значений: ");
        int level = Integer.parseInt(scanner.nextLine());

        logger.log("Заполняем массив");
        for (int i = 0; i < size; i++) {
            list.add(rnd.nextInt(level));
        }
        System.out.println(list);

        logger.log("Просим пользователя ввести данные для фильтрации");
        System.out.println("Введите порог для фильтра: ");
        int doorstep = Integer.parseInt(scanner.nextLine());

        logger.log("Создаем фильтр и фильтруем исходный массив");
        Filter filter = new Filter(doorstep);
        List<Integer> listOut = filter.filterOut(list);
        System.out.println(listOut);

        logger.log("До свидания");
    }
}
