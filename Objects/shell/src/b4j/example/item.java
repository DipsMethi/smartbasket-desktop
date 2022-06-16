
package b4j.example;

import anywheresoftware.b4a.pc.PCBA;
import anywheresoftware.b4a.pc.RemoteObject;

public class item {
    public static RemoteObject myClass;
	public item() {
	}
    public static PCBA staticBA = new PCBA(null, item.class);

public static RemoteObject __c = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common");
public static RemoteObject _fx = RemoteObject.declareNull("anywheresoftware.b4j.objects.JFX");
public static RemoteObject _id_ = RemoteObject.createImmutable(0);
public static RemoteObject _name_ = RemoteObject.createImmutable("");
public static RemoteObject _price_ = RemoteObject.createImmutable(0);
public static b4j.example.main _main = null;
public static b4j.example.loginform _loginform = null;
public static b4j.example.dashboard _dashboard = null;
public static b4j.example.registrationform _registrationform = null;
public static b4j.example.customerview _customerview = null;
public static b4j.example.b4xcollections _b4xcollections = null;
public static b4j.example.dbutils _dbutils = null;
public static Object[] GetGlobals(RemoteObject _ref) throws Exception {
		return new Object[] {"fx",_ref.getField(false, "_fx"),"id_",_ref.getField(false, "_id_"),"name_",_ref.getField(false, "_name_"),"price_",_ref.getField(false, "_price_")};
}
}