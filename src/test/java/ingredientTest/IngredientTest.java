package ingredientTest;

import org.junit.Test;
import praktikum.bean.Ingredient;
import praktikum.enums.IngredientType;

import static org.junit.Assert.assertEquals;

public class IngredientTest {

    @Test
    public void testGetNameReturnsCorrectName() {
        Ingredient ingredient = new Ingredient(IngredientType.FILLING, "Beef Patty", 2.0f);
        String expectedName = "Beef Patty";
        String actualName = ingredient.getName();
        assertEquals(expectedName, actualName);
    }

    @Test
    public void testGetTypeReturnsCorrectType() {
        Ingredient ingredient = new Ingredient(IngredientType.SAUCE, "Ketchup", 0.5f);
        IngredientType expectedType = IngredientType.SAUCE;
        IngredientType actualType = ingredient.getType();
        assertEquals(expectedType, actualType);
    }

    @Test
    public void testGetPriceReturnsCorrectPrice() {
        Ingredient ingredient = new Ingredient(IngredientType.FILLING, "Tomato", 0.3f);
        float expectedPrice = 0.3f;
        float actualPrice = ingredient.getPrice();
        assertEquals(expectedPrice, actualPrice, 0.0f);
    }
}

