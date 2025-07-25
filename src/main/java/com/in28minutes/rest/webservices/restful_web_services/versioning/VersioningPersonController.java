package com.in28minutes.rest.webservices.restful_web_services.versioning;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;;


@RestController
public class VersioningPersonController {

    @GetMapping("/v1/person")
    public PersonV1 getFirstVersionOfPerson() {
        return new PersonV1("Bob Charlie");
    }

    @GetMapping("/v2/person")
    public PersonV2 getSecondVersionOfPerson() {
        return new PersonV2("Aman", "Gupta");
    }

    @GetMapping(path = "/person", params = "version=1")
    public PersonV1 getFirstVersionOfPersonRequestParam() {
        return new PersonV1("Bob the king");
    }

    @GetMapping(path = "/person", params = "version=2")
    public PersonV2 getSecondVersionOfPersonRequestParam() {
        return new PersonV2("Aman", "Sharma");
    }

    @GetMapping(path = "/person/header", headers = "X-API-Version=1")
    public PersonV1 getFirstVersionOfPersonRequestHeader() {
        return new PersonV1("Ben charmy");
    }

    @GetMapping(path = "/person/header", headers = "X-API-Version=2")
    public PersonV2 getSecondVersionOfPersonRequestHeader() {
        return new PersonV2("Taunt", "Sharma");
    }

    @GetMapping(path = "/person/accept", produces = "application/vnd.compa.app-v1+json")
    public PersonV1 getFirstVersionOfPersonAcceptHeader() {
        return new PersonV1("Ben fire");
    }

    @GetMapping(path = "/person/accept", produces = "application/vnd.company.app-v2+json")
    public PersonV2 getSecondVersionOfPersonAcceptHeader() {
        return new PersonV2("Fire", "Sharma");
    }
    
}
