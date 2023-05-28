package com.mocktest.service;

import com.mocktest.constant.TeamConstants;
import com.mocktest.repository.TeamRepository;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static com.mocktest.constant.TeamConstants.*;
import static org.mockito.Mockito.*;


@ExtendWith(MockitoExtension.class)
public class TeamServiceImplTest {
    @Mock
    private TeamRepository repositoryMock;

    @InjectMocks
    private TeamServiceImpl teamService;

    @Test
    public void addTeam() {
        when(repositoryMock.add(TEAM_NAME_1)).thenReturn("test");
        Assertions.assertEquals("test", teamService.add(TEAM_NAME_1));
        verify(repositoryMock, times(1)).add(TEAM_NAME_1);

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
