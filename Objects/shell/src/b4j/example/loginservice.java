
package b4j.example;

import anywheresoftware.b4a.pc.PCBA;
import anywheresoftware.b4a.pc.RemoteObject;

public class loginservice {
    public static RemoteObject myClass;
	public loginservice() {
	}
    public static PCBA staticBA = new PCBA(null, loginservice.class);

public static RemoteObject __c = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common");
public static RemoteObject _fx = RemoteObject.declareNull("anywheresoftware.b4j.objects.JFX");
public static RemoteObject _xui = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper.XUI");
public static RemoteObject _dbservice = RemoteObject.declareNull("b4j.example.databaseservice");
public static RemoteObject _userdetails = RemoteObject.declareNull("anywheresoftware.b4j.objects.SQL.ResultSetWrapper");
public static b4j.example.main _main = null;
public static b4j.example.loginform _loginform = null;
public static b4j.example.dashboard _dashboard = null;
public static b4j.example.registrationform _registrationform = null;
public static b4j.example.customerview _customerview = null;
public static b4j.example.b4xcollections _b4xcollections = null;
public static b4j.example.dbutils _dbutils = null;
public static Object[] GetGlobals(RemoteObject _ref) throws Exception {
		return new Object[] {"dbService",_ref.getField(false, "_dbservice"),"fx",_ref.getField(false, "_fx"),"userDetails",_ref.getField(false, "_userdetails"),"xui",_ref.getField(false, "_xui")};
}
}