package domain;

import java.util.ArrayList;
import java.util.List;

public class CookingPlan {

    private List<Meal> mealsInPlan = new ArrayList<>();


    public CookingPlan(List<Meal> mealsInPlan) {
        this.mealsInPlan = mealsInPlan;
    }

    public List<Meal> getMealsInPlan() {
        return mealsInPlan;
    }

    public void setMealsInPlan(List<Meal> mealsInPlan) {
        this.mealsInPlan = mealsInPlan;
    }

    @Override
    public String toString() {
        return "CookingPlan{" +
                "mealsInPlan=" + mealsInPlan +
                '}';
    }
}
