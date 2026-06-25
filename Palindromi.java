
//PALINDROMI
class Palindrome{
    public boolean isPalindrome(String str){
        int c = str.length()-1;
        for(Character ch: str.toCharArray()){
            if(!ch.equals(str.charAt(c))){return false;}
            c--;
        }
        return true;
    }
    public String getPalindromeNumbers(Integer n){
        String res="";
        for(int i=0;i<=n;i++){
            if(isPalindrome(String.valueOf(i))){
                res = res + i + " ";
            }
        }
        return res.trim();
    }
}


public class Main {

    public static void main(String[] args) {

        String expected = "0 1 2 3 4 5 6 7 8 9 11 22 33 44 55 66 77 88 99";

        Palindrome palindrome = new Palindrome();

        String actual = palindrome.getPalindromeNumbers(100);
        if (expected.equals(actual))
            System.out.println(actual);
        else
            System.out.print("Error");
    }
}