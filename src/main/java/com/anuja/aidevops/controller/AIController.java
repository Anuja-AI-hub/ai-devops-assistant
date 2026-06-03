package com.anuja.aidevops.controller;
import com.anuja.aidevops.service.AIService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/ai")
public class AIController {
    private final AIService service;

    public AIController(AIService service) {
        this.service = service;
    }

    @PostMapping("/analyze-log")
    public String analyze(@RequestBody String log) {
        return service.analyzeLog(log);
    }
}
