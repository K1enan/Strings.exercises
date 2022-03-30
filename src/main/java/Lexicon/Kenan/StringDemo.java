package Lexicon.Kenan;

import java.sql.SQLOutput;
import java.util.Locale;

public class StringDemo {

//1

    public static void main (String[] args) {
        String name = "Java";
        System.out.println(name);
        System.out.println(name.length());
//2

        String sentence = "Long example sentence";
        System.out.println(sentence.charAt(6));
//3
        String sentence1 = "Even longer example sentence";
        int index1 = sentence1.indexOf('o');
        System.out.println(sentence1.indexOf('o'));
//4
        String ok = "Ok this is not as long!";
        System.out.println(ok.substring(10,22));

//5
        String caps = "CAPS EQUALS SCREAMING";
        System.out.println(caps.toLowerCase());
        System.out.println(caps.toUpperCase());
//6
        String java = "Java is the worst programming language!";
        System.out.println(java.replace("worst", "best"));
//7
        String ex = "\tJ\ta\tv\ta\t";
        System.out.println(ex.trim());
//8



    }














}





