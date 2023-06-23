package dto;

public class PersonTraining {
    private int idPerson;
    private int trainingId;
    
    public PersonTraining(int idPerson, int trainingId) {
        this.idPerson = idPerson;
        this.trainingId = trainingId;
    }

    public int getidPerson() {
        return idPerson;
    }

    public void setidPerson(int idPerson) {
        this.idPerson = idPerson;
    }

    public int gettrainingId() {
        return trainingId;
    }

    public void settrainingId(int trainingId) {
        this.trainingId = trainingId;
    }
}
