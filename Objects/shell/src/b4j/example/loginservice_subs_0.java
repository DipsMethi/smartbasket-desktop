package b4j.example;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class loginservice_subs_0 {


public static RemoteObject  _class_globals(RemoteObject __ref) throws Exception{
 //BA.debugLineNum = 1;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 2;BA.debugLine="Private fx As JFX";
loginservice._fx = RemoteObject.createNew ("anywheresoftware.b4j.objects.JFX");__ref.setField("_fx",loginservice._fx);
 //BA.debugLineNum = 3;BA.debugLine="Private xui As XUI";
loginservice._xui = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper.XUI");__ref.setField("_xui",loginservice._xui);
 //BA.debugLineNum = 5;BA.debugLine="Private dbService As DatabaseService";
loginservice._dbservice = RemoteObject.createNew ("b4j.example.databaseservice");__ref.setField("_dbservice",loginservice._dbservice);
 //BA.debugLineNum = 6;BA.debugLine="Public userDetails As JdbcResultSet";
loginservice._userdetails = RemoteObject.createNew ("anywheresoftware.b4j.objects.SQL.ResultSetWrapper");__ref.setField("_userdetails",loginservice._userdetails);
 //BA.debugLineNum = 7;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _initialize(RemoteObject __ref,RemoteObject _ba) throws Exception{
try {
		Debug.PushSubsStack("Initialize (loginservice) ","loginservice",5,__ref.getField(false, "ba"),__ref,10);
if (RapidSub.canDelegate("initialize")) { return __ref.runUserSub(false, "loginservice","initialize", __ref, _ba);}
__ref.runVoidMethodAndSync("innerInitializeHelper", _ba);
Debug.locals.put("ba", _ba);
 BA.debugLineNum = 10;BA.debugLine="Public Sub Initialize";
Debug.ShouldStop(512);
 BA.debugLineNum = 11;BA.debugLine="dbService.Initialize";
Debug.ShouldStop(1024);
__ref.getField(false,"_dbservice" /*RemoteObject*/ ).runClassMethod (b4j.example.databaseservice.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"));
 BA.debugLineNum = 12;BA.debugLine="End Sub";
Debug.ShouldStop(2048);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _login(RemoteObject __ref,RemoteObject _username,RemoteObject _password) throws Exception{
try {
		Debug.PushSubsStack("Login (loginservice) ","loginservice",5,__ref.getField(false, "ba"),__ref,14);
if (RapidSub.canDelegate("login")) { return __ref.runUserSub(false, "loginservice","login", __ref, _username, _password);}
RemoteObject _userexist = RemoteObject.createImmutable(false);
Debug.locals.put("username", _username);
Debug.locals.put("password", _password);
 BA.debugLineNum = 14;BA.debugLine="Public Sub Login(username As String, password As S";
Debug.ShouldStop(8192);
 BA.debugLineNum = 15;BA.debugLine="Dim userExist As Boolean = False";
Debug.ShouldStop(16384);
_userexist = loginservice.__c.getField(true,"False");Debug.locals.put("userExist", _userexist);Debug.locals.put("userExist", _userexist);
 BA.debugLineNum = 17;BA.debugLine="Try";
Debug.ShouldStop(65536);
try { BA.debugLineNum = 18;BA.debugLine="If ( dbService.sql.IsInitialized = True) Then";
Debug.ShouldStop(131072);
if ((RemoteObject.solveBoolean("=",__ref.getField(false,"_dbservice" /*RemoteObject*/ ).getField(false,"_sql" /*RemoteObject*/ ).runMethod(true,"IsInitialized"),loginservice.__c.getField(true,"True")))) { 
 BA.debugLineNum = 19;BA.debugLine="userDetails = dbService.sql.ExecQuery($\"SELECT";
Debug.ShouldStop(262144);
__ref.setField ("_userdetails" /*RemoteObject*/ ,__ref.getField(false,"_dbservice" /*RemoteObject*/ ).getField(false,"_sql" /*RemoteObject*/ ).runMethod(false,"ExecQuery",(Object)((RemoteObject.concat(RemoteObject.createImmutable("SELECT * FROM users WHERE email='"),loginservice.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_username))),RemoteObject.createImmutable("' AND password='"),loginservice.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_password))),RemoteObject.createImmutable("'"))))));
 BA.debugLineNum = 20;BA.debugLine="If (userDetails.NextRow = True) Then";
Debug.ShouldStop(524288);
if ((RemoteObject.solveBoolean("=",__ref.getField(false,"_userdetails" /*RemoteObject*/ ).runMethod(true,"NextRow"),loginservice.__c.getField(true,"True")))) { 
 BA.debugLineNum = 21;BA.debugLine="userExist = True";
Debug.ShouldStop(1048576);
_userexist = loginservice.__c.getField(true,"True");Debug.locals.put("userExist", _userexist);
 };
 };
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e10) {
			BA.rdebugUtils.runVoidMethod("setLastException",__ref.getField(false, "ba"), e10.toString()); BA.debugLineNum = 25;BA.debugLine="Main.log.write(LastException.Message)";
Debug.ShouldStop(16777216);
loginservice._main._log /*RemoteObject*/ .runClassMethod (b4j.example.logger.class, "_write" /*RemoteObject*/ ,(Object)(loginservice.__c.runMethod(false,"LastException",__ref.getField(false, "ba")).runMethod(true,"getMessage")));
 BA.debugLineNum = 26;BA.debugLine="xui.MsgboxAsync($\"Exception: ${LastException}\"$,";
Debug.ShouldStop(33554432);
__ref.getField(false,"_xui" /*RemoteObject*/ ).runVoidMethod ("MsgboxAsync",__ref.getField(false, "ba"),(Object)((RemoteObject.concat(RemoteObject.createImmutable("Exception: "),loginservice.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((loginservice.__c.runMethod(false,"LastException",__ref.getField(false, "ba")).getObject()))),RemoteObject.createImmutable("")))),(Object)(RemoteObject.createImmutable("Exception")));
 };
 BA.debugLineNum = 28;BA.debugLine="dbService.Disconnect";
