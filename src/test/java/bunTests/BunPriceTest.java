package bunTests;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import praktikum.bean.Bun;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class BunPriceTest {

    private final float price;
    private final Bun bun;

    public BunPriceTest(float price) {
        this.price = price;
        this.bun = new Bun("Sesame Bun", price); // использование конструктора Bun для создания объекта bun
    }

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
                {2.5f},
                {3.0f},
                {3.5f}
        });
    }

    @Test
    public void testBunPrice() {
        assertEquals(price, bun.getPrice(), 0.001); // сравнение ожидаемого значения price с актуальным значением поля price объекта bun с погрешностью 0.001
    }
}
