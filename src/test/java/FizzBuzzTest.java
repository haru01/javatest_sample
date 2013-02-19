//import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class FizzBuzzTest {

    @Test
    public void Fizzリストを返すこと() {
        Fizzbuzz target = new Fizzbuzz();
        assertThat(target.convert(new Integer[]
                       {1, 2, 3, 4, 5, 6, 7, 8, 9, 10,
                        11, 12, 13, 14, 15, 16}),
                   equalTo(new String[]
                        {"1", "2", "FIZZ", "4", "BUZZ", "FIZZ", "7", "8", "FIZZ", "BUZZ",
                        "11", "FIZZ", "13", "14", "FIZZBUZZ", "16"}));
    }
}
