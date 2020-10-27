package com.jie.images.Entity;

import lombok.Data;

import java.util.List;

/**
 * Description:
 *
 * @author LiJie
 * @date Created on 2020/4/5
 * WWW https://github.com/j6l
 */

public class limitANDlist {
    private List<Images> listimg;
    private PageImg pageImg;

    public limitANDlist() {
    }
    public limitANDlist(List<Images> listimg,PageImg pageImg) {
        this.listimg = listimg;
        this.pageImg = pageImg;
    }

    public List<Images> getListimg() {
        return listimg;
    }

    public void setListimg(List<Images> listimg) {
        this.listimg = listimg;
    }

    public PageImg getPageImg() {
        return pageImg;
    }

    public void setPageImg(PageImg pageImg) {
        this.pageImg = pageImg;
    }
}
