package com.raisetech.mybatisdemob;

import java.util.List;

public abstract class NameServiceImpl implements NameService {

     private final NameMapper nameMapper;

     public NameServiceImpl(NameMapper nameMapper) {
         this.nameMapper = nameMapper;
     }

    @Override
    public List<Name> findAll() {
        return nameMapper.findAll();
    }
}
