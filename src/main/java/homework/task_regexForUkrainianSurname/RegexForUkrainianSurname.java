package homework.task_regexForUkrainianSurname;

public class RegexForUkrainianSurname {

    private String surname;

    public RegexForUkrainianSurname(String surname){
        this.surname = surname;
    }

    public void processSurname() {
        boolean surnameMatch = checkSurname();
        System.out.printf("Surname '%s' is Ukrainian surname -> %b", surname, surnameMatch);
    }

    private boolean checkSurname() {
        if (surname.matches("[А-Ща-яьюЮяЯіІїЇЄєҐґ']+")){
            return true;
        } else {
            return false;
        }
    }

}
