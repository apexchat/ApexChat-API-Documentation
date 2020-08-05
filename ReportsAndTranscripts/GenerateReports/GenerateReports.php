<?php
$url = "https://reports.apexchat.com/Services/ApexChatService.svc/queueduserreports/17687?format=json";
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