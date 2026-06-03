package com.anuja.aidevops.ai;
import org.springframework.stereotype.Component;

@Component
public class OpenAIClient {
    public String getResponse(String prompt) {

        // 🔍 Analyzer Agent
        if (prompt.toLowerCase().contains("analyze")) {
            return "NullPointerException detected in service layer due to improper object handling.";
        }

        // 🧠 Root Cause Agent
        if (prompt.toLowerCase().contains("root cause")) {
            return "Object reference is null because it was not initialized before use.";
        }

        // 🛠 Fix Agent
        if (prompt.toLowerCase().contains("fix")) {
            return "Add null checks or initialize the object before accessing it.";
        }

        return "General AI Response: " + prompt;
    }
}
