package Module3.Task2.Flower;

import java.util.ArrayList;
import java.util.List;

/**
 *
 */
public class BunchOfFlowers {
    private List<Flower> flowers = new ArrayList<>();
    public void addFlower(Flower newFlower) {
        flowers.add(newFlower);
    }
    public List<Flower> getFlower() {return flowers;}
}
