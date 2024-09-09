package BaiTap2;

public class PhoneNumberValidator {
    public static boolean validatePhoneNumber(String phoneNumber) {
        // Sử dụng biểu thức chính quy để kiểm tra
        // (xx)-(0xxxxxxxxx)
        return phoneNumber.matches("\\(\\d{2}\\)-0\\d{9}");
    }

    public static void main(String[] args) {
        String validNumber1 = "(84)-(0978489648)";
        String validNumber2 = "(86)-(0123456789)";
        String invalidNumber1 = "(a8)-(22222222)";
        String invalidNumber2 = "(84)-(22b22222)";
        String invalidNumber3 = "(84)-(9978489648)";

        System.out.println("Is " + validNumber1 + " valid? " + validatePhoneNumber(validNumber1));
        System.out.println("Is " + validNumber2 + " valid? " + validatePhoneNumber(validNumber2));
        System.out.println("Is " + invalidNumber1 + " valid? " + validatePhoneNumber(invalidNumber1));
        System.out.println("Is " + invalidNumber2 + " valid? " + validatePhoneNumber(invalidNumber2));
        System.out.println("Is " + invalidNumber3 + " valid? " + validatePhoneNumber(invalidNumber3));
    }
}
