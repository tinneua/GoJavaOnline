package Module3.Task2.Flower;

import java.util.ArrayList;
import java.util.List;

/**
 *
 */
public class RoseBush {
    private List<RoseFlower> roses = new ArrayList<>();
    public void addRose(RoseFlower newRose) {
        roses.add(newRose);
    }
    public List<RoseFlower> getRoses() {return roses;}
}
