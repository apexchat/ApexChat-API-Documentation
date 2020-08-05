package ReportsAndTranscripts.GenerateReports;

import com.mashape.unirest.http.*;
import com.mashape.unirest.http.exceptions.UnirestException;

public class GenerateReports {
    public static void main(String[] args) throws UnirestException{
        HttpResponse<String> response = Unirest
                .get("https://reports.apexchat.com/Services/ApexChatService.svc/queueduserreports/17687?format=json")
                .header("apexchat-company", "CompanyName")
                .header("apexchat-username", "Username")
                .header("apexchat-password", "Password")
                .asString();
        System.out.println(response.getBody());
    }
}