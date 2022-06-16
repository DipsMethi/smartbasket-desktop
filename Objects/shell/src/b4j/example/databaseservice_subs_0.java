package b4j.example;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class databaseservice_subs_0 {


public static RemoteObject  _class_globals(RemoteObject __ref) throws Exception{
 //BA.debugLineNum = 1;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 2;BA.debugLine="Private fx As JFX";
databaseservice._fx = RemoteObject.createNew ("anywheresoftware.b4j.objects.JFX");__ref.setField("_fx",databaseservice._fx);
 //BA.debugLineNum = 3;BA.debugLine="Public sql As JdbcSQL";
databaseservice._sql = RemoteObject.createNew ("anywheresoftware.b4j.objects.SQL");__ref.setField("_sql",databaseservice._sql);
 //BA.debugLineNum = 4;BA.debugLine="Private xui As XUI";
databaseservice._xui = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper.XUI");__ref.setField("_xui",databaseservice._xui);
 //BA.debugLineNum = 5;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _deleteuser(RemoteObject __ref,RemoteObject _uid) throws Exception{
try {
		Debug.PushSubsStack("DeleteUser (databaseservice) ","databaseservice",6,__ref.getField(false, "ba"),__ref,81);
if (RapidSub.canDelegate("deleteuser")) { return __ref.runUserSub(false, "databaseservice","deleteuser", __ref, _uid);}
RemoteObject _flag = RemoteObject.createImmutable(false);
Debug.locals.put("uid", _uid);
 BA.debugLineNum = 81;BA.debugLine="Public Sub DeleteUser(uid As String) As Boolean";
Debug.ShouldStop(65536);
 BA.debugLineNum = 82;BA.debugLine="Dim flag As Boolean = False";
Debug.ShouldStop(131072);
_flag = databaseservice.__c.getField(true,"False");Debug.locals.put("flag", _flag);Debug.locals.put("flag", _flag);
 BA.debugLineNum = 83;BA.debugLine="Try";
Debug.ShouldStop(262144);
try { BA.debugLineNum = 84;BA.debugLine="If(sql.IsInitialized) Then";
Debug.ShouldStop(524288);
if ((__ref.getField(false,"_sql" /*RemoteObject*/ ).runMethod(true,"IsInitialized")).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 85;BA.debugLine="sql.ExecNonQuery($\"DELETE FROM users WHERE id =";
Debug.ShouldStop(1048576);
__ref.getField(false,"_sql" /*RemoteObject*/ ).runVoidMethod ("ExecNonQuery",(Object)((RemoteObject.concat(RemoteObject.createImmutable("DELETE FROM users WHERE id = "),databaseservice.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_uid))),RemoteObject.createImmutable("")))));
 BA.debugLineNum = 86;BA.debugLine="flag = True";
Debug.ShouldStop(2097152);
_flag = databaseservice.__c.getField(true,"True");Debug.locals.put("flag", _flag);
 }else {
 BA.debugLineNum = 88;BA.debugLine="flag = False";
Debug.ShouldStop(8388608);
_flag = databaseservice.__c.getField(true,"False");Debug.locals.put("flag", _flag);
 };
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e10) {
			BA.rdebugUtils.runVoidMethod("setLastException",__ref.getField(false, "ba"), e10.toString()); BA.debugLineNum = 91;BA.debugLine="Main.log.write(\"[\" & LoginForm.lgService.userDet";
Debug.ShouldStop(67108864);
databaseservice._main._log /*RemoteObject*/ .runClassMethod (b4j.example.logger.class, "_write" /*RemoteObject*/ ,(Object)(RemoteObject.concat(RemoteObject.createImmutable("["),databaseservice._loginform._lgservice /*RemoteObject*/ .getField(false,"_userdetails" /*RemoteObject*/ ).runMethod(true,"GetString2",(Object)(BA.numberCast(int.class, 0))),RemoteObject.createImmutable("] "),databaseservice.__c.runMethod(false,"LastException",__ref.getField(false, "ba")).runMethod(true,"getMessage"))));
 BA.debugLineNum = 92;BA.debugLine="xui.MsgboxAsync($\"Exception: ${LastException}\"$,";
Debug.ShouldStop(134217728);
__ref.getField(false,"_xui" /*RemoteObject*/ ).runVoidMethod ("MsgboxAsync",__ref.getField(false, "ba"),(Object)((RemoteObject.concat(RemoteObject.createImmutable("Exception: "),databaseservice.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((databaseservice.__c.runMethod(false,"LastException",__ref.getField(false, "ba")).getObject()))),RemoteObject.createImmutable("")))),(Object)(RemoteObject.createImmutable("Exception")));
 };
 BA.debugLineNum = 95;BA.debugLine="Return flag";
