package me.minho.springboot.service;

import lombok.RequiredArgsConstructor;
import me.minho.springboot.domain.posts.Posts;
import me.minho.springboot.domain.posts.PostsRepository;
import me.minho.springboot.web.dto.PostsResponseDto;
import me.minho.springboot.web.dto.PostsSaveRequestDto;
import me.minho.springboot.web.dto.PostsUpdateRequestDto;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@RequiredArgsConstructor
@Service
public class PostsService {

    private final PostsRepository postsRepository;

    @Transactional
    public Long save(PostsSaveRequestDto postsSaveRequestDto) {
        return postsRepository.save(postsSaveRequestDto.toEntity()).getId();
    }

    @Transactional
    public Long update(long id, PostsUpdateRequestDto postsUpdateRequestDto) {
        Posts posts = postsRepository.findById(id).orElseThrow(() -> new IllegalArgumentException("해당 사용자가 없습니다. id=" + id));
        posts.update(postsUpdateRequestDto.getTitle(), postsUpdateRequestDto.getContent());
        return id;
    }

    public PostsResponseDto findById(Long id) {
        return new PostsResponseDto(postsRepository
                .findById(id)
                .orElseThrow(() -> new IllegalArgumentException("해당 사용자가 없습니다. id=" + id)));
    }
}
