package kolegran.github.com.springbootstart;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
public class UserService {
    private final UserRepository userRepository;

    @Transactional (readOnly = true)
    public UserDto getById(Long userId){

        return new UserDto(userRepository.getOne(userId));
    }
    @Transactional
    public UserDto save(CreateUserCommand command){
        User user = new User();
        user.setLogin(command.getLogin());

        return new UserDto(userRepository.save(user));
    }

}
