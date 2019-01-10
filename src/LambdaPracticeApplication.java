import java.util.ArrayList;
import java.util.List;
public class LambdaPracticeApplication {
    public static void main(String[] args) {
//        Create a list of words. Make sure you use new ArrayList to have a mutable list.
        List<String> keywords = new ArrayList<>();
        keywords.add("somewhere");
        keywords.add("scenario");
        keywords.add("table");
        keywords.add("cable");
        keywords.add("glass");
        keywords.add("backpack");
        keywords.add("mouse");
        System.out.println(keywords);
//        Use the removeIf method to remove every word that ends with the letter e.
        System.out.println("Words filtered List by ending with letter e: ");
        keywords.removeIf(e -> e.endsWith("e"));
        System.out.println(keywords);
//        Use the replaceAll method to transform every word in their uppercase version.
        System.out.println("Words filtered by changing to uppercase: ");
        keywords.replaceAll(e -> e.toUpperCase());
        System.out.println(keywords);
//        Use the removeIf method to remove every word that has less than six letters.
        System.out.println("Words filtered by words that has less than six letters: ");
        keywords.removeIf(e -> e.length() < 6 );
        System.out.println(keywords);
//        Use the forEach method to print every word one by one.
        keywords.forEach(e -> System.out.println(e));
        }
    }
