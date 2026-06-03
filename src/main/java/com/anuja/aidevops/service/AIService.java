package com.anuja.aidevops.service;

import com.anuja.aidevops.model.AIResponse;
import org.springframework.stereotype.Service;

@Service
public class AIService {

    // 🔍 Main method used by Controller
    public AIResponse analyzeLog(String log) {

        // 👉 Simple mock AI logic (for now)
        if (log == null || log.isEmpty()) {
            return new AIResponse(
                    "No log provided",
                    "Input log is empty",
                    "Provide a valid error log"
            );
        }

        if (log.contains("NullPointerException")) {
            return new AIResponse(
                    "NullPointerException detected in service layer due to improper object handling.",
                    "Object reference is null because it was not initialized before use.",
                    "Add null checks or initialize the object before accessing it."
            );
        }

        if (log.contains("IndexOutOfBoundsException")) {
            return new AIResponse(
                    "IndexOutOfBoundsException detected.",
                    "Index accessed is outside the valid range of the collection.",
                    "Ensure index is within bounds before accessing elements."
            );
        }

        // 🔁 Default response
        return new AIResponse(
                "Unknown issue detected.",
                "Unable to determine exact root cause.",
                "Check logs manually or improve log details."
        );
    }
}