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
RDebugUtils.currentLine=1572864;
 //BA.debugLineNum = 1572864;BA.debugLine="Public Sub Show";
RDebugUtils.currentLine=1572865;
 //BA.debugLineNum = 1572865;BA.debugLine="If frmCustomerView.IsInitialized = False Then";
if (_frmcustomerview.IsInitialized()==anywheresoftware.b4a.keywords.Common.False) { 
RDebugUtils.currentLine=1572866;
 //BA.debugLineNum = 1572866;BA.debugLine="frmCustomerView.Initialize(\"frmCustomerView\", 80";
_frmcustomerview.Initialize(ba,"frmCustomerView",800,600);
RDebugUtils.currentLine=1572867;
 //BA.debugLineNum = 1572867;BA.debugLine="frmCustomerView.RootPane.LoadLayout(\"CustomerVie";
_frmcustomerview.getRootPane().LoadLayout(ba,"CustomerView");
 };
RDebugUtils.currentLine=1572871;
 //BA.debugLineNum = 1572871;BA.debugLine="AddCustomerID";
_addcustomerid();
RDebugUtils.currentLine=1572873;
 //BA.debugLineNum = 1572873;BA.debugLine="AddColumnHeadings";
_addcolumnheadings();
RDebugUtils.currentLine=1572875;
 //BA.debugLineNum = 1572875;BA.debugLine="AddCustDetailsToTable";
_addcustdetailstotable();
RDebugUtils.currentLine=1572877;
 //BA.debugLineNum = 1572877;BA.debugLine="frmCustomerView.Show";
_frmcustomerview.Show();
RDebugUtils.currentLine=1572878;
 //BA.debugLineNum = 1572878;BA.debugLine="End Sub";
