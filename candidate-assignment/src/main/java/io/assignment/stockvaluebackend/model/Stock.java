package io.assignment.stockvaluebackend.model;



public class Stock {
    private Quote quote;
    private Chart[] chart;

    public Stock() {
    }

    public Chart[] getChart() {
        return chart;
    }

    public void setChart(Chart[] chart) {
        this.chart = chart;
    }

    public Quote getQuote() {
      return quote;
    }
  
    public void setQuote(Quote quote) {
      this.quote = quote;
    }
}
