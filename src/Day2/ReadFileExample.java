package Day2;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Random;

public class ReadFileExample {
    public static void main(String[] args) throws IOException {
        //part 1 reading into the list
        var fileName = "students.txt";
        String all_names = Files.readString(Paths.get(fileName));
        String[] name_list = all_names.split("\n");
        var numberOfStudents=name_list.length;
        var randGenerator=new Random();
        var num=randGenerator.nextInt(numberOfStudents);
        System.out.print("Congrats " + name_list[num] + " you get to answer this question" );


        //part 2-Printing the list
//        for (String name : name_list) { // note the
//            if (name.equals("fjkdkskdj")) {
//                System.out.println(name);

            }
        }