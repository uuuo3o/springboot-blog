package jin.springboot.blog.springbootblog.service;

import jin.springboot.blog.springbootblog.domain.Article;
import jin.springboot.blog.springbootblog.dto.AddArticleRequest;
import jin.springboot.blog.springbootblog.repository.BlogRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class BlogService {

    private final BlogRepository blogRepository;

    public Article save(AddArticleRequest request) {
        return blogRepository.save(request.toEntity());
    }

}
