
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

public class registrationform implements IRemote{
	public static registrationform mostCurrent;
	public static RemoteObject ba;
    public static boolean processGlobalsRun;
    public static RemoteObject myClass;
    public static RemoteObject remoteMe;
	public registrationform() {
		mostCurrent = this;
	}
    public RemoteObject getRemoteMe() {
        return remoteMe;    
    }
    
public boolean isSingleton() {
		return true;
	}
    static {
		mostCurrent = new registrationform();
		remoteMe = RemoteObject.declareNull("b4j.example.registrationform");
        anywheresoftware.b4a.pc.RapidSub.moduleToObject.put(new B4XClass("registrationform"), "b4j.example.registrationform");
	}
    public static void main (String[] args) throws Exception {
		new RDebug(args[0], Integer.parseInt(args[1]), Integer.parseInt(args[2]), args[3]);
		RDebug.INSTANCE.waitForTask();

	}
    private static PCBA pcBA = new PCBA(null, registrationform.class);
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
		pcBA = new PCBA(this, registrationform.class);
        main_subs_0.initializeProcessGlobals();
		return pcBA;
	}
public static RemoteObject __c = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common");
public static RemoteObject _fx = RemoteObject.declareNull("anywheresoftware.b4j.objects.JFX");
public static RemoteObject _ui = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper.XUI");
public static RemoteObject _frmregistration = RemoteObject.declareNull("anywheresoftware.b4j.objects.Form");
public static RemoteObject _txtid = RemoteObject.declareNull("anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper");
public static RemoteObject _txtfirstname = RemoteObject.declareNull("anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper");
public static RemoteObject _txtlastname = RemoteObject.declareNull("anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper");
public static RemoteObject _txtemail = RemoteObject.declareNull("anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper");
public static RemoteObject _txtcell = RemoteObject.declareNull("anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper");
public static RemoteObject _txtaddress = RemoteObject.declareNull("anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper");
public static RemoteObject _txtpassword = RemoteObject.declareNull("anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper");
public static RemoteObject _cbgender = RemoteObject.declareNull("anywheresoftware.b4j.objects.ComboBoxWrapper");
public static RemoteObject _cbrole = RemoteObject.declareNull("anywheresoftware.b4j.objects.ComboBoxWrapper");
public static RemoteObject _tbshow = RemoteObject.declareNull("anywheresoftware.b4j.objects.ButtonWrapper.ToggleButtonWrapper");
public static RemoteObject _regservice = RemoteObject.declareNull("b4j.example.registrationservice");
public static RemoteObject _dbservice = RemoteObject.declareNull("b4j.example.databaseservice");
public static b4j.example.main _main = null;
public static b4j.example.loginform _loginform = null;
public static b4j.example.dashboard _dashboard = null;
public static b4j.example.customerview _customerview = null;
public static b4j.example.b4xcollections _b4xcollections = null;
public static b4j.example.dbutils _dbutils = null;
  public Object[] GetGlobals() {
		return new Object[] {"B4XCollections",Debug.moduleToString(b4j.example.b4xcollections.class),"cbGender",registrationform._cbgender,"cbRole",registrationform._cbrole,"CustomerView",Debug.moduleToString(b4j.example.customerview.class),"Dashboard",Debug.moduleToString(b4j.example.dashboard.class),"dbService",registrationform._dbservice,"DBUtils",Debug.moduleToString(b4j.example.dbutils.class),"frmRegistration",registrationform._frmregistration,"fx",registrationform._fx,"LoginForm",Debug.moduleToString(b4j.example.loginform.class),"Main",Debug.moduleToString(b4j.example.main.class),"regService",registrationform._regservice,"tbShow",registrationform._tbshow,"txtAddress",registrationform._txtaddress,"txtCell",registrationform._txtcell,"txtEmail",registrationform._txtemail,"txtFirstname",registrationform._txtfirstname,"txtID",registrationform._txtid,"txtLastname",registrationform._txtlastname,"txtPassword",registrationform._txtpassword,"ui",registrationform._ui};
}
}