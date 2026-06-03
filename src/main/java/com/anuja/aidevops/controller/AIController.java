package com.anuja.aidevops.controller;

import com.anuja.aidevops.model.AIResponse;
import com.anuja.aidevops.service.AIService;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/api/ai")
public class AIController {

    private final AIService service;

    // ✅ Constructor Injection
    public AIController(AIService service) {
        this.service = service;
    }

    // ✅ Home endpoint (fixes Whitelabel error)
    @GetMapping("/")
    public Map<String, String> home() {
        return Map.of(
                "status", "UP",
                "service", "AI DevOps Assistant",
                "message", "Use POST /api/ai/analyze-log"
        );
    }

    // 🔍 Analyze Logs API
    @PostMapping("/analyze-log")
    public AIResponse analyze(@RequestBody String log) {
        return service.analyzeLog(log);
    }
}