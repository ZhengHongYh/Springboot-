package com.example.intelligence.repository;

import com.example.intelligence.Data.Data;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface DataDao {
//    @Query(value = "select * from user where uname LIKE ?1 OR email LIKE ?2 OR lastdid LIKE ?3 OR uid LIKE ?4",nativeQuery = true)
//    @Modifying
//    @Query(value = "insert into data(id,title,content,url,yuanurl) values(?1,?2,?3,?4,?5);",nativeQuery = true)
    @Insert({ "insert into data(id, title, content, url, yuanurl) values(#{id}, #{title}, #{content}, #{url},#{yuanurl} )" })
    int findUserswithoutgender(
            String id,
            String title,
            String content,
            String url,
            String yuanurl
    );

    @Select("select * from data order by id desc")
    List<Data> inquire();

    @Select("select * from data where id= #{id}")
    Data inquireabout(String id);


    @Select("select max(id) from data")
    String getLastId();


}
