package homework.block_6_task_registrationForm.app.model.entity;

import homework.block_6_task_registrationForm.app.exceptions.WrongInputDataException;

public enum  EnumDBNote {
    USER_1("Tenslie", "Robert", "Markovich", "robbie7",
            "Just for fun", "+456-455-45-45", "+077(09)-456-67-67",
            "rob@gmil.com", "kaon"),
    USER_2("Roling", "Mat", "Davidson", "MAT",
            "For business purposes", "+778-324-34-46",
            "+345(23)-445-87-12","Roling_Mat@unp.com", "mat_778"),
    USER_3("Прокопенко", "Іван", "Миколайович", "іван",
            "Створено для ...", "+044-525-12-90",
            "+380(93)-999-34-34","procopenKO@ukr.net", "Ivan_89");

    private String surname;
    private String name;
    private String familyName;
    private String nickName;
    private String commentary;
    private String homePhoneNumber;
    private String mobilePhoneNumber;
    private String email;
    private String skype;

    EnumDBNote(String surname, String name, String familyName, String nickName,
               String commentary, String homePhoneNumber, String mobilePhoneNumber,
               String email, String skype) {
        this.surname = surname;
        this.name = name;
        this.familyName = familyName;
        this.nickName = nickName;
        this.commentary = commentary;
        this.homePhoneNumber = homePhoneNumber;
        this.mobilePhoneNumber = mobilePhoneNumber;
        this.email = email;
        this.skype = skype;
    }

    public static void checkNoteIfExist(Note note) throws WrongInputDataException {
        String nickName = note.getNickName();
        String email = note.getEmail();
        for (EnumDBNote user : EnumDBNote.values()) {
            if (nickName.equals(user.nickName)) {
                throw new WrongInputDataException(
                        "User with nick name: %s is already registered", nickName);
            } else if (email.equals(user.email)) {
                throw new WrongInputDataException(
                        "User with email: %s is already registered", email);
            }
        }
    }

}
