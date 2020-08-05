# List Companies

GET request that returns a list of companies and their associated data.

## Parameters

### URL

https://api.apexchat.com/Services/ApexChatService.svc/companies/

| Key | Description |
| :-- | :-- |
| start | The starting value for the paginated results |
| limit | The maximum number of companies to return |
| filter | Filters to apply on the data. See [here](/README.md#Filters) for more information. |

### Headers

Aside from the credentials that have to be included with every API call to ApexChat, there are no additional parameters that need to be included in the headers.

### Post body

(none)

## Example

### URL

https://api.apexchat.com/Services/ApexChatService.svc/companies/?start=0&limit=5

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
            "address": "123 Elm Street",
            ...
            "city": "Beverly Hills",
            ...
            "companyKey": "a1test",
            ...
            "companyName": "SomeCompany",
            "companyNameKey": "SomeCompany",
            ...
            "country": "United States",
            ...
            "createdOn": "/Date(1296779665067)/",
            ...
            "state": "California",
            ...
            "zip": "90210"
        },
        ...
    ],
    "error": "",
    "isInnerException": false,
    "stackTrace": null,
    "success": true,
    "pageIndex": 0,
    "pageSize": 5,
    "totalSize": 7694
}
```
