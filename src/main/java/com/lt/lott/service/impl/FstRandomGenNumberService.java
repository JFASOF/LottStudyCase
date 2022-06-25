package com.lt.lott.service.impl;

import com.lt.lott.service.RandomGenNumberService;
import org.springframework.stereotype.Service;

import java.util.concurrent.ThreadLocalRandom;

/*
Created by J.Fırat ©
    Date : 25.06.2022
    Time : 14:46
*/
@Service //-->Singleton-statless
public class FstRandomGenNumberService implements RandomGenNumberService {
    @Override
    public Integer generateInteger(int min, int max) {
        return ThreadLocalRandom.current().nextInt(min, max);
    }
}
