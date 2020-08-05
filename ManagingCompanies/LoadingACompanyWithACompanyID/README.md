# Loading a Company With a Company ID

GET request that returns information about a company given its company ID.

## Parameters

### URL

https://api.apexchat.com/Services/ApexChatService.svc/companies/{companyID}

* companyID - the ID of the company to load.  Not to be confused by the company key.

### Headers

Aside from the credentials that have to be included with every API call to ApexChat, there are no additional parameters that need to be included in the headers.

### Post body

(none)

## Example

### URL

https://api.apexchat.com/Services/ApexChatService.svc/companies/1234

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
    "data": {
        ...
        "address": "123 Elm Street",
        ...
        "city": "Toronto",
        ...
        "companyKey": "SomeCompany",
        ...
        "companyName": "SomeCompany",
        "companyNameKey": "SomeCompany (SomeCompany)",
        ...
        "country": "Canada",
        ...
        "id": 1234,
        ...
        "primaryContactEmail": "someone@example.com",
        ...
        "state": "Ontario",
        ...
        "zip": "12345"
    },
    "error": "",
    "isInnerException": false,
    "stackTrace": null,
    "success": true
}
```
