package dto;

public class TrainingSet {
        private int trainingSetId;
        private String exercise;
        private String muscleGroup;
        private int setAmount;
        private int repAmount;
        private String details;

    public TrainingSet(int trainingSetId, String exercise, String muscleGroup, int setAmount, int repAmount, String details) {
        this.trainingSetId = trainingSetId;
        this.exercise = exercise;
        this.muscleGroup = muscleGroup;
        this.setAmount = setAmount;
        this.repAmount = repAmount;
        this.details = details;
    }

    public TrainingSet(){

    }
// Getters and setters


    public int getTrainingSetId() {
        return trainingSetId;
    }

    public void setTrainingSetId(int trainingSetId) {
        this.trainingSetId = trainingSetId;
    }

    public String getExercise() {
        return exercise;
    }

    public void setExercise(String exercise) {
        this.exercise = exercise;
    }

    public String getMuscleGroup() {
        return muscleGroup;
    }

    public void setMuscleGroup(String muscleGroup) {
        this.muscleGroup = muscleGroup;
    }

    public int getSetAmount() {
        return setAmount;
    }

    public void setSetAmount(int setAmount) {
        this.setAmount = setAmount;
    }

    public int getRepAmount() {
        return repAmount;
    }

    public void setRepAmount(int repAmount) {
        this.repAmount = repAmount;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }
}
