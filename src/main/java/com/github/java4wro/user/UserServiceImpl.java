package com.github.java4wro.user;

import com.github.java4wro.user.dto.UserDTO;
import com.github.java4wro.user.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private UserMapper userMapper;

    @Override
    public UserDTO findUser(String userMail) {
        User user = userRepository.findOneByEmail(userMail);
        if(user==null){
            throw new RuntimeException();
        }
        return userMapper.toUserDTO(user);
    }
    public UserDTO addUser (User newUser){
        User user = new User();


        return null;
    }
}
