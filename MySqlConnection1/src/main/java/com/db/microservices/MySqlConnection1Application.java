package com.db.microservices;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.jdbc.core.JdbcTemplate;

@SpringBootApplication
public class MySqlConnection1Application implements CommandLineRunner {
   @Autowired
	private JdbcTemplate jdbcTemplate;
    
	public static void main(String[] args) {
		SpringApplication.run(MySqlConnection1Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		String sql="INSERT INTO teams(team_id,team_name) VALUES(?,?)";
		int result=jdbcTemplate.update(sql,4,"pr");
		if(result>0) {
			System.out.println("success!!!!!!!!!!!!");
		}
	}

}
