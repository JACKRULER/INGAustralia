@Test1
Feature: GetFeature 

  @GetTest
  Scenario: Send the GetRequest
    Given Get the base url for get Request
   
    When Send the request for get operation
   
  
    Then validate the status code of get request
    
    @PostTest
  Scenario: Send the PostRequest
    Given Get the base url for Post Request
   
    When Send the request for Post Request
   
  
    Then validate the status code of post operations
    
    

 