using System;
using RestSharp;

namespace CreatingACompany
{
    class CreatingACompany
    {
        static void Main(string[] args)
        {
            var client = new RestClient("https://api.apexchat.com/Services/ApexChatService.svc/companies/create");
            var request = new RestRequest(Method.POST);
            request.AddHeader("apexchat-company", "CompanyName");
            request.AddHeader("apexchat-username", "Username");
            request.AddHeader("apexchat-password", "Password");
            request.AddHeader("Content-Type", "application/json");
            request.AddParameter("application/json", "{\r\n    \"companyName\": \"New Company\",\r\n    \"officeHoursTimeZone\": \"Mountain Standard Time\",\r\n    \"companyKey\": \"NewCompany\",\r\n    \"address\": \"123 Elm Street\",\r\n    \"hostId\": \"2\",\r\n    \"city\": \"Vancouver\",\r\n    \"state\": \"British Columbia\",\r\n    \"country\": \"Canada\",\r\n    \"zip\": \"V6C1H2\",\r\n    \"logLevel\": \"3\",\r\n    \"chatMode\": \"1\",\r\n    \"chatTheme\": \"8\",\r\n    \"invitationDisplayMode\": \"1\"\r\n}", ParameterType.RequestBody);
            IRestResponse response = client.Execute(request);
            Console.WriteLine(response.Content);
        }
    }
}
