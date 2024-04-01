package com.moon.myteam.service;

import com.moon.myteam.dto.MyTeamDTO;
import com.moon.myteam.repository.MyTeamRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class MyTeamService {
    private final MyTeamRepository myTeamRepository;

    public void registration(MyTeamDTO myTeamDTO) {
        myTeamRepository.registration(myTeamDTO);
    }

    public List<MyTeamDTO> findAll() {
        return myTeamRepository.findAll();
    }

    public List<MyTeamDTO> findTop5Goal() {
        return myTeamRepository.findTop5Goal();
    }

    public List<MyTeamDTO> findTop5Assist() {
        return myTeamRepository.findTop5Assist();
    }

    public List<MyTeamDTO> findTop5Steel() {
        return myTeamRepository.findTop5Steel();
    }

    public List<MyTeamDTO> findTop5Block() {
        return myTeamRepository.findTop5Block();
    }

    public List<MyTeamDTO> findTop5Rebound() {
        return myTeamRepository.findTop5Rebound();
    }

    public List<MyTeamDTO> findTop5TurnOver() {
        return myTeamRepository.findTop5TurnOver();
    }

    public void saveResult(MyTeamDTO myTeamDTO) {
        myTeamRepository.saveResult(myTeamDTO);
    }
}
