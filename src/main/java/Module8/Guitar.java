package Module8;

public class Guitar {
    String name;
    double price;
    int yearOfProduction;
    public Guitar(String name, double price, int yearOfProduction) {
        this.name = name;
        this.price = price;
        this.yearOfProduction = yearOfProduction;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int getYearOfProduction() {
        return yearOfProduction;
    }

    @Override
    public String toString() {
        return name + "\t" + price + "\t\t" + yearOfProduction + "\t\t";
    }
}
