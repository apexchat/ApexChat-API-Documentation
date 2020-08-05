package ManagingLeads.ViewASpecificLead;

import com.mashape.unirest.http.*;
import com.mashape.unirest.http.exceptions.UnirestException;

public class ViewASpecificLead {
    public static void main(String[] args) throws UnirestException {
        HttpResponse<String> response = Unirest
                .get("https://api.apexchat.com/Services/ApexChatService.svc/leads/{LeadID}")
                .header("apexchat-company", "CompanyName").header("apexchat-username", "Username")
                .header("apexchat-password", "Password")
                .asString();
        System.out.println(response.getBody());
    }
}