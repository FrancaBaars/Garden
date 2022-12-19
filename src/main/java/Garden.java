import java.util.HashSet;

public class Garden {
    private HashSet<Vegetable> vegetables;

    public Garden() {
        this.vegetables = new HashSet<>();
    }

    public HashSet<Vegetable> getVegetables() {
        return vegetables;
    }

    public void setVegetables(HashSet<Vegetable> vegetables) {
        this.vegetables = vegetables;
    }

    public void addVegetable(Vegetable vegetable) {
        this.vegetables.add(vegetable);
    }

    public void grow(int Lux, int rain, int days) {
        for (Vegetable vegetable : this.vegetables) {
            vegetable.grow(Lux, rain, days);
        }
    }
}
