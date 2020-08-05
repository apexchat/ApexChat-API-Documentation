# ApexChat API Documentation

Revision 4

## Contents

* [Introduction](#Introduction)
    * [Request](#Request)
    * [Response](#Response)
    * [Dates](#Dates)
    * [Authentication and Authorization](#Authentication-and-Authorization)
        * [Authentication](#Authentication)
        * [Authorization](#Authorization)
    * [Filters](#Filters)
* [Examples](#Examples)
    * [Managing Companies](/ManagingCompanies)
        * [Creating a Company](/ManagingCompanies/CreatingACompany)
        * [List Companies](/ManagingCompanies/ListCompanies)
        * [Loading a Company By Company ID](/ManagingCompanies/LoadingACompanyWithACompanyID)
        * [Updating a Company](/ManagingCompanies/UpdatingACompany)
    * [Managing Leads](/ManagingLeads)
        * [View a Specific Lead](/ManagingLeads/ViewASpecificLead)
        * [View Most Recent Leads](/ManagingLeads/ViewMostRecentLeads)
            * [View Leads by Date](/ManagingLeads/ViewMostRecentLeads/ViewLeadsByDate)
    * [Reports and Transcripts](/ReportsAndTranscripts)
        * [Generate Reports](/ReportsAndTranscripts/GenerateReports)
        * [Generate Transcripts](/ReportsAndTranscripts/GenerateTranscripts)

## Introduction

### Request

Requests to ApexChat are simply GET and POST requests.

A valid "Content Type" header is required for all POST requests.  Setting this value to "text" or "json" is all that is necessary but must exist for POST requests to function correctly.

All URLs are assumed to start with the base URL https://api.apexchat.com/Services/ApexChatService.svc.  To avoid caching for a get request, add the "_nocache" parameter to your request.

### Response

Responses from ApexChat are JSON-encoded strings. Each response will have the following elements:

1. A "success" property, indicating if the request was successful
2. An "error" property, indicating the error, if the request was unsuccessful
3. A "data" property, containing the actual contents of the response

Additionally, if the request is for paginated data, the response will contain:

1. A "totalSize" property, indicating the total number of (un-paged) records
2. A "pageIndex" property, indicating the current page returned (0-based)
3. A "pageSize" property, indicating the maximum number of records that could be returned (note that this does not necessarily correspond to the actual number of records returned, for example it could have a value of "2" when returning the last 2 records on the last page of a group of records)

### Dates

Dates returned from the server are formatted in Microsoft standard formatting for JSON dates:

`\/Date(1293812894410)\/`

All dates returned by the server are in Coordinated Universal Time (UTC).

When making any POST requests, dates should be formatted using the Microsoft format for JSON dates.

### Authentication and Authorization

#### Authentication

Authentication is performed using standard HTTPS headers.  Use your login credentials when logging in.  The headers that need to be set for each request are:

* apexchat-company
* apexchat-username
* apexchat-password

These headers must be sent with **every** request that uses the API.

**It is recommended to use HTTPS instead of HTTP as your credentials will be sent in plaintext to the API server.**

#### Authorization

If you attempt to set a property that you do not have permission to change, the incoming property will be ignored and the rest of the request will be processed as much as possible based on your permissions.

### Filters

The filter parameter may be passed along with the API call to restrict the data being returned based on any fields.

The following two APIs listed in this document can be used with the filter parameter:

* /leads/?start={start}&limit={limit}
* /companies/?start={start}&limit={limit}

The "filter" parameter is an array of JSON serialized objects. Currently, we only support combining those
filters with an "And" statement. Hence, you can pass multiple filters, and they'll restrict the data further.

The "comparison" options are (starting with 0):

0. Equals
1. NotEquals
2. Like
3. NotLike
4. GreaterThan
5. GreaterOrEquals
6. LessThan
7. LessOrEquals

The URL would look similar to this to get the leads data between 24 June 2020 (2020-06-24) and 27 July 2020 (2020-07-27):  https://api.apexchat.com/Services/ApexChatService.svc/leads/?limit=20&filter=%5B%7B%22propertyName%22:%22createdOn%22,%22propertyValue1%22:%222020-06-24T08:00:00%22,%22propertyValue2%22:%222020-07-27T08:00:00%22,%22comparison%22:0%7D%5D

For getting data on companies located in Australia, the URL would look similar to this: https://api.apexchat.com/Services/ApexChatService.svc/companies/?limit=20&filter=%5B%7B%22propertyName%22:%22country%22,%22propertyValue1%22:%22Australia%22,%22propertyValue2%22:%22%22,%22comparison%22:%220%22%7D%5D

## Examples

Examples are available in Java, PHP, and C#.  For Java and C#, you will need to add the Unirest and RestSharp packages to your project's build path, respectively.  For Java projects, you will need to install Unirest (which you can download [here](https://jar-download.com/artifacts/com.mashape.unirest/unirest-java)) and add it to your project's build path in an IDE such as Eclipse or IntelliJ.  For C#, you will need to run `dotnet add package RestSharp` from the command line in your project's folder.

* [Managing Companies](/ManagingCompanies)
    * [Creating a Company](/ManagingCompanies/CreatingACompany)
    * [List Companies](/ManagingCompanies/ListCompanies)
    * [Loading a Company By Company ID](/ManagingCompanies/LoadingACompanyWithACompanyID)
    * [Updating a Company](/ManagingCompanies/UpdatingACompany)
* [Managing Leads](/ManagingLeads)
    * [View a Specific Lead](/ManagingLeads/ViewASpecificLead)
    * [View Most Recent Leads](/ManagingLeads/ViewMostRecentLeads)
        * [View Leads by Date](/ManagingLeads/ViewMostRecentLeads/ViewLeadsByDate)
* [Reports and Transcripts](/ReportsAndTranscripts)
    * [Generate Reports](/ReportsAndTranscripts/GenerateReports)
    * [Generate Transcripts](/ReportsAndTranscripts/GenerateTranscripts)
