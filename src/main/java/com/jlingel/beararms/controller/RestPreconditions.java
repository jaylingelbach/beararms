package com.jlingel.beararms.controller;

class RestPreconditions {

    static <T> T checkFound(T resource) {
        if (resource == null) {
            // throw new MyResourceNotFoundException();
            System.out.println("Throw new MyResourceFoundException() implemented later.");
        }
        return resource;
    }
}
