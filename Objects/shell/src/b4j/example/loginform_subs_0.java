package b4j.example;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class loginform_subs_0 {


public static RemoteObject  _btnclear_click() throws Exception{
try {
		Debug.PushSubsStack("btnClear_Click (loginform) ","loginform",1,loginform.ba,loginform.mostCurrent,74);
if (RapidSub.canDelegate("btnclear_click")) { return b4j.example.loginform.remoteMe.runUserSub(false, "loginform","btnclear_click");}
 BA.debugLineNum = 74;BA.debugLine="Private Sub btnClear_Click";
Debug.ShouldStop(512);
 BA.debugLineNum = 75;BA.debugLine="clearForm";
Debug.ShouldStop(1024);
_clearform();
 BA.debugLineNum = 76;BA.debugLine="End Sub";
Debug.ShouldStop(2048);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _btnlogin_click() throws Exception{
try {
		Debug.PushSubsStack("btnLogin_Click (loginform) ","loginform",1,loginform.ba,loginform.mostCurrent,34);
if (RapidSub.canDelegate("btnlogin_click")) { return b4j.example.loginform.remoteMe.runUserSub(false, "loginform","btnlogin_click");}
RemoteObject _password = RemoteObject.createImmutable("");
 BA.debugLineNum = 34;BA.debugLine="Private Sub btnLogin_Click";
Debug.ShouldStop(2);
 BA.debugLineNum = 36;BA.debugLine="Dim username As String = txtUsername.Text";
Debug.ShouldStop(8);
loginform._username = loginform._txtusername.runMethod(true,"getText");
 BA.debugLineNum = 37;BA.debugLine="Dim password As String = txtPassword.Text";
Debug.ShouldStop(16);
_password = loginform._txtpassword.runMethod(true,"getText");Debug.locals.put("password", _password);Debug.locals.put("password", _password);
 BA.debugLineNum = 39;BA.debugLine="Try";
Debug.ShouldStop(64);
try { BA.debugLineNum = 41;BA.debugLine="lgService.Initialize";
Debug.ShouldStop(256);
loginform._lgservice.runClassMethod (b4j.example.loginservice.class, "_initialize" /*RemoteObject*/ ,loginform.ba);
 BA.debugLineNum = 43;BA.debugLine="If(username.Length < 1 And password.Length < 1)";
Debug.ShouldStop(1024);
if ((RemoteObject.solveBoolean("<",loginform._username.runMethod(true,"length"),BA.numberCast(double.class, 1)) && RemoteObject.solveBoolean("<",_password.runMethod(true,"length"),BA.numberCast(double.class, 1)))) { 
 BA.debugLineNum = 44;BA.debugLine="xui.MsgboxAsync(\"Please enter username and/pass";
Debug.ShouldStop(2048);
loginform._xui.runVoidMethod ("MsgboxAsync",loginform.ba,(Object)(BA.ObjectToString("Please enter username and/password")),(Object)(RemoteObject.createImmutable("Please enter credentials")));
 BA.debugLineNum = 45;BA.debugLine="Main.log.write(\"Please enter username and/passw";
Debug.ShouldStop(4096);
loginform._main._log /*RemoteObject*/ .runClassMethod (b4j.example.logger.class, "_write" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("Please enter username and/password")));
 }else {
 BA.debugLineNum = 48;BA.debugLine="If( lgService.Login( username, password ) ) The";
Debug.ShouldStop(32768);
if ((loginform._lgservice.runClassMethod (b4j.example.loginservice.class, "_login" /*RemoteObject*/ ,(Object)(loginform._username),(Object)(_password))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 50;BA.debugLine="Close";
Debug.ShouldStop(131072);
_close();
 BA.debugLineNum = 52;BA.debugLine="Dashboard.Show";
Debug.ShouldStop(524288);
loginform._dashboard.runVoidMethod ("_show" /*RemoteObject*/ );
 }else {
 BA.debugLineNum = 55;BA.debugLine="xui.MsgboxAsync(\"Incorrect username and/ passw";
Debug.ShouldStop(4194304);
loginform._xui.runVoidMethod ("MsgboxAsync",loginform.ba,(Object)(RemoteObject.concat(RemoteObject.createImmutable("Incorrect username and/ password"),loginform.__c.getField(true,"CRLF"),RemoteObject.createImmutable("Please varify your credentials"))),(Object)(RemoteObject.createImmutable("Information")));
 BA.debugLineNum = 56;BA.debugLine="Main.log.write(\"Incorrect username and/ passwo";
Debug.ShouldStop(8388608);
loginform._main._log /*RemoteObject*/ .runClassMethod (b4j.example.logger.class, "_write" /*RemoteObject*/ ,(Object)(RemoteObject.concat(RemoteObject.createImmutable("Incorrect username and/ password"),loginform.__c.getField(true,"CRLF"),RemoteObject.createImmutable("Please varify your credentials"))));
 };
 };
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e18) {
			BA.rdebugUtils.runVoidMethod("setLastException",loginform.ba, e18.toString()); BA.debugLineNum = 62;BA.debugLine="xui.MsgboxAsync(LastException.Message, \"Exceptio";
Debug.ShouldStop(536870912);
loginform._xui.runVoidMethod ("MsgboxAsync",loginform.ba,(Object)(loginform.__c.runMethod(false,"LastException",loginform.ba).runMethod(true,"getMessage")),(Object)(RemoteObject.createImmutable("Exception")));
 BA.debugLineNum = 63;BA.debugLine="Main.log.write(\"[\" & lgService.userDetails.GetSt";
Debug.ShouldStop(1073741824);
loginform._main._log /*RemoteObject*/ .runClassMethod (b4j.example.logger.class, "_write" /*RemoteObject*/ ,(Object)(RemoteObject.concat(RemoteObject.createImmutable("["),loginform._lgservice.getField(false,"_userdetails" /*RemoteObject*/ ).runMethod(true,"GetString2",(Object)(BA.numberCast(int.class, 0))),RemoteObject.createImmutable("]"),loginform.__c.runMethod(false,"LastException",loginform.ba).runMethod(true,"getMessage"))));
 };
 BA.debugLineNum = 66;BA.debugLine="End Sub";
Debug.ShouldStop(2);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _clearform() throws Exception{
try {
		Debug.PushSubsStack("clearForm (loginform) ","loginform",1,loginform.ba,loginform.mostCurrent,78);
if (RapidSub.canDelegate("clearform")) { return b4j.example.loginform.remoteMe.runUserSub(false, "loginform","clearform");}
 BA.debugLineNum = 78;BA.debugLine="Private Sub clearForm";
Debug.ShouldStop(8192);
 BA.debugLineNum = 79;BA.debugLine="txtUsername.Text = \"\"";
Debug.ShouldStop(16384);
loginform._txtusername.runMethod(true,"setText",BA.ObjectToString(""));
 BA.debugLineNum = 80;BA.debugLine="txtPassword.Text = \"\"";
Debug.ShouldStop(32768);
loginform._txtpassword.runMethod(true,"setText",BA.ObjectToString(""));
 BA.debugLineNum = 81;BA.debugLine="End Sub";
Debug.ShouldStop(65536);
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
		Debug.PushSubsStack("Close (loginform) ","loginform",1,loginform.ba,loginform.mostCurrent,28);
if (RapidSub.canDelegate("close")) { return b4j.example.loginform.remoteMe.runUserSub(false, "loginform","close");}
 BA.debugLineNum = 28;BA.debugLine="Public Sub Close";
Debug.ShouldStop(134217728);
 BA.debugLineNum = 30;BA.debugLine="frmLogin.Close";
Debug.ShouldStop(536870912);
loginform._frmlogin.runVoidMethod ("Close");
 BA.debugLineNum = 32;BA.debugLine="End Sub";
Debug.ShouldStop(-2147483648);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _lblregister_mouseclicked(RemoteObject _eventdata) throws Exception{
try {
		Debug.PushSubsStack("lblRegister_MouseClicked (loginform) ","loginform",1,loginform.ba,loginform.mostCurrent,68);
if (RapidSub.canDelegate("lblregister_mouseclicked")) { return b4j.example.loginform.remoteMe.runUserSub(false, "loginform","lblregister_mouseclicked", _eventdata);}
Debug.locals.put("EventData", _eventdata);
 BA.debugLineNum = 68;BA.debugLine="Private Sub lblRegister_MouseClicked (EventData As";
Debug.ShouldStop(8);
 BA.debugLineNum = 69;BA.debugLine="If(EventData.PrimaryButtonPressed = True) Then";
Debug.ShouldStop(16);
if ((RemoteObject.solveBoolean("=",_eventdata.runMethod(true,"getPrimaryButtonPressed"),loginform.__c.getField(true,"True")))) { 
 BA.debugLineNum = 70;BA.debugLine="RegistrationForm.Show";
Debug.ShouldStop(32);
loginform._registrationform.runVoidMethod ("_show" /*RemoteObject*/ );
 };
 BA.debugLineNum = 72;BA.debugLine="End Sub";
Debug.ShouldStop(128);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _process_globals() throws Exception{
 //BA.debugLineNum = 4;BA.debugLine="Sub Process_Globals";
 //BA.debugLineNum = 6;BA.debugLine="Private fx As JFX";
loginform._fx = RemoteObject.createNew ("anywheresoftware.b4j.objects.JFX");
 //BA.debugLineNum = 7;BA.debugLine="Private frmLogin As Form";
loginform._frmlogin = RemoteObject.createNew ("anywheresoftware.b4j.objects.Form");
 //BA.debugLineNum = 8;BA.debugLine="Private txtUsername As TextField";
loginform._txtusername = RemoteObject.createNew ("anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper");
 //BA.debugLineNum = 9;BA.debugLine="Private txtPassword As TextField";
loginform._txtpassword = RemoteObject.createNew ("anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper");
 //BA.debugLineNum = 10;BA.debugLine="Public username As String";
loginform._username = RemoteObject.createImmutable("");
 //BA.debugLineNum = 12;BA.debugLine="Public lgService As LoginService";
loginform._lgservice = RemoteObject.createNew ("b4j.example.loginservice");
 //BA.debugLineNum = 13;BA.debugLine="Private xui As XUI";
loginform._xui = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper.XUI");
 //BA.debugLineNum = 15;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _show() throws Exception{
try {
		Debug.PushSubsStack("Show (loginform) ","loginform",1,loginform.ba,loginform.mostCurrent,17);
if (RapidSub.canDelegate("show")) { return b4j.example.loginform.remoteMe.runUserSub(false, "loginform","show");}
 BA.debugLineNum = 17;BA.debugLine="Public Sub Show";
Debug.ShouldStop(65536);
 BA.debugLineNum = 18;BA.debugLine="If frmLogin.IsInitialized = False Then";
Debug.ShouldStop(131072);
if (RemoteObject.solveBoolean("=",loginform._frmlogin.runMethod(true,"IsInitialized"),loginform.__c.getField(true,"False"))) { 
 BA.debugLineNum = 19;BA.debugLine="frmLogin.Initialize(\"LoginForm\", 600, 600)";
Debug.ShouldStop(262144);
loginform._frmlogin.runVoidMethod ("Initialize",loginform.ba,(Object)(BA.ObjectToString("LoginForm")),(Object)(BA.numberCast(double.class, 600)),(Object)(BA.numberCast(double.class, 600)));
 BA.debugLineNum = 20;BA.debugLine="frmLogin.RootPane.LoadLayout(\"LoginForm\")";
Debug.ShouldStop(524288);
loginform._frmlogin.runMethod(false,"getRootPane").runMethodAndSync(false,"LoadLayout",loginform.ba,(Object)(RemoteObject.createImmutable("LoginForm")));
 };
 BA.debugLineNum = 23;BA.debugLine="Main.Log.Initialize";
Debug.ShouldStop(4194304);
loginform._main._log /*RemoteObject*/ .runClassMethod (b4j.example.logger.class, "_initialize" /*RemoteObject*/ ,loginform.ba);
 BA.debugLineNum = 25;BA.debugLine="frmLogin.Show";
Debug.ShouldStop(16777216);
loginform._frmlogin.runVoidMethodAndSync ("Show");
 BA.debugLineNum = 26;BA.debugLine="End Sub";
Debug.ShouldStop(33554432);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}