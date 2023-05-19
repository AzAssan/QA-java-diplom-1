package burgerTests;

import org.junit.Test;
import praktikum.Burger;
import praktikum.bean.Ingredient;
import praktikum.enums.IngredientType;

import static org.junit.Assert.*;


public class BurgerIngredientTest {

    @Test
    public void testAddIngredient() {
        Burger burger = new Burger();

        // Создаем тестовый объект ингредиента
        Ingredient ingredient = new Ingredient( IngredientType.SAUCE, "Test Ingredient", 1.5f);

        // Добавляем ингредиент в бургер
        burger.addIngredient(ingredient);


        // Проверяем, что ингредиент был добавлен в бургер
        assertTrue(burger.ingredients.contains(ingredient));
    }

    @Test
    public void testRemoveIngredient() {
        Burger burger = new Burger();

        // Создаем тестовый объект ингредиента и добавляем его в бургер
        Ingredient ingredient = new Ingredient( IngredientType.FILLING, "Test Ingredient", 2.0f);
        burger.addIngredient(ingredient);

        // Удаляем ингредиент из бургера
        burger.removeIngredient(0);

        // Проверяем, что ингредиент был удален из бургера
        assertFalse(burger.ingredients.contains(ingredient));
    }

    @Test
    public void testMoveIngredient() {
        Burger burger = new Burger();

        // Создаем тестовые объекты ингредиентов и добавляем их в бургер
        Ingredient ingredient1 = new Ingredient( IngredientType.FILLING, "Test Ingredient 1", 2.0f);
        Ingredient ingredient2 = new Ingredient( IngredientType.SAUCE, "Test Ingredient 2", 0.5f);
        burger.addIngredient(ingredient1);
        burger.addIngredient(ingredient2);

        // Перемещаем ингредиент 2 на первое место
        burger.moveIngredient(1, 0);

        // Проверяем, что ингредиент 2 находится на первом месте в списке ингредиентов бургера
        assertEquals(ingredient2, burger.ingredients.get(0));
    }
}

