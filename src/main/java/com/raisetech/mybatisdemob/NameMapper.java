package com.raisetech.mybatisdemob;

import org.apache.ibatis.annotations.Select;

import java.util.List;

public class NameMapper {
    @Select("SELECT*FROM names")
    List<name> findAll();

}
