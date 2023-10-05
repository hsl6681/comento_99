package CRUD.CRUDSPRING;

public class Post {
    private Long id;
    private String title;
    private String content;
    // Getter와 Setter 메서드
}
public interface PostRepository extends JpaRepository<Post, Long> {
    List<Post> findAll();
}