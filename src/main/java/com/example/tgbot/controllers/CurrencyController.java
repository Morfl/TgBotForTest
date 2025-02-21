package com.example.tgbot.controllers;

import com.example.tgbot.Service.CentralRussianBankService;
import com.example.tgbot.dto.ValuteCursOnDate;
import lombok.Data;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@Data
public class CurrencyController {

    private final CentralRussianBankService centralRussianBankService;

    public CurrencyController(CentralRussianBankService centralRussianBankService) {
        this.centralRussianBankService = centralRussianBankService;
    }

    @GetMapping("/getCurrencies")
    @ResponseBody
    public List<ValuteCursOnDate> getValuteCursOnDate() throws Exception {
        return centralRussianBankService.getCurrenciesFromCbr();
    }
}