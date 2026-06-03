package com.anuja.aidevops.service;
import com.anuja.aidevops.ai.OpenAIClient;
import org.springframework.stereotype.Service;

@Service

public class AIService {
    private final OpenAIClient client;

    public AIService(OpenAIClient client) {
        this.client = client;
    }

    public String analyzeLog(String log) {

        // Step 1: Analyze
        String analysis = client.getResponse("Analyze this error: " + log);

        // Step 2: Root Cause
        String rootCause = client.getResponse("Find root cause: " + analysis);

        // Step 3: Fix
        String fix = client.getResponse("Suggest fix: " + rootCause);

        // Step 4: Final Response
        return "🔍 Analysis:\n" + analysis +
                "\n\n🧠 Root Cause:\n" + rootCause +
                "\n\n🛠 Fix:\n" + fix;
    }
}
