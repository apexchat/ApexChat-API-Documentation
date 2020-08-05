package ManagingCompanies.UpdatingACompany;

import com.mashape.unirest.http.*;
import com.mashape.unirest.http.exceptions.UnirestException;

public class UpdatingACompany {
    public static void main(String[] args) throws UnirestException {
        Unirest.setTimeouts(0, 0);
        HttpResponse<String> response = Unirest
                .post("https://api.apexchat.com/Services/ApexChatService.svc/companies/{companyID}")
                .header("apexchat-company", "CompanyName").header("apexchat-username", "Username")
                .header("apexchat-password", "Password").header("Content-Type", "application/json")
                .body("{\r\n    \"address\": \"123 Elm Street\",\r\n    \"zip\": \"12345\"\r\n}").asString();
        System.out.println(response.getBody());
    }
}