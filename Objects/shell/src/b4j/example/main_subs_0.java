package b4j.example;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class main_subs_0 {


public static RemoteObject  _appstart(RemoteObject _form1,RemoteObject _args) throws Exception{
try {
		Debug.PushSubsStack("AppStart (main) ","main",0,main.ba,main.mostCurrent,12);
if (RapidSub.canDelegate("appstart")) { return b4j.example.main.remoteMe.runUserSub(false, "main","appstart", _form1, _args);}
Debug.locals.put("Form1", _form1);
Debug.locals.put("Args", _args);
 BA.debugLineNum = 12;BA.debugLine="Sub AppStart (Form1 As Form, Args() As String)";
Debug.ShouldStop(2048);
 BA.debugLineNum = 13;BA.debugLine="LoginForm.Show";
Debug.ShouldStop(4096);
main._loginform.runVoidMethod ("_show" /*RemoteObject*/ );
 BA.debugLineNum = 14;BA.debugLine="End Sub";
Debug.ShouldStop(8192);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}

private static boolean processGlobalsRun;
public static void initializeProcessGlobals() {
    
    if (main.processGlobalsRun == false) {
	    main.processGlobalsRun = true;
		try {
		        main_subs_0._process_globals();
loginform_subs_0._process_globals();
dashboard_subs_0._process_globals();
registrationform_subs_0._process_globals();
customerview_subs_0._process_globals();
b4xcollections_subs_0._process_globals();
dbutils_subs_0._process_globals();
main.myClass = BA.getDeviceClass ("b4j.example.main");
loginform.myClass = BA.getDeviceClass ("b4j.example.loginform");
dashboard.myClass = BA.getDeviceClass ("b4j.example.dashboard");
registrationform.myClass = BA.getDeviceClass ("b4j.example.registrationform");
customerview.myClass = BA.getDeviceClass ("b4j.example.customerview");
loginservice.myClass = BA.getDeviceClass ("b4j.example.loginservice");
databaseservice.myClass = BA.getDeviceClass ("b4j.example.databaseservice");
registrationservice.myClass = BA.getDeviceClass ("b4j.example.registrationservice");
user.myClass = BA.getDeviceClass ("b4j.example.user");
item.myClass = BA.getDeviceClass ("b4j.example.item");
logger.myClass = BA.getDeviceClass ("b4j.example.logger");
b4xbitset.myClass = BA.getDeviceClass ("b4j.example.b4xbitset");
b4xbytesbuilder.myClass = BA.getDeviceClass ("b4j.example.b4xbytesbuilder");
b4xcache.myClass = BA.getDeviceClass ("b4j.example.b4xcache");
b4xcollections.myClass = BA.getDeviceClass ("b4j.example.b4xcollections");
b4xcomparatorsort.myClass = BA.getDeviceClass ("b4j.example.b4xcomparatorsort");
b4xorderedmap.myClass = BA.getDeviceClass ("b4j.example.b4xorderedmap");
b4xset.myClass = BA.getDeviceClass ("b4j.example.b4xset");
dbutils.myClass = BA.getDeviceClass ("b4j.example.dbutils");
		
        } catch (Exception e) {
			throw new RuntimeException(e);
		}
    }
}public static RemoteObject  _process_globals() throws Exception{
 //BA.debugLineNum = 7;BA.debugLine="Sub Process_Globals";
 //BA.debugLineNum = 8;BA.debugLine="Private fx As JFX";
main._fx = RemoteObject.createNew ("anywheresoftware.b4j.objects.JFX");
 //BA.debugLineNum = 9;BA.debugLine="Public Log As Logger";
main._log = RemoteObject.createNew ("b4j.example.logger");
 //BA.debugLineNum = 10;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
}