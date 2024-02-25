import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.Scanner;

public class CurrencyConverter {

    public static void conversion(String baseCurrency, String targetCurrency, double amount){
        try{
        String api = "129b664c3fde3fac9fafa485";
        String urlString = "https://v6.exchangerate-api.com/v6/" + api + "/pair/" + baseCurrency + "/" + targetCurrency + "/" + amount ;


        URL url = new URI(urlString).toURL();
        HttpURLConnection connection = (HttpURLConnection) url.openConnection();
        connection.setRequestMethod("GET");
        int resCode = connection.getResponseCode();
        if (resCode == 200) {
            InputStream is = connection.getInputStream();
            BufferedReader br = new BufferedReader(new InputStreamReader(is));
            StringBuffer sf = new StringBuffer();
            String line;
            while ((line = br.readLine()) != null) {
                sf.append(line);
            }
            int indexofcon = sf.indexOf("conversion_result");
            String result = sf.substring((indexofcon+19), sf.length()-1);
            System.out.println(result);
            
            
        }
        else{
            System.out.println("Connection was closed with " + resCode + " respnse code");
        }
    }
    catch(IOException a){
        System.out.println("e");
    }
    catch(URISyntaxException e){
        System.out.println("e");
    }

    }
  
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String baseCurrency = "";
        String targetCurrency = "";
        double amount = 0.0;

        System.out.println("Wekcome to Real time Currency Cunverter");

        while (true) {
            System.out.println("Write the base currency in codes (i.e. USD for US doolar, GBP for Pound Sterling etc.)");
            baseCurrency = sc.nextLine();
    
            System.out.println("Write the target currency in codes (i.e. USD for US doolar, GBP for Pound Sterling etc.)");
            targetCurrency = sc.nextLine();
    
            System.out.println("Enter amount: ");
            amount = sc.nextDouble();

            sc = new Scanner(System.in);

            conversion(baseCurrency, targetCurrency, amount);
            System.out.println("Do you want to convert another currency pair (yes/no)");
            String choice = sc.nextLine();
            if(!(choice.equals("yes")) && !(choice.equals("Yes")) && (!choice.equals("YES"))) break;
        }

        System.out.println("Thanks for Using Currency Converter!");

        sc.close();



    }
}