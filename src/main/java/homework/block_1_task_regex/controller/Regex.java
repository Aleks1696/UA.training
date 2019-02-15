package homework.block_1_task_regex.controller;

public interface Regex {

    String NAME_NAME_REGEX = "((^[A-Z]{1})[a-z]{0,30}-?)(([A-Z]{1})[a-z]{0,30})?";
    String NICK_NAME_REGEX = "(^[A-Za-z]{1,10}).{0,10}";
    String COMMENTARY_REGEX = ".+";
    String HOME_PHONE_NUMBER_REGEX = "^\\+\\d{3}-\\d{3}-\\d{2}-\\d{2}";
    String MOBILE_PHONE_NUMBER_REGEX = "^\\+\\d{3}\\(\\d{2}\\)-\\d{3}-\\d{2}-\\d{2}";
    String EMAIL_NAME_REGEX = "(^[a-zA-Z0-9.!#$%&'*+=?^_`{|}~-]+@)([a-zA-Z0-9]+\\.[a-zA-Z0-9]+)";
    String SKYPE_NAME_REGEX = "\\w{1,10}.{0,10}";

}
