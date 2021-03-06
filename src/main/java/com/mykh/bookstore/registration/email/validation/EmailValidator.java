package com.mykh.bookstore.registration.email.validation;

import org.springframework.stereotype.Service;

import java.util.Optional;
import java.util.function.Predicate;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static java.lang.Boolean.FALSE;
import static java.lang.Boolean.TRUE;

@Service
public class EmailValidator implements Predicate<String> {

    private static final Pattern PATTERN = Pattern.compile("^[\\w-$.]+@([\\w-]+\\.)+[\\w-]{2,10}$");

    @Override
    public boolean test(String email) {
       return Optional.of(email)
                .map(PATTERN::matcher)
                .filter(Matcher::find)
                .map(isEmailValid -> TRUE)
                .orElse(FALSE);
    }
}
