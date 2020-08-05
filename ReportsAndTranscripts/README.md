# Reports and Transcripts

## How to Get the URL for Reports

In the Portal, "Reporting" area, open the report which you want to be notified about. Simply plug in the URL at which you wish to be notified (use the Notification Endpoint field). This URL will be hit with a GET request with a "jsonUrl" parameter. You will need to make a GET request to that URL for accessing the report as a JSON object which you can process into your system however you want. "xlsxUrl" and "csvUrl" are also available.

The following type of reports can be queued from the portal:

* Billable leads reports
* Transcript reports
* Traffic reports summarized by day
* Traffic reports summarized by company

## Viewing Traffic

| Description | Method | URL | Post Body Parameters
| :-- | :-- | :-- | :--
| [View traffic summarized by company](/ReportsAndTranscripts/GenerateReports) | GET | Sample URL: https://reports.apexchat.com/Services/DefaultService.svc/queueduserreports/23709?format=json | All parameters will be set up in the portal.
| [View traffic summarized by day](/ReportsAndTranscripts/GenerateReports) | GET | Sample URL: https://reports.apexchat.com/Services/DefaultService.svc/queueduserreports/23709?format=json | All parameters will be set up in the portal.

## Viewing Transcripts

| Description | Method | URL | Parameters
| :-- | :-- | :-- | :--
| [View transcript for past chats](/ReportsAndTranscripts/GenerateReports) | GET | Sample URL: https://reports.apexchat.com/Services/DefaultService.svc/queueduserreports/23709?format=json | All parameters will be set up in the portal.
| [View transcript details - gets the full transcript for a specific chat](/ReportsAndTranscripts/GenerateTranscripts) | GET | /reports/transcripts/detail/{chatId} | chatId - the ID of the chat to have details about
