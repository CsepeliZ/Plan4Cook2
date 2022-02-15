package domain;

import java.util.ArrayList;
import java.util.List;

public class Meal {

    private String mealName;
    private List<Ingredient> mealIngredients = new ArrayList<>();

    public Meal(String mealName, List<Ingredient> mealIngredients) {
        this.mealName = mealName;
        this.mealIngredients = mealIngredients;
    }

    public String getMealName() {
        return mealName;
    }

    public void setMealName(String mealName) {
        this.mealName = mealName;
    }

    public List<Ingredient> getMealIngredients() {
        return mealIngredients;
    }

    public void setMealIngredients(List<Ingredient> mealIngredients) {
        this.mealIngredients = mealIngredients;
    }

    @Override
    public String toString() {
        return "Meal{" +
                "mealName='" + mealName + '\'' +
                ", mealIngredients=" + mealIngredients +
                '}';
    }
}
