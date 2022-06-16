package b4j.example;

import anywheresoftware.b4a.debug.*;

import anywheresoftware.b4a.BA;

public class customerview extends Object{
public static customerview mostCurrent = new customerview();

public static BA ba;
static {
		ba = new  anywheresoftware.b4a.shell.ShellBA("b4j.example", "b4j.example.customerview", null);
		ba.loadHtSubs(customerview.class);
        if (ba.getClass().getName().endsWith("ShellBA")) {
			
			ba.raiseEvent2(null, true, "SHELL", false);
			ba.raiseEvent2(null, true, "CREATE", true, "b4j.example.customerview", ba);
		}
	}
    public static Class<?> getObject() {
		return customerview.class;
	}

 
public static anywheresoftware.b4a.keywords.Common __c = null;
public static anywheresoftware.b4j.objects.JFX _fx = null;
public static anywheresoftware.b4a.objects.B4XViewWrapper.XUI _xui = null;
public static anywheresoftware.b4j.objects.Form _frmcustomerview = null;
public static anywheresoftware.b4j.objects.ListViewWrapper _lstcustomers = null;
public static anywheresoftware.b4j.objects.TableViewWrapper _tblviewexpenditure = null;
public static anywheresoftware.b4j.objects.ButtonWrapper _btnsuspend = null;
public static anywheresoftware.b4j.objects.ButtonWrapper _btndelete = null;
public static int _selectedindex = 0;
public static b4j.example.databaseservice _dbmanager = null;
public static anywheresoftware.b4j.objects.SQL.ResultSetWrapper _customerrecords = null;
public static b4j.example.main _main = null;
public static b4j.example.loginform _loginform = null;
public static b4j.example.dashboard _dashboard = null;
public static b4j.example.registrationform _registrationform = null;
public static b4j.example.b4xcollections _b4xcollections = null;
public static b4j.example.dbutils _dbutils = null;
public static String  _show() throws Exception{
RDebugUtils.currentModule="customerview";
if (Debug.shouldDelegate(ba, "show", false))
	 {return ((String) Debug.delegate(ba, "show", null));}
RDebugUtils.currentLine=1507328;
 //BA.debugLineNum = 1507328;BA.debugLine="Public Sub Show";
RDebugUtils.currentLine=1507329;
 //BA.debugLineNum = 1507329;BA.debugLine="If frmCustomerView.IsInitialized = False Then";
if (_frmcustomerview.IsInitialized()==anywheresoftware.b4a.keywords.Common.False) { 
RDebugUtils.currentLine=1507330;
 //BA.debugLineNum = 1507330;BA.debugLine="frmCustomerView.Initialize(\"frmCustomerView\", 80";
_frmcustomerview.Initialize(ba,"frmCustomerView",800,600);
RDebugUtils.currentLine=1507331;
 //BA.debugLineNum = 1507331;BA.debugLine="frmCustomerView.RootPane.LoadLayout(\"CustomerVie";
_frmcustomerview.getRootPane().LoadLayout(ba,"CustomerView");
 };
RDebugUtils.currentLine=1507335;
 //BA.debugLineNum = 1507335;BA.debugLine="AddCustomerID";
_addcustomerid();
RDebugUtils.currentLine=1507337;
 //BA.debugLineNum = 1507337;BA.debugLine="AddColumnHeadings";
_addcolumnheadings();
RDebugUtils.currentLine=1507339;
 //BA.debugLineNum = 1507339;BA.debugLine="AddCustDetailsToTable";
_addcustdetailstotable();
RDebugUtils.currentLine=1507341;
 //BA.debugLineNum = 1507341;BA.debugLine="frmCustomerView.Show";
_frmcustomerview.Show();
RDebugUtils.currentLine=1507342;
 //BA.debugLineNum = 1507342;BA.debugLine="End Sub";
return "";
}
public static String  _addcolumnheadings() throws Exception{
RDebugUtils.currentModule="customerview";
if (Debug.shouldDelegate(ba, "addcolumnheadings", false))
	 {return ((String) Debug.delegate(ba, "addcolumnheadings", null));}
int _n = 0;
String _colname = "";
RDebugUtils.currentLine=1900544;
 //BA.debugLineNum = 1900544;BA.debugLine="Private Sub AddColumnHeadings";
RDebugUtils.currentLine=1900546;
 //BA.debugLineNum = 1900546;BA.debugLine="Try";
try {RDebugUtils.currentLine=1900548;
 //BA.debugLineNum = 1900548;BA.debugLine="dbManager.Initialize";
_dbmanager._initialize /*String*/ (null,ba);
RDebugUtils.currentLine=1900550;
 //BA.debugLineNum = 1900550;BA.debugLine="customerRecords = dbManager.GetPurchaseDetails(";
_customerrecords = _dbmanager._getpurchasedetails /*anywheresoftware.b4j.objects.SQL.ResultSetWrapper*/ (null,"customers",BA.ObjectToString(_lstcustomers.getItems().Get(_selectedindex)));
RDebugUtils.currentLine=1900553;
 //BA.debugLineNum = 1900553;BA.debugLine="For n = 0 To customerRecords.ColumnCount - 2";
{
final int step4 = 1;
final int limit4 = (int) (_customerrecords.getColumnCount()-2);
_n = (int) (0) ;
for (;_n <= limit4 ;_n = _n + step4 ) {
RDebugUtils.currentLine=1900554;
 //BA.debugLineNum = 1900554;BA.debugLine="Dim colName As String = customerRecords.GetColu";
_colname = _customerrecords.GetColumnName(_n);
RDebugUtils.currentLine=1900555;
 //BA.debugLineNum = 1900555;BA.debugLine="tblViewExpenditure.SetColumnHeader( n , colName";
_tblviewexpenditure.SetColumnHeader(_n,_colname);
 }
};
 } 
       catch (Exception e9) {
			ba.setLastException(e9);RDebugUtils.currentLine=1900559;
 //BA.debugLineNum = 1900559;BA.debugLine="Main.log.write(\"[UID:\" & LoginForm.lgService.use";
_main._log /*b4j.example.logger*/ ._write /*String*/ (null,"[UID:"+_loginform._lgservice /*b4j.example.loginservice*/ ._userdetails /*anywheresoftware.b4j.objects.SQL.ResultSetWrapper*/ .GetString2((int) (0))+"] "+anywheresoftware.b4a.keywords.Common.LastException(ba).getMessage());
RDebugUtils.currentLine=1900560;
 //BA.debugLineNum = 1900560;BA.debugLine="xui.MsgboxAsync( LastException.Message, \"Excepti";
_xui.MsgboxAsync(ba,anywheresoftware.b4a.keywords.Common.LastException(ba).getMessage(),"Exception");
 };
RDebugUtils.currentLine=1900562;
 //BA.debugLineNum = 1900562;BA.debugLine="dbManager.Disconnect";
_dbmanager._disconnect /*String*/ (null);
RDebugUtils.currentLine=1900564;
 //BA.debugLineNum = 1900564;BA.debugLine="End Sub";
return "";
}
public static String  _addcustdetailstotable() throws Exception{
RDebugUtils.currentModule="customerview";
if (Debug.shouldDelegate(ba, "addcustdetailstotable", false))
	 {return ((String) Debug.delegate(ba, "addcustdetailstotable", null));}
String _strid = "";
String _strdatetime = "";
String _strendtime = "";
String _strtotalamt = "";
RDebugUtils.currentLine=1835008;
 //BA.debugLineNum = 1835008;BA.debugLine="Private Sub AddCustDetailsToTable";
RDebugUtils.currentLine=1835010;
 //BA.debugLineNum = 1835010;BA.debugLine="Try";
try {RDebugUtils.currentLine=1835012;
 //BA.debugLineNum = 1835012;BA.debugLine="dbManager.Initialize";
_dbmanager._initialize /*String*/ (null,ba);
RDebugUtils.currentLine=1835014;
 //BA.debugLineNum = 1835014;BA.debugLine="customerRecords = dbManager.GetPurchaseDetails(";
_customerrecords = _dbmanager._getpurchasedetails /*anywheresoftware.b4j.objects.SQL.ResultSetWrapper*/ (null,"customers",BA.ObjectToString(_lstcustomers.getItems().Get(_selectedindex)));
RDebugUtils.currentLine=1835016;
 //BA.debugLineNum = 1835016;BA.debugLine="tblViewExpenditure.Items.Clear";
_tblviewexpenditure.getItems().Clear();
RDebugUtils.currentLine=1835018;
 //BA.debugLineNum = 1835018;BA.debugLine="Do While customerRecords.NextRow";
while (_customerrecords.NextRow()) {
RDebugUtils.currentLine=1835020;
 //BA.debugLineNum = 1835020;BA.debugLine="Dim strID As String = customerRecords.GetString";
_strid = _customerrecords.GetString2((int) (0));
RDebugUtils.currentLine=1835021;
 //BA.debugLineNum = 1835021;BA.debugLine="Dim strDateTime As String =  LongToDate(custome";
_strdatetime = _longtodate(_customerrecords.GetLong2((int) (1)));
RDebugUtils.currentLine=1835022;
 //BA.debugLineNum = 1835022;BA.debugLine="Dim strEndTime As String = LongToDate(customerR";
_strendtime = _longtodate(_customerrecords.GetLong2((int) (2)));
RDebugUtils.currentLine=1835023;
 //BA.debugLineNum = 1835023;BA.debugLine="Dim strTotalAmt As String = customerRecords.Get";
_strtotalamt = _customerrecords.GetString2((int) (3));
RDebugUtils.currentLine=1835025;
 //BA.debugLineNum = 1835025;BA.debugLine="tblViewExpenditure.Items.Add( Array As String(";
_tblviewexpenditure.getItems().Add((Object)(new String[]{_strid,_strdatetime,_strendtime,_strtotalamt}));
 }
;
 } 
       catch (Exception e13) {
			ba.setLastException(e13);RDebugUtils.currentLine=1835028;
 //BA.debugLineNum = 1835028;BA.debugLine="Main.log.write(\"[\" & LoginForm.lgService.userDet";
_main._log /*b4j.example.logger*/ ._write /*String*/ (null,"["+_loginform._lgservice /*b4j.example.loginservice*/ ._userdetails /*anywheresoftware.b4j.objects.SQL.ResultSetWrapper*/ .GetString2((int) (0))+"] "+anywheresoftware.b4a.keywords.Common.LastException(ba).getMessage());
RDebugUtils.currentLine=1835029;
 //BA.debugLineNum = 1835029;BA.debugLine="xui.MsgboxAsync($\"Exception: ${LastException}\"$,";
_xui.MsgboxAsync(ba,("Exception: "+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(anywheresoftware.b4a.keywords.Common.LastException(ba).getObject()))+""),"Exception");
 };
RDebugUtils.currentLine=1835031;
 //BA.debugLineNum = 1835031;BA.debugLine="dbManager.Disconnect";
_dbmanager._disconnect /*String*/ (null);
RDebugUtils.currentLine=1835033;
 //BA.debugLineNum = 1835033;BA.debugLine="End Sub";
return "";
}
public static String  _longtodate(long _ld) throws Exception{
RDebugUtils.currentModule="customerview";
if (Debug.shouldDelegate(ba, "longtodate", false))
	 {return ((String) Debug.delegate(ba, "longtodate", new Object[] {_ld}));}
String _str_date_up = "";
RDebugUtils.currentLine=1966080;
 //BA.debugLineNum = 1966080;BA.debugLine="Private Sub LongToDate(ld As Long) As String";
RDebugUtils.currentLine=1966082;
 //BA.debugLineNum = 1966082;BA.debugLine="DateTime.DateFormat = \"yyyy/MM/dd\"";
anywheresoftware.b4a.keywords.Common.DateTime.setDateFormat("yyyy/MM/dd");
RDebugUtils.currentLine=1966083;
 //BA.debugLineNum = 1966083;BA.debugLine="DateTime.TimeFormat = \"HH:mm:ss\"";
anywheresoftware.b4a.keywords.Common.DateTime.setTimeFormat("HH:mm:ss");
RDebugUtils.currentLine=1966084;
 //BA.debugLineNum = 1966084;BA.debugLine="Dim str_date_up As String = DateTime.Date( ld ) &";
_str_date_up = anywheresoftware.b4a.keywords.Common.DateTime.Date(_ld)+" "+anywheresoftware.b4a.keywords.Common.DateTime.Time(_ld);
RDebugUtils.currentLine=1966085;
 //BA.debugLineNum = 1966085;BA.debugLine="Return str_date_up";
if (true) return _str_date_up;
RDebugUtils.currentLine=1966087;
 //BA.debugLineNum = 1966087;BA.debugLine="End Sub";
return "";
}
public static String  _addcustomerid() throws Exception{
RDebugUtils.currentModule="customerview";
if (Debug.shouldDelegate(ba, "addcustomerid", false))
	 {return ((String) Debug.delegate(ba, "addcustomerid", null));}
RDebugUtils.currentLine=1769472;
 //BA.debugLineNum = 1769472;BA.debugLine="Private Sub AddCustomerID";
RDebugUtils.currentLine=1769474;
 //BA.debugLineNum = 1769474;BA.debugLine="Try";
try {RDebugUtils.currentLine=1769476;
 //BA.debugLineNum = 1769476;BA.debugLine="dbManager.Initialize";
_dbmanager._initialize /*String*/ (null,ba);
RDebugUtils.currentLine=1769478;
 //BA.debugLineNum = 1769478;BA.debugLine="customerRecords = dbManager.GetAll(\"customers\",";
_customerrecords = _dbmanager._getall /*anywheresoftware.b4j.objects.SQL.ResultSetWrapper*/ (null,"customers",(int) (-1));
RDebugUtils.currentLine=1769480;
 //BA.debugLineNum = 1769480;BA.debugLine="lstCustomers.Items.Clear";
_lstcustomers.getItems().Clear();
RDebugUtils.currentLine=1769482;
 //BA.debugLineNum = 1769482;BA.debugLine="Do While customerRecords.NextRow";
while (_customerrecords.NextRow()) {
RDebugUtils.currentLine=1769483;
 //BA.debugLineNum = 1769483;BA.debugLine="lstCustomers.Items.Add(customerRecords.GetStrin";
_lstcustomers.getItems().Add((Object)((_customerrecords.GetString("id"))));
 }
;
 } 
       catch (Exception e9) {
			ba.setLastException(e9);RDebugUtils.currentLine=1769486;
 //BA.debugLineNum = 1769486;BA.debugLine="Main.log.write(LastException.Message)";
_main._log /*b4j.example.logger*/ ._write /*String*/ (null,anywheresoftware.b4a.keywords.Common.LastException(ba).getMessage());
RDebugUtils.currentLine=1769487;
 //BA.debugLineNum = 1769487;BA.debugLine="xui.MsgboxAsync($\"Exception: ${LastException}\"$,";
_xui.MsgboxAsync(ba,("Exception: "+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(anywheresoftware.b4a.keywords.Common.LastException(ba).getObject()))+""),"Exception");
 };
