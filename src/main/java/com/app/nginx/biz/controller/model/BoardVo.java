package com.app.nginx.biz.controller.model;


import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
public class BoardVo {

    private Long id;
    private String title;
    private String content;
}
