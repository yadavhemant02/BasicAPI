package com.TestController;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.web.client.RestTemplate;

import com.controller.Controller;
import com.model.userModel;
import com.repository.userRepository;

//@ExtendWith(MockitoExtension.class)

//@DataJpaTest
@SpringBootTest
public class TestController {
	
	@Autowired
	private RestTemplate restTemp;
	
	@Autowired
	private Controller userController;
	
	@Autowired
    private userRepository userrepo;
	
	userModel userData;
	
	@BeforeEach
	void setUp() {
		userData = new userModel("hemant", "hemant@gmail.com","1234");
		this.userrepo.save(userData);
	}
	
	@AfterEach
	void tearDown() {
		userData=null;
		this.userrepo.deleteAll();
	}
	
	@Test
	public void alluserData() {
		//List<userModel> data = this.restTemp.getForObject("http://localhost:2244/data", List.class );
		ArrayList<userModel> data = this.userController.alluserData();
		assertThat(data.get(0).getId()).isEqualTo(userData.getId());
	}
	
	
	

}
