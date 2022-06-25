package com.lt.lott.service;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/*
Created by J.Fırat ©
    Date : 25.06.2022
    Time : 14:41
*/
public interface LottService {
    List<Integer> drawLott();

    default List<List<Integer>> draw(int column) {
        return IntStream.range(0, column)
                .mapToObj(i -> this.drawLott())
                .collect(Collectors.toList());
    }
}
