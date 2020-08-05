# Generate Transcripts

GET request that returns transcripts for a chat ID.

## Parameters

### URL

https://reports.apexchat.com/Services/reports/transcripts/detail/{chatID}?format=json

* chatID - the ID of the chat session.

### Headers

Aside from the credentials that have to be included with every API call to ApexChat, there are no additional parameters that need to be included in the headers.

### Post body

(none)

## Example

### URL

https://reports.apexchat.com/Services/ApexChatService.svc/reports/transcripts/detail/3030918

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
            "agentScriptOption": null,
            "chatId": 3030918,
            "createdOn": "/Date(1517054420583)/",
            "id": 36896607,
            "isChatEnded": false,
            "isFromPreChat": false,
            "isGreeting": false,
            "isNextQuestionMapped": false,
            "isTranslating": false,
            "isUnread": null,
            "maskedText": null,
            "messageSequence": null,
            "options": null,
            "originalText": null,
            "originalTextLanguage": null,
            "participantDisplayName": "Danielle",
            "participantId": 8845913,
            "questionType": 0,
            "questionTypeChatLogIdToBeUpdated": null,
            "questionTypeDelaySeconds": 0,
            "questionTypeDisplayListForVisitor": false,
            "questionTypeResponseChatLogId": null,
            "randomNumber": null,
            "scriptAnswerId": 0,
            "shouldMessageHideFromVisitor": false,
            "systemMessageType": null,
            "text": "Hello, thanks for contacting khurramarts ltd. My name is Danielle, may I have your name?",
            "translatedText": null,
            "translatedTextLanguage": null,
            "userId": 2147483647,
            "virtualAssistantReference": null,
            "virtualAssistantStatus": 0,
            "visitorResponseStatus": 0,
            "visitorResponseType": 0,
            "visitorSelectedOptions": null
        },
        {
            "agentScriptOption": null,
            "chatId": 3030918,
            "createdOn": "/Date(1517054482487)/",
            "id": 36896608,
            "isChatEnded": false,
            "isFromPreChat": false,
            "isGreeting": false,
            "isNextQuestionMapped": false,
            "isTranslating": false,
            "isUnread": null,
            "maskedText": null,
            "messageSequence": null,
            "options": null,
            "originalText": null,
            "originalTextLanguage": null,
            "participantDisplayName": "Danielle",
            "participantId": 2147483647,
            "questionType": 0,
            "questionTypeChatLogIdToBeUpdated": null,
            "questionTypeDelaySeconds": 0,
            "questionTypeDisplayListForVisitor": false,
            "questionTypeResponseChatLogId": null,
            "randomNumber": null,
            "scriptAnswerId": 0,
            "shouldMessageHideFromVisitor": false,
            "systemMessageType": null,
            "text": "Are you still there?",
            "translatedText": null,
            "translatedTextLanguage": null,
            "userId": 2147483647,
            "virtualAssistantReference": null,
            "virtualAssistantStatus": 0,
            "visitorResponseStatus": 0,
            "visitorResponseType": 0,
            "visitorSelectedOptions": null
        },
        {
            "agentScriptOption": null,
            "chatId": 3030918,
            "createdOn": "/Date(1517054632963)/",
            "id": 36896609,
            "isChatEnded": false,
            "isFromPreChat": false,
            "isGreeting": false,
            "isNextQuestionMapped": false,
            "isTranslating": false,
            "isUnread": null,
            "maskedText": null,
            "messageSequence": null,
            "options": null,
            "originalText": null,
            "originalTextLanguage": null,
            "participantDisplayName": "Danielle",
            "participantId": 2147483647,
            "questionType": 0,
            "questionTypeChatLogIdToBeUpdated": null,
            "questionTypeDelaySeconds": 0,
            "questionTypeDisplayListForVisitor": false,
            "questionTypeResponseChatLogId": null,
            "randomNumber": null,
            "scriptAnswerId": 0,
            "shouldMessageHideFromVisitor": false,
            "systemMessageType": null,
            "text": "Hello?",
            "translatedText": null,
            "translatedTextLanguage": null,
            "userId": 2147483647,
            "virtualAssistantReference": null,
            "virtualAssistantStatus": 0,
            "visitorResponseStatus": 0,
            "visitorResponseType": 0,
            "visitorSelectedOptions": null
        },
        {
            "agentScriptOption": null,
            "chatId": 3030918,
            "createdOn": "/Date(1517054813973)/",
            "id": 36896610,
            "isChatEnded": false,
            "isFromPreChat": false,
            "isGreeting": false,
            "isNextQuestionMapped": false,
            "isTranslating": false,
            "isUnread": null,
            "maskedText": null,
            "messageSequence": null,
            "options": null,
            "originalText": null,
            "originalTextLanguage": null,
            "participantDisplayName": "Danielle",
            "participantId": 2147483647,
            "questionType": 0,
            "questionTypeChatLogIdToBeUpdated": null,
            "questionTypeDelaySeconds": 0,
            "questionTypeDisplayListForVisitor": false,
            "questionTypeResponseChatLogId": null,
            "randomNumber": null,
            "scriptAnswerId": 0,
            "shouldMessageHideFromVisitor": false,
            "systemMessageType": null,
            "text": "Can I help you?",
            "translatedText": null,
            "translatedTextLanguage": null,
            "userId": 2147483647,
            "virtualAssistantReference": null,
            "virtualAssistantStatus": 0,
            "visitorResponseStatus": 0,
            "visitorResponseType": 0,
            "visitorSelectedOptions": null
        },
        {
            "agentScriptOption": null,
            "chatId": 3030918,
            "createdOn": "/Date(1517270411800)/",
            "id": 36896782,
            "isChatEnded": false,
            "isFromPreChat": false,
            "isGreeting": false,
            "isNextQuestionMapped": false,
            "isTranslating": false,
            "isUnread": null,
            "maskedText": null,
            "messageSequence": null,
            "options": null,
            "originalText": null,
            "originalTextLanguage": null,
            "participantDisplayName": "System",
            "participantId": -1,
            "questionType": 0,
            "questionTypeChatLogIdToBeUpdated": null,
            "questionTypeDelaySeconds": 0,
            "questionTypeDisplayListForVisitor": false,
            "questionTypeResponseChatLogId": null,
            "randomNumber": null,
            "scriptAnswerId": 0,
            "shouldMessageHideFromVisitor": false,
            "systemMessageType": null,
            "text": "This chatroom has been closed due to inactivity.",
            "translatedText": null,
            "translatedTextLanguage": null,
            "userId": -1,
            "virtualAssistantReference": null,
            "virtualAssistantStatus": 0,
            "visitorResponseStatus": 0,
            "visitorResponseType": 0,
            "visitorSelectedOptions": null
        }
    ],
    "error": "",
    "isInnerException": false,
    "stackTrace": null,
    "success": true
}
```
