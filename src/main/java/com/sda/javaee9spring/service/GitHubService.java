package com.sda.javaee9spring.service;

import com.sda.javaee9spring.entity.GitHubRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Service
@Slf4j
public class GitHubService {

    private static final String gitHubUrl = "https://api.github.com/users/mariuszpastuszka/repos";

    private final RestTemplate restTemplate;

    public GitHubService(final RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    public List<GitHubRepository> readGitHubRepositories() {
        log.info("trying to read github repositories from url: [{}]", gitHubUrl);
        var repos = restTemplate.getForObject(gitHubUrl, GitHubRepository[].class);
        return List.of(repos != null ? repos : new GitHubRepository[0]);
    }
}
