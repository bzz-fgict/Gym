/*package dao;

import dto

public class TrainingSetDAO {

    public TrainingSet getById(int trainingSetId) {
        // Implementation to retrieve TrainingSet by trainingSetId from the database


    }

    public void save(TrainingSet trainingSet) {
        String sql = "INSERT INTO trainingset (trainingSetId, exercise, muscleGroup, setAmount, repAmount, details) VALUES (:trainingSetId, :exercise, :muscleGroup, :setAmount, :repAmount, :details)";
        KeyHolder keyHolder = new GeneratedKeyHolder();

        SqlParameterSource namedParameters = new MapSqlParameterSource()
                .addValue("trainingSetId", training.
                .addValue("firstname", player.getFirstname())
                .addValue("secondname", player.getSecondname())
                .addValue("age", player.getAge().toString())
                .addValue("teamId", player.getTeamId());
        int rowsAffected = namedParameterJdbcTemplate.update(sql, namedParameters, keyHolder);
        if(rowsAffected == 1){
            System.out.println("Player inserted");
        }
        else{
            System.out.println("Player not inserted");
        }
    }
    }

    public void update(TrainingSet trainingSet) {
        // Implementation to update a TrainingSet object in the database
    }

    public void delete(int trainingSetId) {
        // Implementation to delete a TrainingSet by trainingSetId from the database
    }
}*/
