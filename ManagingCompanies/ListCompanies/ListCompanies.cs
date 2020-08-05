using System;
using RestSharp;
namespace ListCompanies
{
    class ListCompanies
    {
        static void Main(string[] args)
        {
            var client = new RestClient("https://api.apexchat.com/Services/ApexChatService.svc/companies/?start=0&limit=5");
            var request = new RestRequest(Method.GET);
            request.AddHeader("apexchat-company", "CompanyName");
            request.AddHeader("apexchat-username", "Username");
            request.AddHeader("apexchat-password", "Password");
            IRestResponse response = client.Execute(request);
            Console.WriteLine(response.Content);
        }
    }
}
