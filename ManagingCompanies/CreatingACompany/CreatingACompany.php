<?php
$url = 'https://api.apexchat.com/Services/ApexChatService.svc/companies/create';
$data = array(
    "companyName" => "New Company",
    "officeHoursTimeZone" => "Mountain Standard Time",
    "companyKey" => "NewCompany",
    "address" => "123 Elm Street",
    "hostId" => "2",
    "city" => "Vancouver",
    "state" => "British Columbia",
    "country" => "Canada",
    "zip" => "V6C1H2",
    "logLevel" => "3",
    "chatMode" => "1",
    "chatTheme" => "8",
    "invitationDisplayMode" => "1"
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