Debug.ShouldStop(1073741824);
if (true) return _flag;
 BA.debugLineNum = 96;BA.debugLine="End Sub";
Debug.ShouldStop(-2147483648);
return RemoteObject.createImmutable(false);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _disconnect(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("Disconnect (databaseservice) ","databaseservice",6,__ref.getField(false, "ba"),__ref,28);
if (RapidSub.canDelegate("disconnect")) { return __ref.runUserSub(false, "databaseservice","disconnect", __ref);}
 BA.debugLineNum = 28;BA.debugLine="Public Sub Disconnect";
Debug.ShouldStop(134217728);
 BA.debugLineNum = 29;BA.debugLine="sql = Null";
Debug.ShouldStop(268435456);
__ref.setField ("_sql" /*RemoteObject*/ ,(databaseservice.__c.getField(false,"Null")));
 BA.debugLineNum = 30;BA.debugLine="End Sub";
Debug.ShouldStop(536870912);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getall(RemoteObject __ref,RemoteObject _table,RemoteObject _colindex) throws Exception{
try {
		Debug.PushSubsStack("GetAll (databaseservice) ","databaseservice",6,__ref.getField(false, "ba"),__ref,34);
if (RapidSub.canDelegate("getall")) { return __ref.runUserSub(false, "databaseservice","getall", __ref, _table, _colindex);}
RemoteObject _result = RemoteObject.declareNull("anywheresoftware.b4j.objects.SQL.ResultSetWrapper");
Debug.locals.put("table", _table);
Debug.locals.put("colIndex", _colindex);
 BA.debugLineNum = 34;BA.debugLine="Public Sub GetAll(table As String, colIndex As Int";
Debug.ShouldStop(2);
 BA.debugLineNum = 35;BA.debugLine="Dim result As JdbcResultSet = Null";
Debug.ShouldStop(4);
_result = RemoteObject.createNew ("anywheresoftware.b4j.objects.SQL.ResultSetWrapper");
_result = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4j.objects.SQL.ResultSetWrapper"), databaseservice.__c.getField(false,"Null"));Debug.locals.put("result", _result);Debug.locals.put("result", _result);
 BA.debugLineNum = 37;BA.debugLine="Try";
Debug.ShouldStop(16);
try { BA.debugLineNum = 38;BA.debugLine="If (sql.IsInitialized = True) Then";
Debug.ShouldStop(32);
if ((RemoteObject.solveBoolean("=",__ref.getField(false,"_sql" /*RemoteObject*/ ).runMethod(true,"IsInitialized"),databaseservice.__c.getField(true,"True")))) { 
 BA.debugLineNum = 39;BA.debugLine="If( colIndex < 0 ) Then";
Debug.ShouldStop(64);
if ((RemoteObject.solveBoolean("<",_colindex,BA.numberCast(double.class, 0)))) { 
 BA.debugLineNum = 40;BA.debugLine="result = sql.ExecQuery($\"SELECT DISTINCT id FR";
Debug.ShouldStop(128);
_result = __ref.getField(false,"_sql" /*RemoteObject*/ ).runMethod(false,"ExecQuery",(Object)((RemoteObject.concat(RemoteObject.createImmutable("SELECT DISTINCT id FROM "),databaseservice.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_table))),RemoteObject.createImmutable("")))));Debug.locals.put("result", _result);
 };
 };
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e9) {
			BA.rdebugUtils.runVoidMethod("setLastException",__ref.getField(false, "ba"), e9.toString()); BA.debugLineNum = 44;BA.debugLine="Main.log.write(\"[\" & LoginForm.lgService.userDet";
Debug.ShouldStop(2048);
databaseservice._main._log /*RemoteObject*/ .runClassMethod (b4j.example.logger.class, "_write" /*RemoteObject*/ ,(Object)(RemoteObject.concat(RemoteObject.createImmutable("["),databaseservice._loginform._lgservice /*RemoteObject*/ .getField(false,"_userdetails" /*RemoteObject*/ ).runMethod(true,"GetString2",(Object)(BA.numberCast(int.class, 0))),RemoteObject.createImmutable("] "),databaseservice.__c.runMethod(false,"LastException",__ref.getField(false, "ba")).runMethod(true,"getMessage"))));
 BA.debugLineNum = 45;BA.debugLine="xui.MsgboxAsync(LastException, \"Exception\")";
Debug.ShouldStop(4096);
__ref.getField(false,"_xui" /*RemoteObject*/ ).runVoidMethod ("MsgboxAsync",__ref.getField(false, "ba"),(Object)(BA.ObjectToString(databaseservice.__c.runMethod(false,"LastException",__ref.getField(false, "ba")))),(Object)(RemoteObject.createImmutable("Exception")));
 };
 BA.debugLineNum = 48;BA.debugLine="Return result";
