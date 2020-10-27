package com.jie.images.Web;

import com.jie.images.Entity.Images;
import com.jie.images.Entity.PageImg;
import com.jie.images.Entity.limitANDlist;
import com.jie.images.Service.impl.IMGserviceimpl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Description:
 *
 * @author LiJie
 * @date Created on 2020/4/4
 * WWW https://github.com/j6l
 */
@RestController
public class testcontroller {

    private final static Logger  logger= LoggerFactory.getLogger(testcontroller.class);

    @Autowired
    IMGserviceimpl service;

    @RequestMapping("/find/{page}")
    public limitANDlist find(Model model, @PathVariable( "page" ) Integer page){
        logger.info( "进入全部查询" );
        logger.info( "page"+page );
        PageImg pageImg = new PageImg();
        if(page == null||page<=0){
            page = 1;
        }
        pageImg.setOffset( page );
        limitANDlist findall = service.findall( pageImg);
        model.addAttribute( "images" , findall.getListimg() );
        model.addAttribute( "page" , findall.getPageImg() );
        return findall;

    }

    @RequestMapping("/name/{name}/{page}")
    public limitANDlist findname(Model model, @PathVariable( "name" ) String name,@PathVariable( "page" ) Integer page){
        logger.info( "name"+name );
        logger.info( "page"+page );
        if(page == null||page<=0){
            page = 1;
        }
        PageImg pageImg = new PageImg();
        pageImg.setOffset( page );
        limitANDlist nameall = service.nameall( name , pageImg );
        model.addAttribute("images",nameall.getListimg());
        model.addAttribute( "page" , nameall.getPageImg() );
        return nameall;
    }

    @RequestMapping("/lei/{lei}/{page}")
    public String findlei(Model model,@PathVariable( "lei" ) String lei,@PathVariable( "page" ) Integer page){
        logger.info( "name"+lei );
        logger.info( "page"+page );
        if(page == null||page<=0){
            page = 1;
        }
        PageImg pageImg = new PageImg();
        pageImg.setOffset( page );
        limitANDlist leiall = service.leiall( lei , pageImg);
        model.addAttribute("images",leiall.getListimg());
        model.addAttribute("page",leiall.getPageImg());

        return "list";
    }
}
