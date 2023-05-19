package com.example.autodblesson.controlles;

import com.example.autodblesson.models.Team;
import com.example.autodblesson.repositories.TeamsRepository;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path = "/teams")
@AllArgsConstructor
public class TeamsController {
    private TeamsRepository teamsRepository;

    @GetMapping("/get-all")
    public List<Team> getAll() {
        return teamsRepository.findAll();
    }
}
