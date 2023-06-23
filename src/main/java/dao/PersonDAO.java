package dao;

import dto.Person;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;

public class PersonDAO {

    private final NamedParameterJdbcTemplate namedParameterJdbcTemplate;

    public PersonDAO(NamedParameterJdbcTemplate namedParameterJdbcTemplate) {
        this.namedParameterJdbcTemplate = namedParameterJdbcTemplate;
    }

    public Person getById(int idperson) {
        String query = "SELECT * FROM Person WHERE idPerson = :idperson";
        MapSqlParameterSource params = new MapSqlParameterSource();
        params.addValue("idperson", idperson);

        return namedParameterJdbcTemplate.queryForObject(query, params, (resultSet, rowNum) -> {
            Person Person = new Person();
            Person.setIdPerson(resultSet.getInt("idperson"));
            Person.setFirstname(resultSet.getString("firstname"));
            Person.setLastname(resultSet.getString("lastname"));
            Person.setHeight(resultSet.getInt("height"));
            Person.setWeight(resultSet.getBigDecimal("weight"));
            Person.setAge(resultSet.getInt("age"));
            return Person;
        });
    }

    public void save(Person person) {
        // Implementation to save a Person object to the database
    }

    public void update(Person person) {
        // Implementation to update a Person object in the database
    }

    public void delete(int personId) {
        // Implementation to delete a Person by personId from the database
    }
}