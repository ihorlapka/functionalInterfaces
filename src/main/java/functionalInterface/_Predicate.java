package functionalInterface;

import java.util.function.Predicate;

public class _Predicate {
    
    public static void main(String[] args) {
    
        String x = "07000000000";
        System.out.println(isPhoneNumberValid(x));
        String y = "09000000000";
        System.out.println(isPhoneNumberValid(y));
        String z = "070000030000";
        System.out.println(isPhoneNumberValid(z));
    
        System.out.println(isPhoneNumberValidPredicate.test(x));
        System.out.println(isPhoneNumberValidPredicate.test(y));
        System.out.println(isPhoneNumberValidPredicate.test(z));
    
        System.out.println();
    
        System.out.println(isPhoneNumberValidPredicate.and(containsNumber3).test(x));
        System.out.println(isPhoneNumberValidPredicate.or(containsNumber3).test(x));
    }
    
    static boolean isPhoneNumberValid(String phoneNum) {
        return phoneNum.startsWith("07") && phoneNum.length() == 11;
    }
    
    static Predicate<String> isPhoneNumberValidPredicate = phoneNum ->
        phoneNum.startsWith("07") && phoneNum.length() == 11;
    
    static Predicate<String> containsNumber3 = phoneNum ->
        phoneNum.contains("3");
    
}
