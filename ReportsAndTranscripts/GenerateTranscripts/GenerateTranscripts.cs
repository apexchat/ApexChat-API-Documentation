using System;
using RestSharp;

namespace GenerateTranscripts
{
    class GenerateTranscripts
    {
        static void Main(string[] args)
        {
            var client = new RestClient("https://reports.apexchat.com/Services/ApexChatService.svc/reports/transcripts/detail/3030918");
            var request = new RestRequest(Method.GET);
            request.AddHeader("apexchat-company", "CompanyName");
            request.AddHeader("apexchat-username", "Username");
            request.AddHeader("apexchat-password", "Password");
            IRestResponse response = client.Execute(request);
            Console.WriteLine(response.Content);
        }
    }
}