RDebugUtils.currentLine=1769490;
 //BA.debugLineNum = 1769490;BA.debugLine="dbManager.Disconnect";
_dbmanager._disconnect /*String*/ (null);
RDebugUtils.currentLine=1769492;
 //BA.debugLineNum = 1769492;BA.debugLine="End Sub";
return "";
}
public static String  _btnsuspend_click() throws Exception{
RDebugUtils.currentModule="customerview";
if (Debug.shouldDelegate(ba, "btnsuspend_click", false))
	 {return ((String) Debug.delegate(ba, "btnsuspend_click", null));}
RDebugUtils.currentLine=1638400;
 //BA.debugLineNum = 1638400;BA.debugLine="Private Sub btnSuspend_Click";
RDebugUtils.currentLine=1638401;
 //BA.debugLineNum = 1638401;BA.debugLine="dbManager.Initialize";
_dbmanager._initialize /*String*/ (null,ba);
RDebugUtils.currentLine=1638402;
 //BA.debugLineNum = 1638402;BA.debugLine="If(dbManager.DeleteUser(lstCustomers.Items.Get(se";
if ((_dbmanager._deleteuser /*boolean*/ (null,BA.ObjectToString(_lstcustomers.getItems().Get(_selectedindex))))) { 
RDebugUtils.currentLine=1638403;
 //BA.debugLineNum = 1638403;BA.debugLine="xui.MsgboxAsync(\"User deleted\", \"Success\")";
_xui.MsgboxAsync(ba,"User deleted","Success");
 }else {
RDebugUtils.currentLine=1638405;
 //BA.debugLineNum = 1638405;BA.debugLine="xui.MsgboxAsync(\"Could not delete user\", \"Fail\")";
_xui.MsgboxAsync(ba,"Could not delete user","Fail");
 };
RDebugUtils.currentLine=1638407;
 //BA.debugLineNum = 1638407;BA.debugLine="End Sub";
return "";
}
public static String  _close() throws Exception{
RDebugUtils.currentModule="customerview";
if (Debug.shouldDelegate(ba, "close", false))
	 {return ((String) Debug.delegate(ba, "close", null));}
RDebugUtils.currentLine=1572864;
 //BA.debugLineNum = 1572864;BA.debugLine="Public Sub Close";
RDebugUtils.currentLine=1572865;
 //BA.debugLineNum = 1572865;BA.debugLine="frmCustomerView.Close";
_frmcustomerview.Close();
RDebugUtils.currentLine=1572866;
 //BA.debugLineNum = 1572866;BA.debugLine="End Sub";
return "";
}
public static String  _lstcustomers_selectedindexchanged(int _index) throws Exception{
RDebugUtils.currentModule="customerview";
if (Debug.shouldDelegate(ba, "lstcustomers_selectedindexchanged", false))
	 {return ((String) Debug.delegate(ba, "lstcustomers_selectedindexchanged", new Object[] {_index}));}
RDebugUtils.currentLine=1703936;
 //BA.debugLineNum = 1703936;BA.debugLine="Private Sub lstCustomers_SelectedIndexChanged(inde";
RDebugUtils.currentLine=1703938;
 //BA.debugLineNum = 1703938;BA.debugLine="selectedIndex = index";
_selectedindex = _index;
RDebugUtils.currentLine=1703939;
 //BA.debugLineNum = 1703939;BA.debugLine="AddCustDetailsToTable";
_addcustdetailstotable();
RDebugUtils.currentLine=1703941;
 //BA.debugLineNum = 1703941;BA.debugLine="End Sub";
return "";
}
}