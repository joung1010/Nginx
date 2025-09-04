package com.app.nginx.biz.controller;


import com.app.nginx.biz.controller.model.BoardVo;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequestMapping("/api/v1/boards")
@RestController
public class BoardController {

    @GetMapping
    public List<BoardVo> list() {

        List<BoardVo> boards = List.of(
                BoardVo.builder()
                        .id(1L)
                        .title("제목1")
                        .content("내용1")
                        .build(),
                BoardVo.builder()
                        .id(2L)
                        .title("제목2")
                        .content("내용2")
                        .build(),
                BoardVo.builder()
                        .id(3L)
                        .title("제목3")
                        .content("내용3")
                        .build()
        );

        return boards;
    }
}
