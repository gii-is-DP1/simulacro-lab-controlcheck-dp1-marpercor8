package org.springframework.samples.petclinic.product;

import java.text.ParseException;
import java.util.Locale;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.Formatter;
import org.springframework.stereotype.Component;

@Component
public class ProductTypeFormatter implements Formatter<ProductType>{

    @Autowired
    ProductService productSer;

    @Override
    public String print(ProductType object, Locale locale) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public ProductType parse(String text, Locale locale) throws ParseException {
        ProductType pt = productSer.getProductType(text);
        return pt;
    }
    
}
