import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
 
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
 
class Marks {
    int maths;
    int physics;
    int chemistry;
 
    public Marks(int maths, int physics, int chemistry) {
        this.maths = maths;
        this.physics = physics;
        this.chemistry = chemistry;
    }
 
    public double getTotal() {
        return maths + physics + chemistry;
    }
}
 
class Student {
    int id;
    String name;
    Marks marks;
    double percentage;
 
    public Student(int id, String name, Marks marks) {
        this.id = id;
        this.name = name;
        this.marks = marks;
        this.percentage = calculatePercentage();
    }
 
    private double calculatePercentage() {
        return marks.getTotal() / 3.0; 
    }
}
 
public class StudentRankDetail {
    public static void main(String[] args) {
        File file = new File("C:\\Users\\kl000037\\Desktop\\student.json");
        List<Student> students = new ArrayList<>();
 
        try (Scanner scanner = new Scanner(file)) {
            StringBuilder jsonString = new StringBuilder();
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine().trim();
                jsonString.append(line);
            }
 
            // Parse the complete JSON array
            JSONParser parser = new JSONParser();
            JSONArray jsonArray = (JSONArray) parser.parse(jsonString.toString());
            for (Object obj : jsonArray) {
                JSONObject jsonObject = (JSONObject) obj;
                int id = ((Long) jsonObject.get("id")).intValue();
                String name = (String) jsonObject.get("name");
                JSONObject marksJson = (JSONObject) jsonObject.get("marks");
                Marks marks = new Marks(
                        ((Long) marksJson.get("maths")).intValue(),
                        ((Long) marksJson.get("physics")).intValue(),
                        ((Long) marksJson.get("chemistry")).intValue()
                );
                students.add(new Student(id, name, marks));
            }
 
            
            students.sort(Comparator.comparingDouble(s -> -s.percentage));
 
            
            System.out.println("Rank\tID\tName\tPercentage");
            for (int i = 0; i < students.size(); i++) {
                System.out.printf("%d\t%d\t%s\t%.2f%%\n",
                        i + 1, students.get(i).id, students.get(i).name, students.get(i).percentage);
            }
 
        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + e.getMessage());
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        } catch (ParseException e) {
            System.out.println("Error parsing JSON: " + e.getMessage());
        }
    }
}
 