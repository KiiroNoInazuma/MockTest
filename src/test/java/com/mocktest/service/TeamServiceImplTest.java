package com.mocktest.service;

import com.mocktest.repository.TeamRepository;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class TeamServiceImplTest {
    @Mock
    TeamRepository teamRepository;
    @InjectMocks
    TeamServiceImpl impl;

    @Test
    void addTeam() {
        when(teamRepository.add("test")).thenReturn("test");
        Assertions.assertEquals("test", impl.add("test"));

    }

    @Test
    void find() {
    }

    @Test
    void remove() {
    }

    @Test
    void findTeamsAsString() {
    }

    @Test
    void findTeams() {
    }

    @Test
    void findTeamsByPrefix() {
    }
}