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
RDebugUtils.currentLine=8847360;
 //BA.debugLineNum = 8847360;BA.debugLine="Public Sub GetRoles() As JdbcResultSet";
RDebugUtils.currentLine=8847361;
 //BA.debugLineNum = 8847361;BA.debugLine="Dim result As JdbcResultSet = Null";
_result = new anywheresoftware.b4j.objects.SQL.ResultSetWrapper();
_result = (anywheresoftware.b4j.objects.SQL.ResultSetWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.objects.SQL.ResultSetWrapper(), (java.sql.ResultSet)(__c.Null));
RDebugUtils.currentLine=8847363;
 //BA.debugLineNum = 8847363;BA.debugLine="Try";
try {RDebugUtils.currentLine=8847364;
 //BA.debugLineNum = 8847364;BA.debugLine="If (sql.IsInitialized = True) Then";
if ((__ref._sql /*anywheresoftware.b4j.objects.SQL*/ .IsInitialized()==__c.True)) { 
RDebugUtils.currentLine=8847365;
 //BA.debugLineNum = 8847365;BA.debugLine="result = sql.ExecQuery($\"SELECT * FROM roles\"$)";
_result = __ref._sql /*anywheresoftware.b4j.objects.SQL*/ .ExecQuery(("SELECT * FROM roles"));
 };
 } 
       catch (Exception e7) {
			ba.setLastException(e7);RDebugUtils.currentLine=8847368;
 //BA.debugLineNum = 8847368;BA.debugLine="Main.log.write(\"[\" & LoginForm.lgService.userDet";
_main._log /*b4j.example.logger*/ ._write /*String*/ (null,"["+_loginform._lgservice /*b4j.example.loginservice*/ ._userdetails /*anywheresoftware.b4j.objects.SQL.ResultSetWrapper*/ .GetString2((int) (0))+"] "+__c.LastException(ba).getMessage());
RDebugUtils.currentLine=8847369;
 //BA.debugLineNum = 8847369;BA.debugLine="xui.MsgboxAsync($\"Exception: ${LastException}\"$,";
__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .MsgboxAsync(ba,("Exception: "+__c.SmartStringFormatter("",(Object)(__c.LastException(ba).getObject()))+""),"Exception");
 };
RDebugUtils.currentLine=8847372;
 //BA.debugLineNum = 8847372;BA.debugLine="Return result";
if (true) return _result;
RDebugUtils.currentLine=8847373;
 //BA.debugLineNum = 8847373;BA.debugLine="End Sub";
return null;
}
public String  _initialize(b4j.example.databaseservice __ref,anywheresoftware.b4a.BA _ba) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="databaseservice";
if (Debug.shouldDelegate(ba, "initialize", false))
	 {return ((String) Debug.delegate(ba, "initialize", new Object[] {_ba}));}
RDebugUtils.currentLine=8519680;
 //BA.debugLineNum = 8519680;BA.debugLine="Public Sub Initialize";
RDebugUtils.currentLine=8519682;
 //BA.debugLineNum = 8519682;BA.debugLine="Try";
try {RDebugUtils.currentLine=8519684;
 //BA.debugLineNum = 8519684;BA.debugLine="sql.Initialize2(\"com.mysql.cj.jdbc.Driver\", \"jdb";
__ref._sql /*anywheresoftware.b4j.objects.SQL*/ .Initialize2("com.mysql.cj.jdbc.Driver","jdbc:mysql://127.0.0.1:3306/smartbasket_db","root","");
 } 
       catch (Exception e4) {
			ba.setLastException(e4);RDebugUtils.currentLine=8519686;
 //BA.debugLineNum = 8519686;BA.debugLine="Main.log.write(\"[\" & LoginForm.lgService.userDet";
_main._log /*b4j.example.logger*/ ._write /*String*/ (null,"["+_loginform._lgservice /*b4j.example.loginservice*/ ._userdetails /*anywheresoftware.b4j.objects.SQL.ResultSetWrapper*/ .GetString2((int) (0))+"] "+"Exception: "+__c.LastException(ba).getMessage());
RDebugUtils.currentLine=8519687;
 //BA.debugLineNum = 8519687;BA.debugLine="xui.MsgboxAsync(LastException, \"Exception\")";
__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .MsgboxAsync(ba,BA.ObjectToString(__c.LastException(ba)),"Exception");
 };
