package b4j.example;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class registrationform_subs_0 {


public static RemoteObject  _addroles() throws Exception{
try {
		Debug.PushSubsStack("AddRoles (registrationform) ","registrationform",3,registrationform.ba,registrationform.mostCurrent,104);
if (RapidSub.canDelegate("addroles")) { return b4j.example.registrationform.remoteMe.runUserSub(false, "registrationform","addroles");}
RemoteObject _records = RemoteObject.declareNull("anywheresoftware.b4j.objects.SQL.ResultSetWrapper");
 BA.debugLineNum = 104;BA.debugLine="Private Sub AddRoles";
Debug.ShouldStop(128);
 BA.debugLineNum = 106;BA.debugLine="Dim records As JdbcResultSet = dbService.GetRoles";
Debug.ShouldStop(512);
_records = RemoteObject.createNew ("anywheresoftware.b4j.objects.SQL.ResultSetWrapper");
_records = registrationform._dbservice.runClassMethod (b4j.example.databaseservice.class, "_getroles" /*RemoteObject*/ );Debug.locals.put("records", _records);Debug.locals.put("records", _records);
 BA.debugLineNum = 108;BA.debugLine="Do While records.NextRow";
Debug.ShouldStop(2048);
while (_records.runMethod(true,"NextRow").<Boolean>get().booleanValue()) {
 BA.debugLineNum = 109;BA.debugLine="cbRole.Items.Add(records.GetString(\"type\"))";
Debug.ShouldStop(4096);
registrationform._cbrole.runMethod(false,"getItems").runVoidMethod ("Add",(Object)((_records.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("type"))))));
 }
;
 BA.debugLineNum = 111;BA.debugLine="cbRole.SelectedIndex = 0";
Debug.ShouldStop(16384);
registrationform._cbrole.runMethod(true,"setSelectedIndex",BA.numberCast(int.class, 0));
 BA.debugLineNum = 112;BA.debugLine="End Sub";
Debug.ShouldStop(32768);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _btnclear_click() throws Exception{
try {
		Debug.PushSubsStack("btnClear_Click (registrationform) ","registrationform",3,registrationform.ba,registrationform.mostCurrent,83);
if (RapidSub.canDelegate("btnclear_click")) { return b4j.example.registrationform.remoteMe.runUserSub(false, "registrationform","btnclear_click");}
 BA.debugLineNum = 83;BA.debugLine="Private Sub btnClear_Click";
Debug.ShouldStop(262144);
 BA.debugLineNum = 85;BA.debugLine="ClearForm";
Debug.ShouldStop(1048576);
_clearform();
 BA.debugLineNum = 86;BA.debugLine="End Sub";
Debug.ShouldStop(2097152);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _btnregister_click() throws Exception{
try {
		Debug.PushSubsStack("btnRegister_Click (registrationform) ","registrationform",3,registrationform.ba,registrationform.mostCurrent,50);
if (RapidSub.canDelegate("btnregister_click")) { return b4j.example.registrationform.remoteMe.runUserSub(false, "registrationform","btnregister_click");}
RemoteObject _strid = RemoteObject.createImmutable("");
RemoteObject _strfirstname = RemoteObject.createImmutable("");
RemoteObject _strlastname = RemoteObject.createImmutable("");
RemoteObject _strgender = RemoteObject.createImmutable("");
RemoteObject _stremail = RemoteObject.createImmutable("");
RemoteObject _strcell = RemoteObject.createImmutable("");
RemoteObject _straddr = RemoteObject.createImmutable("");
RemoteObject _strpassword = RemoteObject.createImmutable("");
RemoteObject _bytroleid = RemoteObject.createImmutable((byte)0);
RemoteObject _registersuccess = RemoteObject.createImmutable(false);
 BA.debugLineNum = 50;BA.debugLine="Private Sub btnRegister_Click";
Debug.ShouldStop(131072);
 BA.debugLineNum = 52;BA.debugLine="Dim strID As String = txtID.Text.As(String)";
Debug.ShouldStop(524288);
_strid = (registrationform._txtid.runMethod(true,"getText"));Debug.locals.put("strID", _strid);Debug.locals.put("strID", _strid);
 BA.debugLineNum = 53;BA.debugLine="Dim strFirstname As String = txtFirstname.Text.As";
Debug.ShouldStop(1048576);
_strfirstname = (registrationform._txtfirstname.runMethod(true,"getText"));Debug.locals.put("strFirstname", _strfirstname);Debug.locals.put("strFirstname", _strfirstname);
 BA.debugLineNum = 54;BA.debugLine="Dim strLastname As String = txtLastname.Text.As(S";
Debug.ShouldStop(2097152);
_strlastname = (registrationform._txtlastname.runMethod(true,"getText"));Debug.locals.put("strLastname", _strlastname);Debug.locals.put("strLastname", _strlastname);
 BA.debugLineNum = 55;BA.debugLine="Dim strGender As String = cbGender.Value.As(Strin";
Debug.ShouldStop(4194304);
_strgender = (BA.ObjectToString(registrationform._cbgender.runMethod(false,"getValue")));Debug.locals.put("strGender", _strgender);Debug.locals.put("strGender", _strgender);
 BA.debugLineNum = 56;BA.debugLine="Dim strEmail As String = txtEmail.Text.As(String)";
Debug.ShouldStop(8388608);
_stremail = (registrationform._txtemail.runMethod(true,"getText"));Debug.locals.put("strEmail", _stremail);Debug.locals.put("strEmail", _stremail);
 BA.debugLineNum = 57;BA.debugLine="Dim strCell As String = txtCell.Text.As(String)";
Debug.ShouldStop(16777216);
_strcell = (registrationform._txtcell.runMethod(true,"getText"));Debug.locals.put("strCell", _strcell);Debug.locals.put("strCell", _strcell);
 BA.debugLineNum = 58;BA.debugLine="Dim strAddr As String = txtAddress.Text.As(String";
Debug.ShouldStop(33554432);
_straddr = (registrationform._txtaddress.runMethod(true,"getText"));Debug.locals.put("strAddr", _straddr);Debug.locals.put("strAddr", _straddr);
 BA.debugLineNum = 59;BA.debugLine="Dim strPassword As String = txtPassword.Text.As(S";
Debug.ShouldStop(67108864);
_strpassword = (registrationform._txtpassword.runMethod(true,"getText"));Debug.locals.put("strPassword", _strpassword);Debug.locals.put("strPassword", _strpassword);
 BA.debugLineNum = 60;BA.debugLine="Dim bytRoleID As Byte = cbRole.SelectedIndex.As(B";
Debug.ShouldStop(134217728);
_bytroleid = (BA.numberCast(byte.class, registrationform._cbrole.runMethod(true,"getSelectedIndex")));Debug.locals.put("bytRoleID", _bytroleid);Debug.locals.put("bytRoleID", _bytroleid);
 BA.debugLineNum = 62;BA.debugLine="Try";
Debug.ShouldStop(536870912);
try { BA.debugLineNum = 64;BA.debugLine="regService.Initialize";
Debug.ShouldStop(-2147483648);
registrationform._regservice.runClassMethod (b4j.example.registrationservice.class, "_initialize" /*RemoteObject*/ ,registrationform.ba);
 BA.debugLineNum = 66;BA.debugLine="Dim registerSuccess As Boolean = regService.Regi";
Debug.ShouldStop(2);
_registersuccess = registrationform._regservice.runClassMethod (b4j.example.registrationservice.class, "_registeruser" /*RemoteObject*/ ,(Object)(_strid),(Object)(_strfirstname),(Object)(_strlastname),(Object)(_stremail),(Object)(_strgender),(Object)(_strcell),(Object)(_straddr),(Object)(_strpassword),(Object)(_bytroleid));Debug.locals.put("registerSuccess", _registersuccess);Debug.locals.put("registerSuccess", _registersuccess);
 BA.debugLineNum = 68;BA.debugLine="If(registerSuccess = True) Then";
Debug.ShouldStop(8);
if ((RemoteObject.solveBoolean("=",_registersuccess,registrationform.__c.getField(true,"True")))) { 
 BA.debugLineNum = 69;BA.debugLine="ui.MsgboxAsync(\"Registration successful\", \"Succ";
Debug.ShouldStop(16);
registrationform._ui.runVoidMethod ("MsgboxAsync",registrationform.ba,(Object)(BA.ObjectToString("Registration successful")),(Object)(RemoteObject.createImmutable("Success")));
 BA.debugLineNum = 70;BA.debugLine="Main.log.write(\"[\" & LoginForm.lgService.userDe";
Debug.ShouldStop(32);
registrationform._main._log /*RemoteObject*/ .runClassMethod (b4j.example.logger.class, "_write" /*RemoteObject*/ ,(Object)(RemoteObject.concat(RemoteObject.createImmutable("["),registrationform._loginform._lgservice /*RemoteObject*/ .getField(false,"_userdetails" /*RemoteObject*/ ).runMethod(true,"GetString2",(Object)(BA.numberCast(int.class, 0))),RemoteObject.createImmutable("] Registration successful"))));
 BA.debugLineNum = 71;BA.debugLine="ClearForm";
Debug.ShouldStop(64);
_clearform();
 BA.debugLineNum = 72;BA.debugLine="Close";
Debug.ShouldStop(128);
_close();
 }else {
 BA.debugLineNum = 74;BA.debugLine="ui.MsgboxAsync($\"System could not register ${st";
Debug.ShouldStop(512);
registrationform._ui.runVoidMethod ("MsgboxAsync",registrationform.ba,(Object)(RemoteObject.concat((RemoteObject.concat(RemoteObject.createImmutable("System could not register "),registrationform.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_strfirstname))),RemoteObject.createImmutable(" "))),registrationform.__c.getField(true,"CRLF"),RemoteObject.createImmutable(" Kindly contact help desk."))),(Object)(RemoteObject.createImmutable("Hold on!")));
 };
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e22) {
			BA.rdebugUtils.runVoidMethod("setLastException",registrationform.ba, e22.toString()); BA.debugLineNum = 77;BA.debugLine="Main.log.write(\"[\" & LoginForm.lgService.userDet";
Debug.ShouldStop(4096);
registrationform._main._log /*RemoteObject*/ .runClassMethod (b4j.example.logger.class, "_write" /*RemoteObject*/ ,(Object)(RemoteObject.concat(RemoteObject.createImmutable("["),registrationform._loginform._lgservice /*RemoteObject*/ .getField(false,"_userdetails" /*RemoteObject*/ ).runMethod(true,"GetString2",(Object)(BA.numberCast(int.class, 0))),RemoteObject.createImmutable("] "),registrationform.__c.runMethod(false,"LastException",registrationform.ba).runMethod(true,"getMessage"))));
 BA.debugLineNum = 78;BA.debugLine="ui.MsgboxAsync($\"Exception: ${LastException.Mess";
Debug.ShouldStop(8192);
registrationform._ui.runVoidMethod ("MsgboxAsync",registrationform.ba,(Object)((RemoteObject.concat(RemoteObject.createImmutable("Exception: "),registrationform.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((registrationform.__c.runMethod(false,"LastException",registrationform.ba).runMethod(true,"getMessage")))),RemoteObject.createImmutable("")))),(Object)(RemoteObject.createImmutable("Exception")));
 };
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
public static RemoteObject  _clearform() throws Exception{
try {
		Debug.PushSubsStack("ClearForm (registrationform) ","registrationform",3,registrationform.ba,registrationform.mostCurrent,88);
if (RapidSub.canDelegate("clearform")) { return b4j.example.registrationform.remoteMe.runUserSub(false, "registrationform","clearform");}
 BA.debugLineNum = 88;BA.debugLine="Private Sub ClearForm";
Debug.ShouldStop(8388608);
 BA.debugLineNum = 89;BA.debugLine="txtID.Text = \"\"";
Debug.ShouldStop(16777216);
registrationform._txtid.runMethod(true,"setText",BA.ObjectToString(""));
 BA.debugLineNum = 90;BA.debugLine="txtFirstname.Text = \"\"";
Debug.ShouldStop(33554432);
registrationform._txtfirstname.runMethod(true,"setText",BA.ObjectToString(""));
 BA.debugLineNum = 91;BA.debugLine="txtLastname.Text = \"\"";
Debug.ShouldStop(67108864);
registrationform._txtlastname.runMethod(true,"setText",BA.ObjectToString(""));
 BA.debugLineNum = 92;BA.debugLine="txtEmail.Text = \"\"";
Debug.ShouldStop(134217728);
registrationform._txtemail.runMethod(true,"setText",BA.ObjectToString(""));
 BA.debugLineNum = 93;BA.debugLine="txtCell.Text = \"\"";
Debug.ShouldStop(268435456);
registrationform._txtcell.runMethod(true,"setText",BA.ObjectToString(""));
 BA.debugLineNum = 94;BA.debugLine="txtAddress.Text = \"\"";
Debug.ShouldStop(536870912);
registrationform._txtaddress.runMethod(true,"setText",BA.ObjectToString(""));
 BA.debugLineNum = 95;BA.debugLine="txtPassword.Text = \"\"";
Debug.ShouldStop(1073741824);
registrationform._txtpassword.runMethod(true,"setText",BA.ObjectToString(""));
 BA.debugLineNum = 97;BA.debugLine="cbGender.SelectedIndex = 0";
Debug.ShouldStop(1);
registrationform._cbgender.runMethod(true,"setSelectedIndex",BA.numberCast(int.class, 0));
 BA.debugLineNum = 98;BA.debugLine="End Sub";
Debug.ShouldStop(2);
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
		Debug.PushSubsStack("Close (registrationform) ","registrationform",3,registrationform.ba,registrationform.mostCurrent,46);
if (RapidSub.canDelegate("close")) { return b4j.example.registrationform.remoteMe.runUserSub(false, "registrationform","close");}
 BA.debugLineNum = 46;BA.debugLine="Public Sub Close";
Debug.ShouldStop(8192);
 BA.debugLineNum = 47;BA.debugLine="frmRegistration.Close";
Debug.ShouldStop(16384);
registrationform._frmregistration.runVoidMethod ("Close");
 BA.debugLineNum = 48;BA.debugLine="End Sub";
Debug.ShouldStop(32768);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _process_globals() throws Exception{
 //BA.debugLineNum = 3;BA.debugLine="Sub Process_Globals";
 //BA.debugLineNum = 6;BA.debugLine="Private fx As JFX";
registrationform._fx = RemoteObject.createNew ("anywheresoftware.b4j.objects.JFX");
 //BA.debugLineNum = 7;BA.debugLine="Private ui As XUI";
registrationform._ui = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper.XUI");
 //BA.debugLineNum = 8;BA.debugLine="Private frmRegistration As Form";
registrationform._frmregistration = RemoteObject.createNew ("anywheresoftware.b4j.objects.Form");
 //BA.debugLineNum = 10;BA.debugLine="Private txtID As TextField";
registrationform._txtid = RemoteObject.createNew ("anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper");
 //BA.debugLineNum = 11;BA.debugLine="Private txtFirstname As TextField";
registrationform._txtfirstname = RemoteObject.createNew ("anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper");
 //BA.debugLineNum = 12;BA.debugLine="Private txtLastname As TextField";
registrationform._txtlastname = RemoteObject.createNew ("anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper");
 //BA.debugLineNum = 13;BA.debugLine="Private txtEmail As TextField";
registrationform._txtemail = RemoteObject.createNew ("anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper");
 //BA.debugLineNum = 14;BA.debugLine="Private txtCell As TextField";
registrationform._txtcell = RemoteObject.createNew ("anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper");
 //BA.debugLineNum = 15;BA.debugLine="Private txtAddress As TextField";
registrationform._txtaddress = RemoteObject.createNew ("anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper");
 //BA.debugLineNum = 16;BA.debugLine="Private txtPassword As TextField";
registrationform._txtpassword = RemoteObject.createNew ("anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper");
 //BA.debugLineNum = 18;BA.debugLine="Private cbGender As ComboBox";
registrationform._cbgender = RemoteObject.createNew ("anywheresoftware.b4j.objects.ComboBoxWrapper");
 //BA.debugLineNum = 19;BA.debugLine="Private cbRole As ComboBox";
registrationform._cbrole = RemoteObject.createNew ("anywheresoftware.b4j.objects.ComboBoxWrapper");
 //BA.debugLineNum = 20;BA.debugLine="Private tbShow As ToggleButton";
registrationform._tbshow = RemoteObject.createNew ("anywheresoftware.b4j.objects.ButtonWrapper.ToggleButtonWrapper");
 //BA.debugLineNum = 22;BA.debugLine="Private regService As RegistrationService";
registrationform._regservice = RemoteObject.createNew ("b4j.example.registrationservice");
 //BA.debugLineNum = 23;BA.debugLine="Private dbService As DatabaseService";
registrationform._dbservice = RemoteObject.createNew ("b4j.example.databaseservice");
 //BA.debugLineNum = 25;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _show() throws Exception{
try {
		Debug.PushSubsStack("Show (registrationform) ","registrationform",3,registrationform.ba,registrationform.mostCurrent,27);
if (RapidSub.canDelegate("show")) { return b4j.example.registrationform.remoteMe.runUserSub(false, "registrationform","show");}
 BA.debugLineNum = 27;BA.debugLine="Public Sub Show";
Debug.ShouldStop(67108864);
 BA.debugLineNum = 29;BA.debugLine="If frmRegistration.IsInitialized = False Then";
Debug.ShouldStop(268435456);
if (RemoteObject.solveBoolean("=",registrationform._frmregistration.runMethod(true,"IsInitialized"),registrationform.__c.getField(true,"False"))) { 
 BA.debugLineNum = 30;BA.debugLine="frmRegistration.Initialize(\"frmFegistration\", 60";
Debug.ShouldStop(536870912);
registrationform._frmregistration.runVoidMethod ("Initialize",registrationform.ba,(Object)(BA.ObjectToString("frmFegistration")),(Object)(BA.numberCast(double.class, 600)),(Object)(BA.numberCast(double.class, 600)));
 BA.debugLineNum = 31;BA.debugLine="frmRegistration.RootPane.LoadLayout(\"Registratio";
Debug.ShouldStop(1073741824);
registrationform._frmregistration.runMethod(false,"getRootPane").runMethodAndSync(false,"LoadLayout",registrationform.ba,(Object)(RemoteObject.createImmutable("RegistrationForm")));
 };
 BA.debugLineNum = 34;BA.debugLine="dbService.Initialize";
Debug.ShouldStop(2);
registrationform._dbservice.runClassMethod (b4j.example.databaseservice.class, "_initialize" /*RemoteObject*/ ,registrationform.ba);
 BA.debugLineNum = 36;BA.debugLine="cbGender.Items.AddAll( Array As String(\"Male\", \"F";
Debug.ShouldStop(8);
registrationform._cbgender.runMethod(false,"getItems").runVoidMethod ("AddAll",(Object)(registrationform.__c.runMethod(false, "ArrayToList", (Object)(RemoteObject.createNewArray("String",new int[] {2},new Object[] {BA.ObjectToString("Male"),RemoteObject.createImmutable("Female")})))));
 BA.debugLineNum = 38;BA.debugLine="ClearForm";
Debug.ShouldStop(32);
_clearform();
 BA.debugLineNum = 40;BA.debugLine="AddRoles";
Debug.ShouldStop(128);
_addroles();
 BA.debugLineNum = 42;BA.debugLine="frmRegistration.Show";
Debug.ShouldStop(512);
registrationform._frmregistration.runVoidMethodAndSync ("Show");
 BA.debugLineNum = 44;BA.debugLine="End Sub";
Debug.ShouldStop(2048);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _tbshow_selectedchange(RemoteObject _selected) throws Exception{
try {
		Debug.PushSubsStack("tbShow_SelectedChange (registrationform) ","registrationform",3,registrationform.ba,registrationform.mostCurrent,100);
if (RapidSub.canDelegate("tbshow_selectedchange")) { return b4j.example.registrationform.remoteMe.runUserSub(false, "registrationform","tbshow_selectedchange", _selected);}
Debug.locals.put("Selected", _selected);
 BA.debugLineNum = 100;BA.debugLine="Private Sub tbShow_SelectedChange(Selected As Bool";
Debug.ShouldStop(8);
 BA.debugLineNum = 102;BA.debugLine="End Sub";
Debug.ShouldStop(32);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}