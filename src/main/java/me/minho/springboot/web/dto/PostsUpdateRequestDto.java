package me.minho.springboot.web.dto;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public class PostsUpdateRequestDto {

    private final String title;

    private final String content;

}
