package homework.task_1;

/**
 * Created by Borodavka Oleksandr 07.02.2019
 */

public class Model {

    private String inputData;

    public String getInputData() {
        return this.inputData;
    }

    public void setFirstWord(String inputData) {
        this.inputData = inputData;
    }

    public void setSecondWord(String inputData) {
        this.inputData += " " + inputData;
    }

}
