import java.util.Arrays;

public class ch4_4 {
    public static void main(String[] args) {
        String[] text = {"love","is","in","the","air"};
        
        Arrays.sort(text);

        int search = Arrays.binarySearch(text, "air");
        System.out.println(search);
    }
}

