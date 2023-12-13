public class Main {
    public static void main(String[] args){
        HamletParser hp = new HamletParser();
        String hamletText = hp.getHamletData();

        hamletText = hp.hamletToLeon(hamletText);
        hamletText = hp.horatioToTariq(hamletText);

        hp.writeToFile(hamletText);

    }
}
