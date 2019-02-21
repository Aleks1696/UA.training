package homework.block_6_task_registrationForm.app.model.entity;

import homework.block_6_task_registrationForm.app.exceptions.InputDataIsNotUniqueException;

public enum EnumDBNote {
    USER_1("robbie7", "rob@gmil.com"),
    USER_2("MAT", "Roling_Mat@unp.com"),
    USER_3("іван", "procopenKO@ukr.net");

    private String nickName;
    private String email;

    EnumDBNote(String nickName, String email) {
        this.nickName = nickName;
        this.email = email;
    }

    public static void checkNoteIfExist(Note note) throws InputDataIsNotUniqueException {
        String nickName = note.getNickName();
        String email = note.getEmail();
        for (EnumDBNote user : EnumDBNote.values()) {
            if (nickName.equals(user.nickName)) {
                throw new InputDataIsNotUniqueException(
                        "User with nick name: %s is already registered", nickName);
            } else if (email.equals(user.email)) {
                throw new InputDataIsNotUniqueException(
                        "User with email: %s is already registered", email);
            }
        }
    }
}
