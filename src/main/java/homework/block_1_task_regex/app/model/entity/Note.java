package homework.block_1_task_regex.app.model.entity;

public class Note {

    private String surname;
    private String name;
    private String familyName;

    private String nickName;
    private String commentary;

    private String homePhoneNumber;
    private String mobilePhoneNumber;
    private String email;
    private String skype;

    public Note(String surname, String name, String familyName, String nickName,
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

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Note{");
        sb.append("surname='").append(surname).append('\'');
        sb.append(", name='").append(name).append('\'');
        sb.append(", familyName='").append(familyName).append('\'');
        sb.append(", nickName='").append(nickName).append('\'');
        sb.append(", commentary='").append(commentary).append('\'');
        sb.append(", homePhoneNumber='").append(homePhoneNumber).append('\'');
        sb.append(", mobilePhoneNumber='").append(mobilePhoneNumber).append('\'');
        sb.append(", email='").append(email).append('\'');
        sb.append(", skype='").append(skype).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
