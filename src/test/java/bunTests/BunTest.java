package bunTests;

import org.junit.Test;
import praktikum.bean.Bun;

import static org.junit.Assert.assertEquals;

public class BunTest {

    @Test
    public void testBun() {
        Bun bun = new Bun("Sesame Bun", 2.5f); // создание нового объекта bun с заданным именем и ценой

        assertEquals("Sesame Bun", bun.getName()); // проверка поля name объекта bun
        assertEquals(2.5f, bun.getPrice(), 0.001); // проверка поля price объекта bun с погрешностью 0.001
    }
}
