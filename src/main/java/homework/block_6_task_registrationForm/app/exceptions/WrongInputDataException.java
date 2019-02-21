package homework.block_6_task_registrationForm.app.exceptions;

public class WrongInputDataException extends Exception{

    private String enteredData;

    public WrongInputDataException(String message, String enteredData) {
        super(message);
        this.enteredData = enteredData;
    }

    public String getEnteredData() {
        return enteredData;
    }
}
