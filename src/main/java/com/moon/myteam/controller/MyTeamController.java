package com.moon.myteam.controller;

import com.moon.myteam.dto.MyTeamDTO;
import com.moon.myteam.service.MyTeamService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
@RequiredArgsConstructor
public class MyTeamController {
    private final MyTeamService myTeamService;

    @GetMapping("/home")
    public String home() {
        return "home";
    }

    // 선수 등록
    @GetMapping("/registration")
    public String registration() {
        return "registration";
    }

    @PostMapping("/registration")
    public String registration(MyTeamDTO myTeamDTO) {
        myTeamService.registration(myTeamDTO);
        System.out.println("myTeamDTO = " + myTeamDTO);
        return "registration";
    }

    // 기록실
    @GetMapping("/record")
    public String record(Model model) {
        List<MyTeamDTO> myTeamDTOList = myTeamService.findAll();
        model.addAttribute("recordList", myTeamDTOList);
        List<MyTeamDTO> top5GoalList = myTeamService.findTop5Goal();
        model.addAttribute("goalTop5List", top5GoalList);
        List<MyTeamDTO> top5AssistList = myTeamService.findTop5Assist();
        model.addAttribute("assistTop5List", top5AssistList);
        List<MyTeamDTO> top5SteelList = myTeamService.findTop5Steel();
        model.addAttribute("steelTop5List", top5SteelList);
        List<MyTeamDTO> top5BlockList = myTeamService.findTop5Block();
        model.addAttribute("blockTop5List", top5BlockList);
        List<MyTeamDTO> top5ReboundList = myTeamService.findTop5Rebound();
        model.addAttribute("reboundTop5List", top5ReboundList);
        List<MyTeamDTO> top5TurnOverList = myTeamService.findTop5TurnOver();
        model.addAttribute("turnOverTop5List", top5TurnOverList);
        return "record";
    }

    // 새 게임
    @GetMapping("/newgame")
    public String newGame() {
        return "newgame";
    }

    @PostMapping("/saveResult")
    public String saveResult(MyTeamDTO myTeamDTO) {
        myTeamService.saveResult(myTeamDTO);
        return "newgame";
    }
}

