package org.springframework.jdbc.core;

import static java.lang.Boolean.TRUE;
import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;
import static org.junit.jupiter.api.Assertions.assertAll;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class SqlTypeTest {

    @Test
    @DisplayName("문자열을 전달받으면 STRING 객체가 반환된다.")
    void get_STRING() {
        SqlType actual = SqlType.get("콩하나");

        assertThat(actual).isEqualTo(SqlType.STRING);
    }

    @Test
    @DisplayName("숫자를 전달받으면 INT 객체가 반환된다.")
    void get_INT() {
        SqlType actual1 = SqlType.get(10);
        SqlType actual2 = SqlType.get(-10);
        SqlType actual3 = SqlType.get(0);

        assertAll(
                () -> assertThat(actual1).isEqualTo(SqlType.INT),
                () -> assertThat(actual2).isEqualTo(SqlType.INT),
                () -> assertThat(actual3).isEqualTo(SqlType.INT)
        );

    }

    @Test
    @DisplayName("Long 숫자를 전달받으면 LONG 객체가 반환된다.")
    void get_LONG() {
        SqlType actual1 = SqlType.get(10L);
        SqlType actual2 = SqlType.get(-10L);
        SqlType actual3 = SqlType.get(0L);
        SqlType actual4 = SqlType.get(0l);

        assertAll(
                () -> assertThat(actual1).isEqualTo(SqlType.LONG),
                () -> assertThat(actual2).isEqualTo(SqlType.LONG),
                () -> assertThat(actual3).isEqualTo(SqlType.LONG),
                () -> assertThat(actual4).isEqualTo(SqlType.LONG)
        );
    }

    @Test
    @DisplayName("boolean 값을 전달받으면 BOOLEAN 객체가 반환된다.")
    void get_BOOLEAN() {
        SqlType actual1 = SqlType.get(false);
        SqlType actual2 = SqlType.get(true);
        SqlType actual3 = SqlType.get(TRUE);

        assertAll(
                () -> assertThat(actual1).isEqualTo(SqlType.BOOLEAN),
                () -> assertThat(actual2).isEqualTo(SqlType.BOOLEAN),
                () -> assertThat(actual3).isEqualTo(SqlType.BOOLEAN)
        );
    }


    @Test
    @DisplayName("현재 지정하지 않은 값을 전달받으면 예외가 반환된다.")
    void get_null() {
        assertThatThrownBy(() -> SqlType.get(SqlType.STRING))
                .isInstanceOf(SqlTypeException.class);
    }
}
