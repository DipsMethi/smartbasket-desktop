package b4j.example;

import anywheresoftware.b4a.debug.*;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;

public class databaseservice extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4a.shell.ShellBA("b4j.example", "b4j.example.databaseservice", this);
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            ba.htSubs = htSubs;
             
        }
        if (BA.isShellModeRuntimeCheck(ba))
                this.getClass().getMethod("_class_globals", b4j.example.databaseservice.class).invoke(this, new Object[] {null});
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
public anywheresoftware.b4j.objects.SQL _sql = null;
public anywheresoftware.b4a.objects.B4XViewWrapper.XUI _xui = null;
public b4j.example.main _main = null;
public b4j.example.loginform _loginform = null;
public b4j.example.dashboard _dashboard = null;
public b4j.example.registrationform _registrationform = null;
public b4j.example.customerview _customerview = null;
public b4j.example.b4xcollections _b4xcollections = null;
public b4j.example.dbutils _dbutils = null;
public anywheresoftware.b4j.objects.SQL.ResultSetWrapper  _getroles(b4j.example.databaseservice __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="databaseservice";
if (Debug.shouldDelegate(ba, "getroles", false))
	 {return ((anywheresoftware.b4j.objects.SQL.ResultSetWrapper) Debug.delegate(ba, "getroles", null));}
anywheresoftware.b4j.objects.SQL.ResultSetWrapper _result = null;
RDebugUtils.currentLine=2752512;
 //BA.debugLineNum = 2752512;BA.debugLine="Public Sub GetRoles() As JdbcResultSet";
RDebugUtils.currentLine=2752513;
 //BA.debugLineNum = 2752513;BA.debugLine="Dim result As JdbcResultSet = Null";
_result = new anywheresoftware.b4j.objects.SQL.ResultSetWrapper();
_result = (anywheresoftware.b4j.objects.SQL.ResultSetWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.objects.SQL.ResultSetWrapper(), (java.sql.ResultSet)(__c.Null));
RDebugUtils.currentLine=2752515;
 //BA.debugLineNum = 2752515;BA.debugLine="Try";
try {RDebugUtils.currentLine=2752516;
 //BA.debugLineNum = 2752516;BA.debugLine="If (sql.IsInitialized = True) Then";
if ((__ref._sql /*anywheresoftware.b4j.objects.SQL*/ .IsInitialized()==__c.True)) { 
RDebugUtils.currentLine=2752517;
 //BA.debugLineNum = 2752517;BA.debugLine="result = sql.ExecQuery($\"SELECT * FROM roles\"$)";
_result = __ref._sql /*anywheresoftware.b4j.objects.SQL*/ .ExecQuery(("SELECT * FROM roles"));
 };
 } 
       catch (Exception e7) {
			ba.setLastException(e7);RDebugUtils.currentLine=2752520;
 //BA.debugLineNum = 2752520;BA.debugLine="Main.log.write(\"[\" & LoginForm.lgService.userDet";
_main._log /*b4j.example.logger*/ ._write /*String*/ (null,"["+_loginform._lgservice /*b4j.example.loginservice*/ ._userdetails /*anywheresoftware.b4j.objects.SQL.ResultSetWrapper*/ .GetString2((int) (0))+"] "+__c.LastException(ba).getMessage());
RDebugUtils.currentLine=2752521;
 //BA.debugLineNum = 2752521;BA.debugLine="xui.MsgboxAsync($\"Exception: ${LastException}\"$,";
__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .MsgboxAsync(ba,("Exception: "+__c.SmartStringFormatter("",(Object)(__c.LastException(ba).getObject()))+""),"Exception");
 };
RDebugUtils.currentLine=2752524;
 //BA.debugLineNum = 2752524;BA.debugLine="Return result";
if (true) return _result;
RDebugUtils.currentLine=2752525;
 //BA.debugLineNum = 2752525;BA.debugLine="End Sub";
return null;
}
public String  _initialize(b4j.example.databaseservice __ref,anywheresoftware.b4a.BA _ba) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="databaseservice";
if (Debug.shouldDelegate(ba, "initialize", false))
	 {return ((String) Debug.delegate(ba, "initialize", new Object[] {_ba}));}
RDebugUtils.currentLine=2424832;
 //BA.debugLineNum = 2424832;BA.debugLine="Public Sub Initialize";
RDebugUtils.currentLine=2424834;
 //BA.debugLineNum = 2424834;BA.debugLine="Try";
