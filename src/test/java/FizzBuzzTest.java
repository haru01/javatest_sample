//import static org.junit.Assert.*;

import static fj.data.List.list;
import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.assertThat;

import org.junit.Test;

import fj.F;
public class FizzBuzzTest {

	@Test
	public void FizzBuzz配列を返すこと() {
		Fizzbuzz target = new Fizzbuzz();
		assertThat(target.convert(new Integer[]
					   {1, 2, 3, 4, 5, 6, 7, 8, 9, 10,
						11, 12, 13, 14, 15, 16}),
				   equalTo(new String[]
						{"1", "2", "FIZZ", "4", "BUZZ", "FIZZ", "7", "8", "FIZZ", "BUZZ",
						"11", "FIZZ", "13", "14", "FIZZBUZZ", "16"}));
	}
}

class Fizzbuzz {

	public String[] convert(Integer[] numbers) {
		return list(numbers).map(new F<Integer, String>() {
            public String f(Integer num) {
                return _convert(num);
            }
        }).array(String[].class);
	}

	private String _convert(Integer num) {
		if(num % 15 == 0) {
			return "FIZZBUZZ";
		}
		if(num % 5 == 0) {
			return "BUZZ";
		}
		if(num % 3 == 0) {
			return "FIZZ";
		}
		return num.toString();
	}
}
