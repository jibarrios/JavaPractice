package Reverse;

public class Reverse_02 {
    public static void main(String[] args) {

    String word ="string";
        String reverse ="";

        for (int i = word.length()-1; i>= 0;  i--) {
            reverse+= word.charAt(i);




        }
        System.out.println(reverse);
        }
}
