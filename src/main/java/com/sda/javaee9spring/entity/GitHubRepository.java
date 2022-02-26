package com.sda.javaee9spring.entity;

import com.fasterxml.jackson.annotation.JsonProperty;

public record GitHubRepository(Long id, String name, @JsonProperty("html_url") String url) {
}
