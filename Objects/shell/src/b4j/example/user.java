
package b4j.example;

import anywheresoftware.b4a.pc.PCBA;
import anywheresoftware.b4a.pc.RemoteObject;

public class user {
    public static RemoteObject myClass;
	public user() {
	}
    public static PCBA staticBA = new PCBA(null, user.class);

public static RemoteObject __c = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common");
public static RemoteObject _fx = RemoteObject.declareNull("anywheresoftware.b4j.objects.JFX");
public static RemoteObject _id_ = RemoteObject.createImmutable("");
public static RemoteObject _name_ = RemoteObject.createImmutable("");
public static RemoteObject _surname_ = RemoteObject.createImmutable("");
public static RemoteObject _email_ = RemoteObject.createImmutable("");
public static RemoteObject _gender_ = RemoteObject.createImmutable("");
public static RemoteObject _cell_ = RemoteObject.createImmutable("");
public static RemoteObject _addr_ = RemoteObject.createImmutable("");
public static RemoteObject _password_ = RemoteObject.createImmutable("");
public static RemoteObject _roleid_ = RemoteObject.createImmutable((byte)0);
public static b4j.example.main _main = null;
public static b4j.example.loginform _loginform = null;
public static b4j.example.dashboard _dashboard = null;
public static b4j.example.registrationform _registrationform = null;
public static b4j.example.customerview _customerview = null;
public static b4j.example.b4xcollections _b4xcollections = null;
public static b4j.example.dbutils _dbutils = null;
public static Object[] GetGlobals(RemoteObject _ref) throws Exception {
		return new Object[] {"addr_",_ref.getField(false, "_addr_"),"cell_",_ref.getField(false, "_cell_"),"email_",_ref.getField(false, "_email_"),"fx",_ref.getField(false, "_fx"),"gender_",_ref.getField(false, "_gender_"),"ID_",_ref.getField(false, "_id_"),"name_",_ref.getField(false, "_name_"),"password_",_ref.getField(false, "_password_"),"roleID_",_ref.getField(false, "_roleid_"),"surname_",_ref.getField(false, "_surname_")};
}
}