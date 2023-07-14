package dao;

import dto.Foods;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;


public class FoodsDAO {

    private final NamedParameterJdbcTemplate namedParameterJdbcTemplate;

    public FoodsDAO(NamedParameterJdbcTemplate namedParameterJdbcTemplate) {
        this.namedParameterJdbcTemplate = namedParameterJdbcTemplate;
    }

    public Foods getById(int idfood) {
        // Implementation to retrieve Foods by FoodsId from the database
        String query = "SELECT * FROM Foods WHERE idfood = :idfood";
        MapSqlParameterSource params = new MapSqlParameterSource();
        params.addValue("idfood", idfood);

        return namedParameterJdbcTemplate.queryForObject(query, params, (resultSet, rowNum) -> {
            Foods Foods = new Foods();
            Foods.setIdfood(resultSet.getInt("idfood"));
            Foods.setFood(resultSet.getString("food"));
            Foods.setKcal(resultSet.getInt("kcal"));
            Foods.setCarbs(resultSet.getInt("carbs"));
            Foods.setProtein(resultSet.getInt("protein"));
            Foods.setFett(resultSet.getInt("fett"));
            return Foods;
        });
    }

    public void save(Foods Foods) {
        // Implementation to save a Foods object to the database
    }

    public void update(Foods foods) {
        // Implementation to update a Foods object in the database
        try {
            String query = "UPDATE Foods SET food = :food, kcal = :kcal, carbs = :carbs, protein = :protein, fett = :fett WHERE idfood = :idfood";
            MapSqlParameterSource params = new MapSqlParameterSource();
            params.addValue("idfood", foods.getIdfood());
            params.addValue("food", foods.getFood());
            params.addValue("kcal", foods.getKcal());
            params.addValue("carbs", foods.getCarbs());
            params.addValue("protein", foods.getProtein());
            params.addValue("fett", foods.getFett());
            namedParameterJdbcTemplate.update(query, params);
            System.out.println("Food item with ID " + foods.getIdfood() + " updated successfully.");
        } catch (Exception e) {
            System.err.println("Error updating food item with ID " + foods.getIdfood() + ": " + e.getMessage());
        }

    }

    public void delete(int FoodsId) {
        try {
            // Implementation to update a Foods object in the database
            String query = "DELETE FROM Foods WHERE idfood = :idfood";
            MapSqlParameterSource params = new MapSqlParameterSource();
            params.addValue("idfood", FoodsId);
            namedParameterJdbcTemplate.update(query, params);

            System.out.println("Food item with ID " + FoodsId + " deleted successfully.");
        } catch (Exception e) {
            System.err.println("Error deleting food item with ID " + FoodsId + ": " + e.getMessage());
        }
    }
    public void insert(Foods foods) {
        // Implementation to insert a Foods object into the database
        try {
            String query = "INSERT INTO Foods (idfood, food, kcal, carbs, protein, fett) VALUES (:idfood, :food, :kcal, :carbs, :protein, :fett)";
            MapSqlParameterSource params = new MapSqlParameterSource();
            params.addValue("idfood", foods.getIdfood());
            params.addValue("food", foods.getFood());
            params.addValue("kcal", foods.getKcal());
            params.addValue("carbs", foods.getCarbs());
            params.addValue("protein", foods.getProtein());
            params.addValue("fett", foods.getFett());
            namedParameterJdbcTemplate.update(query, params);
            System.out.println("Food item with ID " + foods.getIdfood() + " inserted successfully.");
        } catch (Exception e) {
            System.err.println("Error inserting food item with ID " + foods.getIdfood() + ": " + e.getMessage());
        }
    }

}
