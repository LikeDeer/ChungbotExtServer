package com.junhojeong.apiserver.mapper;

import com.junhojeong.apiserver.model.UserProfile;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface UserProfileMapper {

    @Select("SELECT * FROM UserProfile WHERE id=#{id}")
    UserProfile getUserProfile(@Param("id") String id);

    @Select("SELECT * FROM UserProfile")
    List<UserProfile> getUserProfileList();

    // 영향을 받은 레코드 개수 반환
    @Insert("INSERT INTO UserProfile VALUES(#{id}, #{name}, #{phone}, #{address})")
    int insertUserProfile(@Param("id") String id, @Param("name") String name,
                   @Param("phone") String phone, @Param("address") String address);

    @Update("UPDATE UserProfile SET name=#{name}, phone=#{phone}, address=#{address} WHERE id=#{id}")
    int updateUserProfile(@Param("id") String id, @Param("name") String name,
                         @Param("phone") String phone, @Param("address") String address);

    @Delete("DELETE FROM UserProfile WHERE id=#{id}")
    int deleteUserProfile(@Param("id") String id);
}
