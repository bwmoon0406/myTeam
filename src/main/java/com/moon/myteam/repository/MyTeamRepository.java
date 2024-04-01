package com.moon.myteam.repository;

import com.moon.myteam.dto.MyTeamDTO;
import lombok.RequiredArgsConstructor;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@RequiredArgsConstructor
public class MyTeamRepository {
    private final SqlSessionTemplate sql;

    public void registration(MyTeamDTO myTeamDTO) {
        sql.insert("myTeam.registration", myTeamDTO);
    }

    public List<MyTeamDTO> findAll() {
        return sql.selectList("myTeam.findAll");
    }

    public List<MyTeamDTO> findTop5Goal() {
        return sql.selectList("myTeam.findTop5Goal");
    }

    public List<MyTeamDTO> findTop5Assist() {
        return sql.selectList("myTeam.findTop5Assist");
    }

    public List<MyTeamDTO> findTop5Steel() {
        return sql.selectList("myTeam.findTop5Steel");
    }

    public List<MyTeamDTO> findTop5Block() {
        return sql.selectList("myTeam.findTop5Block");
    }

    public List<MyTeamDTO> findTop5Rebound() {
        return sql.selectList("myTeam.findTop5Rebound");
    }

    public List<MyTeamDTO> findTop5TurnOver() {
        return sql.selectList("myTeam.findTop5TurnOver");
    }

    public void saveResult(MyTeamDTO myTeamDTO) {
        sql.update("myTeam.saveResult", myTeamDTO);
    }
}
