package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class DemoJdbcService {
    @Autowired
    NamedParameterJdbcTemplate namedParameterJdbcTemplate;

    /*
      How to deal with updated data:
      1. delete all and then re-insert?
      2. work out the differences and then insert/update/delete accordingly

      Hint: for primary keys sometimes is very useful to use a UUID... but NOT always
     */

    public void saveCountries(List<Country> countries) {
        countries.forEach(this::saveCountry);
    }

    private void saveCountry(Country country) {
        Map<String, Object> countryData = new HashMap<>();
        countryData.put("COUNTRY_CODE", country.getCode());
        countryData.put("NAME", country.getName());

        namedParameterJdbcTemplate.update("INSERT INTO COUNTRIES(COUNTRY_CODE, NAME) VALUES(:COUNTRY_CODE, :NAME)", countryData);

        country.getCurrencies().forEach(currency -> saveCurrency(country, currency));
    }

    private void saveCurrency(Country country, Currency currency) {
        Map<String, Object> currencyData = new HashMap<>();
        currencyData.put("COUNTRY_CODE", country.getCode());
        currencyData.put("CODE", currency.getCode());

        namedParameterJdbcTemplate.update("INSERT INTO CURRENCIES(COUNTRY_CODE, CODE) VALUES(:COUNTRY_CODE, :CODE)", currencyData);

    }


}