Debug.ShouldStop(134217728);
__ref.getField(false,"_dbservice" /*RemoteObject*/ ).runClassMethod (b4j.example.databaseservice.class, "_disconnect" /*RemoteObject*/ );
 BA.debugLineNum = 30;BA.debugLine="Return userExist";
Debug.ShouldStop(536870912);
if (true) return _userexist;
 BA.debugLineNum = 32;BA.debugLine="End Sub";
Debug.ShouldStop(-2147483648);
return RemoteObject.createImmutable(false);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _logout(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("Logout (loginservice) ","loginservice",5,__ref.getField(false, "ba"),__ref,34);
if (RapidSub.canDelegate("logout")) { return __ref.runUserSub(false, "loginservice","logout", __ref);}
RemoteObject _session_active = RemoteObject.createImmutable(false);
 BA.debugLineNum = 34;BA.debugLine="Public Sub Logout() As Boolean";
Debug.ShouldStop(2);
 BA.debugLineNum = 35;BA.debugLine="Dim session_active As Boolean = False";
Debug.ShouldStop(4);
_session_active = loginservice.__c.getField(true,"False");Debug.locals.put("session_active", _session_active);Debug.locals.put("session_active", _session_active);
 BA.debugLineNum = 37;BA.debugLine="Try";
Debug.ShouldStop(16);
try { BA.debugLineNum = 38;BA.debugLine="If (dbService.IsInitialized) Then";
Debug.ShouldStop(32);
if ((__ref.getField(false,"_dbservice" /*RemoteObject*/ ).runMethod(true,"IsInitialized" /*RemoteObject*/ )).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 39;BA.debugLine="dbService.Disconnect";
Debug.ShouldStop(64);
__ref.getField(false,"_dbservice" /*RemoteObject*/ ).runClassMethod (b4j.example.databaseservice.class, "_disconnect" /*RemoteObject*/ );
 BA.debugLineNum = 40;BA.debugLine="session_active = False";
Debug.ShouldStop(128);
_session_active = loginservice.__c.getField(true,"False");Debug.locals.put("session_active", _session_active);
 }else {
 BA.debugLineNum = 42;BA.debugLine="session_active = True";
Debug.ShouldStop(512);
_session_active = loginservice.__c.getField(true,"True");Debug.locals.put("session_active", _session_active);
 BA.debugLineNum = 43;BA.debugLine="Main.log.write(\"Exception: System logout unsucc";
Debug.ShouldStop(1024);
loginservice._main._log /*RemoteObject*/ .runClassMethod (b4j.example.logger.class, "_write" /*RemoteObject*/ ,(Object)(RemoteObject.concat(RemoteObject.createImmutable("Exception: System logout unsuccessful"),loginservice.__c.getField(true,"CRLF"),RemoteObject.createImmutable("Please contact helpdesk"))));
 BA.debugLineNum = 44;BA.debugLine="xui.MsgboxAsync(\"Exception: System logout unsuc";
Debug.ShouldStop(2048);
__ref.getField(false,"_xui" /*RemoteObject*/ ).runVoidMethod ("MsgboxAsync",__ref.getField(false, "ba"),(Object)(RemoteObject.concat(RemoteObject.createImmutable("Exception: System logout unsuccessful"),loginservice.__c.getField(true,"CRLF"),RemoteObject.createImmutable("Please contact helpdesk"))),(Object)(RemoteObject.createImmutable("Exception")));
 };
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e12) {
			BA.rdebugUtils.runVoidMethod("setLastException",__ref.getField(false, "ba"), e12.toString()); BA.debugLineNum = 47;BA.debugLine="Main.log.write(LastException.Message)";
Debug.ShouldStop(16384);
loginservice._main._log /*RemoteObject*/ .runClassMethod (b4j.example.logger.class, "_write" /*RemoteObject*/ ,(Object)(loginservice.__c.runMethod(false,"LastException",__ref.getField(false, "ba")).runMethod(true,"getMessage")));
 BA.debugLineNum = 48;BA.debugLine="xui.MsgboxAsync(LastException.Message,\"Exception";
Debug.ShouldStop(32768);
__ref.getField(false,"_xui" /*RemoteObject*/ ).runVoidMethod ("MsgboxAsync",__ref.getField(false, "ba"),(Object)(loginservice.__c.runMethod(false,"LastException",__ref.getField(false, "ba")).runMethod(true,"getMessage")),(Object)(RemoteObject.createImmutable("Exception")));
 };
 BA.debugLineNum = 51;BA.debugLine="Return session_active";
Debug.ShouldStop(262144);
if (true) return _session_active;
 BA.debugLineNum = 52;BA.debugLine="End Sub";
Debug.ShouldStop(524288);
return RemoteObject.createImmutable(false);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}