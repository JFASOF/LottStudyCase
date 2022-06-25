package com.lt.lott.service.impl;

/*
Created by J.Fırat ©
    Date : 25.06.2022
    Time : 14:48
*/

import com.lt.lott.service.LottService;
import com.lt.lott.service.RandomGenNumberService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

@Service
public class StandardGenNumberService implements LottService {
    private final RandomGenNumberService randomGenNumberService;
    private final int lottSize;
    private final int lottMax;

    //constructor-injection
    public StandardGenNumberService(RandomGenNumberService randomGenNumberService,  @Value("${lotterySize}")int lottSize, @Value("${lotteryMax}")int lottMax) {
        this.randomGenNumberService = randomGenNumberService;
        this.lottSize = lottSize;
        this.lottMax = lottMax;
    }

    @Override
    public List<Integer> drawLott() {
        return IntStream.generate(() -> randomGenNumberService.generateInteger(1,lottMax)).limit(lottSize).boxed().sorted().collect(Collectors.toList());
    }
}
