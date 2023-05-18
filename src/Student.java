import java.util.ArrayList;
import java.util.Iterator;

public class Student {
    String name;
    ArrayList<Breakfast> breakfastItems;
    ArrayList<Lunch> lunchItems;
    ArrayList<Snack> snackItems;
    String order;

    public Student(String name) {
        this.name = name;
        this.breakfastItems = new ArrayList();
        this.lunchItems = new ArrayList();
        this.snackItems = new ArrayList();
        this.order = "";
    }

    public String getName() {
        return this.name;
    }

    public String getOrder() {
        this.order = "Orders:\n";
        for(Breakfast breakfastItem : breakfastItems){
            order += "{type=breakfast, name=" + breakfastItem.getDescription() + ", price=" + breakfastItem.getCost() + "}\n";
        }
        for(Lunch lunchItem : lunchItems){
            order += "{type=lunch, name=" + lunchItem.getDescription() + ", price=" + lunchItem.getCost() + "}\n";
        }
        for(Snack snackItem : snackItems){
            order += "{type=snack, name=" + snackItem.getDescription() + ", price=" + snackItem.getCost() + "}\n";
        }
        return order;
    }
}
