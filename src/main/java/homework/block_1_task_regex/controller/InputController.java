package homework.block_1_task_regex.controller;

import homework.block_1_task_regex.view.Messages;

public class InputController {

    private String surname;
    private String name;
    private String familyName;

    private String nickName;
    private String commentary;

    private String homePhoneNumber;
    private String mobilePhoneNumber;
    private String email;
    private String skype;

    public void getInput(UtilityController uController) {
        surname = uController.inputValueWithScanner(Messages.SURNAME_NAME_MESSAGE, Regex.NAME_NAME_REGEX);
        name = uController.inputValueWithScanner(Messages.FIRST_NAME_MESSAGE, Regex.NAME_NAME_REGEX);
        familyName = uController.inputValueWithScanner(Messages.FAMILY_NAME_MESSAGE, Regex.NAME_NAME_REGEX);
        nickName = uController.inputValueWithScanner(Messages.NICK_NAME_MESSAGE, Regex.NICK_NAME_REGEX);
        commentary = uController.inputValueWithScanner(Messages.COMMENTARY_MESSAGE, Regex.COMMENTARY_REGEX);
        homePhoneNumber = uController.inputValueWithScanner(Messages.HOME_PHONE_NUMBER_MESSAGE, Regex.HOME_PHONE_NUMBER_REGEX);
        mobilePhoneNumber = uController.inputValueWithScanner(Messages.MOBILE_PHONE_NUMBER_MESSAGE, Regex.MOBILE_PHONE_NUMBER_REGEX);
        email = uController.inputValueWithScanner(Messages.EMAIL_NAME_MESSAGE, Regex.EMAIL_NAME_REGEX);
        skype = uController.inputValueWithScanner(Messages.SKYPE_NAME_MESSAGE, Regex.SKYPE_NAME_REGEX);
    }

    public String getSurname() {
        return surname;
    }

    public String getName() {
        return name;
    }

    public String getFamilyName() {
        return familyName;
    }

    public String getNickName() {
        return nickName;
    }

    public String getCommentary() {
        return commentary;
    }

    public String getHomePhoneNumber() {
        return homePhoneNumber;
    }

    public String getMobilePhoneNumber() {
        return mobilePhoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public String getSkype() {
        return skype;
    }
}
