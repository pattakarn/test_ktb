package io.assignment.stockvaluebackend;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/home")
public class HomeController {

    @GetMapping("/")
    public String hello() {
        return "Hello, World !!";
    }

    @GetMapping("/stock")
    public String stock() {
        RestTemplate restTemplate = new RestTemplate();

        // get all
        final String uri = "https://sandbox.iexapis.com/stable/stock/market/batch?symbols=aapl,fb,googl,msft&types=quote,chart&range=1m&last=30&token=Tpk_cfc7333fc26c4c179f1a66b65efaf9ee";
        String result = restTemplate.getForObject(uri, String.class);

        // get one for add to data class
        // final String uriAppl = "https://sandbox.iexapis.com/stable/stock/aapl/batch?types=quote,chart&range=1m&last=10&token=Tpk_cfc7333fc26c4c179f1a66b65efaf9ee";
        // final String uriFb = "https://sandbox.iexapis.com/stable/stock/fb/batch?types=quote,chart&range=1m&last=10&token=Tpk_cfc7333fc26c4c179f1a66b65efaf9ee";
        // final String uriGoogl = "https://sandbox.iexapis.com/stable/stock/googl/batch?types=quote,chart&range=1m&last=10&token=Tpk_cfc7333fc26c4c179f1a66b65efaf9ee";
        // final String uriMsft = "https://sandbox.iexapis.com/stable/stock/msft/batch?types=quote,chart&range=1m&last=10&token=Tpk_cfc7333fc26c4c179f1a66b65efaf9ee";
 
        // Stock resultAppl = restTemplate.getForObject(uriAppl, Stock.class);
        // Stock resultFb = restTemplate.getForObject(uriFb, Stock.class);
        // Stock resultGoogl = restTemplate.getForObject(uriGoogl, Stock.class);
        // Stock resultMsft = restTemplate.getForObject(uriMsft, Stock.class);
        // System.out.println(result.getQuote().getCompanyName());
        // for (int i = 0 ; i < result.getChart().length; i++) {
        //     System.out.println(result.getChart()[i].getClose());
        // }
        return result;
    }

}