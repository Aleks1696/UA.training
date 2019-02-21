package homework.block_6_task_registrationForm.app.controller;

import homework.block_6_task_registrationForm.app.view.View;

import static homework.block_6_task_registrationForm.app.controller.Regex.*;
import static homework.block_6_task_registrationForm.app.view.Messages.*;

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
        String name_surname_familyNameRegex;
        String nickNameRegex;
        if (View.bundle.getLocale().equals("en")) {
            name_surname_familyNameRegex = US_NAME_REGEX;
            nickNameRegex = US_NICK_NAME_REGEX;
        } else {
            name_surname_familyNameRegex = UA_NAME_REGEX;
            nickNameRegex = UA_NICK_NAME_REGEX;
        }
        surname = uController.inputValueWithScanner(SURNAME_NAME_MESSAGE, name_surname_familyNameRegex);
        name = uController.inputValueWithScanner(FIRST_NAME_MESSAGE, name_surname_familyNameRegex);
        familyName = uController.inputValueWithScanner(FAMILY_NAME_MESSAGE, name_surname_familyNameRegex);
        nickName = uController.inputValueWithScanner(NICK_NAME_MESSAGE, nickNameRegex);
        commentary = uController.inputValueWithScanner(COMMENTARY_MESSAGE, COMMENTARY_REGEX);
        homePhoneNumber = uController.inputValueWithScanner(HOME_PHONE_NUMBER_MESSAGE, HOME_PHONE_NUMBER_REGEX);
        mobilePhoneNumber = uController.inputValueWithScanner(MOBILE_PHONE_NUMBER_MESSAGE, MOBILE_PHONE_NUMBER_REGEX);
        email = uController.inputValueWithScanner(EMAIL_MESSAGE, EMAIL_REGEX);
        skype = uController.inputValueWithScanner(SKYPE_MESSAGE, SKYPE_REGEX);
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
