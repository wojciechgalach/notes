package pl.com.nur.notes.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.com.nur.notes.demo.model.Note;

import java.util.List;

@Repository
public interface NoteDbRepo  extends JpaRepository<Note, Long> {

    List<Note> findByTitleContains(String search);
    void deleteById(Long id);

}
