package com.lyit.csd.marketapi.yahoo.trending;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.util.ArrayList;

/**
 * Simple POJO class used for deserializing responses from yahoo finance api.
 * Holds ArrayList of Quote type called quotes
 * Holds two String type variables called symbol and region
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class Result {
  /**
   * ArrayList of Quote objects.
   */
  public ArrayList<Quote> quotes;

  /**
   * string representing stock ticker.
   */
  public String symbol;

  /**
   * string representing region.
   */
  public String region;
}