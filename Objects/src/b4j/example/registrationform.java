package b4j.example;

import anywheresoftware.b4a.debug.*;

import anywheresoftware.b4a.BA;

public class registrationform extends Object{
public static registrationform mostCurrent = new registrationform();

public static BA ba;
static {
		ba = new  anywheresoftware.b4a.shell.ShellBA("b4j.example", "b4j.example.registrationform", null);
		ba.loadHtSubs(registrationform.class);
        if (ba.getClass().getName().endsWith("ShellBA")) {
			
			ba.raiseEvent2(null, true, "SHELL", false);
			ba.raiseEvent2(null, true, "CREATE", true, "b4j.example.registrationform", ba);
		}
	}
    public static Class<?> getObject() {
		return registrationform.class;
	}

 
public static anywheresoftware.b4a.keywords.Common __c = null;
public static anywheresoftware.b4j.objects.JFX _fx = null;
public static anywheresoftware.b4a.objects.B4XViewWrapper.XUI _ui = null;
public static anywheresoftware.b4j.objects.Form _frmregistration = null;
public static anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper _txtid = null;
public static anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper _txtfirstname = null;
public static anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper _txtlastname = null;
public static anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper _txtemail = null;
public static anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper _txtcell = null;
public static anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper _txtaddress = null;
public static anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper _txtpassword = null;
public static anywheresoftware.b4j.objects.ComboBoxWrapper _cbgender = null;
public static anywheresoftware.b4j.objects.ComboBoxWrapper _cbrole = null;
public static anywheresoftware.b4j.objects.ButtonWrapper.ToggleButtonWrapper _tbshow = null;
public static b4j.example.registrationservice _regservice = null;
public static b4j.example.databaseservice _dbservice = null;
public static b4j.example.main _main = null;
public static b4j.example.loginform _loginform = null;
public static b4j.example.dashboard _dashboard = null;
public static b4j.example.customerview _customerview = null;
public static b4j.example.b4xcollections _b4xcollections = null;
public static b4j.example.dbutils _dbutils = null;
public static String  _show() throws Exception{
RDebugUtils.currentModule="registrationform";
if (Debug.shouldDelegate(ba, "show", false))
	 {return ((String) Debug.delegate(ba, "show", null));}
RDebugUtils.currentLine=1048576;
 //BA.debugLineNum = 1048576;BA.debugLine="Public Sub Show";
RDebugUtils.currentLine=1048578;
 //BA.debugLineNum = 1048578;BA.debugLine="If frmRegistration.IsInitialized = False Then";
if (_frmregistration.IsInitialized()==anywheresoftware.b4a.keywords.Common.False) { 
RDebugUtils.currentLine=1048579;
 //BA.debugLineNum = 1048579;BA.debugLine="frmRegistration.Initialize(\"frmFegistration\", 60";
_frmregistration.Initialize(ba,"frmFegistration",600,600);
RDebugUtils.currentLine=1048580;
 //BA.debugLineNum = 1048580;BA.debugLine="frmRegistration.RootPane.LoadLayout(\"Registratio";
_frmregistration.getRootPane().LoadLayout(ba,"RegistrationForm");
 };
RDebugUtils.currentLine=1048583;
 //BA.debugLineNum = 1048583;BA.debugLine="dbService.Initialize";
_dbservice._initialize /*String*/ (null,ba);
RDebugUtils.currentLine=1048585;
 //BA.debugLineNum = 1048585;BA.debugLine="cbGender.Items.AddAll( Array As String(\"Male\", \"F";
_cbgender.getItems().AddAll(anywheresoftware.b4a.keywords.Common.ArrayToList(new String[]{"Male","Female"}));
RDebugUtils.currentLine=1048587;
 //BA.debugLineNum = 1048587;BA.debugLine="ClearForm";
_clearform();
RDebugUtils.currentLine=1048589;
 //BA.debugLineNum = 1048589;BA.debugLine="AddRoles";
_addroles();
RDebugUtils.currentLine=1048591;
 //BA.debugLineNum = 1048591;BA.debugLine="frmRegistration.Show";
_frmregistration.Show();
RDebugUtils.currentLine=1048593;
 //BA.debugLineNum = 1048593;BA.debugLine="End Sub";
return "";
}
public static String  _addroles() throws Exception{
RDebugUtils.currentModule="registrationform";
if (Debug.shouldDelegate(ba, "addroles", false))
	 {return ((String) Debug.delegate(ba, "addroles", null));}
anywheresoftware.b4j.objects.SQL.ResultSetWrapper _records = null;
RDebugUtils.currentLine=1441792;
 //BA.debugLineNum = 1441792;BA.debugLine="Private Sub AddRoles";
RDebugUtils.currentLine=1441794;
 //BA.debugLineNum = 1441794;BA.debugLine="Dim records As JdbcResultSet = dbService.GetRoles";
_records = new anywheresoftware.b4j.objects.SQL.ResultSetWrapper();
_records = _dbservice._getroles /*anywheresoftware.b4j.objects.SQL.ResultSetWrapper*/ (null);
RDebugUtils.currentLine=1441796;
 //BA.debugLineNum = 1441796;BA.debugLine="Do While records.NextRow";
while (_records.NextRow()) {
RDebugUtils.currentLine=1441797;
 //BA.debugLineNum = 1441797;BA.debugLine="cbRole.Items.Add(records.GetString(\"type\"))";
_cbrole.getItems().Add((Object)(_records.GetString("type")));
 }
;
RDebugUtils.currentLine=1441799;
 //BA.debugLineNum = 1441799;BA.debugLine="cbRole.SelectedIndex = 0";
_cbrole.setSelectedIndex((int) (0));
RDebugUtils.currentLine=1441800;
 //BA.debugLineNum = 1441800;BA.debugLine="End Sub";
return "";
}
public static String  _btnclear_click() throws Exception{
RDebugUtils.currentModule="registrationform";
if (Debug.shouldDelegate(ba, "btnclear_click", false))
	 {return ((String) Debug.delegate(ba, "btnclear_click", null));}
RDebugUtils.currentLine=1245184;
 //BA.debugLineNum = 1245184;BA.debugLine="Private Sub btnClear_Click";
RDebugUtils.currentLine=1245186;
 //BA.debugLineNum = 1245186;BA.debugLine="ClearForm";
_clearform();
RDebugUtils.currentLine=1245187;
 //BA.debugLineNum = 1245187;BA.debugLine="End Sub";
return "";
}
public static String  _clearform() throws Exception{
RDebugUtils.currentModule="registrationform";
if (Debug.shouldDelegate(ba, "clearform", false))
	 {return ((String) Debug.delegate(ba, "clearform", null));}
RDebugUtils.currentLine=1310720;
 //BA.debugLineNum = 1310720;BA.debugLine="Private Sub ClearForm";
RDebugUtils.currentLine=1310721;
 //BA.debugLineNum = 1310721;BA.debugLine="txtID.Text = \"\"";
_txtid.setText("");
RDebugUtils.currentLine=1310722;
 //BA.debugLineNum = 1310722;BA.debugLine="txtFirstname.Text = \"\"";
_txtfirstname.setText("");
RDebugUtils.currentLine=1310723;
 //BA.debugLineNum = 1310723;BA.debugLine="txtLastname.Text = \"\"";
_txtlastname.setText("");
RDebugUtils.currentLine=1310724;
 //BA.debugLineNum = 1310724;BA.debugLine="txtEmail.Text = \"\"";
_txtemail.setText("");
RDebugUtils.currentLine=1310725;
 //BA.debugLineNum = 1310725;BA.debugLine="txtCell.Text = \"\"";
_txtcell.setText("");
RDebugUtils.currentLine=1310726;
 //BA.debugLineNum = 1310726;BA.debugLine="txtAddress.Text = \"\"";
_txtaddress.setText("");
RDebugUtils.currentLine=1310727;
 //BA.debugLineNum = 1310727;BA.debugLine="txtPassword.Text = \"\"";
_txtpassword.setText("");
RDebugUtils.currentLine=1310729;
 //BA.debugLineNum = 1310729;BA.debugLine="cbGender.SelectedIndex = 0";
_cbgender.setSelectedIndex((int) (0));
RDebugUtils.currentLine=1310730;
 //BA.debugLineNum = 1310730;BA.debugLine="End Sub";
return "";
}
public static String  _btnregister_click() throws Exception{
RDebugUtils.currentModule="registrationform";
if (Debug.shouldDelegate(ba, "btnregister_click", false))
	 {return ((String) Debug.delegate(ba, "btnregister_click", null));}
String _strid = "";
String _strfirstname = "";
String _strlastname = "";
String _strgender = "";
String _stremail = "";
String _strcell = "";
String _straddr = "";
String _strpassword = "";
byte _bytroleid = (byte)0;
boolean _registersuccess = false;
RDebugUtils.currentLine=1179648;
 //BA.debugLineNum = 1179648;BA.debugLine="Private Sub btnRegister_Click";
RDebugUtils.currentLine=1179650;
 //BA.debugLineNum = 1179650;BA.debugLine="Dim strID As String = txtID.Text.As(String)";
_strid = (_txtid.getText());
RDebugUtils.currentLine=1179651;
 //BA.debugLineNum = 1179651;BA.debugLine="Dim strFirstname As String = txtFirstname.Text.As";
_strfirstname = (_txtfirstname.getText());
RDebugUtils.currentLine=1179652;
 //BA.debugLineNum = 1179652;BA.debugLine="Dim strLastname As String = txtLastname.Text.As(S";
_strlastname = (_txtlastname.getText());
RDebugUtils.currentLine=1179653;
 //BA.debugLineNum = 1179653;BA.debugLine="Dim strGender As String = cbGender.Value.As(Strin";
_strgender = (BA.ObjectToString(_cbgender.getValue()));
RDebugUtils.currentLine=1179654;
 //BA.debugLineNum = 1179654;BA.debugLine="Dim strEmail As String = txtEmail.Text.As(String)";
_stremail = (_txtemail.getText());
RDebugUtils.currentLine=1179655;
 //BA.debugLineNum = 1179655;BA.debugLine="Dim strCell As String = txtCell.Text.As(String)";
_strcell = (_txtcell.getText());
RDebugUtils.currentLine=1179656;
 //BA.debugLineNum = 1179656;BA.debugLine="Dim strAddr As String = txtAddress.Text.As(String";
_straddr = (_txtaddress.getText());
RDebugUtils.currentLine=1179657;
 //BA.debugLineNum = 1179657;BA.debugLine="Dim strPassword As String = txtPassword.Text.As(S";
_strpassword = (_txtpassword.getText());
RDebugUtils.currentLine=1179658;
 //BA.debugLineNum = 1179658;BA.debugLine="Dim bytRoleID As Byte = cbRole.SelectedIndex.As(B";
_bytroleid = ((byte) (_cbrole.getSelectedIndex()));
RDebugUtils.currentLine=1179660;
 //BA.debugLineNum = 1179660;BA.debugLine="Try";
try {RDebugUtils.currentLine=1179662;
 //BA.debugLineNum = 1179662;BA.debugLine="regService.Initialize";
_regservice._initialize /*String*/ (null,ba);
RDebugUtils.currentLine=1179664;
 //BA.debugLineNum = 1179664;BA.debugLine="Dim registerSuccess As Boolean = regService.Regi";
_registersuccess = _regservice._registeruser /*boolean*/ (null,_strid,_strfirstname,_strlastname,_stremail,_strgender,_strcell,_straddr,_strpassword,_bytroleid);
RDebugUtils.currentLine=1179666;
 //BA.debugLineNum = 1179666;BA.debugLine="If(registerSuccess = True) Then";
if ((_registersuccess==anywheresoftware.b4a.keywords.Common.True)) { 
RDebugUtils.currentLine=1179667;
 //BA.debugLineNum = 1179667;BA.debugLine="ui.MsgboxAsync(\"Registration successful\", \"Succ";
_ui.MsgboxAsync(ba,"Registration successful","Success");
RDebugUtils.currentLine=1179668;
 //BA.debugLineNum = 1179668;BA.debugLine="Main.log.write(\"[\" & LoginForm.lgService.userDe";
_main._log /*b4j.example.logger*/ ._write /*String*/ (null,"["+_loginform._lgservice /*b4j.example.loginservice*/ ._userdetails /*anywheresoftware.b4j.objects.SQL.ResultSetWrapper*/ .GetString2((int) (0))+"] Registration successful");
RDebugUtils.currentLine=1179669;
 //BA.debugLineNum = 1179669;BA.debugLine="ClearForm";
_clearform();
RDebugUtils.currentLine=1179670;
 //BA.debugLineNum = 1179670;BA.debugLine="Close";
_close();
 }else {
RDebugUtils.currentLine=1179672;
 //BA.debugLineNum = 1179672;BA.debugLine="ui.MsgboxAsync($\"System could not register ${st";
_ui.MsgboxAsync(ba,("System could not register "+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_strfirstname))+" ")+anywheresoftware.b4a.keywords.Common.CRLF+" Kindly contact help desk.","Hold on!");
 };
 } 
       catch (Exception e22) {
			ba.setLastException(e22);RDebugUtils.currentLine=1179675;
 //BA.debugLineNum = 1179675;BA.debugLine="Main.log.write(\"[\" & LoginForm.lgService.userDet";
_main._log /*b4j.example.logger*/ ._write /*String*/ (null,"["+_loginform._lgservice /*b4j.example.loginservice*/ ._userdetails /*anywheresoftware.b4j.objects.SQL.ResultSetWrapper*/ .GetString2((int) (0))+"] "+anywheresoftware.b4a.keywords.Common.LastException(ba).getMessage());
RDebugUtils.currentLine=1179676;
 //BA.debugLineNum = 1179676;BA.debugLine="ui.MsgboxAsync($\"Exception: ${LastException.Mess";
_ui.MsgboxAsync(ba,("Exception: "+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(anywheresoftware.b4a.keywords.Common.LastException(ba).getMessage()))+""),"Exception");
 };