Debug.ShouldStop(32768);
if (true) return _result;
 BA.debugLineNum = 49;BA.debugLine="End Sub";
Debug.ShouldStop(65536);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getpurchasedetails(RemoteObject __ref,RemoteObject _table,RemoteObject _id) throws Exception{
try {
		Debug.PushSubsStack("GetPurchaseDetails (databaseservice) ","databaseservice",6,__ref.getField(false, "ba"),__ref,51);
if (RapidSub.canDelegate("getpurchasedetails")) { return __ref.runUserSub(false, "databaseservice","getpurchasedetails", __ref, _table, _id);}
RemoteObject _result = RemoteObject.declareNull("anywheresoftware.b4j.objects.SQL.ResultSetWrapper");
Debug.locals.put("table", _table);
Debug.locals.put("id", _id);
 BA.debugLineNum = 51;BA.debugLine="Public Sub GetPurchaseDetails(table As String, id";
Debug.ShouldStop(262144);
 BA.debugLineNum = 52;BA.debugLine="Dim result As JdbcResultSet = Null";
Debug.ShouldStop(524288);
_result = RemoteObject.createNew ("anywheresoftware.b4j.objects.SQL.ResultSetWrapper");
_result = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4j.objects.SQL.ResultSetWrapper"), databaseservice.__c.getField(false,"Null"));Debug.locals.put("result", _result);Debug.locals.put("result", _result);
 BA.debugLineNum = 54;BA.debugLine="Try";
Debug.ShouldStop(2097152);
try { BA.debugLineNum = 55;BA.debugLine="If(sql.IsInitialized = True) Then";
Debug.ShouldStop(4194304);
if ((RemoteObject.solveBoolean("=",__ref.getField(false,"_sql" /*RemoteObject*/ ).runMethod(true,"IsInitialized"),databaseservice.__c.getField(true,"True")))) { 
 BA.debugLineNum = 56;BA.debugLine="result = sql.ExecQuery($\"SELECT * FROM ${table}";
Debug.ShouldStop(8388608);
_result = __ref.getField(false,"_sql" /*RemoteObject*/ ).runMethod(false,"ExecQuery",(Object)((RemoteObject.concat(RemoteObject.createImmutable("SELECT * FROM "),databaseservice.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_table))),RemoteObject.createImmutable(" WHERE id = "),databaseservice.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_id))),RemoteObject.createImmutable("")))));Debug.locals.put("result", _result);
 };
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e7) {
			BA.rdebugUtils.runVoidMethod("setLastException",__ref.getField(false, "ba"), e7.toString()); BA.debugLineNum = 59;BA.debugLine="Main.log.write(\"[\" & LoginForm.lgService.userDet";
Debug.ShouldStop(67108864);
databaseservice._main._log /*RemoteObject*/ .runClassMethod (b4j.example.logger.class, "_write" /*RemoteObject*/ ,(Object)(RemoteObject.concat(RemoteObject.createImmutable("["),databaseservice._loginform._lgservice /*RemoteObject*/ .getField(false,"_userdetails" /*RemoteObject*/ ).runMethod(true,"GetString2",(Object)(BA.numberCast(int.class, 0))),RemoteObject.createImmutable("] "),databaseservice.__c.runMethod(false,"LastException",__ref.getField(false, "ba")).runMethod(true,"getMessage"))));
 BA.debugLineNum = 60;BA.debugLine="xui.MsgboxAsync($\"Exception: ${LastException}\"$,";
Debug.ShouldStop(134217728);
__ref.getField(false,"_xui" /*RemoteObject*/ ).runVoidMethod ("MsgboxAsync",__ref.getField(false, "ba"),(Object)((RemoteObject.concat(RemoteObject.createImmutable("Exception: "),databaseservice.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((databaseservice.__c.runMethod(false,"LastException",__ref.getField(false, "ba")).getObject()))),RemoteObject.createImmutable("")))),(Object)(RemoteObject.createImmutable("Exception")));
 };
 BA.debugLineNum = 63;BA.debugLine="Return result";
