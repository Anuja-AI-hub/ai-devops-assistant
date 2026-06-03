package com.anuja.aidevops.controller;

import com.anuja.aidevops.model.AIResponse;
import com.anuja.aidevops.service.AIService;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/api/ai")
public class AIController {

    private final AIService service;

    public AIController(AIService service) {
        this.service = service;
    }

    // ✅ Home endpoint
    @GetMapping("/")
    public Map<String, String> home() {
        return Map.of(
                "status", "UP",
                "service", "AI DevOps Assistant",
                "message", "Use POST /api/ai/analyze-log"
        );
    }

    // 🔍 POST API (REAL USE)
    @PostMapping("/analyze-log")
    public AIResponse analyze(@RequestBody String log) {
        return service.analyzeLog(log);
    }

    // 🌐 GET API (FOR BROWSER TESTING)
    @GetMapping("/analyze-log")
    public AIResponse analyzeFromBrowser(@RequestParam(defaultValue = "NullPointerException at UserService.java:45") String log) {
        return service.analyzeLog(log);
    }
}