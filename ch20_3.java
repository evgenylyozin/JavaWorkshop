import java.util.Optional;

public class ch20_3 {
    public static void main(String[] args) {
        // non nullable construction
        Optional<String> textNonNullable = Optional.of("not nullable");
        String textNonNullableSafe = textNonNullable.orElse("this is empty");
        System.out.println("Non-Empty Optional:" + textNonNullableSafe);
        // the empty object
        Optional<String> textEmpty = Optional.empty();
        String textEmptySafe = textEmpty.orElse("this is empty");
        System.out.println("Empty Optional: " + textEmptySafe);
    }
}
