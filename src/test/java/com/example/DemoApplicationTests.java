package com.example;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DemoApplicationTests {

	@Test
	public void contextLoads() {
	}


    private static Logger logger = Logger.getLogger(AppTest.class);
  
  @Test
    public void shouldAnswerWithTrue()
    {
	logger.info("Hello World!");        
	assertTrue( true );
        
    }

	public Integer addition(Integer a, Integer b)
	    {
		Integer somme;
		somme = a + b;
	        return somme;
	   }

	@Test
	public void additionner_should_return()
	{
		Integer somme = addition(2, 3); 
		if (somme == 5) {
   		 assertTrue( true );
		} else {
		assertTrue( false );
		}

	}
	
	
	public Integer soustraction(Integer a, Integer b)
	    {
		Integer somme;
		somme = a - b;
	        return somme;
	   }
	
	@Test
	public void soustraction_should_return()
	{
		Integer somme = soustraction(2, 3); 
		if (somme < 5) {
   		 assertTrue( true );
		} else {
		assertTrue( false );
		}

	}

}
