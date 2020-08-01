package pl.sda.JobAppAplication.user.model;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@AllArgsConstructor
@NoArgsConstructor (access =  AccessLevel.PRIVATE)
public class UserOutput {


    private Long uuid;
    private String name;
    private String login;
    private String creationDate;

}
