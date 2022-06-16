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
RDebugUtils.currentLine=2162688;
 //BA.debugLineNum = 2162688;BA.debugLine="Public Sub Initialize";
RDebugUtils.currentLine=2162689;
 //BA.debugLineNum = 2162689;BA.debugLine="dbService.Initialize";
__ref._dbservice /*b4j.example.databaseservice*/ ._initialize /*String*/ (null,ba);
RDebugUtils.currentLine=2162690;
 //BA.debugLineNum = 2162690;BA.debugLine="End Sub";
return "";
}
public boolean  _login(b4j.example.loginservice __ref,String _username,String _password) throws Exception{
__ref = this;
RDebugUtils.currentModule="loginservice";
if (Debug.shouldDelegate(ba, "login", false))
	 {return ((Boolean) Debug.delegate(ba, "login", new Object[] {_username,_password}));}
boolean _userexist = false;
RDebugUtils.currentLine=2228224;
 //BA.debugLineNum = 2228224;BA.debugLine="Public Sub Login(username As String, password As S";
RDebugUtils.currentLine=2228225;
 //BA.debugLineNum = 2228225;BA.debugLine="Dim userExist As Boolean = False";
_userexist = __c.False;
RDebugUtils.currentLine=2228227;
 //BA.debugLineNum = 2228227;BA.debugLine="Try";
try {RDebugUtils.currentLine=2228228;
 //BA.debugLineNum = 2228228;BA.debugLine="If ( dbService.sql.IsInitialized = True) Then";
if ((__ref._dbservice /*b4j.example.databaseservice*/ ._sql /*anywheresoftware.b4j.objects.SQL*/ .IsInitialized()==__c.True)) { 
RDebugUtils.currentLine=2228229;
 //BA.debugLineNum = 2228229;BA.debugLine="userDetails = dbService.sql.ExecQuery($\"SELECT";
__ref._userdetails /*anywheresoftware.b4j.objects.SQL.ResultSetWrapper*/  = __ref._dbservice /*b4j.example.databaseservice*/ ._sql /*anywheresoftware.b4j.objects.SQL*/ .ExecQuery(("SELECT * FROM users WHERE email='"+__c.SmartStringFormatter("",(Object)(_username))+"' AND password='"+__c.SmartStringFormatter("",(Object)(_password))+"'"));
RDebugUtils.currentLine=2228230;
 //BA.debugLineNum = 2228230;BA.debugLine="If (userDetails.NextRow = True) Then";
if ((__ref._userdetails /*anywheresoftware.b4j.objects.SQL.ResultSetWrapper*/ .NextRow()==__c.True)) { 
RDebugUtils.currentLine=2228231;
 //BA.debugLineNum = 2228231;BA.debugLine="userExist = True";
_userexist = __c.True;
 };
 };
 } 
       catch (Exception e10) {
			ba.setLastException(e10);RDebugUtils.currentLine=2228235;
 //BA.debugLineNum = 2228235;BA.debugLine="Main.log.write(LastException.Message)";
_main._log /*b4j.example.logger*/ ._write /*String*/ (null,__c.LastException(ba).getMessage());
RDebugUtils.currentLine=2228236;
 //BA.debugLineNum = 2228236;BA.debugLine="xui.MsgboxAsync($\"Exception: ${LastException}\"$,";
__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .MsgboxAsync(ba,("Exception: "+__c.SmartStringFormatter("",(Object)(__c.LastException(ba).getObject()))+""),"Exception");
 };
RDebugUtils.currentLine=2228238;
 //BA.debugLineNum = 2228238;BA.debugLine="dbService.Disconnect";
__ref._dbservice /*b4j.example.databaseservice*/ ._disconnect /*String*/ (null);
RDebugUtils.currentLine=2228240;
 //BA.debugLineNum = 2228240;BA.debugLine="Return userExist";
if (true) return _userexist;
RDebugUtils.currentLine=2228242;
 //BA.debugLineNum = 2228242;BA.debugLine="End Sub";
return false;
}
public boolean  _logout(b4j.example.loginservice __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="loginservice";
if (Debug.shouldDelegate(ba, "logout", false))
	 {return ((Boolean) Debug.delegate(ba, "logout", null));}
boolean _session_active = false;
RDebugUtils.currentLine=2293760;
 //BA.debugLineNum = 2293760;BA.debugLine="Public Sub Logout() As Boolean";
RDebugUtils.currentLine=2293761;
 //BA.debugLineNum = 2293761;BA.debugLine="Dim session_active As Boolean = False";
_session_active = __c.False;
RDebugUtils.currentLine=2293763;
 //BA.debugLineNum = 2293763;BA.debugLine="Try";
try {RDebugUtils.currentLine=2293764;
 //BA.debugLineNum = 2293764;BA.debugLine="If (dbService.IsInitialized) Then";
if ((__ref._dbservice /*b4j.example.databaseservice*/ .IsInitialized /*boolean*/ ())) { 
RDebugUtils.currentLine=2293765;
 //BA.debugLineNum = 2293765;BA.debugLine="dbService.Disconnect";
__ref._dbservice /*b4j.example.databaseservice*/ ._disconnect /*String*/ (null);
RDebugUtils.currentLine=2293766;
 //BA.debugLineNum = 2293766;BA.debugLine="session_active = False";
_session_active = __c.False;
 }else {
RDebugUtils.currentLine=2293768;
 //BA.debugLineNum = 2293768;BA.debugLine="session_active = True";
_session_active = __c.True;
RDebugUtils.currentLine=2293769;
 //BA.debugLineNum = 2293769;BA.debugLine="Main.log.write(\"Exception: System logout unsucc";
_main._log /*b4j.example.logger*/ ._write /*String*/ (null,"Exception: System logout unsuccessful"+__c.CRLF+"Please contact helpdesk");
RDebugUtils.currentLine=2293770;
 //BA.debugLineNum = 2293770;BA.debugLine="xui.MsgboxAsync(\"Exception: System logout unsuc";
__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .MsgboxAsync(ba,"Exception: System logout unsuccessful"+__c.CRLF+"Please contact helpdesk","Exception");
 };
 } 
       catch (Exception e12) {
			ba.setLastException(e12);RDebugUtils.currentLine=2293773;
 //BA.debugLineNum = 2293773;BA.debugLine="Main.log.write(LastException.Message)";
_main._log /*b4j.example.logger*/ ._write /*String*/ (null,__c.LastException(ba).getMessage());
RDebugUtils.currentLine=2293774;
 //BA.debugLineNum = 2293774;BA.debugLine="xui.MsgboxAsync(LastException.Message,\"Exception";
__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .MsgboxAsync(ba,__c.LastException(ba).getMessage(),"Exception");
 };
RDebugUtils.currentLine=2293777;
 //BA.debugLineNum = 2293777;BA.debugLine="Return session_active";
if (true) return _session_active;
RDebugUtils.currentLine=2293778;
 //BA.debugLineNum = 2293778;BA.debugLine="End Sub";
return false;
}
public String  _class_globals(b4j.example.loginservice __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="loginservice";
RDebugUtils.currentLine=2097152;
 //BA.debugLineNum = 2097152;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=2097153;
 //BA.debugLineNum = 2097153;BA.debugLine="Private fx As JFX";
_fx = new anywheresoftware.b4j.objects.JFX();
RDebugUtils.currentLine=2097154;
 //BA.debugLineNum = 2097154;BA.debugLine="Private xui As XUI";
_xui = new anywheresoftware.b4a.objects.B4XViewWrapper.XUI();
RDebugUtils.currentLine=2097156;
 //BA.debugLineNum = 2097156;BA.debugLine="Private dbService As DatabaseService";
_dbservice = new b4j.example.databaseservice();
RDebugUtils.currentLine=2097157;
 //BA.debugLineNum = 2097157;BA.debugLine="Public userDetails As JdbcResultSet";
_userdetails = new anywheresoftware.b4j.objects.SQL.ResultSetWrapper();
RDebugUtils.currentLine=2097158;
 //BA.debugLineNum = 2097158;BA.debugLine="End Sub";
return "";
}
}