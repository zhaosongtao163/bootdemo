package com.stzhao.dao.test;


import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface TestMapper {


//    List<xxxDO> queryAll(@Param("xxx") String xxx, @Param("yyy") String yyy);
    List queryAll();
}
