package com.bnt.Calculatotor.Service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
public class CalculatorService {
    private static final Logger logger = LoggerFactory.getLogger(CalculatorService.class);

    int number;

    public CalculatorService(int number) {
        this.number = number;
    }

   public Runnable squaretask(int n){
    return () -> {
        int square = n*n;
        logger.info("square of"+ n +"is:"+ square);
    };
   }

   public Runnable cubetask(int n){
    return () -> {
        int cube = n*n*n;
        logger.info("square of"+ n +"is:"+ cube);
    };
   }
   public Runnable evenoddtask(int n){
    return () -> {
        String evenodd = (n %2 == 0) ? "Even" : "odd";
        logger.info("square of"+ n +"is:"+ evenodd);
    };
}
  
    public Runnable checkprime(int n){
        return () -> {
            boolean isPrime = true;
            if(n<=1){
                isPrime=false;
            }else {
                // Check for prime numbers
                for (int i = 2; i <= Math.sqrt(n); i++) {
                    if (n % i == 0) {
                        isPrime = false;
                        break;
                    }
                }
            }
    
            if (isPrime) {
                logger.info(n + " is a prime number");
            } else {
                logger.info(n + " is not a prime number");
            }
        };
    }
    public Runnable checkPalindrome(int n) {
    return () -> {
    
        int temp=n;
        int rev= 0;

        while (n > 0) {
            int digit = n % 10;
            rev = rev * 10 + digit;
            temp =temp/10;
        }

        if (n == rev) {
            logger.info(n + " is a palindrome number");
        } else {
            logger.info(n + " is not palindrome number");
        }
    };
}

public Runnable calculateFactorial(int n) {
    return () -> {
        int factorial = 1;

        for (int i = 1; i <= n; i++) {
            factorial *= i;
        }

        logger.info("Factorial of " + n + " is: " + factorial);
    };
}
public Runnable reverseNumber(int n) {
    return () -> {
        int temp = n;
        int rev = 0;

        while (n != 0) {
            int digit = n % 10;
            temp = temp/10;
            rev = rev*10 +digit;
        }

        System.out.println("Reverse of " + n + " is: " + rev);
    };
}
public Runnable checkArmstrong(int n) {
    return () -> {
        int temp = n;
        int numDigits = String.valueOf(n).length();
        int sum = 0;

        while (n > 0) {
            int digit = n % 10;
            sum += Math.pow(digit, numDigits);
            temp = temp/10;
        }

        if (sum == temp) {
            System.out.println(n + " is an Armstrong number");
        } else {
            System.out.println(n + " is not an Armstrong number");
        }
    };
}
}

    

