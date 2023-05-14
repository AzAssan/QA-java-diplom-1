package bunTests;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import praktikum.bean.Bun;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class BunNameTest {

    private final String name;
    private final Bun bun;

    public BunNameTest(String name) {
        this.name = name;
        this.bun = new Bun(name, 2.5f); // использование конструктора Bun для создания объекта bun
    }

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
                {"Sesame Bun"},
                {"Whole Wheat Bun"},
                {"Potato Bun"}
        });
    }

    @Test
    public void testBunName() {
        assertEquals(name, bun.getName()); // сравнение ожидаемого значения name с актуальным значением поля name объекта bun
    }
}
