
package b4j.example;

import anywheresoftware.b4a.pc.PCBA;
import anywheresoftware.b4a.pc.RemoteObject;

public class b4xbytesbuilder {
    public static RemoteObject myClass;
	public b4xbytesbuilder() {
	}
    public static PCBA staticBA = new PCBA(null, b4xbytesbuilder.class);

public static RemoteObject __c = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common");
public static RemoteObject _mbuffer = null;
public static RemoteObject _mlength = RemoteObject.createImmutable(0);
public static b4j.example.main _main = null;
public static b4j.example.loginform _loginform = null;
public static b4j.example.dashboard _dashboard = null;
public static b4j.example.registrationform _registrationform = null;
public static b4j.example.customerview _customerview = null;
public static b4j.example.b4xcollections _b4xcollections = null;
public static b4j.example.dbutils _dbutils = null;
public static Object[] GetGlobals(RemoteObject _ref) throws Exception {
		return new Object[] {"mBuffer",_ref.getField(false, "_mbuffer"),"mLength",_ref.getField(false, "_mlength")};
}
}