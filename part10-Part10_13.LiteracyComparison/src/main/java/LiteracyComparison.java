
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

import javax.sound.sampled.SourceDataLine;

public class LiteracyComparison {
    
    public static void main(String[] args) {
        List<Data> list = new ArrayList<>();
        String path = "literacy.csv";

        try{
            Files.lines(Paths.get(path))
                .map(row -> row.split(","))
                .map(row -> new Data(row[3], row[4] ,row[2] , row[5] ))
                .sorted((p1, p2) -> {return (int)(p1.getPercent()*10000 - p2.getPercent()*10000);})
                .forEach(row -> System.out.println(row));
            } catch(Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
