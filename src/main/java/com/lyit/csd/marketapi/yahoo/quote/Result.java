package com.lyit.csd.marketapi.yahoo.quote;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * Simple POJO class used for deserializing responses from yahoo finance api.
 * This class provides the outcome result with the following information, MarketTime,
 * MarketPrice, MarketChange, MarketChangePercent, MarketPreviousClose,
 * MarketOpen, fullExchangeName, quoteType, displayName, symbol, shortName,
 * region Plain java required by the yahoo finance api.
 * Holds the data returned by the api
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class Result {
  /**
   * int value representing current time.
   */
  public int regularMarketTime;

  /**
   * double representing current market price.
   */
  public double regularMarketPrice;

  /**
   * double representing change in price since market open.
   */
  public double regularMarketChange;

  /**
   * double representing the percentage change of asset price since market open.
   */
  public double regularMarketChangePercent;

  /**
   * double representing change in price since previous days close.
   */
  public double regularMarketPreviousClose;

  /**
   * double representing asset price at market open.
   */
  public double regularMarketOpen;

  /**
   * string representing the name of the exchange.
   */
  public String fullExchangeName;

  /**
   * string representing the type of asset.
   */
  public String quoteType;

  /**
   * string representing the full name of the asset.
   */
  public String displayName;

  /**
   * string representing asset ticker symbol.
   */
  public String symbol;

  /**
   * string representing shorthand name of asset.
   */
  public String shortName;

  /**
   * string representing the region of origin for the asset.
   */
  public String region;
}