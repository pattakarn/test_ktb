package io.assignment.stockvaluebackend.controller;

import java.util.ArrayList;
import java.util.List;

import org.json.JSONArray;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.assignment.stockvaluebackend.model.StockDB;
import io.assignment.stockvaluebackend.repository.StockRepository;

@RestController
@RequestMapping("/home")
public class HomeController {

    @Autowired
    private StockRepository stockRepository;

    @GetMapping("/")
    public String hello() {
        return "Hello, World !!";
    }

    @GetMapping("/stock")
    public String stock() {

        List<StockDB> listStock = new ArrayList<StockDB>();
        listStock = (List<StockDB>) stockRepository.findAll();

        JSONArray arrJson = new JSONArray();
        for (int i = 0 ; i < listStock.size(); i++) {
            JSONObject obj = new JSONObject();
            obj.put("companyName", listStock.get(i).getCompanyName());
            obj.put("close", listStock.get(i).getClose());
            obj.put("high", listStock.get(i).getHigh());
            obj.put("low", listStock.get(i).getLow());
            obj.put("open", listStock.get(i).getOpen());
            obj.put("symbol", listStock.get(i).getSymbol());
            obj.put("volume", listStock.get(i).getVolume());
            obj.put("id", listStock.get(i).getId());
            obj.put("key", listStock.get(i).getKey());
            obj.put("subkey", listStock.get(i).getSubkey());
            obj.put("date", listStock.get(i).getDate());
            obj.put("updated", listStock.get(i).getUpdated());
            obj.put("changeOverTime", listStock.get(i).getChangeOverTime());
            obj.put("marketChangeOverTime", listStock.get(i).getMarketChangeOverTime());
            obj.put("uOpen", listStock.get(i).getuOpen());
            obj.put("uClose", listStock.get(i).getuClose());
            obj.put("uHigh", listStock.get(i).getuHigh());
            obj.put("uLow", listStock.get(i).getuLow());
            obj.put("uVolume", listStock.get(i).getuVolume());
            obj.put("fOpen", listStock.get(i).getfOpen());
            obj.put("fClose", listStock.get(i).getfClose());
            obj.put("fHigh", listStock.get(i).getfHigh());
            obj.put("fVolume", listStock.get(i).getfVolume());
            obj.put("change", listStock.get(i).getChange());
            obj.put("changePercent", listStock.get(i).getChangePercent());
            
            arrJson.put(obj);
        }
        return arrJson.toString();
    }

}