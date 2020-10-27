package com.jie.images.Service;

import com.jie.images.Entity.Images;
import com.jie.images.Entity.PageImg;
import com.jie.images.Entity.limitANDlist;

import java.util.List;

/**
 * Description:
 *
 * @author LiJie
 * @date Created on 2020/4/4
 * WWW https://github.com/j6l
 */
public interface Imgservice {

    limitANDlist findall(PageImg pageImg);
    limitANDlist leiall(String lei,PageImg pageImg);
    limitANDlist nameall(String name,PageImg pageImg);
}
