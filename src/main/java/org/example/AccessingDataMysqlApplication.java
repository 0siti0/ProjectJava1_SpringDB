package org.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.jdbc.CannotGetJdbcConnectionException;
import org.springframework.jdbc.core.JdbcTemplate;

import javax.sql.DataSource;

@SpringBootApplication
public class AccessingDataMysqlApplication implements CommandLineRunner {


    @Autowired
    JdbcTemplate jdbcTemplate;

    public static void main(String[] args) {

        SpringApplication.run(AccessingDataMysqlApplication.class, args);

    }
    @Override
    public void run(String... args) {
        try {
            System.out.print("Connected to DB\n");
            jdbcTemplate.execute("DROP TABLE  IF EXISTS MyObect");
            jdbcTemplate.execute("CREATE TABLE MyObect(" +
                    "id SERIAL , name VARCHAR(255),age INTEGER,status BOOLEAN)");

            jdbcTemplate.update("INSERT INTO MyObect(name,age,status) VALUES (?,?,?)",
                    "cat",
                    58,
                    false);


            MyObect obect = jdbcTemplate.queryForObject("SELECT * FROM MyObect WHERE name = ? ",
                    new Object[]{"cat"},
                    new MyRowMapper());

            obect.ShowInConsole();
        }catch (CannotGetJdbcConnectionException e){System.out.print("------Filed connection to DB------");}
    }
}
