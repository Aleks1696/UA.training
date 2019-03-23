package homework.task_registrationFormDAO.app.controller;

public interface Regex {
    String US_NICK_NAME_REGEX = "^[A-Za-z]{1,10}.{0,10}";
    String UA_NICK_NAME_REGEX = "^[А-Ща-яьюЮяЯіІїЇЄєҐґ']{1,10}.{0,10}";
    String EMAIL_REGEX = "(^[a-zA-Z0-9.!#$%&'*+=?^_`{|}~-]+@)([a-zA-Z0-9]+\\.[a-zA-Z0-9]+)";
}
