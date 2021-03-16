package workhours;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class WorkHours {

    private String findMin(BufferedReader reader) throws IOException {
        int min = Integer.MAX_VALUE;
        StringBuilder sb = new StringBuilder();
        String line;
        while ((line = reader.readLine()) != null) {
            String[] s = line.split(",");
            int i = Integer.parseInt(s[1]);
            if (i < min) {
                min = i;
                sb = new StringBuilder();
                sb.append(s[0])
                        .append(": ")
                        .append(s[2]);
            }
        }
        System.out.println(sb.toString());
        return sb.toString();
    }

    public String minWork(String file) {
        Path path = Path.of(file);
        try (BufferedReader reader = Files.newBufferedReader(path)) {
            return findMin(reader);
        }
        catch (IOException ioe) {
            throw new IllegalStateException("Cannot read file!", ioe);
        }
    }



/*
    public static void main(String[] args) {
        WorkHours w = new WorkHours();
        w.minWork("C:\\training-solutions\\hu\\nive\\ujratervezes\\zarovizsga\\src\\main\\java\\workhours\\workhours.txt");
    }
 */
}
