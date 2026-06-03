package com.anuja.aidevops.model;

public class AIResponse {
    private String analysis;
    private String rootCause;
    private String fix;

    public AIResponse(String analysis, String rootCause, String fix) {
        this.analysis = analysis;
        this.rootCause = rootCause;
        this.fix = fix;
    }

    public String getAnalysis() {
        return analysis;
    }

    public String getRootCause() {
        return rootCause;
    }

    public String getFix() {
        return fix;
    }
}
