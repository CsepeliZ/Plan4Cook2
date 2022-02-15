package domain;

public class Ingredient {

    private String ingredientName;
    private double ingredientAmount;
    private Measure ingredientMeasure;

    public Ingredient(String ingredientName, double ingredientAmount, Measure ingredientMeasure) {
        this.ingredientName = ingredientName;
        this.ingredientAmount = ingredientAmount;
        this.ingredientMeasure = ingredientMeasure;
    }

    public String getIngredientName() {
        return ingredientName;
    }

    public void setIngredientName(String ingredientName) {
        this.ingredientName = ingredientName;
    }

    public double getIngredientAmount() {
        return ingredientAmount;
    }

    public void setIngredientAmount(double ingredientAmount) {
        this.ingredientAmount = ingredientAmount;
    }

    public Measure getIngredientMeasure() {
        return ingredientMeasure;
    }

    public void setIngredientMeasure(Measure ingredientMeasure) {
        this.ingredientMeasure = ingredientMeasure;
    }

    @Override
    public String toString() {
        return "Ingredient{" +
                "ingredientName='" + ingredientName + '\'' +
                ", ingredientAmount=" + ingredientAmount +
                ", ingredientMeasure=" + ingredientMeasure +
                '}';
    }
}
