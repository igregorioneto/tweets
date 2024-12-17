package com.greg.tweets.controller.dto;

public record LoginResponse(String accessToken, Long expiresIn) {
}