return "";
}
public static String  _addcolumnheadings() throws Exception{
RDebugUtils.currentModule="customerview";
if (Debug.shouldDelegate(ba, "addcolumnheadings", false))
	 {return ((String) Debug.delegate(ba, "addcolumnheadings", null));}
int _n = 0;
String _colname = "";
RDebugUtils.currentLine=1966080;
 //BA.debugLineNum = 1966080;BA.debugLine="Private Sub AddColumnHeadings";
RDebugUtils.currentLine=1966082;
 //BA.debugLineNum = 1966082;BA.debugLine="Try";
try {RDebugUtils.currentLine=1966084;
 //BA.debugLineNum = 1966084;BA.debugLine="dbManager.Initialize";
_dbmanager._initialize /*String*/ (null,ba);
RDebugUtils.currentLine=1966086;
 //BA.debugLineNum = 1966086;BA.debugLine="customerRecords = dbManager.GetPurchaseDetails(";
_customerrecords = _dbmanager._getpurchasedetails /*anywheresoftware.b4j.objects.SQL.ResultSetWrapper*/ (null,"customers",BA.ObjectToString(_lstcustomers.getItems().Get(_selectedindex)));
RDebugUtils.currentLine=1966089;
 //BA.debugLineNum = 1966089;BA.debugLine="For n = 0 To customerRecords.ColumnCount - 2";
{
final int step4 = 1;
final int limit4 = (int) (_customerrecords.getColumnCount()-2);
_n = (int) (0) ;
for (;_n <= limit4 ;_n = _n + step4 ) {
RDebugUtils.currentLine=1966090;
 //BA.debugLineNum = 1966090;BA.debugLine="Dim colName As String = customerRecords.GetColu";
_colname = _customerrecords.GetColumnName(_n);
RDebugUtils.currentLine=1966091;
 //BA.debugLineNum = 1966091;BA.debugLine="tblViewExpenditure.SetColumnHeader( n , colName";
_tblviewexpenditure.SetColumnHeader(_n,_colname);
 }
};
 } 
       catch (Exception e9) {
			ba.setLastException(e9);RDebugUtils.currentLine=1966095;
 //BA.debugLineNum = 1966095;BA.debugLine="Main.log.write(\"[UID:\" & LoginForm.lgService.use";
_main._log /*b4j.example.logger*/ ._write /*String*/ (null,"[UID:"+_loginform._lgservice /*b4j.example.loginservice*/ ._userdetails /*anywheresoftware.b4j.objects.SQL.ResultSetWrapper*/ .GetString2((int) (0))+"] "+anywheresoftware.b4a.keywords.Common.LastException(ba).getMessage());
RDebugUtils.currentLine=1966096;
 //BA.debugLineNum = 1966096;BA.debugLine="xui.MsgboxAsync( LastException.Message, \"Excepti";
_xui.MsgboxAsync(ba,anywheresoftware.b4a.keywords.Common.LastException(ba).getMessage(),"Exception");
 };
RDebugUtils.currentLine=1966098;
 //BA.debugLineNum = 1966098;BA.debugLine="dbManager.Disconnect";
_dbmanager._disconnect /*String*/ (null);
RDebugUtils.currentLine=1966100;
 //BA.debugLineNum = 1966100;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=1900544;
 //BA.debugLineNum = 1900544;BA.debugLine="Private Sub AddCustDetailsToTable";
RDebugUtils.currentLine=1900546;
 //BA.debugLineNum = 1900546;BA.debugLine="Try";
try {RDebugUtils.currentLine=1900548;
 //BA.debugLineNum = 1900548;BA.debugLine="dbManager.Initialize";
_dbmanager._initialize /*String*/ (null,ba);
RDebugUtils.currentLine=1900550;
 //BA.debugLineNum = 1900550;BA.debugLine="customerRecords = dbManager.GetPurchaseDetails(";
_customerrecords = _dbmanager._getpurchasedetails /*anywheresoftware.b4j.objects.SQL.ResultSetWrapper*/ (null,"customers",BA.ObjectToString(_lstcustomers.getItems().Get(_selectedindex)));
RDebugUtils.currentLine=1900552;
 //BA.debugLineNum = 1900552;BA.debugLine="tblViewExpenditure.Items.Clear";
_tblviewexpenditure.getItems().Clear();
RDebugUtils.currentLine=1900554;
 //BA.debugLineNum = 1900554;BA.debugLine="Do While customerRecords.NextRow";
while (_customerrecords.NextRow()) {
RDebugUtils.currentLine=1900556;
 //BA.debugLineNum = 1900556;BA.debugLine="Dim strID As String = customerRecords.GetString";
_strid = _customerrecords.GetString2((int) (0));
RDebugUtils.currentLine=1900557;
 //BA.debugLineNum = 1900557;BA.debugLine="Dim strDateTime As String =  LongToDate(custome";
_strdatetime = _longtodate(_customerrecords.GetLong2((int) (1)));
RDebugUtils.currentLine=1900558;
 //BA.debugLineNum = 1900558;BA.debugLine="Dim strEndTime As String = LongToDate(customerR";
_strendtime = _longtodate(_customerrecords.GetLong2((int) (2)));
RDebugUtils.currentLine=1900559;
 //BA.debugLineNum = 1900559;BA.debugLine="Dim strTotalAmt As String = customerRecords.Get";
_strtotalamt = _customerrecords.GetString2((int) (3));
RDebugUtils.currentLine=1900561;
 //BA.debugLineNum = 1900561;BA.debugLine="tblViewExpenditure.Items.Add( Array As String(";
_tblviewexpenditure.getItems().Add((Object)(new String[]{_strid,_strdatetime,_strendtime,_strtotalamt}));
 }
;
 } 
       catch (Exception e13) {
			ba.setLastException(e13);RDebugUtils.currentLine=1900564;
 //BA.debugLineNum = 1900564;BA.debugLine="Main.log.write(\"[\" & LoginForm.lgService.userDet";
_main._log /*b4j.example.logger*/ ._write /*String*/ (null,"["+_loginform._lgservice /*b4j.example.loginservice*/ ._userdetails /*anywheresoftware.b4j.objects.SQL.ResultSetWrapper*/ .GetString2((int) (0))+"] "+anywheresoftware.b4a.keywords.Common.LastException(ba).getMessage());
RDebugUtils.currentLine=1900565;
 //BA.debugLineNum = 1900565;BA.debugLine="xui.MsgboxAsync($\"Exception: ${LastException}\"$,";
_xui.MsgboxAsync(ba,("Exception: "+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(anywheresoftware.b4a.keywords.Common.LastException(ba).getObject()))+""),"Exception");
 };
