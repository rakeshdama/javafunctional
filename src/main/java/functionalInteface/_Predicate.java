package functionalInteface;

import java.util.function.Predicate;

public class _Predicate {

    static Predicate<String> isPhoneNumberValidP = (phoneNumber) -> phoneNumber.startsWith("07") && phoneNumber.length() == 11;

    public static void main(String[] args) {

        System.out.println(isPhoneNumberValidP.test("07000000000"));
        System.out.println(isPhoneNumberValidP.test("09000000000"));

    }

    static boolean isPhoneNumberValid(String phoneNumber) {
        return phoneNumber.startsWith("07") && phoneNumber.length() == 11;
    }
}
