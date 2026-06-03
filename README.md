# 🚀 AI DevOps Assistant

An AI-powered backend system that analyzes application logs and suggests fixes using a multi-agent workflow.
## 🌐 Live Demo

https://ai-devops-assistant-jjzj.onrender.com

### Health Check

https://ai-devops-assistant-jjzj.onrender.com/api/ai/

## 🔥 Features

- Log analysis using AI simulation
- Multi-agent workflow (Analysis → Root Cause → Fix)
- REST API integration
- Backend built with Spring Boot

---

## 🧠 AI Architecture

This project uses a **multi-agent approach**:

- 🔍 Analyzer Agent → Detects issue
- 🧠 Root Cause Agent → Finds problem
- 🛠 Fix Agent → Suggests solution

---

## 🏗️ Architecture

Client → Controller → Service → AI Client

---

## 📌 API Endpoints

### 1. Analyze Logs

POST `/api/ai/analyze-log`

#### Input:
```
NullPointerException at UserService.java:45
```
#### Response (JSON):
```
{
  "analysis": "NullPointerException detected in service layer due to improper object handling.",
  "rootCause": "Object reference is null because it was not initialized before use.",
  "fix": "Add null checks or initialize the object before accessing it."
}
```
