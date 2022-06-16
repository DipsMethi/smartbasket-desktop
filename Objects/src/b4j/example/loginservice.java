package b4j.example;

import anywheresoftware.b4a.debug.*;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;

public class loginservice extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4a.shell.ShellBA("b4j.example", "b4j.example.loginservice", this);
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            ba.htSubs = htSubs;
             
        }
        if (BA.isShellModeRuntimeCheck(ba))
                this.getClass().getMethod("_class_globals", b4j.example.loginservice.class).invoke(this, new Object[] {null});
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
public b4j.example.databaseservice _dbservice = null;
public anywheresoftware.b4j.objects.SQL.ResultSetWrapper _userdetails = null;
public b4j.example.main _main = null;
public b4j.example.loginform _loginform = null;
public b4j.example.dashboard _dashboard = null;
public b4j.example.registrationform _registrationform = null;
public b4j.example.customerview _customerview = null;
public b4j.example.b4xcollections _b4xcollections = null;
public b4j.example.dbutils _dbutils = null;
public String  _initialize(b4j.example.loginservice __ref,anywheresoftware.b4a.BA _ba) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="loginservice";
if (Debug.shouldDelegate(ba, "initialize", false))
	 {return ((String) Debug.delegate(ba, "initialize", new Object[] {_ba}));}
RDebugUtils.currentLine=8257536;
 //BA.debugLineNum = 8257536;BA.debugLine="Public Sub Initialize";
RDebugUtils.currentLine=8257537;
 //BA.debugLineNum = 8257537;BA.debugLine="dbService.Initialize";
__ref._dbservice /*b4j.example.databaseservice*/ ._initialize /*String*/ (null,ba);
RDebugUtils.currentLine=8257538;
 //BA.debugLineNum = 8257538;BA.debugLine="End Sub";
