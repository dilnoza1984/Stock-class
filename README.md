Design a class named Stock that contains:

Fields (Instance variables):

A string data field named symbol for the stock’s symbol.
A string data field named name for the stock’s name.
A double data field named previousClosingPrice that stores the stock price for the previous day.
A double data field named currentPrice that stores the stock price for the current time.

Constructors:(use this keyword)

A constructor that creates a stock that takes symbol and name and initializes them.
A constructor that creates a stock that takes symbol, name, previousClosingPrice, currentPrice and initializes them.
A no-arg constructor that creates a default stock with symbol "GOOG" and name "Google Inc" (use this() to set the values)


A method named getChangePercent() that returns the percentage changed from previousClosingPrice to currentPrice.
((current−previous)/previous) * 100
A method named setSymbol() that sets the symbol to a given symbol.
A method named setName() that sets the name to a given name.


Write a test program in the main method that creates a Stock object with the stock symbol ORCL, the name Oracle Corporation, and the previous closing price of 34.5. Set a new current price to 34.35 and display the price-change percentage.