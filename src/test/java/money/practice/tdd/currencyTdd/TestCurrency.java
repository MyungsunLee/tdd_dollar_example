package money.practice.tdd.currencyTdd;

import money.practice.tdd.model.Dollar;
import org.junit.Test;

import static org.junit.Assert.*;
public class TestCurrency {

    @Test
    public void testMultiplication() {

        Dollar five = new Dollar(5);
        five.times(2);

        assertEquals(10,five.getAmount());



    }


}