try {RDebugUtils.currentLine=2424836;
 //BA.debugLineNum = 2424836;BA.debugLine="sql.Initialize2(\"com.mysql.cj.jdbc.Driver\", \"jdb";
__ref._sql /*anywheresoftware.b4j.objects.SQL*/ .Initialize2("com.mysql.cj.jdbc.Driver","jdbc:mysql://127.0.0.1:3306/smartbasket_db","root","");
 } 
       catch (Exception e4) {
			ba.setLastException(e4);RDebugUtils.currentLine=2424838;
 //BA.debugLineNum = 2424838;BA.debugLine="Main.log.write(\"[\" & LoginForm.lgService.userDet";
_main._log /*b4j.example.logger*/ ._write /*String*/ (null,"["+_loginform._lgservice /*b4j.example.loginservice*/ ._userdetails /*anywheresoftware.b4j.objects.SQL.ResultSetWrapper*/ .GetString2((int) (0))+"] "+"Exception: "+__c.LastException(ba).getMessage());
RDebugUtils.currentLine=2424839;
 //BA.debugLineNum = 2424839;BA.debugLine="xui.MsgboxAsync(LastException, \"Exception\")";
__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .MsgboxAsync(ba,BA.ObjectToString(__c.LastException(ba)),"Exception");
 };
RDebugUtils.currentLine=2424842;
 //BA.debugLineNum = 2424842;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4j.objects.SQL.ResultSetWrapper  _getpurchasedetails(b4j.example.databaseservice __ref,String _table,String _id) throws Exception{
__ref = this;
RDebugUtils.currentModule="databaseservice";
if (Debug.shouldDelegate(ba, "getpurchasedetails", false))
	 {return ((anywheresoftware.b4j.objects.SQL.ResultSetWrapper) Debug.delegate(ba, "getpurchasedetails", new Object[] {_table,_id}));}
anywheresoftware.b4j.objects.SQL.ResultSetWrapper _result = null;
RDebugUtils.currentLine=2686976;
 //BA.debugLineNum = 2686976;BA.debugLine="Public Sub GetPurchaseDetails(table As String, id";
RDebugUtils.currentLine=2686977;
 //BA.debugLineNum = 2686977;BA.debugLine="Dim result As JdbcResultSet = Null";
_result = new anywheresoftware.b4j.objects.SQL.ResultSetWrapper();
_result = (anywheresoftware.b4j.objects.SQL.ResultSetWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.objects.SQL.ResultSetWrapper(), (java.sql.ResultSet)(__c.Null));
RDebugUtils.currentLine=2686979;
 //BA.debugLineNum = 2686979;BA.debugLine="Try";
try {RDebugUtils.currentLine=2686980;
 //BA.debugLineNum = 2686980;BA.debugLine="If(sql.IsInitialized = True) Then";
if ((__ref._sql /*anywheresoftware.b4j.objects.SQL*/ .IsInitialized()==__c.True)) { 
RDebugUtils.currentLine=2686981;
 //BA.debugLineNum = 2686981;BA.debugLine="result = sql.ExecQuery($\"SELECT * FROM ${table}";
_result = __ref._sql /*anywheresoftware.b4j.objects.SQL*/ .ExecQuery(("SELECT * FROM "+__c.SmartStringFormatter("",(Object)(_table))+" WHERE id = "+__c.SmartStringFormatter("",(Object)(_id))+""));
 };
 } 
       catch (Exception e7) {
			ba.setLastException(e7);RDebugUtils.currentLine=2686984;
 //BA.debugLineNum = 2686984;BA.debugLine="Main.log.write(\"[\" & LoginForm.lgService.userDet";
_main._log /*b4j.example.logger*/ ._write /*String*/ (null,"["+_loginform._lgservice /*b4j.example.loginservice*/ ._userdetails /*anywheresoftware.b4j.objects.SQL.ResultSetWrapper*/ .GetString2((int) (0))+"] "+__c.LastException(ba).getMessage());
RDebugUtils.currentLine=2686985;
 //BA.debugLineNum = 2686985;BA.debugLine="xui.MsgboxAsync($\"Exception: ${LastException}\"$,";
__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .MsgboxAsync(ba,("Exception: "+__c.SmartStringFormatter("",(Object)(__c.LastException(ba).getObject()))+""),"Exception");
 };
RDebugUtils.currentLine=2686988;
 //BA.debugLineNum = 2686988;BA.debugLine="Return result";
if (true) return _result;
RDebugUtils.currentLine=2686989;
 //BA.debugLineNum = 2686989;BA.debugLine="End Sub";
