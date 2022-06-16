package b4j.example;

import anywheresoftware.b4a.debug.*;

import anywheresoftware.b4a.BA;

public class dashboard extends Object{
public static dashboard mostCurrent = new dashboard();

public static BA ba;
static {
		ba = new  anywheresoftware.b4a.shell.ShellBA("b4j.example", "b4j.example.dashboard", null);
		ba.loadHtSubs(dashboard.class);
        if (ba.getClass().getName().endsWith("ShellBA")) {
			
			ba.raiseEvent2(null, true, "SHELL", false);
			ba.raiseEvent2(null, true, "CREATE", true, "b4j.example.dashboard", ba);
		}
	}
    public static Class<?> getObject() {
		return dashboard.class;
	}

 
public static anywheresoftware.b4a.keywords.Common __c = null;
public static anywheresoftware.b4j.objects.JFX _fx = null;
public static anywheresoftware.b4j.objects.Form _frmdashboard = null;
public static anywheresoftware.b4a.objects.B4XViewWrapper.XUI _xui = null;
public static anywheresoftware.b4j.objects.ButtonWrapper _btnlogout = null;
public static anywheresoftware.b4j.objects.LabelWrapper _lbldirective = null;
public static b4j.example.main _main = null;
public static b4j.example.loginform _loginform = null;
public static b4j.example.registrationform _registrationform = null;
public static b4j.example.customerview _customerview = null;
public static b4j.example.b4xcollections _b4xcollections = null;
public static b4j.example.dbutils _dbutils = null;
public static String  _show() throws Exception{
RDebugUtils.currentModule="dashboard";
if (Debug.shouldDelegate(ba, "show", false))
	 {return ((String) Debug.delegate(ba, "show", null));}
RDebugUtils.currentLine=720896;
 //BA.debugLineNum = 720896;BA.debugLine="Public Sub Show";
RDebugUtils.currentLine=720898;
 //BA.debugLineNum = 720898;BA.debugLine="If (frmDashboard.IsInitialized = False) Then";
if ((_frmdashboard.IsInitialized()==anywheresoftware.b4a.keywords.Common.False)) { 
RDebugUtils.currentLine=720899;
 //BA.debugLineNum = 720899;BA.debugLine="frmDashboard.Initialize(\"dashboard\", 1536, 770)";
_frmdashboard.Initialize(ba,"dashboard",1536,770);
RDebugUtils.currentLine=720900;
 //BA.debugLineNum = 720900;BA.debugLine="frmDashboard.RootPane.LoadLayout(\"Dashboard\")";
_frmdashboard.getRootPane().LoadLayout(ba,"Dashboard");
 };
RDebugUtils.currentLine=720903;
 //BA.debugLineNum = 720903;BA.debugLine="lblDirective.Text = $\"Hello ${LoginForm.lgService";
_lbldirective.setText(("Hello "+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_loginform._lgservice /*b4j.example.loginservice*/ ._userdetails /*anywheresoftware.b4j.objects.SQL.ResultSetWrapper*/ .GetString2((int) (1))+" "+_loginform._lgservice /*b4j.example.loginservice*/ ._userdetails /*anywheresoftware.b4j.objects.SQL.ResultSetWrapper*/ .GetString2((int) (2))))+", this is your dashboard"));
RDebugUtils.currentLine=720906;
 //BA.debugLineNum = 720906;BA.debugLine="frmDashboard.Show";
_frmdashboard.Show();
RDebugUtils.currentLine=720908;
 //BA.debugLineNum = 720908;BA.debugLine="End Sub";
return "";
}
public static String  _btnlogout_click() throws Exception{
RDebugUtils.currentModule="dashboard";
if (Debug.shouldDelegate(ba, "btnlogout_click", false))
	 {return ((String) Debug.delegate(ba, "btnlogout_click", null));}
RDebugUtils.currentLine=917504;
 //BA.debugLineNum = 917504;BA.debugLine="Private Sub btnLogout_Click";
RDebugUtils.currentLine=917508;
 //BA.debugLineNum = 917508;BA.debugLine="Try";
try {RDebugUtils.currentLine=917509;
 //BA.debugLineNum = 917509;BA.debugLine="If(LoginForm.lgService.IsInitialized) Then";
if ((_loginform._lgservice /*b4j.example.loginservice*/ .IsInitialized /*boolean*/ ())) { 
RDebugUtils.currentLine=917511;
 //BA.debugLineNum = 917511;BA.debugLine="If(LoginForm.lgService.Logout = False) Then";
if ((_loginform._lgservice /*b4j.example.loginservice*/ ._logout /*boolean*/ (null)==anywheresoftware.b4a.keywords.Common.False)) { 
RDebugUtils.currentLine=917513;
 //BA.debugLineNum = 917513;BA.debugLine="Close";
_close();
RDebugUtils.currentLine=917515;
 //BA.debugLineNum = 917515;BA.debugLine="LoginForm.Show";
_loginform._show /*String*/ ();
 };
 };
 } 
       catch (Exception e9) {
			ba.setLastException(e9);RDebugUtils.currentLine=917519;
 //BA.debugLineNum = 917519;BA.debugLine="Main.log.write(LastException.Message)";
_main._log /*b4j.example.logger*/ ._write /*String*/ (null,anywheresoftware.b4a.keywords.Common.LastException(ba).getMessage());
RDebugUtils.currentLine=917520;
 //BA.debugLineNum = 917520;BA.debugLine="xui.MsgboxAsync(LastException.Message, \"Exceptio";
_xui.MsgboxAsync(ba,anywheresoftware.b4a.keywords.Common.LastException(ba).getMessage(),"Exception");
 };
RDebugUtils.currentLine=917522;
 //BA.debugLineNum = 917522;BA.debugLine="End Sub";
return "";
}
public static String  _close() throws Exception{
RDebugUtils.currentModule="dashboard";
if (Debug.shouldDelegate(ba, "close", false))
	 {return ((String) Debug.delegate(ba, "close", null));}
RDebugUtils.currentLine=786432;
 //BA.debugLineNum = 786432;BA.debugLine="Public Sub Close";
RDebugUtils.currentLine=786433;
 //BA.debugLineNum = 786433;BA.debugLine="frmDashboard.Close";
_frmdashboard.Close();
RDebugUtils.currentLine=786434;
 //BA.debugLineNum = 786434;BA.debugLine="End Sub";
return "";
}
public static String  _btnusers_click() throws Exception{
RDebugUtils.currentModule="dashboard";
if (Debug.shouldDelegate(ba, "btnusers_click", false))
	 {return ((String) Debug.delegate(ba, "btnusers_click", null));}
RDebugUtils.currentLine=851968;
 //BA.debugLineNum = 851968;BA.debugLine="Private Sub btnUsers_Click";
RDebugUtils.currentLine=851969;
 //BA.debugLineNum = 851969;BA.debugLine="CustomerView.Show";
_customerview._show /*String*/ ();
RDebugUtils.currentLine=851970;
 //BA.debugLineNum = 851970;BA.debugLine="End Sub";
return "";
}
}