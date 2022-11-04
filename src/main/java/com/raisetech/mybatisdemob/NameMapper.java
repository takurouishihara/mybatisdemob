package com.raisetech.mybatisdemob;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;
@Mapper
public class NameMapper {
    @Select("SELECT*FROM names")
    List<Name> findAll();

}
