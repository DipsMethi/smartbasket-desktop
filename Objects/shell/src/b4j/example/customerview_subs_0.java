package b4j.example;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class customerview_subs_0 {


public static RemoteObject  _addcolumnheadings() throws Exception{
try {
		Debug.PushSubsStack("AddColumnHeadings (customerview) ","customerview",4,customerview.ba,customerview.mostCurrent,102);
if (RapidSub.canDelegate("addcolumnheadings")) { return b4j.example.customerview.remoteMe.runUserSub(false, "customerview","addcolumnheadings");}
int _n = 0;
RemoteObject _colname = RemoteObject.createImmutable("");
 BA.debugLineNum = 102;BA.debugLine="Private Sub AddColumnHeadings";
Debug.ShouldStop(32);
 BA.debugLineNum = 104;BA.debugLine="Try";
Debug.ShouldStop(128);
try { BA.debugLineNum = 106;BA.debugLine="dbManager.Initialize";
Debug.ShouldStop(512);
customerview._dbmanager.runClassMethod (b4j.example.databaseservice.class, "_initialize" /*RemoteObject*/ ,customerview.ba);
 BA.debugLineNum = 108;BA.debugLine="customerRecords = dbManager.GetPurchaseDetails(";
Debug.ShouldStop(2048);
customerview._customerrecords = customerview._dbmanager.runClassMethod (b4j.example.databaseservice.class, "_getpurchasedetails" /*RemoteObject*/ ,(Object)(BA.ObjectToString("customers")),(Object)(BA.ObjectToString(customerview._lstcustomers.runMethod(false,"getItems").runMethod(false,"Get",(Object)(customerview._selectedindex)))));
 BA.debugLineNum = 111;BA.debugLine="For n = 0 To customerRecords.ColumnCount - 2";
Debug.ShouldStop(16384);
{
final int step4 = 1;
final int limit4 = RemoteObject.solve(new RemoteObject[] {customerview._customerrecords.runMethod(true,"getColumnCount"),RemoteObject.createImmutable(2)}, "-",1, 1).<Integer>get().intValue();
_n = 0 ;
for (;(step4 > 0 && _n <= limit4) || (step4 < 0 && _n >= limit4) ;_n = ((int)(0 + _n + step4))  ) {
Debug.locals.put("n", _n);
 BA.debugLineNum = 112;BA.debugLine="Dim colName As String = customerRecords.GetColu";
Debug.ShouldStop(32768);
_colname = customerview._customerrecords.runMethod(true,"GetColumnName",(Object)(BA.numberCast(int.class, _n)));Debug.locals.put("colName", _colname);Debug.locals.put("colName", _colname);
 BA.debugLineNum = 113;BA.debugLine="tblViewExpenditure.SetColumnHeader( n , colName";
Debug.ShouldStop(65536);
customerview._tblviewexpenditure.runVoidMethod ("SetColumnHeader",(Object)(BA.numberCast(int.class, _n)),(Object)(_colname));
 }
}Debug.locals.put("n", _n);
;
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e9) {
			BA.rdebugUtils.runVoidMethod("setLastException",customerview.ba, e9.toString()); BA.debugLineNum = 117;BA.debugLine="Main.log.write(\"[UID:\" & LoginForm.lgService.use";
Debug.ShouldStop(1048576);
customerview._main._log /*RemoteObject*/ .runClassMethod (b4j.example.logger.class, "_write" /*RemoteObject*/ ,(Object)(RemoteObject.concat(RemoteObject.createImmutable("[UID:"),customerview._loginform._lgservice /*RemoteObject*/ .getField(false,"_userdetails" /*RemoteObject*/ ).runMethod(true,"GetString2",(Object)(BA.numberCast(int.class, 0))),RemoteObject.createImmutable("] "),customerview.__c.runMethod(false,"LastException",customerview.ba).runMethod(true,"getMessage"))));
 BA.debugLineNum = 118;BA.debugLine="xui.MsgboxAsync( LastException.Message, \"Excepti";
Debug.ShouldStop(2097152);
customerview._xui.runVoidMethod ("MsgboxAsync",customerview.ba,(Object)(customerview.__c.runMethod(false,"LastException",customerview.ba).runMethod(true,"getMessage")),(Object)(RemoteObject.createImmutable("Exception")));
 };
 BA.debugLineNum = 120;BA.debugLine="dbManager.Disconnect";
Debug.ShouldStop(8388608);
customerview._dbmanager.runClassMethod (b4j.example.databaseservice.class, "_disconnect" /*RemoteObject*/ );
 BA.debugLineNum = 122;BA.debugLine="End Sub";
Debug.ShouldStop(33554432);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _addcustdetailstotable() throws Exception{
try {
		Debug.PushSubsStack("AddCustDetailsToTable (customerview) ","customerview",4,customerview.ba,customerview.mostCurrent,75);
if (RapidSub.canDelegate("addcustdetailstotable")) { return b4j.example.customerview.remoteMe.runUserSub(false, "customerview","addcustdetailstotable");}
RemoteObject _strid = RemoteObject.createImmutable("");
RemoteObject _strdatetime = RemoteObject.createImmutable("");
RemoteObject _strendtime = RemoteObject.createImmutable("");
RemoteObject _strtotalamt = RemoteObject.createImmutable("");
 BA.debugLineNum = 75;BA.debugLine="Private Sub AddCustDetailsToTable";
Debug.ShouldStop(1024);
 BA.debugLineNum = 77;BA.debugLine="Try";
Debug.ShouldStop(4096);
try { BA.debugLineNum = 79;BA.debugLine="dbManager.Initialize";
Debug.ShouldStop(16384);
customerview._dbmanager.runClassMethod (b4j.example.databaseservice.class, "_initialize" /*RemoteObject*/ ,customerview.ba);
 BA.debugLineNum = 81;BA.debugLine="customerRecords = dbManager.GetPurchaseDetails(";
Debug.ShouldStop(65536);
customerview._customerrecords = customerview._dbmanager.runClassMethod (b4j.example.databaseservice.class, "_getpurchasedetails" /*RemoteObject*/ ,(Object)(BA.ObjectToString("customers")),(Object)(BA.ObjectToString(customerview._lstcustomers.runMethod(false,"getItems").runMethod(false,"Get",(Object)(customerview._selectedindex)))));
 BA.debugLineNum = 83;BA.debugLine="tblViewExpenditure.Items.Clear";
Debug.ShouldStop(262144);
customerview._tblviewexpenditure.runMethod(false,"getItems").runVoidMethod ("Clear");
 BA.debugLineNum = 85;BA.debugLine="Do While customerRecords.NextRow";
Debug.ShouldStop(1048576);
while (customerview._customerrecords.runMethod(true,"NextRow").<Boolean>get().booleanValue()) {
 BA.debugLineNum = 87;BA.debugLine="Dim strID As String = customerRecords.GetString";
Debug.ShouldStop(4194304);
_strid = customerview._customerrecords.runMethod(true,"GetString2",(Object)(BA.numberCast(int.class, 0)));Debug.locals.put("strID", _strid);Debug.locals.put("strID", _strid);
 BA.debugLineNum = 88;BA.debugLine="Dim strDateTime As String =  LongToDate(custome";
Debug.ShouldStop(8388608);
_strdatetime = _longtodate(customerview._customerrecords.runMethod(true,"GetLong2",(Object)(BA.numberCast(int.class, 1))));Debug.locals.put("strDateTime", _strdatetime);Debug.locals.put("strDateTime", _strdatetime);
 BA.debugLineNum = 89;BA.debugLine="Dim strEndTime As String = LongToDate(customerR";
Debug.ShouldStop(16777216);
_strendtime = _longtodate(customerview._customerrecords.runMethod(true,"GetLong2",(Object)(BA.numberCast(int.class, 2))));Debug.locals.put("strEndTime", _strendtime);Debug.locals.put("strEndTime", _strendtime);
 BA.debugLineNum = 90;BA.debugLine="Dim strTotalAmt As String = customerRecords.Get";
Debug.ShouldStop(33554432);
_strtotalamt = customerview._customerrecords.runMethod(true,"GetString2",(Object)(BA.numberCast(int.class, 3)));Debug.locals.put("strTotalAmt", _strtotalamt);Debug.locals.put("strTotalAmt", _strtotalamt);
 BA.debugLineNum = 92;BA.debugLine="tblViewExpenditure.Items.Add( Array As String(";
Debug.ShouldStop(134217728);
customerview._tblviewexpenditure.runMethod(false,"getItems").runVoidMethod ("Add",(Object)((RemoteObject.createNewArray("String",new int[] {4},new Object[] {_strid,_strdatetime,_strendtime,_strtotalamt}))));
 }
;
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e13) {
			BA.rdebugUtils.runVoidMethod("setLastException",customerview.ba, e13.toString()); BA.debugLineNum = 95;BA.debugLine="Main.log.write(\"[\" & LoginForm.lgService.userDet";
Debug.ShouldStop(1073741824);
customerview._main._log /*RemoteObject*/ .runClassMethod (b4j.example.logger.class, "_write" /*RemoteObject*/ ,(Object)(RemoteObject.concat(RemoteObject.createImmutable("["),customerview._loginform._lgservice /*RemoteObject*/ .getField(false,"_userdetails" /*RemoteObject*/ ).runMethod(true,"GetString2",(Object)(BA.numberCast(int.class, 0))),RemoteObject.createImmutable("] "),customerview.__c.runMethod(false,"LastException",customerview.ba).runMethod(true,"getMessage"))));
 BA.debugLineNum = 96;BA.debugLine="xui.MsgboxAsync($\"Exception: ${LastException}\"$,";
Debug.ShouldStop(-2147483648);
customerview._xui.runVoidMethod ("MsgboxAsync",customerview.ba,(Object)((RemoteObject.concat(RemoteObject.createImmutable("Exception: "),customerview.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((customerview.__c.runMethod(false,"LastException",customerview.ba).getObject()))),RemoteObject.createImmutable("")))),(Object)(RemoteObject.createImmutable("Exception")));
 };
 BA.debugLineNum = 98;BA.debugLine="dbManager.Disconnect";
Debug.ShouldStop(2);
customerview._dbmanager.runClassMethod (b4j.example.databaseservice.class, "_disconnect" /*RemoteObject*/ );
 BA.debugLineNum = 100;BA.debugLine="End Sub";
Debug.ShouldStop(8);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _addcustomerid() throws Exception{
try {
		Debug.PushSubsStack("AddCustomerID (customerview) ","customerview",4,customerview.ba,customerview.mostCurrent,53);
if (RapidSub.canDelegate("addcustomerid")) { return b4j.example.customerview.remoteMe.runUserSub(false, "customerview","addcustomerid");}
 BA.debugLineNum = 53;BA.debugLine="Private Sub AddCustomerID";
Debug.ShouldStop(1048576);
 BA.debugLineNum = 55;BA.debugLine="Try";
Debug.ShouldStop(4194304);
try { BA.debugLineNum = 57;BA.debugLine="dbManager.Initialize";
Debug.ShouldStop(16777216);
customerview._dbmanager.runClassMethod (b4j.example.databaseservice.class, "_initialize" /*RemoteObject*/ ,customerview.ba);
 BA.debugLineNum = 59;BA.debugLine="customerRecords = dbManager.GetAll(\"customers\",";
Debug.ShouldStop(67108864);
customerview._customerrecords = customerview._dbmanager.runClassMethod (b4j.example.databaseservice.class, "_getall" /*RemoteObject*/ ,(Object)(BA.ObjectToString("customers")),(Object)(BA.numberCast(int.class, -(double) (0 + 1))));
 BA.debugLineNum = 61;BA.debugLine="lstCustomers.Items.Clear";
Debug.ShouldStop(268435456);
customerview._lstcustomers.runMethod(false,"getItems").runVoidMethod ("Clear");
 BA.debugLineNum = 63;BA.debugLine="Do While customerRecords.NextRow";
Debug.ShouldStop(1073741824);
while (customerview._customerrecords.runMethod(true,"NextRow").<Boolean>get().booleanValue()) {
 BA.debugLineNum = 64;BA.debugLine="lstCustomers.Items.Add(customerRecords.GetStrin";
Debug.ShouldStop(-2147483648);
customerview._lstcustomers.runMethod(false,"getItems").runVoidMethod ("Add",(Object)(((customerview._customerrecords.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("id")))))));
 }
;
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e9) {
			BA.rdebugUtils.runVoidMethod("setLastException",customerview.ba, e9.toString()); BA.debugLineNum = 67;BA.debugLine="Main.log.write(LastException.Message)";
Debug.ShouldStop(4);
customerview._main._log /*RemoteObject*/ .runClassMethod (b4j.example.logger.class, "_write" /*RemoteObject*/ ,(Object)(customerview.__c.runMethod(false,"LastException",customerview.ba).runMethod(true,"getMessage")));
 BA.debugLineNum = 68;BA.debugLine="xui.MsgboxAsync($\"Exception: ${LastException}\"$,";
Debug.ShouldStop(8);
customerview._xui.runVoidMethod ("MsgboxAsync",customerview.ba,(Object)((RemoteObject.concat(RemoteObject.createImmutable("Exception: "),customerview.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((customerview.__c.runMethod(false,"LastException",customerview.ba).getObject()))),RemoteObject.createImmutable("")))),(Object)(RemoteObject.createImmutable("Exception")));
 };
 BA.debugLineNum = 71;BA.debugLine="dbManager.Disconnect";
Debug.ShouldStop(64);
customerview._dbmanager.runClassMethod (b4j.example.databaseservice.class, "_disconnect" /*RemoteObject*/ );
 BA.debugLineNum = 73;BA.debugLine="End Sub";
Debug.ShouldStop(256);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _btnsuspend_click() throws Exception{
try {
		Debug.PushSubsStack("btnSuspend_Click (customerview) ","customerview",4,customerview.ba,customerview.mostCurrent,37);
if (RapidSub.canDelegate("btnsuspend_click")) { return b4j.example.customerview.remoteMe.runUserSub(false, "customerview","btnsuspend_click");}
 BA.debugLineNum = 37;BA.debugLine="Private Sub btnSuspend_Click";
Debug.ShouldStop(16);
 BA.debugLineNum = 38;BA.debugLine="dbManager.Initialize";
Debug.ShouldStop(32);
customerview._dbmanager.runClassMethod (b4j.example.databaseservice.class, "_initialize" /*RemoteObject*/ ,customerview.ba);
 BA.debugLineNum = 39;BA.debugLine="If(dbManager.DeleteUser(lstCustomers.Items.Get(se";
Debug.ShouldStop(64);
if ((customerview._dbmanager.runClassMethod (b4j.example.databaseservice.class, "_deleteuser" /*RemoteObject*/ ,(Object)(BA.ObjectToString(customerview._lstcustomers.runMethod(false,"getItems").runMethod(false,"Get",(Object)(customerview._selectedindex)))))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 40;BA.debugLine="xui.MsgboxAsync(\"User deleted\", \"Success\")";
Debug.ShouldStop(128);
customerview._xui.runVoidMethod ("MsgboxAsync",customerview.ba,(Object)(BA.ObjectToString("User deleted")),(Object)(RemoteObject.createImmutable("Success")));
 }else {
 BA.debugLineNum = 42;BA.debugLine="xui.MsgboxAsync(\"Could not delete user\", \"Fail\")";
Debug.ShouldStop(512);
customerview._xui.runVoidMethod ("MsgboxAsync",customerview.ba,(Object)(BA.ObjectToString("Could not delete user")),(Object)(RemoteObject.createImmutable("Fail")));
 };
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
public static RemoteObject  _close() throws Exception{
try {
		Debug.PushSubsStack("Close (customerview) ","customerview",4,customerview.ba,customerview.mostCurrent,33);
if (RapidSub.canDelegate("close")) { return b4j.example.customerview.remoteMe.runUserSub(false, "customerview","close");}
 BA.debugLineNum = 33;BA.debugLine="Public Sub Close";
Debug.ShouldStop(1);
 BA.debugLineNum = 34;BA.debugLine="frmCustomerView.Close";
Debug.ShouldStop(2);
customerview._frmcustomerview.runVoidMethod ("Close");
 BA.debugLineNum = 35;BA.debugLine="End Sub";
Debug.ShouldStop(4);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _longtodate(RemoteObject _ld) throws Exception{
try {
		Debug.PushSubsStack("LongToDate (customerview) ","customerview",4,customerview.ba,customerview.mostCurrent,124);
if (RapidSub.canDelegate("longtodate")) { return b4j.example.customerview.remoteMe.runUserSub(false, "customerview","longtodate", _ld);}
RemoteObject _str_date_up = RemoteObject.createImmutable("");
Debug.locals.put("ld", _ld);
 BA.debugLineNum = 124;BA.debugLine="Private Sub LongToDate(ld As Long) As String";
Debug.ShouldStop(134217728);
 BA.debugLineNum = 126;BA.debugLine="DateTime.DateFormat = \"yyyy/MM/dd\"";
Debug.ShouldStop(536870912);
customerview.__c.getField(false,"DateTime").runMethod(true,"setDateFormat",BA.ObjectToString("yyyy/MM/dd"));
 BA.debugLineNum = 127;BA.debugLine="DateTime.TimeFormat = \"HH:mm:ss\"";
Debug.ShouldStop(1073741824);
customerview.__c.getField(false,"DateTime").runMethod(true,"setTimeFormat",BA.ObjectToString("HH:mm:ss"));
 BA.debugLineNum = 128;BA.debugLine="Dim str_date_up As String = DateTime.Date( ld ) &";
Debug.ShouldStop(-2147483648);
_str_date_up = RemoteObject.concat(customerview.__c.getField(false,"DateTime").runMethod(true,"Date",(Object)(_ld)),RemoteObject.createImmutable(" "),customerview.__c.getField(false,"DateTime").runMethod(true,"Time",(Object)(_ld)));Debug.locals.put("str_date_up", _str_date_up);Debug.locals.put("str_date_up", _str_date_up);
 BA.debugLineNum = 129;BA.debugLine="Return str_date_up";
Debug.ShouldStop(1);
if (true) return _str_date_up;
 BA.debugLineNum = 131;BA.debugLine="End Sub";
Debug.ShouldStop(4);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _lstcustomers_selectedindexchanged(RemoteObject _index) throws Exception{
try {
		Debug.PushSubsStack("lstCustomers_SelectedIndexChanged (customerview) ","customerview",4,customerview.ba,customerview.mostCurrent,46);
if (RapidSub.canDelegate("lstcustomers_selectedindexchanged")) { return b4j.example.customerview.remoteMe.runUserSub(false, "customerview","lstcustomers_selectedindexchanged", _index);}
Debug.locals.put("index", _index);
 BA.debugLineNum = 46;BA.debugLine="Private Sub lstCustomers_SelectedIndexChanged(inde";
Debug.ShouldStop(8192);
 BA.debugLineNum = 48;BA.debugLine="selectedIndex = index";
Debug.ShouldStop(32768);
customerview._selectedindex = _index;
 BA.debugLineNum = 49;BA.debugLine="AddCustDetailsToTable";
Debug.ShouldStop(65536);
_addcustdetailstotable();
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
public static RemoteObject  _process_globals() throws Exception{
 //BA.debugLineNum = 2;BA.debugLine="Sub Process_Globals";
 //BA.debugLineNum = 3;BA.debugLine="Private fx As JFX";
customerview._fx = RemoteObject.createNew ("anywheresoftware.b4j.objects.JFX");
 //BA.debugLineNum = 4;BA.debugLine="Private xui As XUI";
customerview._xui = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper.XUI");
 //BA.debugLineNum = 5;BA.debugLine="Private frmCustomerView As Form";
customerview._frmcustomerview = RemoteObject.createNew ("anywheresoftware.b4j.objects.Form");
 //BA.debugLineNum = 6;BA.debugLine="Private lstCustomers As ListView";
customerview._lstcustomers = RemoteObject.createNew ("anywheresoftware.b4j.objects.ListViewWrapper");
 //BA.debugLineNum = 7;BA.debugLine="Private tblViewExpenditure As TableView";
customerview._tblviewexpenditure = RemoteObject.createNew ("anywheresoftware.b4j.objects.TableViewWrapper");
 //BA.debugLineNum = 8;BA.debugLine="Private btnSuspend As Button";
customerview._btnsuspend = RemoteObject.createNew ("anywheresoftware.b4j.objects.ButtonWrapper");
 //BA.debugLineNum = 9;BA.debugLine="Private btnDelete As Button";
customerview._btndelete = RemoteObject.createNew ("anywheresoftware.b4j.objects.ButtonWrapper");
 //BA.debugLineNum = 10;BA.debugLine="Private selectedIndex As Int = 0";
customerview._selectedindex = BA.numberCast(int.class, 0);
 //BA.debugLineNum = 12;BA.debugLine="Private dbManager As DatabaseService";
customerview._dbmanager = RemoteObject.createNew ("b4j.example.databaseservice");
 //BA.debugLineNum = 13;BA.debugLine="Private customerRecords As JdbcResultSet";
customerview._customerrecords = RemoteObject.createNew ("anywheresoftware.b4j.objects.SQL.ResultSetWrapper");
 //BA.debugLineNum = 15;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _show() throws Exception{
try {
		Debug.PushSubsStack("Show (customerview) ","customerview",4,customerview.ba,customerview.mostCurrent,17);
if (RapidSub.canDelegate("show")) { return b4j.example.customerview.remoteMe.runUserSub(false, "customerview","show");}
 BA.debugLineNum = 17;BA.debugLine="Public Sub Show";
Debug.ShouldStop(65536);
 BA.debugLineNum = 18;BA.debugLine="If frmCustomerView.IsInitialized = False Then";
Debug.ShouldStop(131072);
if (RemoteObject.solveBoolean("=",customerview._frmcustomerview.runMethod(true,"IsInitialized"),customerview.__c.getField(true,"False"))) { 
 BA.debugLineNum = 19;BA.debugLine="frmCustomerView.Initialize(\"frmCustomerView\", 80";
Debug.ShouldStop(262144);
customerview._frmcustomerview.runVoidMethod ("Initialize",customerview.ba,(Object)(BA.ObjectToString("frmCustomerView")),(Object)(BA.numberCast(double.class, 800)),(Object)(BA.numberCast(double.class, 600)));
 BA.debugLineNum = 20;BA.debugLine="frmCustomerView.RootPane.LoadLayout(\"CustomerVie";
Debug.ShouldStop(524288);
customerview._frmcustomerview.runMethod(false,"getRootPane").runMethodAndSync(false,"LoadLayout",customerview.ba,(Object)(RemoteObject.createImmutable("CustomerView")));
 };
 BA.debugLineNum = 24;BA.debugLine="AddCustomerID";
Debug.ShouldStop(8388608);
_addcustomerid();
 BA.debugLineNum = 26;BA.debugLine="AddColumnHeadings";
Debug.ShouldStop(33554432);
_addcolumnheadings();
 BA.debugLineNum = 28;BA.debugLine="AddCustDetailsToTable";
Debug.ShouldStop(134217728);
_addcustdetailstotable();
 BA.debugLineNum = 30;BA.debugLine="frmCustomerView.Show";
Debug.ShouldStop(536870912);
customerview._frmcustomerview.runVoidMethodAndSync ("Show");
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
}