package b4j.example;

import anywheresoftware.b4a.debug.*;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;

public class registrationservice extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4a.shell.ShellBA("b4j.example", "b4j.example.registrationservice", this);
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            ba.htSubs = htSubs;
             
        }
        if (BA.isShellModeRuntimeCheck(ba))
                this.getClass().getMethod("_class_globals", b4j.example.registrationservice.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 
    public void  innerInitializeHelper(anywheresoftware.b4a.BA _ba) throws Exception{
        innerInitialize(_ba);
    }
    public Object callSub(String sub, Object sender, Object[] args) throws Exception {
        return BA.SubDelegator.SubNotFound;
    }
public anywheresoftware.b4a.keywords.Common __c = null;
public anywheresoftware.b4j.objects.JFX _fx = null;
public anywheresoftware.b4a.objects.B4XViewWrapper.XUI _xui = null;
public b4j.example.databaseservice _database = null;
public b4j.example.main _main = null;
public b4j.example.loginform _loginform = null;
public b4j.example.dashboard _dashboard = null;
public b4j.example.registrationform _registrationform = null;
public b4j.example.customerview _customerview = null;
public b4j.example.b4xcollections _b4xcollections = null;
public b4j.example.dbutils _dbutils = null;
public String  _initialize(b4j.example.registrationservice __ref,anywheresoftware.b4a.BA _ba) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="registrationservice";
if (Debug.shouldDelegate(ba, "initialize", false))
	 {return ((String) Debug.delegate(ba, "initialize", new Object[] {_ba}));}
RDebugUtils.currentLine=2883584;
 //BA.debugLineNum = 2883584;BA.debugLine="Public Sub Initialize";
RDebugUtils.currentLine=2883585;
 //BA.debugLineNum = 2883585;BA.debugLine="database.Initialize";
__ref._database /*b4j.example.databaseservice*/ ._initialize /*String*/ (null,ba);
RDebugUtils.currentLine=2883586;
 //BA.debugLineNum = 2883586;BA.debugLine="End Sub";
return "";
}
public boolean  _registeruser(b4j.example.registrationservice __ref,String _id,String _firstname,String _lastname,String _email,String _gender,String _cell,String _addr,String _password,byte _role_id) throws Exception{
__ref = this;
RDebugUtils.currentModule="registrationservice";
if (Debug.shouldDelegate(ba, "registeruser", false))
	 {return ((Boolean) Debug.delegate(ba, "registeruser", new Object[] {_id,_firstname,_lastname,_email,_gender,_cell,_addr,_password,_role_id}));}
boolean _success = false;
String _status = "";
RDebugUtils.currentLine=2949120;
 //BA.debugLineNum = 2949120;BA.debugLine="Public Sub RegisterUser( id As String, firstname A";
RDebugUtils.currentLine=2949122;
 //BA.debugLineNum = 2949122;BA.debugLine="Dim success As Boolean = False";
_success = __c.False;
RDebugUtils.currentLine=2949123;
 //BA.debugLineNum = 2949123;BA.debugLine="Dim status As String = \"Active\"";
_status = "Active";
RDebugUtils.currentLine=2949125;
 //BA.debugLineNum = 2949125;BA.debugLine="Try";
try {RDebugUtils.currentLine=2949126;
 //BA.debugLineNum = 2949126;BA.debugLine="If database.IsConnected = True Then";
if (__ref._database /*b4j.example.databaseservice*/ ._isconnected /*boolean*/ (null)==__c.True) { 
RDebugUtils.currentLine=2949127;
 //BA.debugLineNum = 2949127;BA.debugLine="database.sql.ExecNonQuery2(\"INSERT INTO users V";
__ref._database /*b4j.example.databaseservice*/ ._sql /*anywheresoftware.b4j.objects.SQL*/ .ExecNonQuery2("INSERT INTO users VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?)",anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)(_id),(Object)(_firstname),(Object)(_lastname),(Object)(_email),(Object)(_gender),(Object)(_cell),(Object)(_addr),(Object)(_password),(Object)(_status),(Object)(_role_id)}));
RDebugUtils.currentLine=2949128;
 //BA.debugLineNum = 2949128;BA.debugLine="success = True";
_success = __c.True;
 };
 } 
       catch (Exception e9) {
			ba.setLastException(e9);RDebugUtils.currentLine=2949131;
 //BA.debugLineNum = 2949131;BA.debugLine="Main.log.write(\"[\" & LoginForm.lgService.userDet";
_main._log /*b4j.example.logger*/ ._write /*String*/ (null,"["+_loginform._lgservice /*b4j.example.loginservice*/ ._userdetails /*anywheresoftware.b4j.objects.SQL.ResultSetWrapper*/ .GetString2((int) (0))+"] "+__c.LastException(ba).getMessage());
RDebugUtils.currentLine=2949132;
 //BA.debugLineNum = 2949132;BA.debugLine="xui.MsgboxAsync(LastException, \"Exception\")";
__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .MsgboxAsync(ba,BA.ObjectToString(__c.LastException(ba)),"Exception");
 };
RDebugUtils.currentLine=2949134;
 //BA.debugLineNum = 2949134;BA.debugLine="database.Disconnect";
__ref._database /*b4j.example.databaseservice*/ ._disconnect /*String*/ (null);
RDebugUtils.currentLine=2949136;
 //BA.debugLineNum = 2949136;BA.debugLine="Return success";
if (true) return _success;
RDebugUtils.currentLine=2949137;
 //BA.debugLineNum = 2949137;BA.debugLine="End Sub";
return false;
}
public String  _class_globals(b4j.example.registrationservice __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="registrationservice";
RDebugUtils.currentLine=2818048;
 //BA.debugLineNum = 2818048;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=2818049;
 //BA.debugLineNum = 2818049;BA.debugLine="Private fx As JFX";
_fx = new anywheresoftware.b4j.objects.JFX();
RDebugUtils.currentLine=2818050;
 //BA.debugLineNum = 2818050;BA.debugLine="Private xui As XUI";
_xui = new anywheresoftware.b4a.objects.B4XViewWrapper.XUI();
RDebugUtils.currentLine=2818051;
 //BA.debugLineNum = 2818051;BA.debugLine="Private database As DatabaseService";
_database = new b4j.example.databaseservice();
RDebugUtils.currentLine=2818052;
 //BA.debugLineNum = 2818052;BA.debugLine="End Sub";
return "";
}
public String  _registertag(b4j.example.registrationservice __ref,String _tagid) throws Exception{
__ref = this;
RDebugUtils.currentModule="registrationservice";
if (Debug.shouldDelegate(ba, "registertag", false))
	 {return ((String) Debug.delegate(ba, "registertag", new Object[] {_tagid}));}
RDebugUtils.currentLine=3014656;
 //BA.debugLineNum = 3014656;BA.debugLine="Public Sub RegisterTag(tagID As String)";
RDebugUtils.currentLine=3014658;
 //BA.debugLineNum = 3014658;BA.debugLine="End Sub";
return "";
}
}