RDebugUtils.currentLine=1900567;
 //BA.debugLineNum = 1900567;BA.debugLine="dbManager.Disconnect";
_dbmanager._disconnect /*String*/ (null);
RDebugUtils.currentLine=1900569;
 //BA.debugLineNum = 1900569;BA.debugLine="End Sub";
return "";
}
public static String  _longtodate(long _ld) throws Exception{
RDebugUtils.currentModule="customerview";
if (Debug.shouldDelegate(ba, "longtodate", false))
	 {return ((String) Debug.delegate(ba, "longtodate", new Object[] {_ld}));}
String _str_date_up = "";
RDebugUtils.currentLine=2031616;
 //BA.debugLineNum = 2031616;BA.debugLine="Private Sub LongToDate(ld As Long) As String";
RDebugUtils.currentLine=2031618;
 //BA.debugLineNum = 2031618;BA.debugLine="DateTime.DateFormat = \"yyyy/MM/dd\"";
anywheresoftware.b4a.keywords.Common.DateTime.setDateFormat("yyyy/MM/dd");
RDebugUtils.currentLine=2031619;
 //BA.debugLineNum = 2031619;BA.debugLine="DateTime.TimeFormat = \"HH:mm:ss\"";
anywheresoftware.b4a.keywords.Common.DateTime.setTimeFormat("HH:mm:ss");
RDebugUtils.currentLine=2031620;
 //BA.debugLineNum = 2031620;BA.debugLine="Dim str_date_up As String = DateTime.Date( ld ) &";
_str_date_up = anywheresoftware.b4a.keywords.Common.DateTime.Date(_ld)+" "+anywheresoftware.b4a.keywords.Common.DateTime.Time(_ld);
RDebugUtils.currentLine=2031621;
 //BA.debugLineNum = 2031621;BA.debugLine="Return str_date_up";
if (true) return _str_date_up;
RDebugUtils.currentLine=2031623;
 //BA.debugLineNum = 2031623;BA.debugLine="End Sub";
return "";
}
public static String  _addcustomerid() throws Exception{
RDebugUtils.currentModule="customerview";
if (Debug.shouldDelegate(ba, "addcustomerid", false))
	 {return ((String) Debug.delegate(ba, "addcustomerid", null));}
RDebugUtils.currentLine=1835008;
 //BA.debugLineNum = 1835008;BA.debugLine="Private Sub AddCustomerID";
RDebugUtils.currentLine=1835010;
 //BA.debugLineNum = 1835010;BA.debugLine="Try";
try {RDebugUtils.currentLine=1835012;
 //BA.debugLineNum = 1835012;BA.debugLine="dbManager.Initialize";
_dbmanager._initialize /*String*/ (null,ba);
RDebugUtils.currentLine=1835014;
 //BA.debugLineNum = 1835014;BA.debugLine="customerRecords = dbManager.GetAll(\"customers\",";
_customerrecords = _dbmanager._getall /*anywheresoftware.b4j.objects.SQL.ResultSetWrapper*/ (null,"customers",(int) (-1));
RDebugUtils.currentLine=1835016;
 //BA.debugLineNum = 1835016;BA.debugLine="lstCustomers.Items.Clear";
_lstcustomers.getItems().Clear();
RDebugUtils.currentLine=1835018;
 //BA.debugLineNum = 1835018;BA.debugLine="Do While customerRecords.NextRow";
while (_customerrecords.NextRow()) {
RDebugUtils.currentLine=1835019;
 //BA.debugLineNum = 1835019;BA.debugLine="lstCustomers.Items.Add(customerRecords.GetStrin";
_lstcustomers.getItems().Add((Object)((_customerrecords.GetString("id"))));
 }
;
 } 
       catch (Exception e9) {
			ba.setLastException(e9);RDebugUtils.currentLine=1835022;
 //BA.debugLineNum = 1835022;BA.debugLine="Main.log.write(LastException.Message)";
_main._log /*b4j.example.logger*/ ._write /*String*/ (null,anywheresoftware.b4a.keywords.Common.LastException(ba).getMessage());
RDebugUtils.currentLine=1835023;
 //BA.debugLineNum = 1835023;BA.debugLine="xui.MsgboxAsync($\"Exception: ${LastException}\"$,";
_xui.MsgboxAsync(ba,("Exception: "+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(anywheresoftware.b4a.keywords.Common.LastException(ba).getObject()))+""),"Exception");
 };
