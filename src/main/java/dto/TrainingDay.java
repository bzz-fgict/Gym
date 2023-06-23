package dto;

import java.util.Date;

public class TrainingDay {
        private int trainingId;
        private Date trainigDate;
        private String typeOfTraining;

        public int getTrainingId() {
            return trainingId;
        }

        public void setTrainingId(int trainingId) {
            this.trainingId = trainingId;
        }

        public Date getTrainigDate() {
            return trainigDate;
        }

        public void setTrainigDate(Date trainigDate) {
            this.trainigDate = trainigDate;
        }

        public String getTypeOfTraining() {
            return typeOfTraining;
        }

        public void setTypeOfTraining(String typeOfTraining) {
            this.typeOfTraining = typeOfTraining;
        }

        public TrainingDay(int trainingId, Date trainigDate, String typeOfTraining) {
            this.trainingId = trainingId;
            this.trainigDate = trainigDate;
            this.typeOfTraining = typeOfTraining;
        }

}
