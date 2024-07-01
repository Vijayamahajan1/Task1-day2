package com.bnt.Calculatotor.Service;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.slf4j.Logger;
import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;

@ExtendWith(MockitoExtension.class)
public class CalculatorServiceTest {

    // @InjectMocks
    // CalculatorService calculatorService;

    @Mock
    Logger logger;

    CalculatorService calculatorService;

    @BeforeEach
    void setUp() {
        calculatorService = new CalculatorService(4); // Example: Provide the required constructor arguments
    }

    @Test
    void testCalculateSquare() {
        int number = 5;

        // Call the method under test
        Runnable task = calculatorService.squaretask(number);


        assertDoesNotThrow(task::run); // Ensure that calling the task does not throw any exception
        
    }
}
