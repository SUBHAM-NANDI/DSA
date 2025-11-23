public class ReverseString{
    public static void main(String[] args) {
        String newString = "Subham";
        String reverseString = "";
        for (int i = newString.length() - 1; i >= 0; i--){
            reverseString += newString.charAt(i);
        }
        System.out.println("Reverse String:" + reverseString);
    }
}