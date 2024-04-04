package jin.springboot.blog.springbootblog.dto;

import jin.springboot.blog.springbootblog.domain.Article;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Getter
public class AddArticleRequest {

    private String title;
    private String content;

    // DTO를 엔티티로 만들어주는 메서드, 블로그 글을 추가할 때 저장할 엔티티로 변환하는 용도
    public Article toEntity() {
        return Article.builder()
                .title(title)
                .content(content)
                .build();
    }

}
