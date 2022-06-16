package b4j.example;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class dashboard_subs_0 {


public static RemoteObject  _btnlogout_click() throws Exception{
try {
		Debug.PushSubsStack("btnLogout_Click (dashboard) ","dashboard",2,dashboard.ba,dashboard.mostCurrent,33);
if (RapidSub.canDelegate("btnlogout_click")) { return b4j.example.dashboard.remoteMe.runUserSub(false, "dashboard","btnlogout_click");}
 BA.debugLineNum = 33;BA.debugLine="Private Sub btnLogout_Click";
Debug.ShouldStop(1);
 BA.debugLineNum = 37;BA.debugLine="Try";
Debug.ShouldStop(16);
try { BA.debugLineNum = 38;BA.debugLine="If(LoginForm.lgService.IsInitialized) Then";
Debug.ShouldStop(32);
if ((dashboard._loginform._lgservice /*RemoteObject*/ .runMethod(true,"IsInitialized" /*RemoteObject*/ )).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 40;BA.debugLine="If(LoginForm.lgService.Logout = False) Then";
Debug.ShouldStop(128);
if ((RemoteObject.solveBoolean("=",dashboard._loginform._lgservice /*RemoteObject*/ .runClassMethod (b4j.example.loginservice.class, "_logout" /*RemoteObject*/ ),dashboard.__c.getField(true,"False")))) { 
 BA.debugLineNum = 42;BA.debugLine="Close";
Debug.ShouldStop(512);
_close();
 BA.debugLineNum = 44;BA.debugLine="LoginForm.Show";
Debug.ShouldStop(2048);
dashboard._loginform.runVoidMethod ("_show" /*RemoteObject*/ );
 };
 };
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e9) {
			BA.rdebugUtils.runVoidMethod("setLastException",dashboard.ba, e9.toString()); BA.debugLineNum = 48;BA.debugLine="Main.log.write(LastException.Message)";
Debug.ShouldStop(32768);
dashboard._main._log /*RemoteObject*/ .runClassMethod (b4j.example.logger.class, "_write" /*RemoteObject*/ ,(Object)(dashboard.__c.runMethod(false,"LastException",dashboard.ba).runMethod(true,"getMessage")));
 BA.debugLineNum = 49;BA.debugLine="xui.MsgboxAsync(LastException.Message, \"Exceptio";
Debug.ShouldStop(65536);
dashboard._xui.runVoidMethod ("MsgboxAsync",dashboard.ba,(Object)(dashboard.__c.runMethod(false,"LastException",dashboard.ba).runMethod(true,"getMessage")),(Object)(RemoteObject.createImmutable("Exception")));
 };
 BA.debugLineNum = 51;BA.debugLine="End Sub";
Debug.ShouldStop(262144);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _btnusers_click() throws Exception{
try {
		Debug.PushSubsStack("btnUsers_Click (dashboard) ","dashboard",2,dashboard.ba,dashboard.mostCurrent,29);
if (RapidSub.canDelegate("btnusers_click")) { return b4j.example.dashboard.remoteMe.runUserSub(false, "dashboard","btnusers_click");}
 BA.debugLineNum = 29;BA.debugLine="Private Sub btnUsers_Click";
Debug.ShouldStop(268435456);
 BA.debugLineNum = 30;BA.debugLine="CustomerView.Show";
Debug.ShouldStop(536870912);
dashboard._customerview.runVoidMethod ("_show" /*RemoteObject*/ );
 BA.debugLineNum = 31;BA.debugLine="End Sub";
Debug.ShouldStop(1073741824);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _close() throws Exception{
try {
		Debug.PushSubsStack("Close (dashboard) ","dashboard",2,dashboard.ba,dashboard.mostCurrent,25);
if (RapidSub.canDelegate("close")) { return b4j.example.dashboard.remoteMe.runUserSub(false, "dashboard","close");}
 BA.debugLineNum = 25;BA.debugLine="Public Sub Close";
Debug.ShouldStop(16777216);
 BA.debugLineNum = 26;BA.debugLine="frmDashboard.Close";
Debug.ShouldStop(33554432);
dashboard._frmdashboard.runVoidMethod ("Close");
 BA.debugLineNum = 27;BA.debugLine="End Sub";
Debug.ShouldStop(67108864);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _process_globals() throws Exception{
 //BA.debugLineNum = 2;BA.debugLine="Sub Process_Globals";
 //BA.debugLineNum = 3;BA.debugLine="Private fx As JFX";
dashboard._fx = RemoteObject.createNew ("anywheresoftware.b4j.objects.JFX");
 //BA.debugLineNum = 4;BA.debugLine="Private frmDashboard As Form";
dashboard._frmdashboard = RemoteObject.createNew ("anywheresoftware.b4j.objects.Form");
 //BA.debugLineNum = 5;BA.debugLine="Private xui As XUI";
dashboard._xui = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper.XUI");
 //BA.debugLineNum = 6;BA.debugLine="Private btnLogout As Button";
dashboard._btnlogout = RemoteObject.createNew ("anywheresoftware.b4j.objects.ButtonWrapper");
 //BA.debugLineNum = 7;BA.debugLine="Private lblDirective As Label";
dashboard._lbldirective = RemoteObject.createNew ("anywheresoftware.b4j.objects.LabelWrapper");
 //BA.debugLineNum = 9;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _show() throws Exception{
try {
		Debug.PushSubsStack("Show (dashboard) ","dashboard",2,dashboard.ba,dashboard.mostCurrent,11);
if (RapidSub.canDelegate("show")) { return b4j.example.dashboard.remoteMe.runUserSub(false, "dashboard","show");}
 BA.debugLineNum = 11;BA.debugLine="Public Sub Show";
Debug.ShouldStop(1024);
 BA.debugLineNum = 13;BA.debugLine="If (frmDashboard.IsInitialized = False) Then";
Debug.ShouldStop(4096);
if ((RemoteObject.solveBoolean("=",dashboard._frmdashboard.runMethod(true,"IsInitialized"),dashboard.__c.getField(true,"False")))) { 
 BA.debugLineNum = 14;BA.debugLine="frmDashboard.Initialize(\"dashboard\", 1536, 770)";
Debug.ShouldStop(8192);
dashboard._frmdashboard.runVoidMethod ("Initialize",dashboard.ba,(Object)(BA.ObjectToString("dashboard")),(Object)(BA.numberCast(double.class, 1536)),(Object)(BA.numberCast(double.class, 770)));
 BA.debugLineNum = 15;BA.debugLine="frmDashboard.RootPane.LoadLayout(\"Dashboard\")";
Debug.ShouldStop(16384);
dashboard._frmdashboard.runMethod(false,"getRootPane").runMethodAndSync(false,"LoadLayout",dashboard.ba,(Object)(RemoteObject.createImmutable("Dashboard")));
 };
 BA.debugLineNum = 18;BA.debugLine="lblDirective.Text = $\"Hello ${LoginForm.lgService";
Debug.ShouldStop(131072);
dashboard._lbldirective.runMethod(true,"setText",(RemoteObject.concat(RemoteObject.createImmutable("Hello "),dashboard.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((RemoteObject.concat(dashboard._loginform._lgservice /*RemoteObject*/ .getField(false,"_userdetails" /*RemoteObject*/ ).runMethod(true,"GetString2",(Object)(BA.numberCast(int.class, 1))),RemoteObject.createImmutable(" "),dashboard._loginform._lgservice /*RemoteObject*/ .getField(false,"_userdetails" /*RemoteObject*/ ).runMethod(true,"GetString2",(Object)(BA.numberCast(int.class, 2))))))),RemoteObject.createImmutable(", this is your dashboard"))));
 BA.debugLineNum = 21;BA.debugLine="frmDashboard.Show";
Debug.ShouldStop(1048576);
dashboard._frmdashboard.runVoidMethodAndSync ("Show");
 BA.debugLineNum = 23;BA.debugLine="End Sub";
Debug.ShouldStop(4194304);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}