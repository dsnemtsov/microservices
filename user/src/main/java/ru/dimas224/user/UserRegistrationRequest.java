package ru.dimas224.user;

public record UserRegistrationRequest(
        String firstName,
        String lastName,
        String email) {
}