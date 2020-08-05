# Updating a Company

POST request that updates information about a company.

## Parameters

### URL

https://api.apexchat.com/Services/ApexChatService.svc/companies/{companyID}

* companyID - the ID of the company to update.  Not to be confused by the company key.

### Headers

Aside from the credentials that have to be included with every API call to ApexChat, there are no additional parameters that need to be included in the headers.

### Post body

The Post body must be a JSON-formatted string that contains the keys and values of the data to update for the company.

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

``` JSON
{
    "address": "123 Nice Street",
    "zip": "12345"
}
```

### Response

``` JSON
{
    "data": {
        ...
        "address": "123 Nice Street",
        ...
        "id": 1234,
        ...
        "zip": "12345"
    },
    "error": "",
    "isInnerException": false,
    "stackTrace": null,
    "success": true
}
```
