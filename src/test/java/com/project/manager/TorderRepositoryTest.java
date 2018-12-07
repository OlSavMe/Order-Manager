package com.project.manager;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.test.context.junit4.SpringRunner;

import com.project.manager.domain.Item;
import com.project.manager.domain.Torder;
import com.project.manager.domain.TorderRepository;
import com.project.manager.domain.Unit;





@RunWith(SpringRunner.class)
@DataJpaTest
public class TorderRepositoryTest {
	@Autowired
	  private TestEntityManager entityManager;
	  
	  @Autowired
	  private TorderRepository repository;
	  
	  @Test
	  public void createNewTorder() {
	    Torder torder = new Torder (100, "12/12/2018",  new Item("Nuts"),  new Unit("Set"));
	    repository.save(torder);
	    
	    assertThat(torder.getId()).isNotNull();
	  }

	
	
}
