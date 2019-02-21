package homework.block_6_task_registrationForm.app.view;

import java.util.Locale;
import java.util.ResourceBundle;

public class View {

    static String MESSAGES_BUNDLE_NAME = "messages";
    public static final ResourceBundle bundle =
            ResourceBundle.getBundle(
                    MESSAGES_BUNDLE_NAME,
                    new Locale("ua"));
//                    new Locale("en"));

    public void print(String message) {
        System.out.println(bundle.getString(message));
    }
}
