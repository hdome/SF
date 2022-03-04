package com.example;


import java.lang.reflect.Field;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        Field[] fields = Employee.class.getDeclaredFields();
        List<Field> fieldList = Stream.of(fields)
                .filter(field -> field.isAnnotationPresent(Shareable.class))
                .filter(field -> field.getAnnotation(Shareable.class).value())
                .collect(Collectors.toList());

        fieldList.forEach(field -> System.out.println(field.getName()));
    }
}
