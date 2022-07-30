import java.util.Scanner;

public class PalindromicWords {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("Bir Kelime Giriniz: ");
        String word = scan.nextLine();


        boolean isWrong = true;
        while (isWrong = true) {
            if ((word.contains(" "))) {
                System.out.println("Yalnızca Bir Kelime Giriniz Ve Boşluk Kullanmayınız!!! ");
                System.out.print("Bir Kelime Giriniz: ");
                word = scan.nextLine();
            } else {
                break;
            }
        }
        char[] reverseWord = new char[word.length()];

        for (int i = 0, j = reverseWord.length; i < reverseWord.length; i++, j--) {
            char a = word.charAt(j - 1);
            reverseWord[i] = a;
        }

        boolean isPalindrom = false;

        for (int i = 0; i < reverseWord.length; i++) {
            if (reverseWord[i] == word.charAt(i)) {
                isPalindrom = true;
            } else {
                isPalindrom = false;
                break;
            }
        }
        if (isPalindrom) {
            System.out.println(word.toString() + " Kelimesi Bir Palindrom Kelimedir!");
        } else {
            System.out.println(word.toString() + " Kelimesi Bir Palindrom Kelime Değildir!");
        }

    }
}
