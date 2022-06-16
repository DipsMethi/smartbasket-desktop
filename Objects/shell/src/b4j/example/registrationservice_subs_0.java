package b4j.example;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class registrationservice_subs_0 {


public static RemoteObject  _class_globals(RemoteObject __ref) throws Exception{
 //BA.debugLineNum = 1;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 2;BA.debugLine="Private fx As JFX";
registrationservice._fx = RemoteObject.createNew ("anywheresoftware.b4j.objects.JFX");__ref.setField("_fx",registrationservice._fx);
 //BA.debugLineNum = 3;BA.debugLine="Private xui As XUI";
registrationservice._xui = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper.XUI");__ref.setField("_xui",registrationservice._xui);
 //BA.debugLineNum = 4;BA.debugLine="Private database As DatabaseService";
registrationservice._database = RemoteObject.createNew ("b4j.example.databaseservice");__ref.setField("_database",registrationservice._database);
 //BA.debugLineNum = 5;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _initialize(RemoteObject __ref,RemoteObject _ba) throws Exception{
try {
		Debug.PushSubsStack("Initialize (registrationservice) ","registrationservice",7,__ref.getField(false, "ba"),__ref,8);
if (RapidSub.canDelegate("initialize")) { return __ref.runUserSub(false, "registrationservice","initialize", __ref, _ba);}
__ref.runVoidMethodAndSync("innerInitializeHelper", _ba);
Debug.locals.put("ba", _ba);
 BA.debugLineNum = 8;BA.debugLine="Public Sub Initialize";
Debug.ShouldStop(128);
 BA.debugLineNum = 9;BA.debugLine="database.Initialize";
Debug.ShouldStop(256);
__ref.getField(false,"_database" /*RemoteObject*/ ).runClassMethod (b4j.example.databaseservice.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"));
 BA.debugLineNum = 10;BA.debugLine="End Sub";
Debug.ShouldStop(512);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _registertag(RemoteObject __ref,RemoteObject _tagid) throws Exception{
try {
		Debug.PushSubsStack("RegisterTag (registrationservice) ","registrationservice",7,__ref.getField(false, "ba"),__ref,32);
if (RapidSub.canDelegate("registertag")) { return __ref.runUserSub(false, "registrationservice","registertag", __ref, _tagid);}
Debug.locals.put("tagID", _tagid);
 BA.debugLineNum = 32;BA.debugLine="Public Sub RegisterTag(tagID As String)";
Debug.ShouldStop(-2147483648);
 BA.debugLineNum = 34;BA.debugLine="End Sub";
Debug.ShouldStop(2);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _registeruser(RemoteObject __ref,RemoteObject _id,RemoteObject _firstname,RemoteObject _lastname,RemoteObject _email,RemoteObject _gender,RemoteObject _cell,RemoteObject _addr,RemoteObject _password,RemoteObject _role_id) throws Exception{
try {
		Debug.PushSubsStack("RegisterUser (registrationservice) ","registrationservice",7,__ref.getField(false, "ba"),__ref,12);
if (RapidSub.canDelegate("registeruser")) { return __ref.runUserSub(false, "registrationservice","registeruser", __ref, _id, _firstname, _lastname, _email, _gender, _cell, _addr, _password, _role_id);}
RemoteObject _success = RemoteObject.createImmutable(false);
RemoteObject _status = RemoteObject.createImmutable("");
Debug.locals.put("id", _id);
Debug.locals.put("firstname", _firstname);
Debug.locals.put("lastname", _lastname);
Debug.locals.put("email", _email);
Debug.locals.put("gender", _gender);
Debug.locals.put("cell", _cell);
Debug.locals.put("addr", _addr);
Debug.locals.put("password", _password);
Debug.locals.put("role_id", _role_id);
 BA.debugLineNum = 12;BA.debugLine="Public Sub RegisterUser( id As String, firstname A";
Debug.ShouldStop(2048);
 BA.debugLineNum = 14;BA.debugLine="Dim success As Boolean = False";
Debug.ShouldStop(8192);
_success = registrationservice.__c.getField(true,"False");Debug.locals.put("success", _success);Debug.locals.put("success", _success);
 BA.debugLineNum = 15;BA.debugLine="Dim status As String = \"Active\"";
Debug.ShouldStop(16384);
_status = BA.ObjectToString("Active");Debug.locals.put("status", _status);Debug.locals.put("status", _status);
 BA.debugLineNum = 17;BA.debugLine="Try";
Debug.ShouldStop(65536);
try { BA.debugLineNum = 18;BA.debugLine="If database.IsConnected = True Then";
Debug.ShouldStop(131072);
if (RemoteObject.solveBoolean("=",__ref.getField(false,"_database" /*RemoteObject*/ ).runClassMethod (b4j.example.databaseservice.class, "_isconnected" /*RemoteObject*/ ),registrationservice.__c.getField(true,"True"))) { 
 BA.debugLineNum = 19;BA.debugLine="database.sql.ExecNonQuery2(\"INSERT INTO users V";
Debug.ShouldStop(262144);
__ref.getField(false,"_database" /*RemoteObject*/ ).getField(false,"_sql" /*RemoteObject*/ ).runVoidMethod ("ExecNonQuery2",(Object)(BA.ObjectToString("INSERT INTO users VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?)")),(Object)(registrationservice.__c.runMethod(false, "ArrayToList", (Object)(RemoteObject.createNewArray("Object",new int[] {10},new Object[] {(_id),(_firstname),(_lastname),(_email),(_gender),(_cell),(_addr),(_password),(_status),(_role_id)})))));
 BA.debugLineNum = 20;BA.debugLine="success = True";
Debug.ShouldStop(524288);
_success = registrationservice.__c.getField(true,"True");Debug.locals.put("success", _success);
 };
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e9) {
			BA.rdebugUtils.runVoidMethod("setLastException",__ref.getField(false, "ba"), e9.toString()); BA.debugLineNum = 23;BA.debugLine="Main.log.write(\"[\" & LoginForm.lgService.userDet";
Debug.ShouldStop(4194304);
registrationservice._main._log /*RemoteObject*/ .runClassMethod (b4j.example.logger.class, "_write" /*RemoteObject*/ ,(Object)(RemoteObject.concat(RemoteObject.createImmutable("["),registrationservice._loginform._lgservice /*RemoteObject*/ .getField(false,"_userdetails" /*RemoteObject*/ ).runMethod(true,"GetString2",(Object)(BA.numberCast(int.class, 0))),RemoteObject.createImmutable("] "),registrationservice.__c.runMethod(false,"LastException",__ref.getField(false, "ba")).runMethod(true,"getMessage"))));
 BA.debugLineNum = 24;BA.debugLine="xui.MsgboxAsync(LastException, \"Exception\")";
Debug.ShouldStop(8388608);
__ref.getField(false,"_xui" /*RemoteObject*/ ).runVoidMethod ("MsgboxAsync",__ref.getField(false, "ba"),(Object)(BA.ObjectToString(registrationservice.__c.runMethod(false,"LastException",__ref.getField(false, "ba")))),(Object)(RemoteObject.createImmutable("Exception")));
 };
 BA.debugLineNum = 26;BA.debugLine="database.Disconnect";
Debug.ShouldStop(33554432);
__ref.getField(false,"_database" /*RemoteObject*/ ).runClassMethod (b4j.example.databaseservice.class, "_disconnect" /*RemoteObject*/ );
 BA.debugLineNum = 28;BA.debugLine="Return success";
Debug.ShouldStop(134217728);
if (true) return _success;
 BA.debugLineNum = 29;BA.debugLine="End Sub";
Debug.ShouldStop(268435456);
return RemoteObject.createImmutable(false);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}