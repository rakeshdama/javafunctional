package functionalInteface;

import java.util.function.Predicate;

public class _Predicate {

    static Predicate<String> isPhoneNumberValidP = (phoneNumber) -> phoneNumber.startsWith("07") && phoneNumber.length() == 11;

    static Predicate<String> containsNumber9 = phoneNumber -> phoneNumber.contains("9");

    public static void main(String[] args) {

        System.out.println(isPhoneNumberValid("07000000000"));
        System.out.println(isPhoneNumberValid("00900000000"));

        System.out.println(isPhoneNumberValidP.test("07000000000"));
        System.out.println(isPhoneNumberValidP.test("09000000000"));

        System.out.println(containsNumber9.test("07000000000"));
        System.out.println(containsNumber9.test("09000000000"));

        System.out.println(
                isPhoneNumberValidP.or(containsNumber9).test("09000000000")
        );

    }

    static boolean isPhoneNumberValid(String phoneNumber) {
        return phoneNumber.startsWith("07") && phoneNumber.length() == 11;
    }
}
