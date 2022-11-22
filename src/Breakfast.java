public class Breakfast
{
    double cost;
    String description;

    public Breakfast()
    {
        cost = 1.0;
        description = "eggs 'n bacon";
    }

    public Breakfast(String name)
    {
        description = name;
        cost = 5.0;
    }

    public Breakfast(double money)
    {
        cost = money;
        description = "eggs 'n bacon";
    }

    public Breakfast(String name, double money)
    {
        cost = money;
        description = name;
    }

}