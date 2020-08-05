# Managing Leads

| Description | Method | URL | Post Body Parameters
| :-- | :-- | :-- | :--
| [View most recent leads](/ManagingLeads/ViewMostRecentLeads) ([by date](/ManagingLeads/ViewMostRecentLeads/ViewLeadsByDate)) | GET | /leads/?start={start}&limit={limit} | <ul><li>start - the starting value for the paginated results</li><li>limit - the number of records to return</li><li>filter - any filters to apply on the data. See [here](/README.md#Filters) for more information.</li></ul>
| [View a summary of all leads](/ReportsAndTranscripts/GenerateReports) | GET | Sample URL: https://reports.apexchat.com/Services/DefaultService.svc/queueduserreports/23709?format=json | All parameters will be set up in the portal.  See [here](/ReportsAndTranscripts#How-to-Get-the-URL-for-Reports) for more information.
| [View billable leads](/ReportsAndTranscripts/GenerateReports) | GET | Sample URL: https://reports.apexchat.com/Services/DefaultService.svc/queueduserreports/23709?format=json | All parameters will be set up in the portal.  See [here](/ReportsAndTranscripts#How-to-Get-the-URL-for-Reports) for more information.
| [View details for a specific lead](/ManagingLeads/ViewASpecificLead) | GET | /leads/{leadId} | <ul><li>leadId - the ID of the lead to see details for</li></ul>

Lead summary reports contain data in JSON format:

``` json
{
    "categoryId": null,
    "createdOn": "/Date(1593625249880)/",
    "leadChangeReason": null,
    "leadType": 3,
    "notes": "Hello, thanks for contacting Arif Inc. My name is Arif Imran, may I have your name?\nKitbe\n12\narif@arif.com\n222-333-4444\n Notes: Jdjd",
    "processedByCustomer": false,
    "regionId": null,
    "agentSpecifiedCity": "",
    "agentSpecifiedState": "",
    "agentSpecifiedZip": "",
    "appliedRuleName": null,
    "attemptedCalls": 0,
    "chatId": 3142922,
    "chatKeyFacts": null,
    "companyId": 13788,
    "companyKey": "arif2",
    "companyName": "Arif",
    "completedCalls": 0,
    "countryCode": null,
    "dealershipDepartment": null,
    "dealershipDepartmentName": "",
    "denied": false,
    "deniedDate": null,
    "domain": "",
    "email": "arif@arif.com",
    "emailSentTimestamp": "/Date(1593625249873)/",
    "enableLeadReferral": false,
    "groupName": null,
    "hasKeyfacts": false,
    "hostName": "ApexChat",
    "id": 1506928,
    "initiatedBy": 5,
    "initiatedByName": "Standard",
    "ipAddress": "203.101.160.139",
    "isSMS": false,
    "keyfactQuestions": null,
    "keywords": "",
    "leadCategoryName": null,
    "make": "",
    "metaData": null,
    "model": "",
    "name": "adi",
    "notificationError": "",
    "notificationState": 3,
    "phone": "222-333-4444",
    "piplSearchId": null,
    "referralAccepted": false,
    "referralApplicationFee": 0,
    "referralCost": 0,
    "referred": false,
    "referredDate": null,
    "referredTo": null,
    "regionName": null,
    "requestedLeadType": null,
    "sentBy": 1748,
    "specialInstructions": "",
    "stripeChargeId": null,
    "transcript": null,
    "used": false,
    "username": "arif",
    "year": 0
}
```