public class Stock{
  String name;
  String symbol;
  double previosClosingPrice;
  double currentPrice;

  public Stock(String symbol, String name){
    this.symbol = symbol;
    this.name = name;
  }

    public Stock(String symbol,String name,  double previosClosingPrice,  double currentPrice){
      this.symbol = symbol;
       this.name = name;
      this.previosClosingPrice = previosClosingPrice;
      this.currentPrice = currentPrice;
      
    }
    public Stock(){
      this("GOOG", "Google Inc");
    }
  public double getChangePercent(){
    return((currentPrice - previosClosingPrice)/     previosClosingPrice) * 100;
    
  }
  public void setSymbol(String Symbol){
    this.symbol = symbol;
  }
  public void setName(String name){
    this.name =name;
  }
  }
