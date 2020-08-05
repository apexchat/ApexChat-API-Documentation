# View Leads By Date

GET request that returns a list of leads (newest first) generated on or before a specified date.

## Parameters

### URL

https://api.apexchat.com/Services/ApexChatService.svc/leads/

| Key | Description |
| :-- | :-- |
| limit | The maximum number of leads to return |
| filter | Filters to apply on the data. Setting "createdOn" to the date the lead was generated will return leads created on or before a specific date. See [here](/README.md#Filters) for more information. |

### Headers

Aside from the credentials that have to be included with every API call to ApexChat, there are no additional parameters that need to be included in the headers. 

### Post body

(none)

## Example

### URL

https://api.apexchat.com/Services/ApexChatService.svc/leads/?limit=20&filter=%5B%7B%22propertyName%22:%22createdOn%22,%22propertyValue1%22:%222020-06-24T08:00:00%22,%22propertyValue2%22:%222020-07-27T08:00:00%22,%22comparison%22:0%7D%5D


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
    "data": [
        {
            ...
            "createdOn": "/Date(1595271522423)/",
            ...
            "notes": "Good Morning<br />My name is Sofia<br />My number is 408-555-1212<br />My email is test@example.com",
            ...
            "regionId": null,
            "agentSpecifiedCity": "",
            "agentSpecifiedState": "",
            "agentSpecifiedZip": "",
            "appliedRuleName": null,
            "attemptedCalls": 0,
            "chatId": 1234567,
            "chatKeyFacts": null,
            "companyId": 12345,
            "companyKey": null,
            "companyName": "SomeCompany",
            "completedCalls": 0,
            "countryCode": "US",
            ...
            "email": "test@example.com",
            ...
            "id": 1234567,
            "initiatedBy": 1,
            "initiatedByName": "Bar",
            "ipAddress": "192.0.0.1",
            "isSMS": false,
            ...
            "name": "Reyyan",
            ...
            "phone": "(408) 555-1212",
            ...
            "username": "reyyan",
            "year": 2000
        },
        ...
    ],
    "error": "",
    "isInnerException": false,
    "stackTrace": null,
    "success": true,
    "pageIndex": 0,
    "pageSize": 2,
    "totalSize": 1122
}
```
