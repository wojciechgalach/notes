package pl.com.nur.notes.demo.controller;

import org.springframework.stereotype.Component;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import pl.com.nur.notes.demo.model.Note;
import pl.com.nur.notes.demo.service.NoteList;

@Component
@RequestMapping("/notes")
public class NoteApi {

    private NoteList noteList;

    public NoteApi(NoteList noteList) {
        this.noteList = noteList;
    }

    @GetMapping
    public String getNote(Model model){
        model.addAttribute("notes", noteList.getNoteList());
        model.addAttribute("modNote", new Note());
        return "note";
    }


    @GetMapping("/modification/{id}")
    public String modNote(@ModelAttribute Note note, @PathVariable Long id){
        System.out.println("w NoteApi modNote" + note);
        note.setId(id);
        noteList.modNote(note);
        return "redirect:/notes";
    }

    @GetMapping("/delete/{id}")
    public String removeVehicleId(@PathVariable Long id){
        noteList.delNote(id);
        return "redirect:/notes";
    }

    @GetMapping("/addnote")
    public String addNew(@ModelAttribute Note note, Model model) {
        model.addAttribute("newNote", new Note());
        return "addmynewnote";
    }

    @GetMapping("/addnote/add")
    public String addNewNote(@ModelAttribute Note note, Model model) {
        model.addAttribute("newNote", new Note());
        noteList.addNote(note);
        return "redirect:/notes/addnote";
    }
}
