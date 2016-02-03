package Module3.Task1.File;

import java.util.ArrayList;
import java.util.List;

/**
 *
 */
public class Directory {
    private List<File> files = new ArrayList<>();
    public void addFile(File file) {
        files.add(file);
    }
    public List<File> getFiles() {return files;}
}
