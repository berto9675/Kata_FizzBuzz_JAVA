package dev.berto.Fizzbuzz;

public class FizzBuzz {
    public String checkNumber(int number){
        boolean isDivisibleBy3And5 = number % 3 == 0 && number % 5 == 0;
        if (isDivisibleBy3And5) {
            return "FizzBuzz";
        }
        boolean isDivisibleBy3 = number % 3 == 0;
        if (isDivisibleBy3) {
            return "Fizz";
        }
        boolean isDivisibleBy5 = number % 5 == 0;
        if (isDivisibleBy5) {
            return "Buzz";
        }
        return "null";
    }
    
}