return null;
}
public String  _disconnect(b4j.example.databaseservice __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="databaseservice";
if (Debug.shouldDelegate(ba, "disconnect", false))
	 {return ((String) Debug.delegate(ba, "disconnect", null));}
RDebugUtils.currentLine=2555904;
 //BA.debugLineNum = 2555904;BA.debugLine="Public Sub Disconnect";
RDebugUtils.currentLine=2555905;
 //BA.debugLineNum = 2555905;BA.debugLine="sql = Null";
__ref._sql /*anywheresoftware.b4j.objects.SQL*/  = (anywheresoftware.b4j.objects.SQL)(__c.Null);
RDebugUtils.currentLine=2555906;
 //BA.debugLineNum = 2555906;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4j.objects.SQL.ResultSetWrapper  _getall(b4j.example.databaseservice __ref,String _table,int _colindex) throws Exception{
__ref = this;
RDebugUtils.currentModule="databaseservice";
if (Debug.shouldDelegate(ba, "getall", false))
	 {return ((anywheresoftware.b4j.objects.SQL.ResultSetWrapper) Debug.delegate(ba, "getall", new Object[] {_table,_colindex}));}
anywheresoftware.b4j.objects.SQL.ResultSetWrapper _result = null;
RDebugUtils.currentLine=2621440;
 //BA.debugLineNum = 2621440;BA.debugLine="Public Sub GetAll(table As String, colIndex As Int";
RDebugUtils.currentLine=2621441;
 //BA.debugLineNum = 2621441;BA.debugLine="Dim result As JdbcResultSet = Null";
_result = new anywheresoftware.b4j.objects.SQL.ResultSetWrapper();
_result = (anywheresoftware.b4j.objects.SQL.ResultSetWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.objects.SQL.ResultSetWrapper(), (java.sql.ResultSet)(__c.Null));
RDebugUtils.currentLine=2621443;
 //BA.debugLineNum = 2621443;BA.debugLine="Try";
try {RDebugUtils.currentLine=2621444;
 //BA.debugLineNum = 2621444;BA.debugLine="If (sql.IsInitialized = True) Then";
if ((__ref._sql /*anywheresoftware.b4j.objects.SQL*/ .IsInitialized()==__c.True)) { 
RDebugUtils.currentLine=2621445;
 //BA.debugLineNum = 2621445;BA.debugLine="If( colIndex < 0 ) Then";
if ((_colindex<0)) { 
RDebugUtils.currentLine=2621446;
 //BA.debugLineNum = 2621446;BA.debugLine="result = sql.ExecQuery($\"SELECT DISTINCT id FR";
_result = __ref._sql /*anywheresoftware.b4j.objects.SQL*/ .ExecQuery(("SELECT DISTINCT id FROM "+__c.SmartStringFormatter("",(Object)(_table))+""));
 };
 };
 } 
       catch (Exception e9) {
			ba.setLastException(e9);RDebugUtils.currentLine=2621450;
 //BA.debugLineNum = 2621450;BA.debugLine="Main.log.write(\"[\" & LoginForm.lgService.userDet";
_main._log /*b4j.example.logger*/ ._write /*String*/ (null,"["+_loginform._lgservice /*b4j.example.loginservice*/ ._userdetails /*anywheresoftware.b4j.objects.SQL.ResultSetWrapper*/ .GetString2((int) (0))+"] "+__c.LastException(ba).getMessage());
RDebugUtils.currentLine=2621451;
 //BA.debugLineNum = 2621451;BA.debugLine="xui.MsgboxAsync(LastException, \"Exception\")";
__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .MsgboxAsync(ba,BA.ObjectToString(__c.LastException(ba)),"Exception");
 };
RDebugUtils.currentLine=2621454;
 //BA.debugLineNum = 2621454;BA.debugLine="Return result";
if (true) return _result;
RDebugUtils.currentLine=2621455;
 //BA.debugLineNum = 2621455;BA.debugLine="End Sub";
return null;
}
public boolean  _deleteuser(b4j.example.databaseservice __ref,String _uid) throws Exception{
__ref = this;
RDebugUtils.currentModule="databaseservice";
if (Debug.shouldDelegate(ba, "deleteuser", false))
	 {return ((Boolean) Debug.delegate(ba, "deleteuser", new Object[] {_uid}));}
boolean _flag = false;
RDebugUtils.currentLine=2818048;
 //BA.debugLineNum = 2818048;BA.debugLine="Public Sub DeleteUser(uid As String) As Boolean";
RDebugUtils.currentLine=2818049;
 //BA.debugLineNum = 2818049;BA.debugLine="Dim flag As Boolean = False";
_flag = __c.False;
RDebugUtils.currentLine=2818050;
 //BA.debugLineNum = 2818050;BA.debugLine="Try";
try {RDebugUtils.currentLine=2818051;
 //BA.debugLineNum = 2818051;BA.debugLine="If(sql.IsInitialized) Then";
if ((__ref._sql /*anywheresoftware.b4j.objects.SQL*/ .IsInitialized())) { 
RDebugUtils.currentLine=2818052;
 //BA.debugLineNum = 2818052;BA.debugLine="sql.ExecNonQuery($\"DELETE FROM users WHERE id =";
__ref._sql /*anywheresoftware.b4j.objects.SQL*/ .ExecNonQuery(("DELETE FROM users WHERE id = "+__c.SmartStringFormatter("",(Object)(_uid))+""));
RDebugUtils.currentLine=2818053;
 //BA.debugLineNum = 2818053;BA.debugLine="flag = True";
_flag = __c.True;
 }else {
RDebugUtils.currentLine=2818055;
 //BA.debugLineNum = 2818055;BA.debugLine="flag = False";
_flag = __c.False;
 };
 } 
       catch (Exception e10) {
			ba.setLastException(e10);RDebugUtils.currentLine=2818058;
 //BA.debugLineNum = 2818058;BA.debugLine="Main.log.write(\"[\" & LoginForm.lgService.userDet";
_main._log /*b4j.example.logger*/ ._write /*String*/ (null,"["+_loginform._lgservice /*b4j.example.loginservice*/ ._userdetails /*anywheresoftware.b4j.objects.SQL.ResultSetWrapper*/ .GetString2((int) (0))+"] "+__c.LastException(ba).getMessage());
RDebugUtils.currentLine=2818059;
 //BA.debugLineNum = 2818059;BA.debugLine="xui.MsgboxAsync($\"Exception: ${LastException}\"$,";
__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .MsgboxAsync(ba,("Exception: "+__c.SmartStringFormatter("",(Object)(__c.LastException(ba).getObject()))+""),"Exception");
 };
RDebugUtils.currentLine=2818062;
 //BA.debugLineNum = 2818062;BA.debugLine="Return flag";
if (true) return _flag;
RDebugUtils.currentLine=2818063;
 //BA.debugLineNum = 2818063;BA.debugLine="End Sub";
return false;
}
public String  _class_globals(b4j.example.databaseservice __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="databaseservice";
RDebugUtils.currentLine=2359296;
 //BA.debugLineNum = 2359296;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=2359297;
 //BA.debugLineNum = 2359297;BA.debugLine="Private fx As JFX";
_fx = new anywheresoftware.b4j.objects.JFX();
RDebugUtils.currentLine=2359298;
 //BA.debugLineNum = 2359298;BA.debugLine="Public sql As JdbcSQL";
_sql = new anywheresoftware.b4j.objects.SQL();
RDebugUtils.currentLine=2359299;
 //BA.debugLineNum = 2359299;BA.debugLine="Private xui As XUI";
_xui = new anywheresoftware.b4a.objects.B4XViewWrapper.XUI();
RDebugUtils.currentLine=2359300;
 //BA.debugLineNum = 2359300;BA.debugLine="End Sub";
return "";
}
public boolean  _isconnected(b4j.example.databaseservice __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="databaseservice";
if (Debug.shouldDelegate(ba, "isconnected", false))
	 {return ((Boolean) Debug.delegate(ba, "isconnected", null));}
RDebugUtils.currentLine=2490368;
 //BA.debugLineNum = 2490368;BA.debugLine="Public Sub IsConnected As Boolean";
RDebugUtils.currentLine=2490369;
 //BA.debugLineNum = 2490369;BA.debugLine="If sql.IsInitialized = True Then";
if (__ref._sql /*anywheresoftware.b4j.objects.SQL*/ .IsInitialized()==__c.True) { 
RDebugUtils.currentLine=2490370;
 //BA.debugLineNum = 2490370;BA.debugLine="Return True";
if (true) return __c.True;
 }else {
RDebugUtils.currentLine=2490372;
 //BA.debugLineNum = 2490372;BA.debugLine="Return False";
if (true) return __c.False;
 };
RDebugUtils.currentLine=2490374;
 //BA.debugLineNum = 2490374;BA.debugLine="End Sub";
return false;
}
}