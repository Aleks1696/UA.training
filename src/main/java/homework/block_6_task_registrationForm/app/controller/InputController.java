package homework.block_6_task_registrationForm.app.controller;

import homework.block_6_task_registrationForm.app.view.View;

import static homework.block_6_task_registrationForm.app.controller.Regex.*;
import static homework.block_6_task_registrationForm.app.view.Messages.*;

public class InputController {
    private String nickName;
    private String email;

    public void getInput(UtilityController uController) {
        String nickNameRegex;
        if (View.bundle.getLocale().toString().equals("en")) {
            nickNameRegex = US_NICK_NAME_REGEX;
        } else {
            nickNameRegex = UA_NICK_NAME_REGEX;
        }
        nickName = uController.inputValueWithScanner(NICK_NAME_MESSAGE, nickNameRegex);
        email = uController.inputValueWithScanner(EMAIL_MESSAGE, EMAIL_REGEX);
    }

    public String getNickName() {
        return nickName;
    }

    public String getEmail() {
        return email;
    }
}
