package com.jeocat.library.dao.mapper;

import com.jeocat.library.dao.entity.Classics;
import com.jeocat.library.dao.entity.ClassicsExample;
import java.util.List;

import com.jeocat.library.vo.RequestSaveClassic;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface ClassicsMapper {
    long countByExample(ClassicsExample example);

    int deleteByExample(ClassicsExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Classics record);

    int insertSelective(Classics record);

    List<Classics> selectByAuthor(String author);

    List<Classics> selectAll ();

    Classics selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Classics record, @Param("example") ClassicsExample example);

    int updateByExample(@Param("record") Classics record, @Param("example") ClassicsExample example);

    int updateByPrimaryKeySelective(Classics record);

    int updateByPrimaryKey(Classics record);
}