package ge.tbc.testautomation.exceptionsStringOpsAndRegex_L7;

public class StringOps {
    public static void main(String[] args) {
        String str = new String("10");
        String str2 = "10";
        String str3 = "10";

        String something = " This sentence starts with a T ";
        if (something.strip().startsWith("T")) // remove leading whitespace
            System.out.println("YES IT DOES");
        else
            System.out.println("NO IT DOES NOT");

        if (something.endsWith("J"))
            System.out.println("YES IT DOES");
        else
            System.out.println("NO IT DOES NOT");

        int indexOfStarts = something.strip().indexOf("starts");
        System.out.println(indexOfStarts);

        String someSentence = "Spiderman can't complete a backflip, oh my god! this can't be happening...";

        someSentence = someSentence.substring(someSentence.indexOf("'"), someSentence.lastIndexOf("'"));
        System.out.println(someSentence);

        String absolutePath = "C:\\Users\\Monolith\\IdeaProjects\\Java_L4_2025\\src\\main\\java\\ge\\tbc\\testautomation\\exceptionsStringOpsAndRegex_L7\\StringOps.java";

        absolutePath = absolutePath.replaceAll("\\\\", ".");
        System.out.println(absolutePath);
        String root = "src.main.java.";
        int indexOfRoot = absolutePath.indexOf(root);
        System.out.println(indexOfRoot);
        absolutePath = absolutePath.substring(indexOfRoot + root.length());
        System.out.println(absolutePath);

        String str10 = "10";
        String str11 = "11";
        String formatted = String.format("something has become %s %s", str11, str10);
    }
}
