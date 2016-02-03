package Module3.Task3.Music;

import java.util.ArrayList;
import java.util.List;

/**
 *
 */
public class MusicStore {
    List<MusicInstrument> instruments = new ArrayList<>();
    public void addInstrument(MusicInstrument newInstrument) {
        instruments.add(newInstrument);
    }
    public List<MusicInstrument> getInstruments() {return instruments;}
}
