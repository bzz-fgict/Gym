package dto;

public class SolvedTraining {
    private int trainingset_trainingSetId;
    private int trainingday_trainingId;

    public SolvedTraining(int trainingset_trainingSetId, int trainingday_trainingId) {
        this.trainingset_trainingSetId = trainingset_trainingSetId;
        this.trainingday_trainingId = trainingday_trainingId;
    }

    public int getTrainingset_trainingSetId() {
        return trainingset_trainingSetId;
    }

    public void setTrainingset_trainingSetId(int trainingset_trainingSetId) {
        this.trainingset_trainingSetId = trainingset_trainingSetId;
    }

    public int getTrainingday_trainingId() {
        return trainingday_trainingId;
    }

    public void setTrainingday_trainingId(int trainingday_trainingId) {
        this.trainingday_trainingId = trainingday_trainingId;
    }
}
