package kolegran.github.com.springbootstart;


import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequiredArgsConstructor
public class UserController {
    private final UserService userService;

    @GetMapping("/api/users/{userId}")
    public ResponseEntity<UserDto> getUserById (@PathVariable Long userId) {
        return ResponseEntity.ok(userService.getById(userId));
    }
    @PostMapping("/api/users")
    public ResponseEntity<UserDto> createUser (@RequestBody @Valid CreateUserCommand comand){
        return ResponseEntity.ok(userService.save(comand));
    }
}
