package patterns.structural;

import java.io.File;

import static java.util.Objects.requireNonNull;

public class Helper {
    public File getFile(String file) {
        return new File(requireNonNull(
                getClass().getClassLoader().getResource("data/" + file)
        ).getFile());
    }
}