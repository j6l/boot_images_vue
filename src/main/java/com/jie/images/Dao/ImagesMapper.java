package com.jie.images.Dao;

import com.jie.images.Entity.Images;
import com.jie.images.Entity.ImagesExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface ImagesMapper {
    long countByExample(ImagesExample example);

    int deleteByExample(ImagesExample example);

    int deleteByPrimaryKey(Integer uid);

    int insert(Images record);

    int insertSelective(Images record);

    List<Images> selectByExample(ImagesExample example);

    Images selectByPrimaryKey(Integer uid);

    int updateByExampleSelective(@Param("record") Images record, @Param("example") ImagesExample example);

    int updateByExample(@Param("record") Images record, @Param("example") ImagesExample example);

    int updateByPrimaryKeySelective(Images record);

    int updateByPrimaryKey(Images record);
}