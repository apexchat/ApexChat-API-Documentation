# Creating a Company

POST request that creates a new company.

## Parameters

### URL

https://api.apexchat.com/Services/ApexChatService.svc/companies/create

### Headers

Aside from the credentials that have to be included with every API call to ApexChat, there are no additional parameters that need to be included in the headers.

### Post body

The Post body must be a JSON-formatted string that contains the keys and values of the data for the new company.  **Remember that you must specify the company key.**

## Example

### URL

https://api.apexchat.com/Services/ApexChatService.svc/companies/create

### Headers

| Key | Value |
| :-- | :-- |
| apexchat-company | companyname |
| apexchat-username | username |
| apexchat-password | password |

### Post body

``` JSON
{
    "companyName": "New Company",
    "officeHoursTimeZone": "Mountain Standard Time",
    "companyKey": "NewCompany",
    "address": "123 Elm Street",
    "hostId": "2",
    "city": "Vancouver",
    "state": "British Columbia",
    "country": "Canada",
    "zip": "V6C1H2",
    "logLevel": "3",
    "chatMode": "1",
    "chatTheme": "8",
    "invitationDisplayMode": "1"
}
```

### Response

``` JSON
{
    "data": {
        ...
        "address": "123 Elm Street",
        ...
        "city": "Vancouver",
        ...
        "companyKey": "NewCompany",
        ...
        "companyName": "New Company",
        "companyNameKey": "New Company (NewCompany)",
        ...
        "country": "Canada",
        ...
        "createdBy": "user",
        "createdBySelfServe": false,
        "createdOn": "/Date(1595449892977)/",
        ...
        "state": "British Columbia",
        ...
        "zip": "V6C1H2"
    },
    "error": "",
    "isInnerException": false,
    "stackTrace": null,
    "success": true
}
```
