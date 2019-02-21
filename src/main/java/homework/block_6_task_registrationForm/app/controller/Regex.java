package homework.block_6_task_registrationForm.app.controller;

public interface Regex {

    String US_NAME_REGEX = "^[A-Z]{1}[a-z']{0,30}(-[A-Z]{1}[a-z']{0,30})?";
    String UA_NAME_REGEX = "^[А-ЩЮЯШІЇЄҐ]{1}[а-щяьюяіїєґ']{0,30}(-[А-ЩЮЯШЇЄҐ]{1}[а-щяьюяіїєґ']{0,30})?";
    String US_NICK_NAME_REGEX = "^[A-Za-z]{1,10}.{0,10}";
    String UA_NICK_NAME_REGEX = "^[А-Ща-яьюЮяЯіІїЇЄєҐґ']{1,10}.{0,10}";
    String COMMENTARY_REGEX = ".+";
    String HOME_PHONE_NUMBER_REGEX = "^\\+\\d{3}-\\d{3}-\\d{2}-\\d{2}";
    String MOBILE_PHONE_NUMBER_REGEX = "^\\+\\d{3}\\(\\d{2}\\)-\\d{3}-\\d{2}-\\d{2}";
    String EMAIL_REGEX = "(^[a-zA-Z0-9.!#$%&'*+=?^_`{|}~-]+@)([a-zA-Z0-9]+\\.[a-zA-Z0-9]+)";
    String SKYPE_REGEX = "^[A-Za-z]{1,10}.{0,10}";

}
