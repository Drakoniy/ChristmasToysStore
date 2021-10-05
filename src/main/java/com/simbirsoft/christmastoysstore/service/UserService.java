package com.simbirsoft.christmastoysstore.service;

import com.simbirsoft.christmastoysstore.model.SimpleUser;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;


@Service
public class UserService implements UserServInterface {
    //@Autowired
     //public helloWorldRepository helloWorldR;

    private List<SimpleUser> userList = Stream.of(
            new SimpleUser(1L, "ivanov", "123456", "Admin"),
            new SimpleUser(2L, "Sergeev", "Qwerty", "user"),
            new SimpleUser(3L, "Petrov", "Asdfgh", "user")
    ).collect(Collectors.toList());

    @Override
    public List<SimpleUser> getAll() {
        return userList;
    }

    @Override
    public SimpleUser getById(Long id)
    {
        return userList.stream().filter(user -> user.getId().equals(id)).findFirst().orElse(null);
    }

    @Override
    public void create (SimpleUser simpleUser)
    {
        this.userList.add(simpleUser);
    }

    @Override
    public void delById (Long id)
    {
        this.userList.removeIf(simpleUser -> simpleUser.getId().equals(id));
    }
}
