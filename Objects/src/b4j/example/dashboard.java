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
RDebugUtils.currentLine=655360;
 //BA.debugLineNum = 655360;BA.debugLine="Public Sub Show";
RDebugUtils.currentLine=655362;
 //BA.debugLineNum = 655362;BA.debugLine="If (frmDashboard.IsInitialized = False) Then";
if ((_frmdashboard.IsInitialized()==anywheresoftware.b4a.keywords.Common.False)) { 
RDebugUtils.currentLine=655363;
 //BA.debugLineNum = 655363;BA.debugLine="frmDashboard.Initialize(\"dashboard\", 1536, 770)";
_frmdashboard.Initialize(ba,"dashboard",1536,770);
RDebugUtils.currentLine=655364;
 //BA.debugLineNum = 655364;BA.debugLine="frmDashboard.RootPane.LoadLayout(\"Dashboard\")";
_frmdashboard.getRootPane().LoadLayout(ba,"Dashboard");
 };
RDebugUtils.currentLine=655367;
 //BA.debugLineNum = 655367;BA.debugLine="lblDirective.Text = $\"Hello ${LoginForm.lgService";
_lbldirective.setText(("Hello "+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_loginform._lgservice /*b4j.example.loginservice*/ ._userdetails /*anywheresoftware.b4j.objects.SQL.ResultSetWrapper*/ .GetString2((int) (1))+" "+_loginform._lgservice /*b4j.example.loginservice*/ ._userdetails /*anywheresoftware.b4j.objects.SQL.ResultSetWrapper*/ .GetString2((int) (2))))+", this is your dashboard"));
RDebugUtils.currentLine=655370;
 //BA.debugLineNum = 655370;BA.debugLine="frmDashboard.Show";
_frmdashboard.Show();
RDebugUtils.currentLine=655372;
 //BA.debugLineNum = 655372;BA.debugLine="End Sub";
return "";
}
public static String  _btnlogout_click() throws Exception{
RDebugUtils.currentModule="dashboard";
if (Debug.shouldDelegate(ba, "btnlogout_click", false))
	 {return ((String) Debug.delegate(ba, "btnlogout_click", null));}
RDebugUtils.currentLine=851968;
 //BA.debugLineNum = 851968;BA.debugLine="Private Sub btnLogout_Click";
RDebugUtils.currentLine=851972;
 //BA.debugLineNum = 851972;BA.debugLine="Try";
try {RDebugUtils.currentLine=851973;
 //BA.debugLineNum = 851973;BA.debugLine="If(LoginForm.lgService.IsInitialized) Then";
if ((_loginform._lgservice /*b4j.example.loginservice*/ .IsInitialized /*boolean*/ ())) { 
RDebugUtils.currentLine=851975;
 //BA.debugLineNum = 851975;BA.debugLine="If(LoginForm.lgService.Logout = False) Then";
if ((_loginform._lgservice /*b4j.example.loginservice*/ ._logout /*boolean*/ (null)==anywheresoftware.b4a.keywords.Common.False)) { 
RDebugUtils.currentLine=851977;
 //BA.debugLineNum = 851977;BA.debugLine="Close";
_close();
RDebugUtils.currentLine=851979;
 //BA.debugLineNum = 851979;BA.debugLine="LoginForm.Show";
_loginform._show /*String*/ ();
 };
 };
 } 
       catch (Exception e9) {
			ba.setLastException(e9);RDebugUtils.currentLine=851983;
 //BA.debugLineNum = 851983;BA.debugLine="Main.log.write(LastException.Message)";
_main._log /*b4j.example.logger*/ ._write /*String*/ (null,anywheresoftware.b4a.keywords.Common.LastException(ba).getMessage());
RDebugUtils.currentLine=851984;
 //BA.debugLineNum = 851984;BA.debugLine="xui.MsgboxAsync(LastException.Message, \"Exceptio";
_xui.MsgboxAsync(ba,anywheresoftware.b4a.keywords.Common.LastException(ba).getMessage(),"Exception");
 };
RDebugUtils.currentLine=851986;
 //BA.debugLineNum = 851986;BA.debugLine="End Sub";
return "";
}
public static String  _close() throws Exception{
RDebugUtils.currentModule="dashboard";
if (Debug.shouldDelegate(ba, "close", false))
	 {return ((String) Debug.delegate(ba, "close", null));}
RDebugUtils.currentLine=720896;
 //BA.debugLineNum = 720896;BA.debugLine="Public Sub Close";
RDebugUtils.currentLine=720897;
 //BA.debugLineNum = 720897;BA.debugLine="frmDashboard.Close";
_frmdashboard.Close();
RDebugUtils.currentLine=720898;
 //BA.debugLineNum = 720898;BA.debugLine="End Sub";
return "";
}
public static String  _btnusers_click() throws Exception{
RDebugUtils.currentModule="dashboard";
if (Debug.shouldDelegate(ba, "btnusers_click", false))
	 {return ((String) Debug.delegate(ba, "btnusers_click", null));}
RDebugUtils.currentLine=786432;
 //BA.debugLineNum = 786432;BA.debugLine="Private Sub btnUsers_Click";
RDebugUtils.currentLine=786433;
 //BA.debugLineNum = 786433;BA.debugLine="CustomerView.Show";
_customerview._show /*String*/ ();
RDebugUtils.currentLine=786434;
 //BA.debugLineNum = 786434;BA.debugLine="End Sub";
return "";
}
}