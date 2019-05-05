package pl.patryk.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pl.patryk.demo.model.Champions;
import pl.patryk.demo.service.ChampionsRepo;


/**
 * Projektowanie API:
 * https://pages.apigee.com/rs/apigee/images/api-design-ebook-2012-03.pdf
 */

@RestController
@CrossOrigin
public class AppController {

    @Autowired
    ChampionsRepo championsRepo;

    @GetMapping(value = "/status")
    public String showStatus() {
        return "App running OK";
    }



    @GetMapping("/champions")
    public Iterable<Champions> getAllChampions() {
        return championsRepo.findAll();
    }

    @PostMapping("/champions")
    public Champions addChampions(@RequestBody Champions champion) {
        return championsRepo.save(champion);
    }




    }
