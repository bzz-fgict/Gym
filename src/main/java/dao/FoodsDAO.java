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

    public void save(Foods foods) {
        String sql = "INSERT INTO foods(idfood, food, kcal, carbs, protein, fett) VALUES (:idfood, :food, :kcal, :carbs, :protein, :fett)";

        MapSqlParameterSource params = new MapSqlParameterSource();
        params.addValue("idfood", foods.getIdfood());
        params.addValue("food", foods.getFood());
        params.addValue("kcal", foods.getKcal());
        params.addValue("carbs", foods.getCarbs());
        params.addValue("protein", foods.getProtein());
        params.addValue("fett", foods.getFett());

        namedParameterJdbcTemplate.update(sql, params);
    }

    public void update(Foods Foods) {
        // Implementation to update a Foods object in the database
    }

    public void delete(int FoodsId) {
        // Implementation to delete a Foods by FoodsId from the database
    }
}
