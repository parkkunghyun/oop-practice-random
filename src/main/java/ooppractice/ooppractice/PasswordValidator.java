package ooppractice.ooppractice;

public class PasswordValidator {
    public static final String PASSWORD_LENGTH_EXCEPTION_MESSAGE = "비밀번호는 최소 8자이상 12자 이하여야함";

    public static void validate(String password) {
        int length = password.length();
        if( 8 > length || length > 12 ) {
            throw new IllegalArgumentException(PASSWORD_LENGTH_EXCEPTION_MESSAGE);
        }

    }
}
