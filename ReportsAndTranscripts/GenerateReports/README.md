# Generate Reports

GET request that returns a queued report from the database.

## Parameters

### URL

https://reports.apexchat.com/Services/ApexChatService.svc/queueduserreports/{reportID}?format=json

* reportID - the ID of the report.  The URL for the report will be sent to an endpoint specified in the ApexChat portal.

### Headers

Aside from the credentials that have to be included with every API call to ApexChat, there are no additional parameters that need to be included in the headers.

### Post body

(none)

## Example

### URL

https://reports.apexchat.com/Services/ApexChatService.svc/queueduserreports/17687?format=json

### Headers

| Key | Value |
| :-- | :-- |
| apexchat-company | companyname |
| apexchat-username | username |
| apexchat-password | password |

### Post body

(empty)

### Response

``` JSON
{
    "table1": [
        {
            "companyName": "SomeCompany",
            "companyKey": "SomeCompany",
            "leadId": 1506911,
            "chatId": 3142066,
            "hostId": 1,
            "leadName": "Reyyan",
            "leadTypeName": "Sales",
            "leadPhone": "(408) 555-1212",
            "leadEmail": "abc123@gmail.com",
            "leadNotes": "Good Morning\nMy name is Bob\nMy email is abc123@gmail.com\nMy number is 408-555-1212",
            "createdOn": "/Date(1592421187510)/",
            ...
            "keywords": "",
            "firstName": "Reyyan",
            "lastName": "",
            "smsLead": false,
            "exitPopupLead": false,
            "isMobile": false,
            "attemptedCalls": 0,
            "completedCalls": 0,
            "initiatedByName": "Bar",
            "visitorId": 82816007
        },
        {
            "companyName": "SomeCompany",
            "companyKey": "SomeCompany",
            "leadId": 1506912,
            "chatId": 3142201,
            "hostId": 1,
            "leadName": "Reyyan",
            "leadTypeName": "Sales",
            "leadPhone": "(408) 555-1212",
            "leadEmail": "test@example.com",
            "leadNotes": "Good Morning\nMy name is Bob\nMy number is 408-555-1212\nMy email is test@example.com",
            "createdOn": "/Date(1592503735050)/",
            ...
            "keywords": "",
            "firstName": "Reyyan",
            "lastName": "",
            "smsLead": false,
            "exitPopupLead": false,
            "isMobile": false,
            "attemptedCalls": 0,
            "completedCalls": 0,
            "initiatedByName": "Bar",
            "visitorId": 82816160
        },
        {
            "companyName": "SomeCompany",
            "companyKey": "SomeCompany",
            "leadId": 1506913,
            "chatId": 3142212,
            "hostId": 1,
            "leadName": "Reyyan",
            "leadTypeName": "Sales",
            "leadPhone": "(408) 555-1212",
            "leadEmail": "test@example.com",
            "leadNotes": "Good Morning\nMy name is Bob\nMy number is 408-555-1212\nMy email is test@example.com",
            "createdOn": "/Date(1592508613200)/",
            ...
            "keywords": "",
            "firstName": "Reyyan",
            "lastName": "",
            "smsLead": false,
            "exitPopupLead": false,
            "isMobile": false,
            "attemptedCalls": 0,
            "completedCalls": 0,
            "initiatedByName": "Bar",
            "visitorId": 82816173
        },
        {
            "companyName": "SomeCompany",
            "companyKey": "SomeCompany",
            "leadId": 1506914,
            "chatId": 3142223,
            "hostId": 1,
            "leadName": "Reyyan",
            "leadTypeName": "Sales",
            "leadPhone": "(408) 555-1212",
            "leadEmail": "test@example.com",
            "leadNotes": "Good Morning\nMy name is Bob\nMy number is 408-555-1212\nMy email is test@example.com",
            "createdOn": "/Date(1592509616317)/",
            ...
            "keywords": "",
            "firstName": "Reyyan",
            "lastName": "",
            "smsLead": false,
            "exitPopupLead": false,
            "isMobile": false,
            "attemptedCalls": 0,
            "completedCalls": 0,
            "initiatedByName": "Bar",
            "visitorId": 82816184
        },
        {
            "companyName": "SomeCompany",
            "companyKey": "SomeCompany",
            "leadId": 1506915,
            "chatId": 3142294,
            "hostId": 1,
            "leadName": "Reyyan",
            "leadTypeName": "Sales",
            "leadPhone": "(408) 555-1212",
            "leadEmail": "test@example.com",
            "leadNotes": "Good Morning\nMy name is Bob\nMy number is 408-555-1212\nMy email is test@example.com",
            "createdOn": "/Date(1592764264590)/",
            ...
            "keywords": "",
            "firstName": "Reyyan",
            "lastName": "",
            "smsLead": false,
            "exitPopupLead": false,
            "isMobile": false,
            "attemptedCalls": 0,
            "completedCalls": 0,
            "initiatedByName": "Bar",
            "visitorId": 82816268
        }
    ]
}
```
