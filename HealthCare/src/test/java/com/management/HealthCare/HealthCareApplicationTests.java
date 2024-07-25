package com.management.HealthCare;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.security.test.context.support.WithMockUser;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.management.HealthCare.UserAuthentication.UserAuthController;
import com.management.HealthCare.UserAuthentication.UserAuthServiceImpl;
import com.management.HealthCare.UserAuthentication.UserDto;

@SpringBootTest
@AutoConfigureMockMvc(addFilters = false)
class HealthCareApplicationTests {

//	@Test
//	void contextLoads() {
//	}

	 @Autowired
	    private MockMvc mockMvc;

	    @Autowired
	    private ObjectMapper objectMapper; // ObjectMapper for JSON serialization/deserialization

	    @Autowired
	    private UserAuthServiceImpl service;
	    
	    @Test
	    @WithMockUser(username = "admin", roles = {"USER", "ADMIN"}) 
	    public void testRegister() throws Exception {
	        UserDto userDTO = new UserDto();
	        userDTO.setUsername("testuser");
	        userDTO.setEmailId("test@mail.com");
	        userDTO.setUniqueId("test123");
	        userDTO.setPassword("password123");
	        
	        mockMvc.perform(MockMvcRequestBuilders.post("/auth/user/register")
	                .contentType(MediaType.APPLICATION_JSON)
	                .content(objectMapper.writeValueAsString(userDTO)))
	                .andExpect(MockMvcResultMatchers.status().isCreated())
	                .andExpect(MockMvcResultMatchers.content().string("User registered successfully"));
	        
	     
	    }
	    
	    @Test
	    public void testUser() {
	        // Create a mock for the service
	        UserAuthServiceImpl service = Mockito.mock(UserAuthServiceImpl.class);
	        
	        // Create a user DTO
	        UserDto userDTO = new UserDto("testuser", "password123", "test123");
	        
	        // Stub the method call on the mock object
	        when(service.login(userDTO)).thenReturn(true);

	        // Use the mocked service in your test logic
	        assertThat(service.login(userDTO)).isTrue();
	    }
}
