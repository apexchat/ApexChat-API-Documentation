<?php
$url = 'https://api.apexchat.com/Services/ApexChatService.svc/companies/{companyID}';
$data = array(
    "address" => "123 Elm Street",
    "zip" => "12345"
);
$headers = array(
    'Content-type: application/json',
    'apexchat-company: CompanyName',
    'apexchat-username: Username',
    'apexchat-password: Password'
);
$options = array(
    'http' => array(
        'header'  => $headers,
        'method'  => 'POST',
        'content' => json_encode($data),
    ),
);
$context  = stream_context_create($options);
$result = file_get_contents($url, false, $context);
echo $result;
?>