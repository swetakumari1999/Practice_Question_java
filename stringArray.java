import java.util.Arrays;

public class stringArray
{
public static void main(String args[])
{
    String[] words = new String[4];
    words[0] = "Hello";
    words[1] = "to";
    words[2] = "you";

    System.out.println(words[0]);
    System.out.println(words[1]);
    System.out.println(words[2]);

    String[] fruits = {"apple","banana","coco","Orange"};

    for(String fruit: fruits)
    {
        System.out.println(fruit);
    }

    int value =0;
    String text = null;
    System.out.println(text);
    String[] texts = new String[3];
    System.out.println(texts[0]);
    texts[0] = "one";
}
}
