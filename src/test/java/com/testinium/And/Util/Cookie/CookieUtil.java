package com.testinium.And.Util.Cookie;

import com.testinium.And.Model.LoginIssue;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import javax.net.ssl.HttpsURLConnection;
import java.io.*;
import java.net.MalformedURLException;
import java.net.URL;

public class CookieUtil {
    //TODO id ler gelince Düzenlenecek cookie data driven olarak çekilecek
    private static final String BASE_URL = "https://mobileservice.apac.beiniz.biz";
    private static final String AUTHCODE_PATH = "/api/sessionexchangebyauthcode";
    private static final String BASIC_AUTH = "";


    public static boolean createAuthCode(final String authcode) {
        URL url = null;
        try {
            url = new URL(BASE_URL + AUTHCODE_PATH);
        } catch (MalformedURLException e) {
            e.printStackTrace();
            return false;
        }
        HttpsURLConnection connection = null;
        try {
            String cookie = "m=i=1Bj%2fQ%2bM9OF3wk7k1ckd%2fQKIumq5JRmMRJx7nWR7Hc7otBCg0qfI2C9KTCMGkmQ%2fp6kyknHA5vMT7lZ1Z%2bEytgq0s954535ldGBehBPl93cvwKdlU1xcJiKcfn3hWvbODo%2fzPw3opjOVH%2fV5XQjS0ZKzmckJGhR0dSa1Gd2TqvOYCuC%2fd5ctMrDWBhj1%2fJhy0wuP6tN189FMV5WKSr9sCBp0YHjAN8IN3DJcBRUcUCRhbPuN8ISK%2f%2b7d2BAAINj%2fu%2flEhnKyaRSIIfQczYSVJ61gYwJs5sUOluAwULB0o6GVaC246wC8g6l8ubcXDGeG9OP85%2flMYpDJ9jmM3pj4XC0%2f%2beT6I0fL4VlcPjNfPibqU2cy8VoEe4jBsV25q%2fEPO&ui=7995889D25B18F4E146BADBACD281E3BD8D0A8DC4E7138B62B8DD12AE57F3B943FE45E61A5E0FD0CCA34BD98CD369CB949F698FFEFF78A8BF4B7BFE3200358063E57D911E4EF1532BF97D922E00AEF719D93539551FF751DA1DB249FB835CEDC1A0AAD004D5F3E02AFD31E724A0688154EB0FE9DCC5185F07245E35DE001B081A099EE778EB545B2FD69EBD2B9952CF2FE3CDFA3007353208DD6D97EB1FAB0FCBFF2B58A54D2D7720340341060AEE892DF43C9AF5B113C0290A93202F65986FACC0B21C40AD1F9AF005F9E062F3A0CA5E0FCF122B7EFF179B995D0FC7A24B7D58DA5232E94569086C613FEA19F00A8BB2F7F153D8487C0D05437CC5167679965E8A917F631F4328B7B687CC78B0BBF9A573EBDD52A1C94BB418C1B64B1C62C878AAE594662A48A11D7212C696844468D9DFDEFB8D39225E7D7082E5FC8B824377E8CB4F320DD693572FC6F4B8A4A1277795CF06120291F3A7D0305026AF5B596CFC6387D612E8DAA60BC2A08FB744154E59AC6CC91785C894D9E315023659F43BB2B36252334E3EC6387469B4E3E3294004BED83262D8B6650896AA0ECB40EF896E8D40254F7BD7CB4E6A44D25AD9B938382A0DB74594A68A995B290E51C740237667F1F1111C3F74D56B6C6A0CDDB204D759D15C21A936A3563212216AFD3F8C1EE85A6C8D85C115B0E232F6B019A1F0D0E61B4B914B61F53A08BA8D9010B4810CCECC3960590389BA2E656D701012B71400A6BCE2A90B6C52982C659A671AB7E43F4C64306738074271168844C8AB9BC342E71B121D3FD209A35CB6B1F63A7211E671DDC3B12087DCA7BC94D211B86F62C2D6BF0313C76A8AF1D2BA17A472C4432733B40CEA4EDDFD36D812512C21499367FF56A71B7D7487ADF7023D3FA4C477298E9D1C0B704FE49BF543D908DC013880038662024CBEFC7C90924DADA4E7304C73F117DF6F9AB43D9089B3F3E9ACEEC0BABCA0D1902DF2436BBDCF9A1CE8F28BA01B206398BAEF88B328DB1DD176A120A1C8F6ABB142B7154A21FD2667018B360C988B83BEFD089D86916CEAD41328E4C6971ACDB3A0F7FD4BA54B64AA324090E098D9857EBFC81210F63B80DF9103A12788E164E8E18ADE02D297D932A3587783A9A114AF3363F13FA50FEC9E7309163417719EC317F0649E996DC80845F6CC8033BBDA63F7D0E9BA22561FF53DEE7CBD77B300C163E29087CD4981A237D891BA0ECC7AC2199ACE4DF3F6A41CA75600E4C5E082E756793F0974A1C86B16F56A2E6983E6A54E7FB2630CAA6BB4EDF90BA710D5A1D882FCACEE049C74AF7C705038CE189CEE41A4BD7F223E1C9947677FC5D358F0784587FC0FBEB2F6773F515CC8299F2D222EACA2DF107AE3B24CE5C28EEA6F26A80A62E2ABDC818DD6C1C30F6AB9FE369E2DBDB422C781481E7B22F023C8D03ACB1EF21DB1A509386ECFBEF5778286D6B9FFFD50F9E767F53CB7867DA05A4C4C16FD7E45204D4E0BD1DF427051E80673864CF58048683F8B4D977CBFFC4B89087E5B341B931910114D0B159F33B13D2F51B320BD2AB4C444A0A2150C65D9E869C2167FBA862F83D104A554461100E3AD1E7157A0AF89B6289412E955753213D4CE77FAEECD67EA2F8AE1CBAFC69F586D5FB07B93D14DC366159EA77A01717CDCB0A5805594685DCAB359D42D923929974A1839B1D74D7723D72F84A75E2F4EA461B83A303C58743B575A1BC62C8D926033572AE2AC921442C2227AB6653D62121C00263A0B39D46E60918F83A21B62A92B63DFAEDCB86D2A2F1F4EDA4B3C67662065214A62A363CF441A793D271DFA7E9D80B10DD1843A518F90C92D07853FE3F778A97A1132A3B008ABD014496C066A7AAC6E9553A6206980FA02046965EF091CA4EFD63B74513A86E29651FB47929BE58DDBC7CA9B6072DA8C7100D16BC149FAFE96E02CDF32124C85464619256854A6E791B26F4834297122420DC4AD4B2C10EBFB3F90424E8A8C2399349EED6AAD3684F60F4D775FE891AA86626BA9EBDD78D4A09114AD5B5D3DD18BD4689834D9375731FE2D6AD7F7DB4; expires=Wed, 30-Oct-2019 07:58:41 GMT; path=/";
            connection = (HttpsURLConnection) url.openConnection();
            connection.setRequestProperty("Content-Type", "application/json");
            connection.setRequestProperty("Cookie", cookie);
            connection.setDoOutput(true);
            connection.setRequestMethod("POST");
            connection.setConnectTimeout(10000);
            connection.connect();
        } catch (IOException e) {
            e.printStackTrace();
            return false;
        }
        LoginIssue loginIssue = new LoginIssue();
        loginIssue.setAuthCode(authcode);
        ObjectMapper mapper = new ObjectMapper();
        String loginIssueJson = null;
        try {
            loginIssueJson = mapper.writeValueAsString(loginIssue);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
            return false;
        }
        try {
            Writer writer = new OutputStreamWriter(connection.getOutputStream(),"utf-8");
            writer.write(loginIssueJson);
            writer.flush();
            writer.close();
            if(connection.getResponseCode() == HttpsURLConnection.HTTP_CREATED){
                BufferedReader br = new BufferedReader(new InputStreamReader( connection.getInputStream(),"utf-8"));
                StringBuilder sb = new StringBuilder();
                String line = "";
                while ((line = br.readLine()) != null) {
                    sb.append(line + "\n");
                }
                br.close();
                final String responseContent = sb.toString();
                System.out.println(responseContent);
                //JiraResponse jiraResponse = (JiraResponse)mapper.readValue(responseContent, JiraResponse.class);
                //issueKey = jiraResponse.getKey();
                //System.out.println("JIRA ISSUE OPENED WITH KEY: " + issueKey);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        return true;

    }

}