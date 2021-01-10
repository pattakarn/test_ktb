package io.assignment.stockvaluebackend;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.web.client.RestTemplate;

import io.assignment.stockvaluebackend.model.Stock;
import io.assignment.stockvaluebackend.model.StockDB;
import io.assignment.stockvaluebackend.repository.StockRepository;

@SpringBootApplication
public class StockValueBackendApplication {

	static StockRepository stockRepository;

	public static void main(String[] args) {
		ConfigurableApplicationContext configurableApplicationContext = SpringApplication
				.run(StockValueBackendApplication.class, args);

		stockRepository = configurableApplicationContext.getBean(StockRepository.class);

		getStock();
	}

	public static void getStock() {
		RestTemplate restTemplate = new RestTemplate();

		// Get all stock
		// final String uri =
		// "https://sandbox.iexapis.com/stable/stock/market/batch?symbols=aapl,fb,googl,msft&types=chart&range=1m&last=30&token=Tpk_cfc7333fc26c4c179f1a66b65efaf9ee";
		// String result = restTemplate.getForObject(uri, String.class);
		// JSONObject jsonObject = new JSONObject(result);
		// System.out.println(jsonObject.getJSONObject("AAPL").toString());

		// Get one stock
		final String uriAppl = "https://sandbox.iexapis.com/stable/stock/aapl/batch?types=quote,chart&range=1m&last=30&token=Tpk_cfc7333fc26c4c179f1a66b65efaf9ee";
		final String uriFb = "https://sandbox.iexapis.com/stable/stock/fb/batch?types=quote,chart&range=1m&last=30&token=Tpk_cfc7333fc26c4c179f1a66b65efaf9ee";
		final String uriGoogl = "https://sandbox.iexapis.com/stable/stock/googl/batch?types=quote,chart&range=1m&last=30&token=Tpk_cfc7333fc26c4c179f1a66b65efaf9ee";
		final String uriMsft = "https://sandbox.iexapis.com/stable/stock/msft/batch?types=quote,chart&range=1m&last=30&token=Tpk_cfc7333fc26c4c179f1a66b65efaf9ee";

		Stock resultAppl = restTemplate.getForObject(uriAppl, Stock.class);
		Stock resultFb = restTemplate.getForObject(uriFb, Stock.class);
		Stock resultGoogl = restTemplate.getForObject(uriGoogl, Stock.class);
		Stock resultMsft = restTemplate.getForObject(uriMsft, Stock.class);

		System.out.println(resultAppl.getQuote().getCompanyName());
		System.out.println(resultFb.getQuote().getCompanyName());
		System.out.println(resultGoogl.getQuote().getCompanyName());
		System.out.println(resultMsft.getQuote().getCompanyName());


		addDb(resultAppl);
		addDb(resultFb);
		addDb(resultGoogl);
		addDb(resultMsft);
	}

	public static void addDb(Stock data){
		
		String companyName = data.getQuote().getCompanyName();
		// System.out.println(companyName + " - " + data.getChart().length);
		for (int i = 0 ; i < data.getChart().length; i++) {
			// System.out.println(i + " " + data.getChart()[i].getClose());
			StockDB temp = new StockDB();
			temp.setCompanyName(companyName);
			temp.setClose(data.getChart()[i].getClose());
			temp.setHigh(data.getChart()[i].getHigh());
			temp.setLow(data.getChart()[i].getLow());
			temp.setOpen(data.getChart()[i].getOpen());
			temp.setSymbol(data.getChart()[i].getSymbol());
			temp.setVolume(data.getChart()[i].getVolume());
			temp.setId(data.getChart()[i].getId());
			temp.setKey(data.getChart()[i].getKey());
			temp.setSubkey(data.getChart()[i].getSubkey());
			temp.setUpdated(data.getChart()[i].getUpdated());
			temp.setChangeOverTime(data.getChart()[i].getChangeOverTime());
			temp.setMarketChangeOverTime(data.getChart()[i].getMarketChangeOverTime());
			temp.setuOpen(data.getChart()[i].getuOpen());
			temp.setuClose(data.getChart()[i].getuClose());
			temp.setuHigh(data.getChart()[i].getuHigh());
			temp.setuLow(data.getChart()[i].getuLow());
			temp.setuVolume(data.getChart()[i].getuVolume());
			temp.setfOpen(data.getChart()[i].getfOpen());
			temp.setfClose(data.getChart()[i].getfClose());
			temp.setfHigh(data.getChart()[i].getfHigh());
			temp.setfLow(data.getChart()[i].getfLow());
			temp.setfVolume(data.getChart()[i].getfVolume());
			temp.setLabel(data.getChart()[i].getLabel());
			temp.setChange(data.getChart()[i].getChange());
			temp.setChangePercent(data.getChart()[i].getChangePercent());
			
			stockRepository.save(temp);
		}
	}


}