Debug.ShouldStop(1073741824);
if (true) return _result;
 BA.debugLineNum = 64;BA.debugLine="End Sub";
Debug.ShouldStop(-2147483648);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getroles(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("GetRoles (databaseservice) ","databaseservice",6,__ref.getField(false, "ba"),__ref,66);
if (RapidSub.canDelegate("getroles")) { return __ref.runUserSub(false, "databaseservice","getroles", __ref);}
RemoteObject _result = RemoteObject.declareNull("anywheresoftware.b4j.objects.SQL.ResultSetWrapper");
 BA.debugLineNum = 66;BA.debugLine="Public Sub GetRoles() As JdbcResultSet";
Debug.ShouldStop(2);
 BA.debugLineNum = 67;BA.debugLine="Dim result As JdbcResultSet = Null";
Debug.ShouldStop(4);
_result = RemoteObject.createNew ("anywheresoftware.b4j.objects.SQL.ResultSetWrapper");
_result = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4j.objects.SQL.ResultSetWrapper"), databaseservice.__c.getField(false,"Null"));Debug.locals.put("result", _result);Debug.locals.put("result", _result);
 BA.debugLineNum = 69;BA.debugLine="Try";
Debug.ShouldStop(16);
try { BA.debugLineNum = 70;BA.debugLine="If (sql.IsInitialized = True) Then";
Debug.ShouldStop(32);
if ((RemoteObject.solveBoolean("=",__ref.getField(false,"_sql" /*RemoteObject*/ ).runMethod(true,"IsInitialized"),databaseservice.__c.getField(true,"True")))) { 
 BA.debugLineNum = 71;BA.debugLine="result = sql.ExecQuery($\"SELECT * FROM roles\"$)";
Debug.ShouldStop(64);
_result = __ref.getField(false,"_sql" /*RemoteObject*/ ).runMethod(false,"ExecQuery",(Object)((RemoteObject.createImmutable("SELECT * FROM roles"))));Debug.locals.put("result", _result);
 };
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e7) {
			BA.rdebugUtils.runVoidMethod("setLastException",__ref.getField(false, "ba"), e7.toString()); BA.debugLineNum = 74;BA.debugLine="Main.log.write(\"[\" & LoginForm.lgService.userDet";
Debug.ShouldStop(512);
databaseservice._main._log /*RemoteObject*/ .runClassMethod (b4j.example.logger.class, "_write" /*RemoteObject*/ ,(Object)(RemoteObject.concat(RemoteObject.createImmutable("["),databaseservice._loginform._lgservice /*RemoteObject*/ .getField(false,"_userdetails" /*RemoteObject*/ ).runMethod(true,"GetString2",(Object)(BA.numberCast(int.class, 0))),RemoteObject.createImmutable("] "),databaseservice.__c.runMethod(false,"LastException",__ref.getField(false, "ba")).runMethod(true,"getMessage"))));
 BA.debugLineNum = 75;BA.debugLine="xui.MsgboxAsync($\"Exception: ${LastException}\"$,";
Debug.ShouldStop(1024);
__ref.getField(false,"_xui" /*RemoteObject*/ ).runVoidMethod ("MsgboxAsync",__ref.getField(false, "ba"),(Object)((RemoteObject.concat(RemoteObject.createImmutable("Exception: "),databaseservice.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((databaseservice.__c.runMethod(false,"LastException",__ref.getField(false, "ba")).getObject()))),RemoteObject.createImmutable("")))),(Object)(RemoteObject.createImmutable("Exception")));
 };
 BA.debugLineNum = 78;BA.debugLine="Return result";
