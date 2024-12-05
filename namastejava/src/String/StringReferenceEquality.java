package String;

public class StringReferenceEquality {
    public static void main(String[] args) {
        String str1 = "Hello";
        String str2 = "Hello";
        String str3 = new String("Hello");
        
        System.out.println(str1 == str2); // true (both point to the same object in the string pool)
        System.out.println(str1 == str3); // false (str3 is a new object in heap memory)
    }
}