RDebugUtils.currentLine=1179679;
 //BA.debugLineNum = 1179679;BA.debugLine="End Sub";
return "";
}
public static String  _close() throws Exception{
RDebugUtils.currentModule="registrationform";
if (Debug.shouldDelegate(ba, "close", false))
	 {return ((String) Debug.delegate(ba, "close", null));}
RDebugUtils.currentLine=1114112;
 //BA.debugLineNum = 1114112;BA.debugLine="Public Sub Close";
RDebugUtils.currentLine=1114113;
 //BA.debugLineNum = 1114113;BA.debugLine="frmRegistration.Close";
_frmregistration.Close();
RDebugUtils.currentLine=1114114;
 //BA.debugLineNum = 1114114;BA.debugLine="End Sub";
return "";
}
public static String  _tbshow_selectedchange(boolean _selected) throws Exception{
RDebugUtils.currentModule="registrationform";
if (Debug.shouldDelegate(ba, "tbshow_selectedchange", false))
	 {return ((String) Debug.delegate(ba, "tbshow_selectedchange", new Object[] {_selected}));}
RDebugUtils.currentLine=1376256;
 //BA.debugLineNum = 1376256;BA.debugLine="Private Sub tbShow_SelectedChange(Selected As Bool";
RDebugUtils.currentLine=1376258;
 //BA.debugLineNum = 1376258;BA.debugLine="End Sub";
return "";
}
}