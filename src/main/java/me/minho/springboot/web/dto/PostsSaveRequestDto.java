package me.minho.springboot.web.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import me.minho.springboot.domain.posts.Posts;

@Getter
@RequiredArgsConstructor
public class PostsSaveRequestDto {

    private final String title;
    private final String content;
    private final String author;

    public Posts toEntity() {
        return Posts.builder()
                .title(title)
                .content(content)
                .author(author)
                .build();
    }
}
