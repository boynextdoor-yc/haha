package com.es.service;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@Service
public class HelloService {
    @Scheduled(cron = "0/5 * * * * 0-7")
    public void sayHello(){
        System.out.println("hello.....");
    }

    public static int test(int cap){
        int n = cap - 1;
        n |= n >>> 1;
        n |= n >>> 2;
        n |= n >>> 4;
        n |= n >>> 8;
        n |= n >>> 16;
        return (n < 0) ? 1 : ( n + 1);
    }

    public static void main(String[] args) {
        Integer [] integers=new Integer[]{1,2,3,4,5};
        Stream<Integer> stream = Arrays.stream(integers);
        List<Integer> collect = stream.map(x -> x * x).collect(Collectors.toList());
        System.out.println(collect);
    }
}
