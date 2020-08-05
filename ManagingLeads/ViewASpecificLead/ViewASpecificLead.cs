using System;
using RestSharp;

namespace ViewASpecificLead
{
    class ViewASpecificLead
    {
        static void Main(string[] args)
        {
            var client = new RestClient("https://api.apexchat.com/Services/ApexChatService.svc/leads/{LeadID}");
            var request = new RestRequest(Method.GET);
            request.AddHeader("apexchat-company", "CompanyName");
            request.AddHeader("apexchat-username", "Username");
            request.AddHeader("apexchat-password", "Password");
            IRestResponse response = client.Execute(request);
            Console.WriteLine(response.Content);
        }
    }
}
