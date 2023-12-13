import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by thook on 10/7/15.
 */
public class HamletParser {

    private String hamletData;

    public HamletParser(){
        this.hamletData = loadFile();
    }

    private String loadFile(){
        ClassLoader classLoader = getClass().getClassLoader();
        File file = new File(classLoader.getResource("hamlet.txt").getFile());
        StringBuilder result = new StringBuilder("");

        try(Scanner scanner = new Scanner(file)){
            while(scanner.hasNextLine()){
                String line = scanner.nextLine();
                result.append(line).append("\n");
            }

            scanner.close();
        }catch(IOException e){
            e.printStackTrace();
        }

        return result.toString();
    }

    public String getHamletData(){
        return hamletData;
    }

    public String hamletToLeon(String hamletText){
        String hamlet = "Hamlet";
        Pattern pattern = Pattern.compile(hamlet);
        Matcher matcher = pattern.matcher(hamletText);

        String hamletToLeon = matcher.replaceAll("Leon");

        return hamletToLeon;
    }

    public String horatioToTariq(String hamletText){
        String horatio = "Horatio";
        Pattern pattern = Pattern.compile(horatio);
        Matcher matcher = pattern.matcher(hamletText);

        String horatioToTariq = matcher.replaceAll("Tariq");

        return horatioToTariq;
    }

}
