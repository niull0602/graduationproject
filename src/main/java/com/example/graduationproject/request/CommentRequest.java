package com.example.graduationproject.request;

import lombok.Data;

/**
 * @Author:Fengxutong
 * @Date:2020/1/11
 * @Description:小冯同学写点注释吧！
 */
@Data
public class CommentRequest {

    private Integer bookId;

    private Integer pageNumber= 1;

    private Integer size = 10;

}
