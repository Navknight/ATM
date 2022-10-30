import java.util.*;
import java.io.*;

public class Writer {
    public static void write(String loc, List<List<String>> data) throws IOException {
        File csvFile = new File(loc);
        FileWriter fileWriter = new FileWriter(csvFile);
        for (List <String> list: data) {
            StringBuilder line = new StringBuilder();
            for (String str : list) {
                line.append(str);
                line.append(",");
            }
            line.append("\n");
            fileWriter.write(line.toString());
        }
        fileWriter.close();
    }
}
