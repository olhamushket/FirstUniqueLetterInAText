import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class FirstUniqueLetter {

    public List sequenceOfLetters(List<String> lines){
        List<Character> sequence = new LinkedList<>();
        for (String st: lines) {
            List<String> words = new LinkedList<>(Arrays.
                    asList(st.split("[ .,(“—/:?!”;*)\"-]|\\s+]")));
            for (String str : words) {
                for (int i = 0; i < str.length(); i++) {
                    if (str.indexOf(str.charAt(i)) == str.lastIndexOf(str.charAt(i))) {
                        sequence.add(str.charAt(i));
                        break;
                    }
                }
            }
        }
        return sequence;
    }


    public void result(List<Character> sequence) {
        System.out.println("\n");
        if (sequence.isEmpty()) {
            System.out.println("This text hasn't got a first unique letter");
            System.exit(0);
        }
        for (Character c : sequence) {
            if (sequence.indexOf(c) == sequence.lastIndexOf(c)) {
                System.out.println("First Unique Letter for this text is " + c);
                System.exit(0);
            }
        }
        System.out.println("This text hasn't got a first unique letter");
    }

    public List<String> scan() {
        List<String> lines = new LinkedList<>();
        System.out.println("Write the text for analysis:");
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNextLine()){
            String line = scanner.nextLine();
            if (line.isEmpty()) break;
            lines.add(line);
        }
        return lines;
    }
}
