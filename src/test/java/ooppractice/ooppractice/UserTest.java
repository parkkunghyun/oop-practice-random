package ooppractice.ooppractice;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.ClassBasedNavigableIterableAssert.assertThat;

public class UserTest {

    @DisplayName("패스워드 초기화")
    @Test
    void passwordTest() {
        //given
        User user = new User();
        // when
        user.initPassword();
        // then
        //assertThat(user.getPassword()).isNotNull();
    }

}