RDebugUtils.currentLine=8519690;
 //BA.debugLineNum = 8519690;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4j.objects.SQL.ResultSetWrapper  _getpurchasedetails(b4j.example.databaseservice __ref,String _table,String _id) throws Exception{
__ref = this;
RDebugUtils.currentModule="databaseservice";
if (Debug.shouldDelegate(ba, "getpurchasedetails", false))
	 {return ((anywheresoftware.b4j.objects.SQL.ResultSetWrapper) Debug.delegate(ba, "getpurchasedetails", new Object[] {_table,_id}));}
anywheresoftware.b4j.objects.SQL.ResultSetWrapper _result = null;
RDebugUtils.currentLine=8781824;
 //BA.debugLineNum = 8781824;BA.debugLine="Public Sub GetPurchaseDetails(table As String, id";
RDebugUtils.currentLine=8781825;
 //BA.debugLineNum = 8781825;BA.debugLine="Dim result As JdbcResultSet = Null";
_result = new anywheresoftware.b4j.objects.SQL.ResultSetWrapper();
_result = (anywheresoftware.b4j.objects.SQL.ResultSetWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.objects.SQL.ResultSetWrapper(), (java.sql.ResultSet)(__c.Null));
RDebugUtils.currentLine=8781827;
 //BA.debugLineNum = 8781827;BA.debugLine="Try";
try {RDebugUtils.currentLine=8781828;
 //BA.debugLineNum = 8781828;BA.debugLine="If(sql.IsInitialized = True) Then";
if ((__ref._sql /*anywheresoftware.b4j.objects.SQL*/ .IsInitialized()==__c.True)) { 
RDebugUtils.currentLine=8781829;
 //BA.debugLineNum = 8781829;BA.debugLine="result = sql.ExecQuery($\"SELECT * FROM ${table}";
_result = __ref._sql /*anywheresoftware.b4j.objects.SQL*/ .ExecQuery(("SELECT * FROM "+__c.SmartStringFormatter("",(Object)(_table))+" WHERE id = "+__c.SmartStringFormatter("",(Object)(_id))+""));
 };
 } 
       catch (Exception e7) {
			ba.setLastException(e7);RDebugUtils.currentLine=8781832;
 //BA.debugLineNum = 8781832;BA.debugLine="Main.log.write(\"[\" & LoginForm.lgService.userDet";
_main._log /*b4j.example.logger*/ ._write /*String*/ (null,"["+_loginform._lgservice /*b4j.example.loginservice*/ ._userdetails /*anywheresoftware.b4j.objects.SQL.ResultSetWrapper*/ .GetString2((int) (0))+"] "+__c.LastException(ba).getMessage());
RDebugUtils.currentLine=8781833;
 //BA.debugLineNum = 8781833;BA.debugLine="xui.MsgboxAsync($\"Exception: ${LastException}\"$,";
__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .MsgboxAsync(ba,("Exception: "+__c.SmartStringFormatter("",(Object)(__c.LastException(ba).getObject()))+""),"Exception");
 };
RDebugUtils.currentLine=8781836;
 //BA.debugLineNum = 8781836;BA.debugLine="Return result";
if (true) return _result;
RDebugUtils.currentLine=8781837;
 //BA.debugLineNum = 8781837;BA.debugLine="End Sub";
