package ooppractice.ooppractice;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.assertj.core.api.AssertionsForClassTypes.assertThatCode;

/**
 * 비밀번호는 최소 8 - 12자 이하
 * 	비밀번호가 초과후 IllegalArgumentException 예외 발생
 * 	경계조건에 대해 테스트 코드를 작성! -> 7자랑 13자일때 꼭 검사!!
 *
 */
public class PasswordValidatorTest {

    @Test
    @DisplayName("비밀번호가 최소 8 - 12 자 이하면 예외 발생 X")
    void validatePasswordTest() {
        assertThatCode(() -> PasswordValidator.validate("skkkeizard"))
                .doesNotThrowAnyException();
        //
    }

    @DisplayName("2222 => 비밀번호가 최소 8 - 12 자 이하면 예외 발생 X")
    @Test
    @ParameterizedTest // 파라미터로 주는 듯?
    @ValueSource(strings = {"aabbccc", "aabbccddeeffs"})
    void validatePasswordTest2(String password) {
        assertThatCode(() -> PasswordValidator.validate(password))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessage("비밀번호가 8-12사이여야함!");
        //
    }



}
