package com.sapient.client.cui;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Check extends Payment implements Authorization {
String name;
String bankID;
//private final Map<String,Long> bankDetails = new HashMap<String,Long>();
//public final void validCardDetails(){
//	bankDetails.put("SBI",new Long(5196));
//	bankDetails.put("PNB",new Long(8523));
//	bankDetails.put("UNION BNAK", new Long(7897));  
//}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getBankID() {
	return bankID;
}
public void setBankID(String bankID) {
	this.bankID = bankID;
}

public String authorized(String message)
{
	return message;
}
//	String authorize=" ";
//	Iterator mapIteration;
//	mapIteration = bankDetails.entrySet().iterator();
//	String bankID=this.getBankID();
//	String nameTest=this.getName();
//	while(mapIteration.hasNext())
//	{
//		Map.Entry mapEntry = (Map.Entry) mapIteration.next();
//		if(nameTest==(String)mapEntry.getValue()&& bankID==(String)mapEntry.getKey());
//		{
//			return "authorised";
//		}
//	}
//	return "not authorized";
//

}


