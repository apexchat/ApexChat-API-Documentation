package ReportsAndTranscripts.GenerateTranscripts;

import com.mashape.unirest.http.*;
import com.mashape.unirest.http.exceptions.UnirestException;

public class GenerateTranscripts {
    public static void main(String[] args) throws UnirestException {
        HttpResponse<String> response = Unirest
                .get("https://reports.apexchat.com/Services/ApexChatService.svc/reports/transcripts/detail/3030918")
                .header("apexchat-company", "CompanyName").header("apexchat-username", "Username")
                .header("apexchat-password", "Password")
                .asString();
        System.out.println(response.getBody());
    }
}