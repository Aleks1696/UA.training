package homework.task_registrationFormDAO.app.controller;

import homework.task_registrationFormDAO.app.view.View;

import java.util.ResourceBundle;

import static homework.block_6_task_registrationForm.app.controller.Regex.*;
import static homework.block_6_task_registrationForm.app.view.Messages.EMAIL_MESSAGE;
import static homework.block_6_task_registrationForm.app.view.Messages.NICK_NAME_MESSAGE;

public class InputController {
    private String nickName;
    private String email;

    public void getInput(UtilityController uController) {
        String nickNameRegex;
        if (String.valueOf(View.bundle.getLocale()).equals("ua")) {
            nickNameRegex = UA_NICK_NAME_REGEX;
        } else {
            nickNameRegex = US_NICK_NAME_REGEX;
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