return "";
}
public boolean  _login(b4j.example.loginservice __ref,String _username,String _password) throws Exception{
__ref = this;
RDebugUtils.currentModule="loginservice";
if (Debug.shouldDelegate(ba, "login", false))
	 {return ((Boolean) Debug.delegate(ba, "login", new Object[] {_username,_password}));}
boolean _userexist = false;
RDebugUtils.currentLine=8323072;
 //BA.debugLineNum = 8323072;BA.debugLine="Public Sub Login(username As String, password As S";
RDebugUtils.currentLine=8323073;
 //BA.debugLineNum = 8323073;BA.debugLine="Dim userExist As Boolean = False";
_userexist = __c.False;
RDebugUtils.currentLine=8323075;
 //BA.debugLineNum = 8323075;BA.debugLine="Try";
try {RDebugUtils.currentLine=8323076;
 //BA.debugLineNum = 8323076;BA.debugLine="If ( dbService.sql.IsInitialized = True) Then";
if ((__ref._dbservice /*b4j.example.databaseservice*/ ._sql /*anywheresoftware.b4j.objects.SQL*/ .IsInitialized()==__c.True)) { 
RDebugUtils.currentLine=8323077;
 //BA.debugLineNum = 8323077;BA.debugLine="userDetails = dbService.sql.ExecQuery($\"SELECT";
__ref._userdetails /*anywheresoftware.b4j.objects.SQL.ResultSetWrapper*/  = __ref._dbservice /*b4j.example.databaseservice*/ ._sql /*anywheresoftware.b4j.objects.SQL*/ .ExecQuery(("SELECT * FROM users WHERE email='"+__c.SmartStringFormatter("",(Object)(_username))+"' AND password='"+__c.SmartStringFormatter("",(Object)(_password))+"'"));
RDebugUtils.currentLine=8323078;
 //BA.debugLineNum = 8323078;BA.debugLine="If (userDetails.NextRow = True) Then";
if ((__ref._userdetails /*anywheresoftware.b4j.objects.SQL.ResultSetWrapper*/ .NextRow()==__c.True)) { 
RDebugUtils.currentLine=8323079;
 //BA.debugLineNum = 8323079;BA.debugLine="userExist = True";
_userexist = __c.True;
 };
 };
 } 
       catch (Exception e10) {
			ba.setLastException(e10);RDebugUtils.currentLine=8323083;
 //BA.debugLineNum = 8323083;BA.debugLine="Main.log.write(LastException.Message)";
_main._log /*b4j.example.logger*/ ._write /*String*/ (null,__c.LastException(ba).getMessage());
RDebugUtils.currentLine=8323084;
 //BA.debugLineNum = 8323084;BA.debugLine="xui.MsgboxAsync($\"Exception: ${LastException}\"$,";
__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .MsgboxAsync(ba,("Exception: "+__c.SmartStringFormatter("",(Object)(__c.LastException(ba).getObject()))+""),"Exception");
 };
RDebugUtils.currentLine=8323086;
 //BA.debugLineNum = 8323086;BA.debugLine="dbService.Disconnect";
__ref._dbservice /*b4j.example.databaseservice*/ ._disconnect /*String*/ (null);
RDebugUtils.currentLine=8323088;
 //BA.debugLineNum = 8323088;BA.debugLine="Return userExist";
if (true) return _userexist;
RDebugUtils.currentLine=8323090;
 //BA.debugLineNum = 8323090;BA.debugLine="End Sub";
return false;
}
public boolean  _logout(b4j.example.loginservice __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="loginservice";
if (Debug.shouldDelegate(ba, "logout", false))
	 {return ((Boolean) Debug.delegate(ba, "logout", null));}
boolean _session_active = false;
RDebugUtils.currentLine=8388608;
 //BA.debugLineNum = 8388608;BA.debugLine="Public Sub Logout() As Boolean";
RDebugUtils.currentLine=8388609;
 //BA.debugLineNum = 8388609;BA.debugLine="Dim session_active As Boolean = False";
_session_active = __c.False;
RDebugUtils.currentLine=8388611;
 //BA.debugLineNum = 8388611;BA.debugLine="Try";
try {RDebugUtils.currentLine=8388612;
 //BA.debugLineNum = 8388612;BA.debugLine="If (dbService.IsInitialized) Then";
if ((__ref._dbservice /*b4j.example.databaseservice*/ .IsInitialized /*boolean*/ ())) { 
RDebugUtils.currentLine=8388613;
 //BA.debugLineNum = 8388613;BA.debugLine="dbService.Disconnect";
__ref._dbservice /*b4j.example.databaseservice*/ ._disconnect /*String*/ (null);
RDebugUtils.currentLine=8388614;
 //BA.debugLineNum = 8388614;BA.debugLine="session_active = False";
_session_active = __c.False;
 }else {
RDebugUtils.currentLine=8388616;
 //BA.debugLineNum = 8388616;BA.debugLine="session_active = True";
_session_active = __c.True;
RDebugUtils.currentLine=8388617;
 //BA.debugLineNum = 8388617;BA.debugLine="Main.log.write(\"Exception: System logout unsucc";
_main._log /*b4j.example.logger*/ ._write /*String*/ (null,"Exception: System logout unsuccessful"+__c.CRLF+"Please contact helpdesk");
RDebugUtils.currentLine=8388618;
 //BA.debugLineNum = 8388618;BA.debugLine="xui.MsgboxAsync(\"Exception: System logout unsuc";
__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .MsgboxAsync(ba,"Exception: System logout unsuccessful"+__c.CRLF+"Please contact helpdesk","Exception");
 };
 } 
       catch (Exception e12) {
			ba.setLastException(e12);RDebugUtils.currentLine=8388621;
 //BA.debugLineNum = 8388621;BA.debugLine="Main.log.write(LastException.Message)";
_main._log /*b4j.example.logger*/ ._write /*String*/ (null,__c.LastException(ba).getMessage());
RDebugUtils.currentLine=8388622;
 //BA.debugLineNum = 8388622;BA.debugLine="xui.MsgboxAsync(LastException.Message,\"Exception";
__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .MsgboxAsync(ba,__c.LastException(ba).getMessage(),"Exception");
 };
RDebugUtils.currentLine=8388625;
 //BA.debugLineNum = 8388625;BA.debugLine="Return session_active";
if (true) return _session_active;
RDebugUtils.currentLine=8388626;
 //BA.debugLineNum = 8388626;BA.debugLine="End Sub";
return false;
}
public String  _class_globals(b4j.example.loginservice __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="loginservice";
RDebugUtils.currentLine=8192000;
 //BA.debugLineNum = 8192000;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=8192001;
 //BA.debugLineNum = 8192001;BA.debugLine="Private fx As JFX";
_fx = new anywheresoftware.b4j.objects.JFX();
RDebugUtils.currentLine=8192002;
 //BA.debugLineNum = 8192002;BA.debugLine="Private xui As XUI";
_xui = new anywheresoftware.b4a.objects.B4XViewWrapper.XUI();
RDebugUtils.currentLine=8192004;
 //BA.debugLineNum = 8192004;BA.debugLine="Private dbService As DatabaseService";
_dbservice = new b4j.example.databaseservice();
RDebugUtils.currentLine=8192005;
 //BA.debugLineNum = 8192005;BA.debugLine="Public userDetails As JdbcResultSet";
_userdetails = new anywheresoftware.b4j.objects.SQL.ResultSetWrapper();
RDebugUtils.currentLine=8192006;
 //BA.debugLineNum = 8192006;BA.debugLine="End Sub";
return "";
}
}