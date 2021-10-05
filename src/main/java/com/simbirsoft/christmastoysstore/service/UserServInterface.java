package com.simbirsoft.christmastoysstore.service;

import com.simbirsoft.christmastoysstore.model.SimpleUser;

import java.util.List;

//@Service
public interface UserServInterface {
    public List<SimpleUser> getAll();

    public void create(SimpleUser simpleUser);

    public void delById(Long id);

    public SimpleUser getById(Long id);
}
