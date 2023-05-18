public class Breakfast
{
    String cost;
    String description;

    public Breakfast(String name) {
        this.description = name;
        this.cost = "10";
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