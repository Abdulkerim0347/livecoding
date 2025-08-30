package ui.models;

import lombok.Builder;
import lombok.Data;
import org.apache.commons.lang3.RandomStringUtils;

@Data
@Builder
public class User {
    private String firstName;
    private String lastName;
    private String email;
    private String address;
    private String city;
    private String zipCode;
    private String loginName;
    private String password;

    public static User generate() {
        return User.builder()
                .firstName(RandomStringUtils.randomAlphabetic(5))
                .lastName(RandomStringUtils.randomAlphabetic(5))
                .email(RandomStringUtils.randomAlphabetic(5) + "@" +
                        RandomStringUtils.randomAlphabetic(2) + "." +
                        RandomStringUtils.randomAlphabetic(2))
                .address(RandomStringUtils.randomAlphabetic(5))
                .city(RandomStringUtils.randomAlphabetic(5))
                .zipCode(RandomStringUtils.randomAlphabetic(5))
                .loginName(RandomStringUtils.randomAlphanumeric(10))
                .password(RandomStringUtils.randomAlphabetic(6))
                .build();
    }
}
