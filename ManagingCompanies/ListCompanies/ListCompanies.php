<?php
$url = 'https://api.apexchat.com/Services/ApexChatService.svc/companies/?start=0&limit=5';
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