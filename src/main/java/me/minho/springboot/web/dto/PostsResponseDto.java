package me.minho.springboot.web.dto;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import me.minho.springboot.domain.posts.Posts;

@Getter
public class PostsResponseDto {

    private final Long id;
    private final String title;
    private final String content;
    private final String author;

    public PostsResponseDto(Posts entity) {
        this.id = entity.getId();
        this.title = entity.getTitle();
        this.content = entity.getContent();
        this.author = entity.getAuthor();
    }
}
