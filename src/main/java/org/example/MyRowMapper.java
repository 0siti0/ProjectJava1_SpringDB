package org.example;

import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class MyRowMapper implements RowMapper<MyObect> {
    @Override
    public MyObect mapRow(ResultSet rs, int rowNum) throws SQLException {
        MyObect obect = new MyObect();

        obect.Id(rs.getInt("id"));
        obect.Name(rs.getString("name"));
        obect.Age(rs.getInt("age"));
        obect.Status(rs.getBoolean("status"));
        return obect;
    }
}
