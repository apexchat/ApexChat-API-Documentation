package ManagingCompanies.CreatingACompany;

import com.mashape.unirest.http.*;
import com.mashape.unirest.http.exceptions.UnirestException;

public class CreatingACompany {
    public static void main(String[] args) throws UnirestException {
        HttpResponse<String> response = Unirest
                .post("https://api.apexchat.com/Services/ApexChatService.svc/companies/create")
                .header("apexchat-company", "CompanyName").header("apexchat-username", "Username")
                .header("apexchat-password", "Password").header("Content-Type", "application/json")
                .body("{\r\n    \"companyName\": \"New Company\",\r\n    \"officeHoursTimeZone\": \"Mountain Standard Time\",\r\n    \"companyKey\": \"NewCompany\",\r\n    \"address\": \"123 Elm Street\",\r\n    \"hostId\": \"2\",\r\n    \"city\": \"Vancouver\",\r\n    \"state\": \"British Columbia\",\r\n    \"country\": \"Canada\",\r\n    \"zip\": \"V6C1H2\",\r\n    \"logLevel\": \"3\",\r\n    \"chatMode\": \"1\",\r\n    \"chatTheme\": \"8\",\r\n    \"invitationDisplayMode\": \"1\"\r\n}")
                .asString();
        System.out.println(response.getBody());
    }
}