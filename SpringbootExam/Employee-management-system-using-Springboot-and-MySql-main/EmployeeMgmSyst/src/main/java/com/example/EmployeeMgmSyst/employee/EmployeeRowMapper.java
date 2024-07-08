package com.example.EmployeeMgmSyst.employee;

import org.springframework.jdbc.core.RowMapper;
import java.sql.ResultSet;
import java.sql.SQLException;

public class EmployeeRowMapper implements RowMapper<Employees> {

    public Employees mapRow(ResultSet resultSet, int rowNum) throws SQLException {
        Employees employee = new Employees();
        employee.setId(resultSet.getLong("id"));
        employee.setName(resultSet.getString("name"));
        employee.setSalary(resultSet.getInt("salary"));
        return employee;
    }
}
