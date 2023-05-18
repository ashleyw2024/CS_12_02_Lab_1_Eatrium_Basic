public class Snack
{
    String cost;
    String description;

    public Snack(String description) {
        this.description = description;
        this.cost = "5";
    }

    public String getCost() {
        return cost;
    }

    public void setCost(String cost) {
        this.cost = cost;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}