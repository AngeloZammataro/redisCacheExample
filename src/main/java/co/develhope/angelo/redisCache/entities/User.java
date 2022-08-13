package co.develhope.angelo.redisCache.entities;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Table;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {


    private String firstName;
    private String lastName;
    private String profilePicture;
    private String email;
    private String passwordEncrypted;

    private String domicileAddress;
    private String domicileCity;
    private String domicileNumber;
    private String domicileState;

    private String fiscalCode;
}
