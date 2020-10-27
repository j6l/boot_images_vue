package com.jie.images;

import com.jie.images.Entity.PageImg;
import com.jie.images.Service.impl.IMGserviceimpl;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
class ImagesApplicationTests {

    @Autowired
    IMGserviceimpl imgservice;

    @Test
    void contextLoads() {
        PageImg pageImg = new PageImg();
        pageImg.setOffset( 2 );
        imgservice.findall(pageImg).getListimg().forEach(System.out::println);
        System.out.println( pageImg.getLimit() );
        System.out.println( pageImg.getOffset() );
        System.out.println( pageImg.getCount() );

    }
    @Test
    void contextLoad1() {
        PageImg pageImg = new PageImg();
        pageImg.setOffset( 2 );
        imgservice.findall(pageImg).getListimg().forEach(System.out::println);
        System.out.println( pageImg.getLimit() );
        System.out.println( pageImg.getOffset() );
        System.out.println( pageImg.getCount() );

    }

}
