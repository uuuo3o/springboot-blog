package jin.springboot.blog.springbootblog.repository;

import jin.springboot.blog.springbootblog.domain.Article;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BlogRepository extends JpaRepository<Article, Long> {
}
