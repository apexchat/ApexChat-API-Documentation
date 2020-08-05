<?php
$url = 'https://api.apexchat.com/Services/ApexChatService.svc/leads/?limit=20&filter=%5B%7B%22propertyName%22:%22createdOn%22,%22propertyValue1%22:%222020-06-24T08:00:00%22,%22propertyValue2%22:%222020-07-27T08:00:00%22,%22comparison%22:0%7D%5D';
$headers = array(
    'Content-type: application/json',
    'apexchat-company: CompanyName',
    'apexchat-username: Username',
    'apexchat-password: Password'
);
$options = array(
    'http' => array(
        'header'  => $headers,
        'method'  => 'GET'
    ),
);
$context  = stream_context_create($options);
$result = file_get_contents($url, false, $context);
echo $result;
?>