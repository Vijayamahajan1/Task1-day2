package com.bnt.Calculatotor.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bnt.Calculatotor.Service.CalculatorService;

@RestController
@RequestMapping("/Calculator")
public class CalculatorController {

@Autowired
CalculatorService calculatorService;

@PostMapping("/calculat")

public String Calculate(@PathVariable ("n") int n){
    new Thread(calculatorService.squaretask(n)).start();
    new Thread(calculatorService.cubetask(n)).start();
    new Thread(calculatorService.checkArmstrong(n)).start();
    new Thread(calculatorService.checkPalindrome(n)).start();
    new Thread(calculatorService.evenoddtask(n)).start();
    new Thread(calculatorService.reverseNumber(n)).start();
    new Thread(calculatorService.checkprime(n)).start();
    new Thread(calculatorService.calculateFactorial(n)).start();
    return "calculations started "  ;

}

}
