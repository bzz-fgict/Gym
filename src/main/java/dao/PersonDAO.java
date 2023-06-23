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
        try {
            String query = "UPDATE Person SET person = :person, age = :age, firstname = :firstname, lastname = :lastname, weight = :weight, height = :height WHERE idperson = :idperson";
            MapSqlParameterSource params = new MapSqlParameterSource();
            params.addValue("idperson", person.getIdPerson());
            params.addValue("age", person.getAge());
            params.addValue("firstname", person.getFirstname());
            params.addValue("lastname", person.getLastname());
            params.addValue("weight", person.getWeight());
            params.addValue("height", person.getHeight());
            namedParameterJdbcTemplate.update(query, params);
            System.out.println("Person with ID " + person.getIdPerson() + " updated successfully.");
        } catch (Exception e) {
            System.err.println("Error updating Person with ID " + person.getIdPerson() + ": " + e.getMessage());
        }
    }

    public void delete(int idperson) {
        // Implementation to delete a Person by personId from the database
        try {
            String query = "DELETE FROM Person WHERE idperson = :idperson";
            MapSqlParameterSource params = new MapSqlParameterSource();
            params.addValue("idperson", idperson);
            namedParameterJdbcTemplate.update(query, params);

            System.out.println("Food item with ID " + idperson + " deleted successfully.");
        } catch (Exception e) {
            System.err.println("Error deleting food item with ID " + idperson + ": " + e.getMessage());
        }
    }
}