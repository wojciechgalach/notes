package pl.com.nur.notes.demo.component;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;
import pl.com.nur.notes.demo.repository.NoteDbRepo;

@Component
public class StartExercise {

    private NoteDbRepo noteDbRepo;

    @Autowired
    public StartExercise(NoteDbRepo noteDbRepo) {
        this.noteDbRepo = noteDbRepo;
    }


    @EventListener(ApplicationReadyEvent.class)
    public void init() {
//        Note note1 = new Note("temat1 notatki", "treść notatki 1");
//        Note note2 = new Note("Wiersz", "Szlachetne zdrowie ...");
//        noteDbRepo.save(note1);
//        noteDbRepo.save(note2);
//        noteDbRepo.findAll().stream().forEach(System.out::println);
    }

}
