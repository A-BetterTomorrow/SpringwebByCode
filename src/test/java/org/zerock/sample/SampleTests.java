
package org.zerock.sample;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import lombok.Setter;
//import lombok.extern.java.Log;
//import lombok.extern.log4j.Log4j;
import lombok.extern.slf4j.Slf4j;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/root-context.xml")
//@Log4j
@Slf4j
//@Log
public class SampleTests {
  
  @Setter(onMethod_ = { @Autowired })
  private Restaurant restaurant;  

  @Test
  public void testExist() {
    
    assertNotNull(restaurant);
    log.info(restaurant.toString());
    log.info("----------------------------------");
    log.info(restaurant.getChef().toString());
  }
  
  
}
