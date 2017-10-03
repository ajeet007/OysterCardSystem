# OysterCardSystem

Problem statement 
--------------------
Design a limited version of London’s Oyster card system. Demonstrate a user loading a card with £30, and taking the following trips, and then viewing the balance.
- Tube Holborn to Earl’s Court
- 328 bus from Earl’s Court to Chelsea
- Tube Earl’s court to Hammersmith

When the user passes through the inward barrier at the station, their oyster card is charged the maximum fare. When they pass out of the barrier at the exit station, the fare is calculated and the maximum fare transaction removed and replaced with the real transaction (in this way, if the user doesn’t swipe out, they are charged the maximum fare).

All bus journeys are charged at the same price. The system should favour the customer where more than one fare is possible for a given journey. E.g. Holburn to Earl’s Court is charged at £2.50. For the purposes of this test use the following data:

**Stations and zones**

Station  | Zone(s)
-------- | -------
Holborn | 1
Earl’s Court | 1, 2
Wimbledon | 3
Hammersmith | 2

**Fares**

Journey  | Fare
-------- | -------
Anywhere in Zone 1 | £2.50
Any one zone outside zone 1 | £2.00
Any two zones including zone 1 | £3.00
Any two zones excluding zone 1 | £2.25
Any three zones | £3.20
Any bus journey | £1.80

The maximum possible fare is therefore £3.20.

Solution 
-----------
1. Although it would come from a backend system in the real world solution, Fares information is loaded from zonesAndFares.txt, format of which is as below:
Key is -> Zone sets delimited by ';'. Each zone set may be having multiple zones, each delimited by ','
Value is -> Fare (associated with those zone sets) and the TransporationMode, delimited by '@'
2. Although it would come from a backend system in the real world solution, Stations and zones information is loaded from stationsAndZones.txt, format of which is as below:
Key is -> Station name
Value is -> Set of zones to which this station belongs to
3. For the demo client code (OysterCardSystemAppClient#main), Travel data has been loaded from travelData.txt
From the unit test cases' perspective: 
4. Just a single system test case class (OysterCardSystemTest.java) has been written. it is exhaustive enough to cover 84.4% of the lines of code. Same UTC model could be easily repeated for each java class and code coverage could be increased. 5. 5. Since there is no service OR database interaction, mocking did not come into use.
6. Valid travel data files: travelData.txt and travelData1.txt have been used for normal use cases
7. Invalid travel data files: invalidTravelData.txt and invalidTravelData1.txt have been used for negative use  cases 
