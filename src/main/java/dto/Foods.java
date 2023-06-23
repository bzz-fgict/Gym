package dto;

public class Foods {
    private int idfood;
    private String food;
    private int kcal;
    private int carbs;
    private int protein;

    private int fett;

    public Foods(int idfood, String food, int kcal, int carbs, int protein, int fett) {
        this.idfood = idfood;
        this.food = food;
        this.kcal = kcal;
        this.carbs = carbs;
        this.protein = protein;
        this.fett = fett;
    }

    public Foods() {
    }

    public int getIdfood() {
        return idfood;
    }

    public void setIdfood(int idfood) {
        this.idfood = idfood;
    }

    public String getFood() {
        return food;
    }

    public void setFood(String food) {
        this.food = food;
    }

    public int getKcal() {
        return kcal;
    }

    public void setKcal(int kcal) {
        this.kcal = kcal;
    }

    public int getCarbs() {
        return carbs;
    }

    public void setCarbs(int carbs) {
        this.carbs = carbs;
    }

    public int getProtein() {
        return protein;
    }

    public void setProtein(int protein) {
        this.protein = protein;
    }

    public int getFett() {
        return fett;
    }

    public void setFett(int fett) {
        this.fett = fett;
    }

}
