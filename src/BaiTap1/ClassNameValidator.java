package BaiTap1;

public class ClassNameValidator {
    public static boolean validateClassName(String className) {
        // Bắt đầu bằng một ký tự chữ hoa C, A hoặc P
        if (!className.matches("^[CAP][0-9]{4}[GHIK]$")) {
            return false;
        }
        return true;
    }

    public static void main(String[] args) {
        String validClassName1 = "C0223G";
        String validClassName2 = "A0323K";
        String invalidClassName1 = "M0318G";
        String invalidClassName2 = "P0323A";

        System.out.println("Is " + validClassName1 + " valid? " + validateClassName(validClassName1));
        System.out.println("Is " + validClassName2 + " valid? " + validateClassName(validClassName2));
        System.out.println("Is " + invalidClassName1 + " valid? " + validateClassName(invalidClassName1));
        System.out.println("Is " + invalidClassName2 + " valid? " + validateClassName(invalidClassName2));
    }
}