Debug.ShouldStop(8192);
if (true) return _result;
 BA.debugLineNum = 79;BA.debugLine="End Sub";
Debug.ShouldStop(16384);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _initialize(RemoteObject __ref,RemoteObject _ba) throws Exception{
try {
		Debug.PushSubsStack("Initialize (databaseservice) ","databaseservice",6,__ref.getField(false, "ba"),__ref,8);
if (RapidSub.canDelegate("initialize")) { return __ref.runUserSub(false, "databaseservice","initialize", __ref, _ba);}
__ref.runVoidMethodAndSync("innerInitializeHelper", _ba);
Debug.locals.put("ba", _ba);
 BA.debugLineNum = 8;BA.debugLine="Public Sub Initialize";
Debug.ShouldStop(128);
 BA.debugLineNum = 10;BA.debugLine="Try";
Debug.ShouldStop(512);
try { BA.debugLineNum = 12;BA.debugLine="sql.Initialize2(\"com.mysql.cj.jdbc.Driver\", \"jdb";
Debug.ShouldStop(2048);
__ref.getField(false,"_sql" /*RemoteObject*/ ).runVoidMethod ("Initialize2",(Object)(BA.ObjectToString("com.mysql.cj.jdbc.Driver")),(Object)(BA.ObjectToString("jdbc:mysql://127.0.0.1:3306/smartbasket_db")),(Object)(BA.ObjectToString("root")),(Object)(RemoteObject.createImmutable("")));
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e4) {
			BA.rdebugUtils.runVoidMethod("setLastException",__ref.getField(false, "ba"), e4.toString()); BA.debugLineNum = 14;BA.debugLine="Main.log.write(\"[\" & LoginForm.lgService.userDet";
Debug.ShouldStop(8192);
databaseservice._main._log /*RemoteObject*/ .runClassMethod (b4j.example.logger.class, "_write" /*RemoteObject*/ ,(Object)(RemoteObject.concat(RemoteObject.createImmutable("["),databaseservice._loginform._lgservice /*RemoteObject*/ .getField(false,"_userdetails" /*RemoteObject*/ ).runMethod(true,"GetString2",(Object)(BA.numberCast(int.class, 0))),RemoteObject.createImmutable("] "),RemoteObject.createImmutable("Exception: "),databaseservice.__c.runMethod(false,"LastException",__ref.getField(false, "ba")).runMethod(true,"getMessage"))));
 BA.debugLineNum = 15;BA.debugLine="xui.MsgboxAsync(LastException, \"Exception\")";
Debug.ShouldStop(16384);
__ref.getField(false,"_xui" /*RemoteObject*/ ).runVoidMethod ("MsgboxAsync",__ref.getField(false, "ba"),(Object)(BA.ObjectToString(databaseservice.__c.runMethod(false,"LastException",__ref.getField(false, "ba")))),(Object)(RemoteObject.createImmutable("Exception")));
 };
 BA.debugLineNum = 18;BA.debugLine="End Sub";
Debug.ShouldStop(131072);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _isconnected(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("IsConnected (databaseservice) ","databaseservice",6,__ref.getField(false, "ba"),__ref,20);
if (RapidSub.canDelegate("isconnected")) { return __ref.runUserSub(false, "databaseservice","isconnected", __ref);}
 BA.debugLineNum = 20;BA.debugLine="Public Sub IsConnected As Boolean";
Debug.ShouldStop(524288);
 BA.debugLineNum = 21;BA.debugLine="If sql.IsInitialized = True Then";
Debug.ShouldStop(1048576);
if (RemoteObject.solveBoolean("=",__ref.getField(false,"_sql" /*RemoteObject*/ ).runMethod(true,"IsInitialized"),databaseservice.__c.getField(true,"True"))) { 
 BA.debugLineNum = 22;BA.debugLine="Return True";
Debug.ShouldStop(2097152);
if (true) return databaseservice.__c.getField(true,"True");
 }else {
 BA.debugLineNum = 24;BA.debugLine="Return False";
Debug.ShouldStop(8388608);
if (true) return databaseservice.__c.getField(true,"False");
 };
 BA.debugLineNum = 26;BA.debugLine="End Sub";
Debug.ShouldStop(33554432);
return RemoteObject.createImmutable(false);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}