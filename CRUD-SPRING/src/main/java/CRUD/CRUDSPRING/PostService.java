package CRUD.CRUDSPRING;


import org.springframework.beans.factory.annotation.Autowired;

public class PostService {
        @Autowired
        private PostRepository postRepository;

        public List<Post> getAllPosts() {
            return postRepository.findAll();
        }

        public Post getPostById(Long id) {
            return postRepository.findById(id).orElse(null);
        }

        public Post createPost(Post post) {
            return postRepository.save(post);
        }

        public Post updatePost(Long id, Post updatedPost) {
            Post existingPost = postRepository.findById(id).orElse(null);
            if (existingPost == null) {
                return null;
            }
            existingPost.setTitle(updatedPost.getTitle());
            existingPost.setContent(updatedPost.getContent());
            return postRepository.save(existingPost);
        }

        public void deletePost(Long id) {
            postRepository.deleteById(id);
        }
    }


