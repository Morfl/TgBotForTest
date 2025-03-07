package com.example.tgbot.Service;


import com.example.tgbot.repository.IncomeRepository;
import com.example.tgbot.repository.SpendRepository;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
@ExtendWith(MockitoExtension.class) // Для поддержки Mockito в JUnit 5
class FinanceServiceTest {

    @InjectMocks
    private FinanceService financeService;

    @Mock
    private SpendRepository spendRepository;

    @Mock
    private IncomeRepository incomeRepository;

    @BeforeEach
    public void setup() {
        // Инициализация моков (необязательно, если используется @ExtendWith(MockitoExtension.class))
        MockitoAnnotations.openMocks(this);
    }

    @Test
    public void addFinanceOperationTest() {


        // Тест для добавления дохода
        String price = "150.0";
        String message = financeService.addFinanceOperation("/addincome", price, 500L);
        Assertions.assertEquals("Доход в размере " + price + " был успешно добавлен", message);

        // Тест для добавления расхода
        price = "200";
        message = financeService.addFinanceOperation("/nan", price, 250L);
        Assertions.assertEquals("Расход в размере " + price + " был успешно добавлен", message);

    }
}