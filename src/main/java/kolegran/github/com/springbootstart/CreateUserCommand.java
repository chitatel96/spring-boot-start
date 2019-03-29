package kolegran.github.com.springbootstart;

import lombok.Data;

import javax.validation.constraints.NotNull;

@Data
public class CreateUserCommand {
    @NotNull
    private String login;
    @NotNull
    private String pass;
}
