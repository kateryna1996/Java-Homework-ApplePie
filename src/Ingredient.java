public class Ingredient {
    private int amount;
    private String unit;
    private String name;

    public Ingredient() {
    }

    public Ingredient(int amount, String unit, String name) {
        this.amount = amount;
        this.unit = unit;
        this.name = name;
    }
//********************** Amount ****************************
    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    //********************** Unit ****************************
    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    //********************** Name ****************************
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
