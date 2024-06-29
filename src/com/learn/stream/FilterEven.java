package com.learn.stream;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FilterEven {
    public static void main(String[] args) {
        List<Integer> list = List.of(1,2,3,4,5);
        Stream<Integer> stream = list.stream().filter(i-> i %2 == 0);
        System.out.println(stream.collect(Collectors.toUnmodifiableList()).stream().filter(i -> i == 2).collect(Collectors.toList()));
        String[] arr = {"Hii","Kanha"};
       Stream<Object>  stream1=Stream.builder().build();
       stream1.forEach(System.out::println);

       List<String> ass = Arrays.stream(arr).filter(s->s.length()>3).toList();
       System.out.println(ass);
    }
}
