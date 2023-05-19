package burgerTests;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Spy;
import org.mockito.junit.MockitoJUnitRunner;
import praktikum.Burger;
import praktikum.bean.Bun;
import praktikum.bean.Ingredient;
import praktikum.enums.IngredientType;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class BurgerReceiptTest {

    @Mock
    private Ingredient ingredient;
    @Spy
    private Burger burger;

    @Before
    public void setUp() {
        Bun bun = new Bun("Bun", 1.0f);
        burger.setBuns(bun);
    }

    @Test
    public void testGetReceiptBunAndIngredientsShowsBunNameIngredientsAndBurgerPrice() {
        // Создаем булочку и ингредиенты
        when(ingredient.getType()).thenReturn(IngredientType.FILLING);
        when(ingredient.getName()).thenReturn("Beef Patty");
        Ingredient ingredient2 = new Ingredient(IngredientType.FILLING,"Cheddar Cheese", 1.5f);
        Ingredient ingredient3 = new Ingredient(IngredientType.SAUCE, "Ketchup", 0.5f);

        // Создаем бургер и добавляем булочку и ингредиенты
        burger.addIngredient(ingredient);
        burger.addIngredient(ingredient2);
        burger.addIngredient(ingredient3);

        // Ожидаемый результат
        String expectedReceipt = "(==== Bun ====)\r\n" +
                "= filling Beef Patty =\r\n" +
                "= filling Cheddar Cheese =\r\n" +
                "= sauce Ketchup =\r\n" +
                "(==== Bun ====)\r\n" +
                "\r\nPrice: 4,000000\r\n";

        // Получаем фактический результат
        String actualReceipt = burger.getReceipt();

        // Проверяем, что строки совпадают
        assertEquals(expectedReceipt, actualReceipt);
    }

}



