import domain.CookingPlan;
import domain.Meal;
import repository.CookingPlanRepository;
import repository.IngredientRepository;
import repository.MealRepository;
import ui.Ui;

import java.util.List;
import java.util.Scanner;

public class UserConsole {

    CookingPlanRepository cookingPlanRepository = new CookingPlanRepository();
    MealRepository mealRepository = new MealRepository();
    IngredientRepository ingredientRepository = new IngredientRepository();
    Ui ui = new Ui();

    private String currentName;
    private int currentInt;
    private double currentDouble;

    public void startApp() {

        boolean endProgram = false;
        // cookingPlanRepository.createCookingPlanTable();
        mealRepository.createMealTable();
        ingredientRepository.createingredientTable();
        mainMenu();
        while (!endProgram) {
            int userInput = ui.askInt();
            switch (userInput) {
                case 1:
                    CookingPlan cookingPlan = cookingPlanRepository.createNewCookingPlan();


                case 2:
                    String newMealInfo = mealRepository.createNewMeal(new Meal(ui.askText()); /* TODO: list of ingreds */ ;
                    // TODO: LIKE-alapú pontosítás az UI-ban
                    break;
                case 3:
                    String newMealInfo = mealRepository.modifyMeal(ui.askText());
                    // TODO: LIKE-alapú pontosítás az UI-ban
                    break;
                case 4:
                    String newMealInfo = mealRepository.deleteMeal(ui.askText());
                    // TODO: LIKE-alapú pontosítás az UI-ban
                    break;
                case 0:
                    endProgram = true;
            }
        }

    }

    private static void mainMenu() {
        System.out.println("[[[ Plan4Cook ]]]");
        System.out.println();
        System.out.println("Choose an option:");
        System.out.println("[1] Create a new cooking plan");
        System.out.println("[2] Create a new meal");
        System.out.println("[3] Modify a meal");
        System.out.println("[4] Delete a meal");
        System.out.println("[0] QUIT");
    }
}