RDebugUtils.currentLine=1835026;
 //BA.debugLineNum = 1835026;BA.debugLine="dbManager.Disconnect";
_dbmanager._disconnect /*String*/ (null);
RDebugUtils.currentLine=1835028;
 //BA.debugLineNum = 1835028;BA.debugLine="End Sub";
return "";
}
public static String  _btnsuspend_click() throws Exception{
RDebugUtils.currentModule="customerview";
if (Debug.shouldDelegate(ba, "btnsuspend_click", false))
	 {return ((String) Debug.delegate(ba, "btnsuspend_click", null));}
RDebugUtils.currentLine=1703936;
 //BA.debugLineNum = 1703936;BA.debugLine="Private Sub btnSuspend_Click";
RDebugUtils.currentLine=1703937;
 //BA.debugLineNum = 1703937;BA.debugLine="dbManager.Initialize";
_dbmanager._initialize /*String*/ (null,ba);
RDebugUtils.currentLine=1703938;
 //BA.debugLineNum = 1703938;BA.debugLine="If(dbManager.DeleteUser(lstCustomers.Items.Get(se";
if ((_dbmanager._deleteuser /*boolean*/ (null,BA.ObjectToString(_lstcustomers.getItems().Get(_selectedindex))))) { 
RDebugUtils.currentLine=1703939;
 //BA.debugLineNum = 1703939;BA.debugLine="xui.MsgboxAsync(\"User deleted\", \"Success\")";
_xui.MsgboxAsync(ba,"User deleted","Success");
 }else {
RDebugUtils.currentLine=1703941;
 //BA.debugLineNum = 1703941;BA.debugLine="xui.MsgboxAsync(\"Could not delete user\", \"Fail\")";
_xui.MsgboxAsync(ba,"Could not delete user","Fail");
 };
RDebugUtils.currentLine=1703943;
 //BA.debugLineNum = 1703943;BA.debugLine="End Sub";
return "";
}
public static String  _close() throws Exception{
RDebugUtils.currentModule="customerview";
if (Debug.shouldDelegate(ba, "close", false))
	 {return ((String) Debug.delegate(ba, "close", null));}
RDebugUtils.currentLine=1638400;
 //BA.debugLineNum = 1638400;BA.debugLine="Public Sub Close";
RDebugUtils.currentLine=1638401;
 //BA.debugLineNum = 1638401;BA.debugLine="frmCustomerView.Close";
_frmcustomerview.Close();
RDebugUtils.currentLine=1638402;
 //BA.debugLineNum = 1638402;BA.debugLine="End Sub";
return "";
}
public static String  _lstcustomers_selectedindexchanged(int _index) throws Exception{
RDebugUtils.currentModule="customerview";
if (Debug.shouldDelegate(ba, "lstcustomers_selectedindexchanged", false))
	 {return ((String) Debug.delegate(ba, "lstcustomers_selectedindexchanged", new Object[] {_index}));}
RDebugUtils.currentLine=1769472;
 //BA.debugLineNum = 1769472;BA.debugLine="Private Sub lstCustomers_SelectedIndexChanged(inde";
RDebugUtils.currentLine=1769474;
 //BA.debugLineNum = 1769474;BA.debugLine="selectedIndex = index";
_selectedindex = _index;
RDebugUtils.currentLine=1769475;
 //BA.debugLineNum = 1769475;BA.debugLine="AddCustDetailsToTable";
_addcustdetailstotable();
RDebugUtils.currentLine=1769477;
 //BA.debugLineNum = 1769477;BA.debugLine="End Sub";
return "";
}
}