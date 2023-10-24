# TicketSystem
Simple Spring Boot Rest API for TicketSystem. 
Run app from the main class `TicketSystemApplication.java`. App local port is 8080.

## API
### Create Ticket
`POST /api/tickets`
```json
{
    "title": "Ticket title",
    "description": "Ticket description",
    "status": "OPEN",
    "priority": "HIGH",
    "assignee": "John Doe"
}
```
### Get Current Ticket
`GET /api/tickets/current`

### Delete Current Ticket
`DELETE /api/tickets/current`