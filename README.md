# WhatsApp Chatbot Backend Simulation

## 📌 Project Overview
This project is a simple WhatsApp chatbot backend simulation built using Java and Spring Boot.  
It receives messages via a REST API and responds with predefined replies.

---

## 🚀 Features
- REST API endpoint: `/webhook`
- Accepts JSON input
- Returns predefined responses:
  - "Hi" → "Hello"
  - "Bye" → "Goodbye"
- Logs all incoming messages

---

## 🛠️ Tech Stack
- Java
- Spring Boot
- Maven

---

## 📮 API Endpoint

**POST** `/webhook`

### Request:
```json
{
  "message": "Hi"
}
### Response:
{
  "reply": "Hello"
}
