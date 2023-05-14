package burgerTests;
import org.junit.Before;
import org.junit.Test;
import praktikum.Burger;
import praktikum.bean.Bun;
import praktikum.bean.Ingredient;
import praktikum.enums.IngredientType;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class BurgerTest {

    private Burger burger;

    @Before
    public void setUp() {
        burger = new Burger();
    }

    @Test
    public void testSetAndGetBuns() {
        Bun bun = new Bun("Sesame Seed Bun", 1.0f);
        burger.setBuns(bun);
        assertEquals(bun, burger.bun);
    }

    @Test
    public void testAddAndGetIngredients() {
        Ingredient ingredient1 = new Ingredient(IngredientType.FILLING, "Beef Filling", 1.5f);
        Ingredient ingredient2 = new Ingredient(IngredientType.SAUCE, "Cheddar Cheese", 0.5f);
        burger.addIngredient(ingredient1);
        burger.addIngredient(ingredient2);

    }

    @Test
    public void testRemoveIngredientRemovesIngredientAtIndex() {
        Ingredient ingredient1 = new Ingredient( IngredientType.FILLING, "lettuce",0.5f);
        Ingredient ingredient2 = new Ingredient(IngredientType.FILLING,"cheese", 1.0f);
        Ingredient ingredient3 = new Ingredient(IngredientType.SAUCE,"ketchup",  0.5f);

        Burger burger = new Burger();
        burger.setBuns(new Bun("Bun", 1.0f));
        burger.addIngredient(ingredient1);
        burger.addIngredient(ingredient2);
        burger.addIngredient(ingredient3);

        int indexToRemove = 1;
        burger.removeIngredient(indexToRemove);

        List<Ingredient> expectedIngredients = new ArrayList<>();
        expectedIngredients.add(ingredient1);
        expectedIngredients.add(ingredient3);

        assertEquals(expectedIngredients, burger.ingredients);
    }

}
