package dev.berto.FizzbuzzTest;


import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.instanceOf;
import static org.hamcrest.CoreMatchers.is;
import org.junit.jupiter.api.Test;

// Ensure the correct package path for Fizzbuzz class
import dev.berto.Fizzbuzz.FizzBuzz;


import org.junit.jupiter.api.DisplayName;

public class FizzBuzzTest {
    @Test
    @DisplayName("Returns FizzBuzz if the number is divisible by both 3 and 5")
    public void test_fizzbuzz_ifdivisivleBy3And5() {
        int num = 15; 
        FizzBuzz fizzbuzz = new FizzBuzz();

        String result = fizzbuzz.checkNumber(num);

        assertThat(result, is("FizzBuzz"));
    }

    @Test
    @DisplayName("Returns Fizz if the number is divisible by 3")
    void testIfdivisbleByThree_ReturnFizz() {

        // Given
        int num = 9;
        FizzBuzz fizzbuzz = new FizzBuzz();

        // When
        String result = fizzbuzz.checkNumber(num);

        // Then
        
        assertThat(fizzbuzz, instanceOf(FizzBuzz.class));
        assertThat(result, is("Fizz"));
    }   

    @Test
    @DisplayName("Returns Buzz if the number is divisible by 5")
        void testIfdivisbleByFive_ReturnBuzz() {
            
            int num = 10;

            FizzBuzz fizzbuzz = new FizzBuzz();
    
            String result = fizzbuzz.checkNumber(num);
    
            assertThat(result, is("Buzz"));
    }   
}
