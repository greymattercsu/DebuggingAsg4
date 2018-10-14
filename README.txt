Assignment: Debugging
Description: Replicate, simplify, trace, and eliminate the reported bugs using best practice debugging techniques.
______________________________________________________________________________________
Assignemnt Done Details

Version Control: 
	|Master: https://github.com/greymattercsu/DebuggingAsg4
	|BijanDhakal: https://github.com/greymattercsu/DebuggingAsg4/tree/BijanDhakal

Assignemnt PDF: In the file 11643832_BijanDhakal_ITC515_A4.pdf
	|Table of Contents
		|Bug: Service Charge reported 0.0 during checkout - pg.2
			|Replication (UAT) - pg.2
			|Simplification (automated test) - pg.8
			|Tracing - pg.10
				|Step 1: Check if a correct service charge is recorded while adding service charges - pg.10
				|Step 2: Find the error while adding service charge at Booking Class - pg.13
			|Resolution - pg.15
				|Automated Test	- pg.15
				|UAT - pg.17
		|Bug: Charge a room for service after the guest has checked out	- pg.23
			|Replication (UAT) - pg.23
			|Simplification (automated test ) - pg.28
			|Tracing - pg.30
				|Step 1: Check the state of the different variable after checkout. - pg.30
				|Step 2: Finding what happens when checkout method of a hotel class is called - pg.33
			|Resolution - pg.35
				|Automatic Test	- pg.35
				|UAT - pg.37
______________________________________________________________________________________________
In the Version control Assignemtn work done

Bug 1: All Service charges are reported as 0.00 when checking out
	|Report: https://github.com/greymattercsu/DebuggingAsg4/tree/BijanDhakal/Reporting/BUG1
	|Test Case: https://github.com/greymattercsu/DebuggingAsg4/blob/BijanDhakal/test/hotel/checkout/CheckoutCTLTest.java
	|Solution: https://github.com/greymattercsu/DebuggingAsg4/blob/BijanDhakal/src/hotel/entities/Booking.java
		|Note: Solution is at line 141 of Booking.java
	|Tracing: In the file 11643832_BijanDhakal_ITC515_A4.pdf from pg10	 
Bug 2: It is possible to charge a room for service after the guest has checked out
 	|Report: https://github.com/greymattercsu/DebuggingAsg4/tree/BijanDhakal/Reporting/BUG2
	|Test Case: https://github.com/greymattercsu/DebuggingAsg4/blob/BijanDhakal/test/hotel/service/RecordServiceCTLTest.java
	|Solution: https://github.com/greymattercsu/DebuggingAsg4/blob/BijanDhakal/src/hotel/entities/Hotel.java
		|Note: Solution is at line 129 of Hotel.java
	|Tracing: In the file 11643832_BijanDhakal_ITC515_A4.pdf from pg 30
