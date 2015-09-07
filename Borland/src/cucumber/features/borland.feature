Feature: Borland Demo Site 
Scenario: Successful run borland demo site 
	Given User is on Main Page 
	When User click the GMO enter site 
	And To fillup the OnLine Catalog form 
		|Fields|Value|
		|OrderQuantity|3|
		|OrderQuantity|4|
		|OrderQuantity|5|
		|OrderQuantity|6|
	Then User click the place an order button 
	And User Proceed With order button 
	
	
	Given User fill up form for billing Info 
		|Fields|Value|
		|Name|Haque MD|
		|Address|351 S St Andresws|
		|City|Los Angeles|
		|State|CA|
		|ZipCode|90020|
		|Phone|213-841-7273|
		|E-mail|enams@yahoo.com|
		|CardNumber|1233-3333-3335-5665|
		|CardDate|01/91|
		
	When  User check the Ship To 
	Then To close the browser 
	
