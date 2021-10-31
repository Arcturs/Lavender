package ru.vsu.csf.Sashina.Study.example.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import ru.vsu.csf.Sashina.Study.example.models.Post;

@Repository
public interface PostRepository extends CrudRepository<Post, Long> {
}
