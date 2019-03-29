package kolegran.github.com.springbootstart;

import lombok.Getter;

@Getter
public class UserDto {
    private final Long id;
    private final String login;
    private final String pass;

    public UserDto (User user){
       this.id = user.getId();
        this.login = user.getLogin();
        this.pass = user.getPass();
    }

}
