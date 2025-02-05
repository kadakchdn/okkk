
package com.orasi;

import java.util.*;
import org.openqa.selenium.By;
import org.openqa.selenium.By.*;
import org.openqa.selenium.*;
import com.orasi.datasource.*;


public class ObjectManager {
  private static final ObjectManager singleton = new ObjectManager();
  
  public static final ObjectManager instance() {
    return singleton;
  }
  
  private final Map<String,ByFactory> objectMap = new HashMap<>( 10 );
  
  private ObjectManager() {
    ByFactoryCollection bC = null;
    /*
    Site: omayo.blogspot.com
    Add a description of omayo.blogspot.com
    */
    /* Page: omayo (QAFox.com) 
    
    */

    

bC = new ByFactoryCollection("INPUT", "27297.2065", "");
bC.add( new ByFactory( ByXPath.class, "//form[@name=\"form1\"]/input[1]", "ParentRule[NameRule]", "27297.2067", "" ) );
bC.add( new ByFactory( ByXPath.class, "//*[@name=\"form1\"]/input[1]", "ParentRule[NameRule]", "27297.2069", "" ) );
bC.add( new ByFactory( ByXPath.class, "(//input[@type='text'])[1]", "IndexedAttributeRule", "27297.2071", "" ) );
bC.add( new ByFactory( ByXPath.class, "/body[1]/div[4]/div[2]/div[2]/div[2]/div[2]/div[2]/div[2]/div[1]/div[4]/div[1]/div[1]/div[1]/div[5]/div[1]/form[1]/input[1]", "AbsoluteRule", "27297.2073", "" ) );


objectMap.put( "27297.2065", bC );


bC = new ByFactoryCollection("INPUT1", "27297.2077", "");
bC.add( new ByFactory( ByXPath.class, "//form[@name=\"form1\"]/input[2]", "ParentRule[NameRule]", "27297.2079", "" ) );
bC.add( new ByFactory( ByXPath.class, "//*[@name=\"form1\"]/input[2]", "ParentRule[NameRule]", "27297.2081", "" ) );
bC.add( new ByFactory( ByXPath.class, "(//input[@type='text'])[1]/following-sibling::input[1]", "SiblingRule", "27297.2083", "" ) );
bC.add( new ByFactory( ByXPath.class, "(//input[@type='password'])[1]", "IndexedAttributeRule", "27297.2085", "" ) );
bC.add( new ByFactory( ByXPath.class, "/body[1]/div[4]/div[2]/div[2]/div[2]/div[2]/div[2]/div[2]/div[1]/div[4]/div[1]/div[1]/div[1]/div[5]/div[1]/form[1]/input[2]", "AbsoluteRule", "27297.2087", "" ) );


objectMap.put( "27297.2077", bC );


bC = new ByFactoryCollection("LogIn", "27297.2091", "");
bC.add( new ByFactory( ByXPath.class, "//button[@value='LogIn']", "AttributeRule", "27297.2093", "" ) );
bC.add( new ByFactory( ByXPath.class, "//*[@value='LogIn']", "AttributeRule", "27297.2095", "" ) );
bC.add( new ByFactory( ByXPath.class, "//form[@name=\"form1\"]/button[1]", "ParentRule[NameRule]", "27297.2097", "" ) );
bC.add( new ByFactory( ByXPath.class, "//*[@name=\"form1\"]/button[1]", "ParentRule[NameRule]", "27297.2099", "" ) );
bC.add( new ByFactory( ByXPath.class, "//button[contains( text(), \"LogIn\")][1]", "TextRule", "27297.2101", "" ) );
bC.add( new ByFactory( ByXPath.class, "(//input[@type='password'])[1]/following-sibling::button[1]", "SiblingRule", "27297.2103", "" ) );
bC.add( new ByFactory( ByXPath.class, "(//button[@type='button'])[1]", "IndexedAttributeRule", "27297.2105", "" ) );
bC.add( new ByFactory( ByXPath.class, "/body[1]/div[4]/div[2]/div[2]/div[2]/div[2]/div[2]/div[2]/div[1]/div[4]/div[1]/div[1]/div[1]/div[5]/div[1]/form[1]/button[1]", "AbsoluteRule", "27297.2107", "" ) );


objectMap.put( "27297.2091", bC );




  }
  
  public By getObject( Object alchemyIdentifier, Map<String,Object> contextMap, DataSourceProvider dM ) {
    
    if ( alchemyIdentifier instanceof By ) {
      return (By) alchemyIdentifier;
    }
    
    ByFactory by = objectMap.get( alchemyIdentifier + "" );
    if ( by == null ) {
      return new By() {
        @Override
        public List<WebElement> findElements(SearchContext sc) {
          throw new RuntimeException( "Could not find and object using [" + alchemyIdentifier + "]" );
        }
      };
    }
    return by.create(contextMap, dM);
  }

  public ByFactory getObject( String alchemyIdentifier ) {
   
    return objectMap.get( alchemyIdentifier );
  }
}
