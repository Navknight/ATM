import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Reader {
    public static void reader(String loc, List<List<String>> data) {
        try {
            File file = new File(loc);
            Scanner s = new Scanner(file);
            //Reading until we run out of lines
            while (s.hasNextLine()) {
                List<String> lineData = Arrays.asList(s.nextLine().split(","));//splitting lines
                data.add(lineData);
            }
            //printing the fetched data
//            for (List<String> list : data) {
//                for (String str : list)
//                    System.out.print(str + " ");
//                System.out.println();
//            }
            s.close();
        } catch (Exception e) {
            System.out.print(e);
        }
    }
}
