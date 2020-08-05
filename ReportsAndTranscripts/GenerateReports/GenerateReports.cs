using System;
using RestSharp;

namespace GenerateReports
{
    class GenerateReports
    {
        static void Main(string[] args)
        {
            var client = new RestClient("https://reports.apexchat.com/Services/ApexChatService.svc/queueduserreports/17687?format=json");
            var request = new RestRequest(Method.GET);
            request.AddHeader("apexchat-company", "CompanyName");
            request.AddHeader("apexchat-username", "Username");
            request.AddHeader("apexchat-password", "Password");
            IRestResponse response = client.Execute(request);
            Console.WriteLine(response.Content);
        }
    }
}
