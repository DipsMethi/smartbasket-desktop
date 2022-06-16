
package b4j.example;

import java.io.IOException;
import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.PCBA;
import anywheresoftware.b4a.pc.RDebug;
import anywheresoftware.b4a.pc.RemoteObject;
import anywheresoftware.b4a.pc.RDebug.IRemote;
import anywheresoftware.b4a.pc.Debug;
import anywheresoftware.b4a.pc.B4XTypes.B4XClass;
import anywheresoftware.b4a.pc.B4XTypes.DeviceClass;

public class customerview implements IRemote{
	public static customerview mostCurrent;
	public static RemoteObject ba;
    public static boolean processGlobalsRun;
    public static RemoteObject myClass;
    public static RemoteObject remoteMe;
	public customerview() {
		mostCurrent = this;
	}
    public RemoteObject getRemoteMe() {
        return remoteMe;    
    }
    
public boolean isSingleton() {
		return true;
	}
    static {
		mostCurrent = new customerview();
		remoteMe = RemoteObject.declareNull("b4j.example.customerview");
        anywheresoftware.b4a.pc.RapidSub.moduleToObject.put(new B4XClass("customerview"), "b4j.example.customerview");
	}
    public static void main (String[] args) throws Exception {
		new RDebug(args[0], Integer.parseInt(args[1]), Integer.parseInt(args[2]), args[3]);
		RDebug.INSTANCE.waitForTask();

	}
    private static PCBA pcBA = new PCBA(null, customerview.class);
	public static RemoteObject runMethod(boolean notUsed, String method, Object... args) throws Exception{
		return (RemoteObject) pcBA.raiseEvent(method.substring(1), args);
	}
    public static void runVoidMethod(String method, Object... args) throws Exception{
		runMethod(false, method, args);
	}
    public static RemoteObject getObject() {
		return myClass;
	 }
	public PCBA create(Object[] args) throws ClassNotFoundException{
		ba = (RemoteObject) args[1];
		pcBA = new PCBA(this, customerview.class);
        main_subs_0.initializeProcessGlobals();
		return pcBA;
	}
public static RemoteObject __c = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common");
public static RemoteObject _fx = RemoteObject.declareNull("anywheresoftware.b4j.objects.JFX");
public static RemoteObject _xui = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper.XUI");
public static RemoteObject _frmcustomerview = RemoteObject.declareNull("anywheresoftware.b4j.objects.Form");
public static RemoteObject _lstcustomers = RemoteObject.declareNull("anywheresoftware.b4j.objects.ListViewWrapper");
public static RemoteObject _tblviewexpenditure = RemoteObject.declareNull("anywheresoftware.b4j.objects.TableViewWrapper");
public static RemoteObject _btnsuspend = RemoteObject.declareNull("anywheresoftware.b4j.objects.ButtonWrapper");
public static RemoteObject _btndelete = RemoteObject.declareNull("anywheresoftware.b4j.objects.ButtonWrapper");
public static RemoteObject _selectedindex = RemoteObject.createImmutable(0);
public static RemoteObject _dbmanager = RemoteObject.declareNull("b4j.example.databaseservice");
public static RemoteObject _customerrecords = RemoteObject.declareNull("anywheresoftware.b4j.objects.SQL.ResultSetWrapper");
public static b4j.example.main _main = null;
public static b4j.example.loginform _loginform = null;
public static b4j.example.dashboard _dashboard = null;
public static b4j.example.registrationform _registrationform = null;
public static b4j.example.b4xcollections _b4xcollections = null;
public static b4j.example.dbutils _dbutils = null;
  public Object[] GetGlobals() {
		return new Object[] {"B4XCollections",Debug.moduleToString(b4j.example.b4xcollections.class),"btnDelete",customerview._btndelete,"btnSuspend",customerview._btnsuspend,"customerRecords",customerview._customerrecords,"Dashboard",Debug.moduleToString(b4j.example.dashboard.class),"dbManager",customerview._dbmanager,"DBUtils",Debug.moduleToString(b4j.example.dbutils.class),"frmCustomerView",customerview._frmcustomerview,"fx",customerview._fx,"LoginForm",Debug.moduleToString(b4j.example.loginform.class),"lstCustomers",customerview._lstcustomers,"Main",Debug.moduleToString(b4j.example.main.class),"RegistrationForm",Debug.moduleToString(b4j.example.registrationform.class),"selectedIndex",customerview._selectedindex,"tblViewExpenditure",customerview._tblviewexpenditure,"xui",customerview._xui};
}
}