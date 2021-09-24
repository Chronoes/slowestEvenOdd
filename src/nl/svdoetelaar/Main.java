package nl.svdoetelaar;

import java.time.Duration;
import java.util.Arrays;

public class Main {
    private static final long[] NUMBERS = {96640035,
            861388824,
            672739311,
            276059063,
            828148957,
            691705110,
            780551637,
            901585233,
            937629128,
            201453176,
            946630906,
            282486120,
            276013971,
            335866674,
            213712520,
            325011558,
            232784743,
            308278038,
            104423268,
            514808490,
            956598218,
            569311687,
            184227151,
            60237767,
            465551106,
            713855650,
            8908093,
            860503060,
            897415165,
            642175719,
            889632298,
            798436611,
            651293572,
            530475273,
            894927661,
            632485055,
            818776423,
            275028881,
            153688147,
            196201768,
            608326042,
            668469313,
            780540564,
            504798805,
            937906389,
            782849010,
            598687209,
            795732937,
            922990382,
            419131268,
            243834815,
            401020217,
            568425059,
            87060236, 1,
            930221996,
            660568199,
            48162332,
            457049813,
            296224203,
            471503090,
            847056950,
            663177512,
            710902797,
            33009999,
            596948247,
            951708092,
            372256551,
            198211739,
            533038621,
            853187111,
            123490388,
            114861126,
            476388309,
            765925099,
            873299315,
            537848067,
            607131798,
            611310130,
            733151796,
            887230600,
            511190690,
            785928550,
            550494320,
            143869641,
            534160073,
            912785855,
            918112912,
            308064488,
            299891605,
            998377939,
            595522057,
            664820877,
            28867545,
            677672963,
            260002223,
            268773190,
            498185543,
            414550567,
            561713696,
            770187519};

    public static void main(String[] args) {

        System.out.println("amount of numbers" + NUMBERS.length);
        long startTime = System.nanoTime();

        Arrays.stream(NUMBERS).forEach(n -> {
                    long startSampleTime = System.nanoTime();
                    boolean result = FastAsFuck.isOdd(n);
                    System.out.printf("%10d: %-7s Sample Time: %dns\n", n, result, (System.nanoTime() - startSampleTime));
                }
        );

        long endTime = System.nanoTime();

        System.out.printf("\nTotal Duration: %d.%d seconds ", Duration.ofNanos(endTime - startTime).toSeconds(), Duration.ofNanos(endTime - startTime).toMillis() % 1000);
    }
}