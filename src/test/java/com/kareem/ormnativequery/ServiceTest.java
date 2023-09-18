package com.kareem.ormnativequery;
import com.github.javafaker.Faker;
import com.kareem.ormnativequery.orm.entities.User;
import com.kareem.ormnativequery.orm.repo.UserRepo;
import com.kareem.ormnativequery.orm.service.UserService;

import java.util.Date;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class ServiceTest {
    private final Faker faker = new Faker();
    private final UserService UserServiceObj;

    @Autowired
    public ServiceTest(UserService USO){
        this.UserServiceObj = USO;
    }

    @Test
    public void testSomeMethod() {
        // Use JavaFaker to generate fake data
        String fakeName = faker.name().fullName();
        String fakerPhone = faker.phoneNumber().cellPhone();
        Double fakerLength = faker.number().randomDouble(2, 0, 195);
        Date fakerBirthday = faker.date().birthday();
        
        User user;
        //insert list of user
        for(int i = 0; i < 10; i++){
            // Use JavaFaker to generate fake data
            fakeName = faker.name().fullName();
            fakerPhone = faker.phoneNumber().cellPhone();
            fakerLength = faker.number().randomDouble(2, 0, 195);
            fakerBirthday = faker.date().birthday();
            user = new User(faker.number().numberBetween(1, 90),fakeName, fakerPhone,fakerLength,fakerBirthday);
            // user = new User(fakeName, fakerPhone,fakerLength,fakerBirthday);
            this.UserServiceObj.saveUser(user);

        }
        // Create test objects with the generated fake data
        // User user = new User(fakeName,);

        // Perform your test using the test objects
        // ...
    }
}
