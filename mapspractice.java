package maps;

import java.util.HashMap;

public class mapspractice {

	public static void main(String[] args) {
		
		 HashMap hm = new HashMap();
		 
		 hm.put("NellaiExpress", "2000");
		 hm.put("VaigaiExpress", "2100");
		 hm.put("NellaiExpress", "2200");
		 hm.put("NellaiExpress", "2200");
		 hm.put(null,"3000");
		 
		 System.out.println(hm.get(null));
		 
		 System.out.println(hm.entrySet());
		 System.out.println(hm.keySet());
		 System.out.println(hm.values());
		 System.out.println(hm);
		 
		 System.out.println(hm.get("NellaiExpress"));
		 
		 System.out.println(hm.remove("VaigaiExpress"));
		 System.out.println(hm.remove("NellaiExpress","2000"));
		 
		 System.out.println(hm);

	}

}
