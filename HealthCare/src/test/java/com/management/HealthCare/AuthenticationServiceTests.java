package com.management.HealthCare;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.security.crypto.password.PasswordEncoder;

import com.management.HealthCare.UserAuthentication.UserAuthServiceImpl;
import com.management.HealthCare.UserAuthentication.UserDto;
import com.management.HealthCare.UserAuthentication.UserEntity;
import com.management.HealthCare.UserAuthentication.UserRepo;

//@RunWith(SpringRunner.class)
@SpringBootTest
public class AuthenticationServiceTests {

    @Autowired
    private UserAuthServiceImpl authenticationService;

    @MockBean
    private UserRepo userRepository;

    @MockBean
    private PasswordEncoder passwordEncoder;

    @Test
    public void testLogin() {
         UserEntity user = new UserEntity();
        user.setUsername("testUser");
        user.setPassword("encodedPassword");
        user.setUniqueId("check");

        when(userRepository.findByUniqueId("check")).thenReturn(user);
        when(passwordEncoder.matches("testPassword", "encodedPassword")).thenReturn(true);
        UserDto dto = new UserDto();
        user.setUsername("testUser");
        user.setPassword("encodedPassword");
        user.setUniqueId("check");
        boolean result = authenticationService.login(dto);
        assertTrue(result);
    }
}
