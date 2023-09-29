package org.springframework.jdbc.core;

public abstract class JdbcTemplateException extends RuntimeException {

    protected JdbcTemplateException(final String message) {
        super(message);
    }

    static class NoSqlTypeException extends JdbcTemplateException {

        private static final String CANNOT_TRANSFER_TO_SQL_TYPE_MESSAGE = "sql로 변환할 수 없는 타입입니다. - ";

        NoSqlTypeException(final String cause) {
            super(CANNOT_TRANSFER_TO_SQL_TYPE_MESSAGE + cause);
        }
    }

    static class EntityReflectionException extends JdbcTemplateException {

        private static final String CANNOT_REFLECTION_MESSAGE = "엔티티로 변환이 불가능합니다. - ";

        EntityReflectionException(final String cause) {
            super(CANNOT_REFLECTION_MESSAGE + cause);
        }
    }

    static class SqlException extends JdbcTemplateException {

        public SqlException(final String message) {
            super(message);
        }
    }
}
