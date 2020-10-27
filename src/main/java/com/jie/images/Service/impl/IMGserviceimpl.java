package com.jie.images.Service.impl;

import com.jie.images.Dao.ImagesMapper;
import com.jie.images.Entity.Images;
import com.jie.images.Entity.ImagesExample;
import com.jie.images.Entity.PageImg;
import com.jie.images.Entity.limitANDlist;
import com.jie.images.Service.Imgservice;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Description:
 *
 * @author LiJie
 * @date Created on 2020/4/4
 * WWW https://github.com/j6l
 */
@Service
public class IMGserviceimpl implements Imgservice {
    private final static Logger logger= LoggerFactory.getLogger( Imgservice.class);
    @Autowired
    ImagesMapper imagesdao;

    @Override
    public limitANDlist findall(PageImg pageImg) {
        //创建一个images的查询对象
        ImagesExample imagesExample = new ImagesExample();
        //启用Example里面的定义查询
        ImagesExample.Criteria cri = imagesExample.createCriteria();
        // 使用url 是 不为空规则
        cri.andUrlIsNotNull();
        pageImg.setCount( (int) imagesdao.countByExample( imagesExample ) );
        imagesExample.setOffset( pageImg.getOffset() );
        imagesExample.setLimit( pageImg.getLimit() );

        logger.info( "fooset===="+pageImg.getOffset() );
        logger.info( "limit===="+pageImg.getLimit() );
        // 使用查询

        return new limitANDlist(imagesdao.selectByExample( imagesExample),pageImg);


    }

    @Override
    public limitANDlist leiall(String lei,PageImg pageImg) {
        //创建一个images的查询对象
        ImagesExample imagesExample = new ImagesExample();
        //启用Example里面的定义查询
        ImagesExample.Criteria cri = imagesExample.createCriteria();
        // 使用lei like规则
        lei = "%"+lei+"%";
        cri.andLeiLike( lei );
        pageImg.setCount( (int) imagesdao.countByExample( imagesExample ) );
        imagesExample.setOffset( pageImg.getOffset() );
        imagesExample.setLimit( pageImg.getLimit() );
        // 使用查询
        return new limitANDlist(imagesdao.selectByExample( imagesExample ),pageImg);
    }

    @Override
    public limitANDlist nameall(String name,PageImg pageImg) {
        //创建一个images的查询对象
        ImagesExample imagesExample = new ImagesExample();
        //启用Example里面的定义查询
        ImagesExample.Criteria cri = imagesExample.createCriteria();
        // 使用name like规则
        //就这一句不一样
        name = "%"+name+"%";
        cri.andNameLike( name );
        pageImg.setCount( (int) imagesdao.countByExample( imagesExample ) );
        imagesExample.setOffset( pageImg.getOffset() );
        imagesExample.setLimit( pageImg.getLimit() );
        // 使用查询
        return new limitANDlist(imagesdao.selectByExample( imagesExample ),pageImg);
    }
}
