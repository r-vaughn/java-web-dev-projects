import java.sql.SQLOutput;

public class Main  {

    public static void main() {
        HouseCat garfield = new HouseCat("Garfield", 12);
        garfield.eat();
        System.out.println(garfield.isTired());
    }
}