return null;
}
public String  _disconnect(b4j.example.databaseservice __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="databaseservice";
if (Debug.shouldDelegate(ba, "disconnect", false))
	 {return ((String) Debug.delegate(ba, "disconnect", null));}
RDebugUtils.currentLine=8650752;
 //BA.debugLineNum = 8650752;BA.debugLine="Public Sub Disconnect";
RDebugUtils.currentLine=8650753;
 //BA.debugLineNum = 8650753;BA.debugLine="sql = Null";
__ref._sql /*anywheresoftware.b4j.objects.SQL*/  = (anywheresoftware.b4j.objects.SQL)(__c.Null);
RDebugUtils.currentLine=8650754;
 //BA.debugLineNum = 8650754;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4j.objects.SQL.ResultSetWrapper  _getall(b4j.example.databaseservice __ref,String _table,int _colindex) throws Exception{
__ref = this;
RDebugUtils.currentModule="databaseservice";
if (Debug.shouldDelegate(ba, "getall", false))
	 {return ((anywheresoftware.b4j.objects.SQL.ResultSetWrapper) Debug.delegate(ba, "getall", new Object[] {_table,_colindex}));}
anywheresoftware.b4j.objects.SQL.ResultSetWrapper _result = null;
RDebugUtils.currentLine=8716288;
 //BA.debugLineNum = 8716288;BA.debugLine="Public Sub GetAll(table As String, colIndex As Int";
RDebugUtils.currentLine=8716289;
 //BA.debugLineNum = 8716289;BA.debugLine="Dim result As JdbcResultSet = Null";
_result = new anywheresoftware.b4j.objects.SQL.ResultSetWrapper();
_result = (anywheresoftware.b4j.objects.SQL.ResultSetWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.objects.SQL.ResultSetWrapper(), (java.sql.ResultSet)(__c.Null));
RDebugUtils.currentLine=8716291;
 //BA.debugLineNum = 8716291;BA.debugLine="Try";
try {RDebugUtils.currentLine=8716292;
 //BA.debugLineNum = 8716292;BA.debugLine="If (sql.IsInitialized = True) Then";
if ((__ref._sql /*anywheresoftware.b4j.objects.SQL*/ .IsInitialized()==__c.True)) { 
RDebugUtils.currentLine=8716293;
 //BA.debugLineNum = 8716293;BA.debugLine="If( colIndex < 0 ) Then";
if ((_colindex<0)) { 
RDebugUtils.currentLine=8716294;
 //BA.debugLineNum = 8716294;BA.debugLine="result = sql.ExecQuery($\"SELECT DISTINCT id FR";
_result = __ref._sql /*anywheresoftware.b4j.objects.SQL*/ .ExecQuery(("SELECT DISTINCT id FROM "+__c.SmartStringFormatter("",(Object)(_table))+""));
 };
 };
 } 
       catch (Exception e9) {
			ba.setLastException(e9);RDebugUtils.currentLine=8716298;
 //BA.debugLineNum = 8716298;BA.debugLine="Main.log.write(\"[\" & LoginForm.lgService.userDet";
_main._log /*b4j.example.logger*/ ._write /*String*/ (null,"["+_loginform._lgservice /*b4j.example.loginservice*/ ._userdetails /*anywheresoftware.b4j.objects.SQL.ResultSetWrapper*/ .GetString2((int) (0))+"] "+__c.LastException(ba).getMessage());
RDebugUtils.currentLine=8716299;
 //BA.debugLineNum = 8716299;BA.debugLine="xui.MsgboxAsync(LastException, \"Exception\")";
__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .MsgboxAsync(ba,BA.ObjectToString(__c.LastException(ba)),"Exception");
 };
RDebugUtils.currentLine=8716302;
 //BA.debugLineNum = 8716302;BA.debugLine="Return result";
if (true) return _result;
RDebugUtils.currentLine=8716303;
 //BA.debugLineNum = 8716303;BA.debugLine="End Sub";
return null;
}
public boolean  _deleteuser(b4j.example.databaseservice __ref,String _uid) throws Exception{
__ref = this;
RDebugUtils.currentModule="databaseservice";
if (Debug.shouldDelegate(ba, "deleteuser", false))
	 {return ((Boolean) Debug.delegate(ba, "deleteuser", new Object[] {_uid}));}
boolean _flag = false;
RDebugUtils.currentLine=8912896;
 //BA.debugLineNum = 8912896;BA.debugLine="Public Sub DeleteUser(uid As String) As Boolean";
RDebugUtils.currentLine=8912897;
 //BA.debugLineNum = 8912897;BA.debugLine="Dim flag As Boolean = False";
_flag = __c.False;
RDebugUtils.currentLine=8912898;
 //BA.debugLineNum = 8912898;BA.debugLine="Try";
try {RDebugUtils.currentLine=8912899;
 //BA.debugLineNum = 8912899;BA.debugLine="If(sql.IsInitialized) Then";
if ((__ref._sql /*anywheresoftware.b4j.objects.SQL*/ .IsInitialized())) { 
RDebugUtils.currentLine=8912900;
 //BA.debugLineNum = 8912900;BA.debugLine="sql.ExecNonQuery($\"DELETE FROM users WHERE id =";
__ref._sql /*anywheresoftware.b4j.objects.SQL*/ .ExecNonQuery(("DELETE FROM users WHERE id = "+__c.SmartStringFormatter("",(Object)(_uid))+""));
RDebugUtils.currentLine=8912901;
 //BA.debugLineNum = 8912901;BA.debugLine="flag = True";
_flag = __c.True;
 }else {
RDebugUtils.currentLine=8912903;
 //BA.debugLineNum = 8912903;BA.debugLine="flag = False";
_flag = __c.False;
 };
 } 
       catch (Exception e10) {
			ba.setLastException(e10);RDebugUtils.currentLine=8912906;
 //BA.debugLineNum = 8912906;BA.debugLine="Main.log.write(\"[\" & LoginForm.lgService.userDet";
_main._log /*b4j.example.logger*/ ._write /*String*/ (null,"["+_loginform._lgservice /*b4j.example.loginservice*/ ._userdetails /*anywheresoftware.b4j.objects.SQL.ResultSetWrapper*/ .GetString2((int) (0))+"] "+__c.LastException(ba).getMessage());
RDebugUtils.currentLine=8912907;
 //BA.debugLineNum = 8912907;BA.debugLine="xui.MsgboxAsync($\"Exception: ${LastException}\"$,";
__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .MsgboxAsync(ba,("Exception: "+__c.SmartStringFormatter("",(Object)(__c.LastException(ba).getObject()))+""),"Exception");
 };
RDebugUtils.currentLine=8912910;
 //BA.debugLineNum = 8912910;BA.debugLine="Return flag";
if (true) return _flag;
RDebugUtils.currentLine=8912911;
 //BA.debugLineNum = 8912911;BA.debugLine="End Sub";
return false;
}
public String  _class_globals(b4j.example.databaseservice __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="databaseservice";
RDebugUtils.currentLine=8454144;
 //BA.debugLineNum = 8454144;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=8454145;
 //BA.debugLineNum = 8454145;BA.debugLine="Private fx As JFX";
_fx = new anywheresoftware.b4j.objects.JFX();
RDebugUtils.currentLine=8454146;
 //BA.debugLineNum = 8454146;BA.debugLine="Public sql As JdbcSQL";
_sql = new anywheresoftware.b4j.objects.SQL();
RDebugUtils.currentLine=8454147;
 //BA.debugLineNum = 8454147;BA.debugLine="Private xui As XUI";
_xui = new anywheresoftware.b4a.objects.B4XViewWrapper.XUI();
RDebugUtils.currentLine=8454148;
 //BA.debugLineNum = 8454148;BA.debugLine="End Sub";
return "";
}
public boolean  _isconnected(b4j.example.databaseservice __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="databaseservice";
if (Debug.shouldDelegate(ba, "isconnected", false))
	 {return ((Boolean) Debug.delegate(ba, "isconnected", null));}
RDebugUtils.currentLine=8585216;
 //BA.debugLineNum = 8585216;BA.debugLine="Public Sub IsConnected As Boolean";
RDebugUtils.currentLine=8585217;
 //BA.debugLineNum = 8585217;BA.debugLine="If sql.IsInitialized = True Then";
if (__ref._sql /*anywheresoftware.b4j.objects.SQL*/ .IsInitialized()==__c.True) { 
RDebugUtils.currentLine=8585218;
 //BA.debugLineNum = 8585218;BA.debugLine="Return True";
if (true) return __c.True;
 }else {
RDebugUtils.currentLine=8585220;
 //BA.debugLineNum = 8585220;BA.debugLine="Return False";
if (true) return __c.False;
 };
RDebugUtils.currentLine=8585222;
 //BA.debugLineNum = 8585222;BA.debugLine="End Sub";
return false;
}
}