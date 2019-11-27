

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONException;

public class Demo {
	public static void main(String[] args) {
		
		String DEATH_TRING = "{\"a\":\"\\x";
		try {
			Object obj = JSON.parse(DEATH_TRING);
			System.out.println(obj);
		} catch (JSONException ex) {
			ex.printStackTrace();
			System.out.println(ex);
		}
		
	}

}
