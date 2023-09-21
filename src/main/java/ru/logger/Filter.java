package ru.logger;

import ru.logger.Logger.Logger;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Filter {

    Logger logger = Logger.get();

    private int f;

    public Filter(int f) {
        this.f = f;
    }

    public List<Integer> filterOut(List<Integer> list) {
        logger.log("Фильтруем исходный массив по числу пользователя: " + f);
        return list.stream().filter(x -> x != f).collect(Collectors.toList());
    }

}
