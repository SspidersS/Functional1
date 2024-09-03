import java.util.List;
import java.util.ArrayList;
import java.util.StringJoiner;

public class Main {

    public static String getNamesAtOddIndices(List<String> names) {
        StringJoiner joiner = new StringJoiner(", ");

        for (int i = 1; i < names.size(); i += 2) {
            joiner.add((i) + ". " + names.get(i));
        }

        return joiner.toString();
    }

    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("Ivan");
        names.add("Peter");
        names.add("John");
        names.add("Alex");
        names.add("Mike");

        String result = getNamesAtOddIndices(names);
        System.out.println(result);
    }
}
