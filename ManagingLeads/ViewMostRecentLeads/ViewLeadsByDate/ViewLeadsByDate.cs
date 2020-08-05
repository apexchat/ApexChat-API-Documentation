using System;
using RestSharp;

namespace ViewLeadsByDate
{
    class ViewLeadsByDate
    {
        static void Main(string[] args)
        {
            var client = new RestClient ("https://api.apexchat.com/Services/ApexChatService.svc/leads/?limit=20&filter=%5B%7B%22propertyName%22:%22createdOn%22,%22propertyValue1%22:%222020-06-24T08:00:00%22,%22propertyValue2%22:%222020-07-27T08:00:00%22,%22comparison%22:0%7D%5D");
            var request = new RestRequest(Method.GET);
            request.AddHeader("apexchat-company", "CompanyName");
            request.AddHeader("apexchat-username", "Username");
            request.AddHeader("apexchat-password", "Password");
            IRestResponse response = client.Execute(request);
            Console.WriteLine(response.Content);
        }
    }
}