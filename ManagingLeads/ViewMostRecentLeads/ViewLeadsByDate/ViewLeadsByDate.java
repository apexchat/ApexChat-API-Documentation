package ManagingLeads.ViewMostRecentLeads.ViewLeadsByDate;

import com.mashape.unirest.http.*;
import com.mashape.unirest.http.exceptions.UnirestException;

public class ViewLeadsByDate {
    public static void main(String[] args) throws UnirestException {
        Unirest.setTimeouts(0, 0);
        HttpResponse<String> response = Unirest
                .get("https://api.apexchat.com/Services/ApexChatService.svc/leads/?limit=20&filter=%5B%7B%22propertyName%22:%22createdOn%22,%22propertyValue1%22:%222020-06-24T08:00:00%22,%22propertyValue2%22:%222020-07-27T08:00:00%22,%22comparison%22:0%7D%5D")
                .header("apexchat-company", "CompanyName").header("apexchat-username", "Username")
                .header("apexchat-password", "Password")
                .asString();
        System.out.println(response.getBody());
    }
}