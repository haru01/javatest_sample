import static fj.data.List.list;
import fj.F;

public class Fizzbuzz {

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
