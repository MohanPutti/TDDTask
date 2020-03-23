package EPAM.TDDProblem;

public class RemoveA {
		
	public String remove(String string) {
		String result=string;
		if(string.length()==0)
			result= "";
		else if(string.length()==1) {
			if(string.charAt(0)=='A')
				result="";
			else
				result=string;
		}
		else {
		char firstchar=string.charAt(0);
		char secondchar=string.charAt(1);
		String remainingchar=string.substring(2);
		if(firstchar!='A'&&secondchar!='A') 
			result= string;
		else if(firstchar=='A'&&secondchar=='A')
			result= remainingchar;
		else if(firstchar=='A')
			result= secondchar+remainingchar;
		else if(secondchar=='A')
			result= firstchar+remainingchar;}
			
		return result;
	}

}
