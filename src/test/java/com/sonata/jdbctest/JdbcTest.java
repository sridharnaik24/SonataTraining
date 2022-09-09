package com.sonata.jdbctest;
import org.junit.jupiter.api.Test;



import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.Assertions;
import com.sonata.dao.*;
import com.sonata.DAOimpl.*;
import com.sonata.JDBCExampleMaven.*;
import com.sonata.model.*;


public class JdbcTest {
	
	@Test
	public void emptest() {
		 Employee c1=new Employee();
		 EmployeeImpl c2=new EmployeeImpl();
		 c1.setEmpid(100);
		 c1.setName("sridhar");
		 c1.setSal(10.000d);
		 
		 
		Assertions.assertEquals(0,c2.save(c1));
		
	}
	
	

}
