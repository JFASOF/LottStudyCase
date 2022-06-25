package com.lt.lott.controller;

/*
Created by J.Fırat ©
    Date : 25.06.2022
    Time : 14:26
*/

import com.lt.lott.service.LottService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.annotation.RequestScope;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import java.util.List;

@RestController
@RequestScope
@RequestMapping("/nums")
@Validated
@CrossOrigin
public class LotteryApiConttroller {
    @Value("${server.port}")
    private int port;
    private final LottService lottService;

    public LotteryApiConttroller(LottService lottService) {
        this.lottService = lottService;
    }
    @GetMapping(params = "column")
    public List<List<Integer>> getDrawLott(@Min(3) @Max(6) int column) {
        return lottService.draw(column);
    }
}
