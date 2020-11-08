package me.minho.springboot.domain.posts;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import me.minho.springboot.domain.BaseTimeEntity;

import javax.persistence.*;

@NoArgsConstructor
@Entity
public class Posts extends BaseTimeEntity {

    @Getter
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Getter
    @Column(length = 500, nullable = false)
    private String title;

    @Getter
    @Column(columnDefinition = "TEXT", nullable = false)
    private String content;

    @Getter
    private String author;

    @Builder
    public Posts(String title, String content, String author) {
        this.title = title;
        this.content = content;
        this.author = author;
    }

    public void update(String title, String content) {
        this.title = title;
        this.content = content;
    }
}
