package com.mocktest.controller;

import com.mocktest.service.TeamService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;


@RestController
@RequestMapping("/teams")
@AllArgsConstructor

public class TeamController {
    private final TeamService teamService;

    @GetMapping("/add")
    public String add(@RequestParam String teamName) {
        return teamService.add(teamName);
    }

    @GetMapping("/find")
    public String find(@RequestParam String teamName) {
        return teamService.find(teamName);
    }
    @GetMapping("/remove")
    public String remove(@RequestParam String teamName) {
        return teamService.remove(teamName);
    }
    @GetMapping("/all")
    public Collection<String> findTeams(String prefix) {
        if (prefix != null) {
            return teamService.findTeamsByPrefix(prefix);
        }
        return teamService.findTeams();
    }
    @GetMapping("/all/format")
    public String findTeamsAsString() {
        return teamService.findTeamsAsString();
    }

}

