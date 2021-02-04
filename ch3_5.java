class WordTool {
    public int wordCount(String s) {
        int count = 0;

        if ( !(s == null || s.isEmpty()) ) {
            String[] w = s.split("\\s+");
            count = w.length;
        }

        return count;
    }

    public int symbolCount ( String s, boolean withSpaces ) {
        int count = 0;

        if ( !(s == null || s.isEmpty()) ) {

            if(withSpaces) {
                count = s.length();
            } else {
                count = s.replace(" ", "").length();
            }
        }

        return count;
    }
}

public class ch3_5 {
    public static void main(String[] args) {
        WordTool wt = new WordTool();
        String text = "Река уносила воспоминания о её детстве.";

        System.out.println("Анализ текста: \n" + text);
        System.out.println("Всего слов: " + wt.wordCount(text));
        System.out.println("Всего символов с пробелами: " + wt.symbolCount(text,true));
        System.out.println("Всего символов без пробелов: " + wt.symbolCount(text,false));
    }
}
