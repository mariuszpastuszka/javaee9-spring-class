package com.sda.javaee9spring.controller;

import com.sda.javaee9spring.service.GitHubService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@Slf4j
public class GitHubController {

    private static final String repositoriesKey = "gitHubRepositories";
    private final GitHubService gitHubService;

    public GitHubController(final GitHubService gitHubService) {
        this.gitHubService = gitHubService;
    }

    @GetMapping("/show-my-repositories")
    public String showMyGitHubRepositories(Model uiData) {
        log.info("showing my github repository request");

        var repositories = gitHubService.readGitHubRepositories();

        uiData.addAttribute(repositoriesKey, repositories);

        return "pages/github/git-hub-repos";
    }
}
