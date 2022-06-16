package b4j.example;

import anywheresoftware.b4a.debug.*;

import anywheresoftware.b4a.BA;

public class loginform extends Object{
public static loginform mostCurrent = new loginform();

public static BA ba;
static {
		ba = new  anywheresoftware.b4a.shell.ShellBA("b4j.example", "b4j.example.loginform", null);
		ba.loadHtSubs(loginform.class);
        if (ba.getClass().getName().endsWith("ShellBA")) {
			
			ba.raiseEvent2(null, true, "SHELL", false);
			ba.raiseEvent2(null, true, "CREATE", true, "b4j.example.loginform", ba);
		}
	}
    public static Class<?> getObject() {
		return loginform.class;
	}

 
public static anywheresoftware.b4a.keywords.Common __c = null;
public static anywheresoftware.b4j.objects.JFX _fx = null;
public static anywheresoftware.b4j.objects.Form _frmlogin = null;
public static anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper _txtusername = null;
public static anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper _txtpassword = null;
public static String _username = "";
public static b4j.example.loginservice _lgservice = null;
public static anywheresoftware.b4a.objects.B4XViewWrapper.XUI _xui = null;
public static b4j.example.main _main = null;
public static b4j.example.dashboard _dashboard = null;
public static b4j.example.registrationform _registrationform = null;
public static b4j.example.customerview _customerview = null;
public static b4j.example.b4xcollections _b4xcollections = null;
public static b4j.example.dbutils _dbutils = null;
public static String  _show() throws Exception{
RDebugUtils.currentModule="loginform";
if (Debug.shouldDelegate(ba, "show", false))
	 {return ((String) Debug.delegate(ba, "show", null));}
RDebugUtils.currentLine=262144;
 //BA.debugLineNum = 262144;BA.debugLine="Public Sub Show";
RDebugUtils.currentLine=262145;
 //BA.debugLineNum = 262145;BA.debugLine="If frmLogin.IsInitialized = False Then";
if (_frmlogin.IsInitialized()==anywheresoftware.b4a.keywords.Common.False) { 
RDebugUtils.currentLine=262146;
 //BA.debugLineNum = 262146;BA.debugLine="frmLogin.Initialize(\"LoginForm\", 600, 600)";
_frmlogin.Initialize(ba,"LoginForm",600,600);
RDebugUtils.currentLine=262147;
 //BA.debugLineNum = 262147;BA.debugLine="frmLogin.RootPane.LoadLayout(\"LoginForm\")";
_frmlogin.getRootPane().LoadLayout(ba,"LoginForm");
 };
RDebugUtils.currentLine=262150;
 //BA.debugLineNum = 262150;BA.debugLine="Main.Log.Initialize";
_main._log /*b4j.example.logger*/ ._initialize /*String*/ (null,ba);
RDebugUtils.currentLine=262152;
 //BA.debugLineNum = 262152;BA.debugLine="frmLogin.Show";
_frmlogin.Show();
RDebugUtils.currentLine=262153;
 //BA.debugLineNum = 262153;BA.debugLine="End Sub";
return "";
}
public static String  _btnclear_click() throws Exception{
RDebugUtils.currentModule="loginform";
if (Debug.shouldDelegate(ba, "btnclear_click", false))
	 {return ((String) Debug.delegate(ba, "btnclear_click", null));}
RDebugUtils.currentLine=524288;
 //BA.debugLineNum = 524288;BA.debugLine="Private Sub btnClear_Click";
RDebugUtils.currentLine=524289;
 //BA.debugLineNum = 524289;BA.debugLine="clearForm";
_clearform();
RDebugUtils.currentLine=524290;
 //BA.debugLineNum = 524290;BA.debugLine="End Sub";
return "";
}
public static String  _clearform() throws Exception{
RDebugUtils.currentModule="loginform";
if (Debug.shouldDelegate(ba, "clearform", false))
	 {return ((String) Debug.delegate(ba, "clearform", null));}
RDebugUtils.currentLine=589824;
 //BA.debugLineNum = 589824;BA.debugLine="Private Sub clearForm";
RDebugUtils.currentLine=589825;
 //BA.debugLineNum = 589825;BA.debugLine="txtUsername.Text = \"\"";
_txtusername.setText("");
RDebugUtils.currentLine=589826;
 //BA.debugLineNum = 589826;BA.debugLine="txtPassword.Text = \"\"";
_txtpassword.setText("");
RDebugUtils.currentLine=589827;
 //BA.debugLineNum = 589827;BA.debugLine="End Sub";
return "";
}
public static String  _btnlogin_click() throws Exception{
RDebugUtils.currentModule="loginform";
if (Debug.shouldDelegate(ba, "btnlogin_click", false))
	 {return ((String) Debug.delegate(ba, "btnlogin_click", null));}
String _password = "";
RDebugUtils.currentLine=393216;
 //BA.debugLineNum = 393216;BA.debugLine="Private Sub btnLogin_Click";
RDebugUtils.currentLine=393218;
 //BA.debugLineNum = 393218;BA.debugLine="Dim username As String = txtUsername.Text";
_username = _txtusername.getText();
RDebugUtils.currentLine=393219;
 //BA.debugLineNum = 393219;BA.debugLine="Dim password As String = txtPassword.Text";
_password = _txtpassword.getText();
RDebugUtils.currentLine=393221;
 //BA.debugLineNum = 393221;BA.debugLine="Try";
try {RDebugUtils.currentLine=393223;
 //BA.debugLineNum = 393223;BA.debugLine="lgService.Initialize";
_lgservice._initialize /*String*/ (null,ba);
RDebugUtils.currentLine=393225;
 //BA.debugLineNum = 393225;BA.debugLine="If(username.Length < 1 And password.Length < 1)";
if ((_username.length()<1 && _password.length()<1)) { 
RDebugUtils.currentLine=393226;
 //BA.debugLineNum = 393226;BA.debugLine="xui.MsgboxAsync(\"Please enter username and/pass";
_xui.MsgboxAsync(ba,"Please enter username and/password","Please enter credentials");
RDebugUtils.currentLine=393227;
 //BA.debugLineNum = 393227;BA.debugLine="Main.log.write(\"Please enter username and/passw";
_main._log /*b4j.example.logger*/ ._write /*String*/ (null,"Please enter username and/password");
 }else {
RDebugUtils.currentLine=393230;
 //BA.debugLineNum = 393230;BA.debugLine="If( lgService.Login( username, password ) ) The";
if ((_lgservice._login /*boolean*/ (null,_username,_password))) { 
RDebugUtils.currentLine=393232;
 //BA.debugLineNum = 393232;BA.debugLine="Close";
_close();
RDebugUtils.currentLine=393234;
 //BA.debugLineNum = 393234;BA.debugLine="Dashboard.Show";
_dashboard._show /*String*/ ();
 }else {
RDebugUtils.currentLine=393237;
 //BA.debugLineNum = 393237;BA.debugLine="xui.MsgboxAsync(\"Incorrect username and/ passw";
_xui.MsgboxAsync(ba,"Incorrect username and/ password"+anywheresoftware.b4a.keywords.Common.CRLF+"Please varify your credentials","Information");
RDebugUtils.currentLine=393238;
 //BA.debugLineNum = 393238;BA.debugLine="Main.log.write(\"Incorrect username and/ passwo";
_main._log /*b4j.example.logger*/ ._write /*String*/ (null,"Incorrect username and/ password"+anywheresoftware.b4a.keywords.Common.CRLF+"Please varify your credentials");
 };
 };
 } 
       catch (Exception e18) {
			ba.setLastException(e18);RDebugUtils.currentLine=393244;
 //BA.debugLineNum = 393244;BA.debugLine="xui.MsgboxAsync(LastException.Message, \"Exceptio";
_xui.MsgboxAsync(ba,anywheresoftware.b4a.keywords.Common.LastException(ba).getMessage(),"Exception");
RDebugUtils.currentLine=393245;
 //BA.debugLineNum = 393245;BA.debugLine="Main.log.write(\"[\" & lgService.userDetails.GetSt";
_main._log /*b4j.example.logger*/ ._write /*String*/ (null,"["+_lgservice._userdetails /*anywheresoftware.b4j.objects.SQL.ResultSetWrapper*/ .GetString2((int) (0))+"]"+anywheresoftware.b4a.keywords.Common.LastException(ba).getMessage());
 };
RDebugUtils.currentLine=393248;
 //BA.debugLineNum = 393248;BA.debugLine="End Sub";
return "";
}
public static String  _close() throws Exception{
RDebugUtils.currentModule="loginform";
if (Debug.shouldDelegate(ba, "close", false))
	 {return ((String) Debug.delegate(ba, "close", null));}
RDebugUtils.currentLine=327680;
 //BA.debugLineNum = 327680;BA.debugLine="Public Sub Close";
RDebugUtils.currentLine=327682;
 //BA.debugLineNum = 327682;BA.debugLine="frmLogin.Close";
_frmlogin.Close();
RDebugUtils.currentLine=327684;
 //BA.debugLineNum = 327684;BA.debugLine="End Sub";
return "";
}
public static String  _lblregister_mouseclicked(anywheresoftware.b4j.objects.NodeWrapper.MouseEventWrapper _eventdata) throws Exception{
RDebugUtils.currentModule="loginform";
if (Debug.shouldDelegate(ba, "lblregister_mouseclicked", false))
	 {return ((String) Debug.delegate(ba, "lblregister_mouseclicked", new Object[] {_eventdata}));}
RDebugUtils.currentLine=458752;
 //BA.debugLineNum = 458752;BA.debugLine="Private Sub lblRegister_MouseClicked (EventData As";
RDebugUtils.currentLine=458753;
 //BA.debugLineNum = 458753;BA.debugLine="If(EventData.PrimaryButtonPressed = True) Then";
if ((_eventdata.getPrimaryButtonPressed()==anywheresoftware.b4a.keywords.Common.True)) { 
RDebugUtils.currentLine=458754;
 //BA.debugLineNum = 458754;BA.debugLine="RegistrationForm.Show";
_registrationform._show /*String*/ ();
 };
RDebugUtils.currentLine=458756;
 //BA.debugLineNum = 458756;BA.debugLine="End Sub";
return "";
}
}