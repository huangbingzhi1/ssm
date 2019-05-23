package com.hisense.ssm.users.mapper;

import com.hisense.ssm.users.entity.BaseUser;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
@Mapper
public interface BaseUserMapper {
    int deleteByPrimaryKey(String uid);

    int insert(BaseUser record);

    BaseUser selectByPrimaryKey(String uid);

    List<BaseUser> selectAll();

    int updateByPrimaryKey(BaseUser record);
}