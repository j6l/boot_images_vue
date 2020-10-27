package com.jie.images.Entity;

import lombok.Data;

/**
 * Description:
 *
 * @author LiJie
 * @date Created on 2020/4/5
 * WWW https://github.com/j6l
 */

public class PageImg {
    //多少开始
    private Integer offset;
    //查询多少
    private Integer limit = 6;
    //总数量
    private Integer count;

    public Integer getOffset() {
        return offset;
    }

    public void setOffset(Integer offset) {
        this.offset = (offset-1) * limit;
    }

    public Integer getLimit() {
        return limit;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count / limit;
    }

}
