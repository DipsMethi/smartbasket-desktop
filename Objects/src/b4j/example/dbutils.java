package b4j.example;

import anywheresoftware.b4a.debug.*;

import anywheresoftware.b4a.BA;

public class dbutils extends Object{
public static dbutils mostCurrent = new dbutils();

public static BA ba;
static {
		ba = new  anywheresoftware.b4a.shell.ShellBA("b4j.example", "b4j.example.dbutils", null);
		ba.loadHtSubs(dbutils.class);
        if (ba.getClass().getName().endsWith("ShellBA")) {
			
			ba.raiseEvent2(null, true, "SHELL", false);
			ba.raiseEvent2(null, true, "CREATE", true, "b4j.example.dbutils", ba);
		}
	}
    public static Class<?> getObject() {
		return dbutils.class;
	}

 
public static class _dbfieldinfo{
public boolean IsInitialized;
public String FieldName;
public String DataType;
public boolean CanBeNull;
public Object DefValue;
public void Initialize() {
IsInitialized = true;
FieldName = "";
DataType = "";
CanBeNull = false;
DefValue = new Object();
}
@Override
		public String toString() {
			return BA.TypeToString(this, false);
		}}
public static anywheresoftware.b4a.keywords.Common __c = null;
public static String _db_real = "";
public static String _db_integer = "";
public static String _db_blob = "";
public static String _db_text = "";
public static String _htmlcss = "";
public static b4j.example.main _main = null;
public static b4j.example.loginform _loginform = null;
public static b4j.example.dashboard _dashboard = null;
public static b4j.example.registrationform _registrationform = null;
public static b4j.example.customerview _customerview = null;
public static b4j.example.b4xcollections _b4xcollections = null;
public static String  _copydbfromassets(String _filename,String _appname) throws Exception{
RDebugUtils.currentModule="dbutils";
if (Debug.shouldDelegate(ba, "copydbfromassets", true))
	 {return ((String) Debug.delegate(ba, "copydbfromassets", new Object[] {_filename,_appname}));}
String _targetdir = "";
RDebugUtils.currentLine=6881280;
 //BA.debugLineNum = 6881280;BA.debugLine="Public Sub CopyDBFromAssets (FileName As String, A";
RDebugUtils.currentLine=6881281;
 //BA.debugLineNum = 6881281;BA.debugLine="Dim TargetDir As String = GetDBFolder(AppName)";
_targetdir = _getdbfolder(_appname);
RDebugUtils.currentLine=6881282;
 //BA.debugLineNum = 6881282;BA.debugLine="If File.Exists(TargetDir, FileName) = False Then";
if (anywheresoftware.b4a.keywords.Common.File.Exists(_targetdir,_filename)==anywheresoftware.b4a.keywords.Common.False) { 
RDebugUtils.currentLine=6881283;
 //BA.debugLineNum = 6881283;BA.debugLine="File.Copy(File.DirAssets, FileName, TargetDir, F";
anywheresoftware.b4a.keywords.Common.File.Copy(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),_filename,_targetdir,_filename);
 };
RDebugUtils.currentLine=6881285;
 //BA.debugLineNum = 6881285;BA.debugLine="Return TargetDir";
if (true) return _targetdir;
RDebugUtils.currentLine=6881286;
 //BA.debugLineNum = 6881286;BA.debugLine="End Sub";
return "";
}
public static String  _getdbfolder(String _appname) throws Exception{
RDebugUtils.currentModule="dbutils";
if (Debug.shouldDelegate(ba, "getdbfolder", true))
	 {return ((String) Debug.delegate(ba, "getdbfolder", new Object[] {_appname}));}
RDebugUtils.currentLine=6815744;
 //BA.debugLineNum = 6815744;BA.debugLine="Public Sub GetDBFolder (AppName As String) As Stri";
RDebugUtils.currentLine=6815745;
 //BA.debugLineNum = 6815745;BA.debugLine="Return File.DirData(AppName)";
if (true) return anywheresoftware.b4a.keywords.Common.File.DirData(_appname);
RDebugUtils.currentLine=6815746;
 //BA.debugLineNum = 6815746;BA.debugLine="End Sub";
return "";
}
public static String  _createtable(anywheresoftware.b4j.objects.SQL _sql,String _tablename,anywheresoftware.b4a.objects.collections.Map _fieldsandtypes,String _primarykey) throws Exception{
RDebugUtils.currentModule="dbutils";
if (Debug.shouldDelegate(ba, "createtable", true))
	 {return ((String) Debug.delegate(ba, "createtable", new Object[] {_sql,_tablename,_fieldsandtypes,_primarykey}));}
anywheresoftware.b4a.keywords.StringBuilderWrapper _sb = null;
int _i = 0;
String _field = "";
String _ftype = "";
String _query = "";
RDebugUtils.currentLine=7012352;
 //BA.debugLineNum = 7012352;BA.debugLine="Public Sub CreateTable(SQL As SQL, TableName As St";
RDebugUtils.currentLine=7012353;
 //BA.debugLineNum = 7012353;BA.debugLine="Dim sb As StringBuilder";
_sb = new anywheresoftware.b4a.keywords.StringBuilderWrapper();
RDebugUtils.currentLine=7012354;
 //BA.debugLineNum = 7012354;BA.debugLine="sb.Initialize";
_sb.Initialize();
RDebugUtils.currentLine=7012355;
 //BA.debugLineNum = 7012355;BA.debugLine="sb.Append(\"(\")";
_sb.Append("(");
RDebugUtils.currentLine=7012356;
 //BA.debugLineNum = 7012356;BA.debugLine="For i = 0 To FieldsAndTypes.Size - 1";
{
final int step4 = 1;
final int limit4 = (int) (_fieldsandtypes.getSize()-1);
_i = (int) (0) ;
for (;_i <= limit4 ;_i = _i + step4 ) {
RDebugUtils.currentLine=7012357;
 //BA.debugLineNum = 7012357;BA.debugLine="Dim field, ftype As String";
_field = "";
_ftype = "";
RDebugUtils.currentLine=7012358;
 //BA.debugLineNum = 7012358;BA.debugLine="field = FieldsAndTypes.GetKeyAt(i)";
_field = BA.ObjectToString(_fieldsandtypes.GetKeyAt(_i));
RDebugUtils.currentLine=7012359;
 //BA.debugLineNum = 7012359;BA.debugLine="ftype = FieldsAndTypes.GetValueAt(i)";
_ftype = BA.ObjectToString(_fieldsandtypes.GetValueAt(_i));
RDebugUtils.currentLine=7012360;
 //BA.debugLineNum = 7012360;BA.debugLine="If i > 0 Then sb.Append(\", \")";
if (_i>0) { 
_sb.Append(", ");};
RDebugUtils.currentLine=7012361;
 //BA.debugLineNum = 7012361;BA.debugLine="sb.Append(EscapeField(field)).Append(\" \").Append";
_sb.Append(_escapefield(_field)).Append(" ").Append(_ftype);
RDebugUtils.currentLine=7012362;
 //BA.debugLineNum = 7012362;BA.debugLine="If field = PrimaryKey Then sb.Append(\" PRIMARY K";
if ((_field).equals(_primarykey)) { 
_sb.Append(" PRIMARY KEY");};
 }
};
RDebugUtils.currentLine=7012364;
 //BA.debugLineNum = 7012364;BA.debugLine="sb.Append(\")\")";
_sb.Append(")");
RDebugUtils.currentLine=7012365;
 //BA.debugLineNum = 7012365;BA.debugLine="Dim query As String = \"CREATE TABLE IF NOT EXISTS";
_query = "CREATE TABLE IF NOT EXISTS "+_escapefield(_tablename)+" "+_sb.ToString();
RDebugUtils.currentLine=7012367;
 //BA.debugLineNum = 7012367;BA.debugLine="Log(\"CreateTable: \" & query)";
anywheresoftware.b4a.keywords.Common.LogImpl("97012367","CreateTable: "+_query,0);
RDebugUtils.currentLine=7012369;
 //BA.debugLineNum = 7012369;BA.debugLine="SQL.ExecNonQuery(query)";
_sql.ExecNonQuery(_query);
RDebugUtils.currentLine=7012370;
 //BA.debugLineNum = 7012370;BA.debugLine="End Sub";
return "";
}
public static String  _escapefield(String _f) throws Exception{
RDebugUtils.currentModule="dbutils";
if (Debug.shouldDelegate(ba, "escapefield", true))
	 {return ((String) Debug.delegate(ba, "escapefield", new Object[] {_f}));}
RDebugUtils.currentLine=6946816;
 //BA.debugLineNum = 6946816;BA.debugLine="Private Sub EscapeField(f As String) As String";
RDebugUtils.currentLine=6946817;
 //BA.debugLineNum = 6946817;BA.debugLine="Return \"[\" & f & \"]\"";
if (true) return "["+_f+"]";
RDebugUtils.currentLine=6946818;
 //BA.debugLineNum = 6946818;BA.debugLine="End Sub";
return "";
}
public static String  _deleterecord(anywheresoftware.b4j.objects.SQL _sql,String _tablename,anywheresoftware.b4a.objects.collections.Map _wherefieldequals) throws Exception{
RDebugUtils.currentModule="dbutils";
if (Debug.shouldDelegate(ba, "deleterecord", true))
	 {return ((String) Debug.delegate(ba, "deleterecord", new Object[] {_sql,_tablename,_wherefieldequals}));}
anywheresoftware.b4a.keywords.StringBuilderWrapper _sb = null;
anywheresoftware.b4a.objects.collections.List _args = null;
String _col = "";
RDebugUtils.currentLine=7929856;
 //BA.debugLineNum = 7929856;BA.debugLine="Public Sub DeleteRecord(SQL As SQL, TableName As S";
RDebugUtils.currentLine=7929857;
 //BA.debugLineNum = 7929857;BA.debugLine="Dim sb As StringBuilder";
_sb = new anywheresoftware.b4a.keywords.StringBuilderWrapper();
RDebugUtils.currentLine=7929858;
 //BA.debugLineNum = 7929858;BA.debugLine="sb.Initialize";
_sb.Initialize();
RDebugUtils.currentLine=7929859;
 //BA.debugLineNum = 7929859;BA.debugLine="sb.Append(\"DELETE FROM \" & EscapeField(TableName)";
_sb.Append("DELETE FROM "+_escapefield(_tablename)+" WHERE ");
RDebugUtils.currentLine=7929860;
 //BA.debugLineNum = 7929860;BA.debugLine="If WhereFieldEquals.Size = 0 Then";
if (_wherefieldequals.getSize()==0) { 
RDebugUtils.currentLine=7929861;
 //BA.debugLineNum = 7929861;BA.debugLine="Log(\"WhereFieldEquals map empty!\")";
anywheresoftware.b4a.keywords.Common.LogImpl("97929861","WhereFieldEquals map empty!",0);
RDebugUtils.currentLine=7929862;
 //BA.debugLineNum = 7929862;BA.debugLine="Return";
if (true) return "";
 };
RDebugUtils.currentLine=7929864;
 //BA.debugLineNum = 7929864;BA.debugLine="Dim args As List";
_args = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=7929865;
 //BA.debugLineNum = 7929865;BA.debugLine="args.Initialize";
_args.Initialize();
RDebugUtils.currentLine=7929866;
 //BA.debugLineNum = 7929866;BA.debugLine="For Each col As String In WhereFieldEquals.Keys";
{
final anywheresoftware.b4a.BA.IterableList group10 = _wherefieldequals.Keys();
final int groupLen10 = group10.getSize()
;int index10 = 0;
;
for (; index10 < groupLen10;index10++){
_col = BA.ObjectToString(group10.Get(index10));
RDebugUtils.currentLine=7929867;
 //BA.debugLineNum = 7929867;BA.debugLine="If args.Size > 0 Then sb.Append(\" AND \")";
if (_args.getSize()>0) { 
_sb.Append(" AND ");};
RDebugUtils.currentLine=7929868;
 //BA.debugLineNum = 7929868;BA.debugLine="sb.Append(EscapeField(col)).Append(\" = ?\")";
_sb.Append(_escapefield(_col)).Append(" = ?");
RDebugUtils.currentLine=7929869;
 //BA.debugLineNum = 7929869;BA.debugLine="args.Add(WhereFieldEquals.Get(col))";
_args.Add(_wherefieldequals.Get((Object)(_col)));
 }
};
RDebugUtils.currentLine=7929872;
 //BA.debugLineNum = 7929872;BA.debugLine="Log(\"DeleteRecord: \" & sb.ToString)";
anywheresoftware.b4a.keywords.Common.LogImpl("97929872","DeleteRecord: "+_sb.ToString(),0);
RDebugUtils.currentLine=7929874;
 //BA.debugLineNum = 7929874;BA.debugLine="SQL.ExecNonQuery2(sb.ToString, args)";
_sql.ExecNonQuery2(_sb.ToString(),_args);
RDebugUtils.currentLine=7929875;
 //BA.debugLineNum = 7929875;BA.debugLine="End Sub";
return "";
}
public static String  _droptable(anywheresoftware.b4j.objects.SQL _sql,String _tablename) throws Exception{
RDebugUtils.currentModule="dbutils";
if (Debug.shouldDelegate(ba, "droptable", true))
	 {return ((String) Debug.delegate(ba, "droptable", new Object[] {_sql,_tablename}));}
String _query = "";
RDebugUtils.currentLine=7077888;
 //BA.debugLineNum = 7077888;BA.debugLine="Public Sub DropTable(SQL As SQL, TableName As Stri";
RDebugUtils.currentLine=7077889;
 //BA.debugLineNum = 7077889;BA.debugLine="Dim query As String = \"DROP TABLE IF EXISTS\" & Es";
_query = "DROP TABLE IF EXISTS"+_escapefield(_tablename);
RDebugUtils.currentLine=7077891;
 //BA.debugLineNum = 7077891;BA.debugLine="Log(\"DropTable: \" & query)";
anywheresoftware.b4a.keywords.Common.LogImpl("97077891","DropTable: "+_query,0);
RDebugUtils.currentLine=7077893;
 //BA.debugLineNum = 7077893;BA.debugLine="SQL.ExecNonQuery(query)";
_sql.ExecNonQuery(_query);
RDebugUtils.currentLine=7077894;
 //BA.debugLineNum = 7077894;BA.debugLine="End Sub";
return "";
}
public static String  _executehtml(anywheresoftware.b4j.objects.SQL _sql,String _query,String[] _stringargs,int _limit,boolean _clickable) throws Exception{
RDebugUtils.currentModule="dbutils";
if (Debug.shouldDelegate(ba, "executehtml", true))
	 {return ((String) Debug.delegate(ba, "executehtml", new Object[] {_sql,_query,_stringargs,_limit,_clickable}));}
anywheresoftware.b4j.objects.SQL.ResultSetWrapper _cur = null;
anywheresoftware.b4a.keywords.StringBuilderWrapper _sb = null;
int _i = 0;
int _row = 0;
RDebugUtils.currentLine=7602176;
 //BA.debugLineNum = 7602176;BA.debugLine="Public Sub ExecuteHtml(SQL As SQL, Query As String";
RDebugUtils.currentLine=7602177;
 //BA.debugLineNum = 7602177;BA.debugLine="Dim cur As ResultSet";
_cur = new anywheresoftware.b4j.objects.SQL.ResultSetWrapper();
RDebugUtils.currentLine=7602178;
 //BA.debugLineNum = 7602178;BA.debugLine="If StringArgs <> Null Then";
if (_stringargs!= null) { 
RDebugUtils.currentLine=7602179;
 //BA.debugLineNum = 7602179;BA.debugLine="cur = SQL.ExecQuery2(Query, StringArgs)";
_cur = _sql.ExecQuery2(_query,anywheresoftware.b4a.keywords.Common.ArrayToList(_stringargs));
 }else {
RDebugUtils.currentLine=7602181;
 //BA.debugLineNum = 7602181;BA.debugLine="cur = SQL.ExecQuery(Query)";
_cur = _sql.ExecQuery(_query);
 };
RDebugUtils.currentLine=7602184;
 //BA.debugLineNum = 7602184;BA.debugLine="Log(\"ExecuteHtml: \" & Query)";
anywheresoftware.b4a.keywords.Common.LogImpl("97602184","ExecuteHtml: "+_query,0);
RDebugUtils.currentLine=7602187;
 //BA.debugLineNum = 7602187;BA.debugLine="Dim sb As StringBuilder";
_sb = new anywheresoftware.b4a.keywords.StringBuilderWrapper();
RDebugUtils.currentLine=7602188;
 //BA.debugLineNum = 7602188;BA.debugLine="sb.Initialize";
_sb.Initialize();
RDebugUtils.currentLine=7602189;
 //BA.debugLineNum = 7602189;BA.debugLine="sb.Append(\"<html><body>\").Append(CRLF)";
_sb.Append("<html><body>").Append(anywheresoftware.b4a.keywords.Common.CRLF);
RDebugUtils.currentLine=7602190;
 //BA.debugLineNum = 7602190;BA.debugLine="sb.Append(\"<style type='text/css'>\").Append(HtmlC";
_sb.Append("<style type='text/css'>").Append(_htmlcss).Append("</style>").Append(anywheresoftware.b4a.keywords.Common.CRLF);
RDebugUtils.currentLine=7602191;
 //BA.debugLineNum = 7602191;BA.debugLine="sb.Append(\"<table><thead><tr>\").Append(CRLF)";
_sb.Append("<table><thead><tr>").Append(anywheresoftware.b4a.keywords.Common.CRLF);
RDebugUtils.currentLine=7602192;
 //BA.debugLineNum = 7602192;BA.debugLine="For i = 0 To cur.ColumnCount - 1";
{
final int step13 = 1;
final int limit13 = (int) (_cur.getColumnCount()-1);
_i = (int) (0) ;
for (;_i <= limit13 ;_i = _i + step13 ) {
RDebugUtils.currentLine=7602193;
 //BA.debugLineNum = 7602193;BA.debugLine="sb.Append(\"<th>\").Append(cur.GetColumnName(i)).A";
_sb.Append("<th>").Append(_cur.GetColumnName(_i)).Append("</th>");
 }
};
RDebugUtils.currentLine=7602195;
 //BA.debugLineNum = 7602195;BA.debugLine="sb.Append(\"</thead>\")";
_sb.Append("</thead>");
RDebugUtils.currentLine=7602205;
 //BA.debugLineNum = 7602205;BA.debugLine="sb.Append(\"</tr>\").Append(CRLF)";
_sb.Append("</tr>").Append(anywheresoftware.b4a.keywords.Common.CRLF);
RDebugUtils.currentLine=7602206;
 //BA.debugLineNum = 7602206;BA.debugLine="Dim row As Int";
_row = 0;
RDebugUtils.currentLine=7602207;
 //BA.debugLineNum = 7602207;BA.debugLine="Do While cur.NextRow";
while (_cur.NextRow()) {
RDebugUtils.currentLine=7602208;
 //BA.debugLineNum = 7602208;BA.debugLine="If row Mod 2 = 0 Then";
if (_row%2==0) { 
RDebugUtils.currentLine=7602209;
 //BA.debugLineNum = 7602209;BA.debugLine="sb.Append(\"<tr>\")";
_sb.Append("<tr>");
 }else {
RDebugUtils.currentLine=7602211;
 //BA.debugLineNum = 7602211;BA.debugLine="sb.Append(\"<tr class='odd'>\")";
_sb.Append("<tr class='odd'>");
 };
RDebugUtils.currentLine=7602213;
 //BA.debugLineNum = 7602213;BA.debugLine="For i = 0 To cur.ColumnCount - 1";
{
final int step25 = 1;
final int limit25 = (int) (_cur.getColumnCount()-1);
_i = (int) (0) ;
for (;_i <= limit25 ;_i = _i + step25 ) {
RDebugUtils.currentLine=7602214;
 //BA.debugLineNum = 7602214;BA.debugLine="sb.Append(\"<td>\")";
_sb.Append("<td>");
RDebugUtils.currentLine=7602215;
 //BA.debugLineNum = 7602215;BA.debugLine="If Clickable Then";
if (_clickable) { 
RDebugUtils.currentLine=7602216;
 //BA.debugLineNum = 7602216;BA.debugLine="sb.Append(\"<a href='http://\").Append(i).Append";
_sb.Append("<a href='http://").Append(BA.NumberToString(_i)).Append(".");
RDebugUtils.currentLine=7602217;
 //BA.debugLineNum = 7602217;BA.debugLine="sb.Append(row)";
_sb.Append(BA.NumberToString(_row));
RDebugUtils.currentLine=7602218;
 //BA.debugLineNum = 7602218;BA.debugLine="sb.Append(\".stub'>\").Append(cur.GetString2(i))";
_sb.Append(".stub'>").Append(_cur.GetString2(_i)).Append("</a>");
 }else {
RDebugUtils.currentLine=7602220;
 //BA.debugLineNum = 7602220;BA.debugLine="sb.Append(cur.GetString2(i))";
_sb.Append(_cur.GetString2(_i));
 };
RDebugUtils.currentLine=7602222;
 //BA.debugLineNum = 7602222;BA.debugLine="sb.Append(\"</td>\")";
_sb.Append("</td>");
 }
};
RDebugUtils.currentLine=7602224;
 //BA.debugLineNum = 7602224;BA.debugLine="sb.Append(\"</tr>\").Append(CRLF)";
_sb.Append("</tr>").Append(anywheresoftware.b4a.keywords.Common.CRLF);
RDebugUtils.currentLine=7602225;
 //BA.debugLineNum = 7602225;BA.debugLine="row = row + 1";
_row = (int) (_row+1);
 }
;
RDebugUtils.currentLine=7602227;
 //BA.debugLineNum = 7602227;BA.debugLine="cur.Close";
_cur.Close();
RDebugUtils.currentLine=7602228;
 //BA.debugLineNum = 7602228;BA.debugLine="sb.Append(\"</table></body></html>\")";
_sb.Append("</table></body></html>");
RDebugUtils.currentLine=7602229;
 //BA.debugLineNum = 7602229;BA.debugLine="Return sb.ToString";
if (true) return _sb.ToString();
RDebugUtils.currentLine=7602230;
 //BA.debugLineNum = 7602230;BA.debugLine="End Sub";
return "";
}
public static anywheresoftware.b4a.objects.collections.Map  _executejson(anywheresoftware.b4j.objects.SQL _sql,String _query,String[] _stringargs,int _limit,anywheresoftware.b4a.objects.collections.List _dbtypes) throws Exception{
RDebugUtils.currentModule="dbutils";
if (Debug.shouldDelegate(ba, "executejson", true))
	 {return ((anywheresoftware.b4a.objects.collections.Map) Debug.delegate(ba, "executejson", new Object[] {_sql,_query,_stringargs,_limit,_dbtypes}));}
anywheresoftware.b4a.objects.collections.List _table = null;
anywheresoftware.b4j.objects.SQL.ResultSetWrapper _cur = null;
anywheresoftware.b4a.objects.collections.Map _m = null;
int _i = 0;
anywheresoftware.b4a.objects.collections.Map _root = null;
RDebugUtils.currentLine=7536640;
 //BA.debugLineNum = 7536640;BA.debugLine="Public Sub ExecuteJSON (SQL As SQL, Query As Strin";
RDebugUtils.currentLine=7536641;
 //BA.debugLineNum = 7536641;BA.debugLine="Dim table As List";
_table = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=7536642;
 //BA.debugLineNum = 7536642;BA.debugLine="Dim cur As ResultSet";
_cur = new anywheresoftware.b4j.objects.SQL.ResultSetWrapper();
RDebugUtils.currentLine=7536643;
 //BA.debugLineNum = 7536643;BA.debugLine="If StringArgs <> Null Then";
if (_stringargs!= null) { 
RDebugUtils.currentLine=7536644;
 //BA.debugLineNum = 7536644;BA.debugLine="cur = SQL.ExecQuery2(Query, StringArgs)";
_cur = _sql.ExecQuery2(_query,anywheresoftware.b4a.keywords.Common.ArrayToList(_stringargs));
 }else {
RDebugUtils.currentLine=7536646;
 //BA.debugLineNum = 7536646;BA.debugLine="cur = SQL.ExecQuery(Query)";
_cur = _sql.ExecQuery(_query);
 };
RDebugUtils.currentLine=7536649;
 //BA.debugLineNum = 7536649;BA.debugLine="Log(\"ExecuteJSON: \" & Query)";
anywheresoftware.b4a.keywords.Common.LogImpl("97536649","ExecuteJSON: "+_query,0);
RDebugUtils.currentLine=7536651;
 //BA.debugLineNum = 7536651;BA.debugLine="Dim table As List";
_table = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=7536652;
 //BA.debugLineNum = 7536652;BA.debugLine="table.Initialize";
_table.Initialize();
RDebugUtils.currentLine=7536653;
 //BA.debugLineNum = 7536653;BA.debugLine="Do While cur.NextRow";
while (_cur.NextRow()) {
RDebugUtils.currentLine=7536654;
 //BA.debugLineNum = 7536654;BA.debugLine="Dim m As Map";
_m = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=7536655;
 //BA.debugLineNum = 7536655;BA.debugLine="m.Initialize";
_m.Initialize();
RDebugUtils.currentLine=7536656;
 //BA.debugLineNum = 7536656;BA.debugLine="For i = 0 To cur.ColumnCount - 1";
{
final int step14 = 1;
final int limit14 = (int) (_cur.getColumnCount()-1);
_i = (int) (0) ;
for (;_i <= limit14 ;_i = _i + step14 ) {
RDebugUtils.currentLine=7536657;
 //BA.debugLineNum = 7536657;BA.debugLine="Select DBTypes.Get(i)";
switch (BA.switchObjectToInt(_dbtypes.Get(_i),(Object)(_db_text),(Object)(_db_integer),(Object)(_db_real))) {
case 0: {
RDebugUtils.currentLine=7536659;
 //BA.debugLineNum = 7536659;BA.debugLine="m.Put(cur.GetColumnName(i), cur.GetString2(i)";
_m.Put((Object)(_cur.GetColumnName(_i)),(Object)(_cur.GetString2(_i)));
 break; }
case 1: {
RDebugUtils.currentLine=7536661;
 //BA.debugLineNum = 7536661;BA.debugLine="m.Put(cur.GetColumnName(i), cur.GetLong2(i))";
_m.Put((Object)(_cur.GetColumnName(_i)),(Object)(_cur.GetLong2(_i)));
 break; }
case 2: {
RDebugUtils.currentLine=7536663;
 //BA.debugLineNum = 7536663;BA.debugLine="m.Put(cur.GetColumnName(i), cur.GetDouble2(i)";
_m.Put((Object)(_cur.GetColumnName(_i)),(Object)(_cur.GetDouble2(_i)));
 break; }
default: {
RDebugUtils.currentLine=7536665;
 //BA.debugLineNum = 7536665;BA.debugLine="Log(\"Invalid type: \" & DBTypes.Get(i))";
anywheresoftware.b4a.keywords.Common.LogImpl("97536665","Invalid type: "+BA.ObjectToString(_dbtypes.Get(_i)),0);
 break; }
}
;
 }
};
RDebugUtils.currentLine=7536668;
 //BA.debugLineNum = 7536668;BA.debugLine="table.Add(m)";
_table.Add((Object)(_m.getObject()));
RDebugUtils.currentLine=7536669;
 //BA.debugLineNum = 7536669;BA.debugLine="If Limit > 0 And table.Size >= Limit Then Exit";
if (_limit>0 && _table.getSize()>=_limit) { 
if (true) break;};
 }
;
RDebugUtils.currentLine=7536671;
 //BA.debugLineNum = 7536671;BA.debugLine="cur.Close";
_cur.Close();
RDebugUtils.currentLine=7536672;
 //BA.debugLineNum = 7536672;BA.debugLine="Dim root As Map";
_root = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=7536673;
 //BA.debugLineNum = 7536673;BA.debugLine="root.Initialize";
_root.Initialize();
RDebugUtils.currentLine=7536674;
 //BA.debugLineNum = 7536674;BA.debugLine="root.Put(\"root\", table)";
_root.Put((Object)("root"),(Object)(_table.getObject()));
RDebugUtils.currentLine=7536675;
 //BA.debugLineNum = 7536675;BA.debugLine="Return root";
if (true) return _root;
RDebugUtils.currentLine=7536676;
 //BA.debugLineNum = 7536676;BA.debugLine="End Sub";
return null;
}
public static anywheresoftware.b4a.objects.collections.List  _executelist(anywheresoftware.b4j.objects.SQL _sql,String _query,String[] _stringargs,int _limit) throws Exception{
RDebugUtils.currentModule="dbutils";
if (Debug.shouldDelegate(ba, "executelist", true))
	 {return ((anywheresoftware.b4a.objects.collections.List) Debug.delegate(ba, "executelist", new Object[] {_sql,_query,_stringargs,_limit}));}
anywheresoftware.b4a.objects.collections.List _table = null;
anywheresoftware.b4a.objects.collections.List _res = null;
String[] _cols = null;
RDebugUtils.currentLine=7471104;
 //BA.debugLineNum = 7471104;BA.debugLine="Public Sub ExecuteList(SQL As SQL, Query As String";
RDebugUtils.currentLine=7471105;
 //BA.debugLineNum = 7471105;BA.debugLine="Dim Table As List = ExecuteMemoryTable(SQL, Query";
_table = new anywheresoftware.b4a.objects.collections.List();
_table = _executememorytable(_sql,_query,_stringargs,_limit);
RDebugUtils.currentLine=7471106;
 //BA.debugLineNum = 7471106;BA.debugLine="Dim res As List";
_res = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=7471107;
 //BA.debugLineNum = 7471107;BA.debugLine="res.Initialize";
_res.Initialize();
RDebugUtils.currentLine=7471108;
 //BA.debugLineNum = 7471108;BA.debugLine="For Each Cols() As String In Table";
{
final anywheresoftware.b4a.BA.IterableList group4 = _table;
final int groupLen4 = group4.getSize()
;int index4 = 0;
;
for (; index4 < groupLen4;index4++){
_cols = (String[])(group4.Get(index4));
RDebugUtils.currentLine=7471109;
 //BA.debugLineNum = 7471109;BA.debugLine="res.Add(Cols(0))";
_res.Add((Object)(_cols[(int) (0)]));
 }
};
RDebugUtils.currentLine=7471111;
 //BA.debugLineNum = 7471111;BA.debugLine="Return res";
if (true) return _res;
RDebugUtils.currentLine=7471112;
 //BA.debugLineNum = 7471112;BA.debugLine="End Sub";
return null;
}
public static anywheresoftware.b4a.objects.collections.List  _executememorytable(anywheresoftware.b4j.objects.SQL _sql,String _query,String[] _stringargs,int _limit) throws Exception{
RDebugUtils.currentModule="dbutils";
if (Debug.shouldDelegate(ba, "executememorytable", true))
	 {return ((anywheresoftware.b4a.objects.collections.List) Debug.delegate(ba, "executememorytable", new Object[] {_sql,_query,_stringargs,_limit}));}
anywheresoftware.b4j.objects.SQL.ResultSetWrapper _cur = null;
anywheresoftware.b4a.objects.collections.List _table = null;
String[] _values = null;
int _col = 0;
RDebugUtils.currentLine=7208960;
 //BA.debugLineNum = 7208960;BA.debugLine="Public Sub ExecuteMemoryTable(SQL As SQL, Query As";
RDebugUtils.currentLine=7208961;
 //BA.debugLineNum = 7208961;BA.debugLine="Dim cur As ResultSet";
_cur = new anywheresoftware.b4j.objects.SQL.ResultSetWrapper();
RDebugUtils.currentLine=7208962;
 //BA.debugLineNum = 7208962;BA.debugLine="If StringArgs = Null Then";
if (_stringargs== null) { 
RDebugUtils.currentLine=7208963;
 //BA.debugLineNum = 7208963;BA.debugLine="Dim StringArgs(0) As String";
_stringargs = new String[(int) (0)];
java.util.Arrays.fill(_stringargs,"");
 };
RDebugUtils.currentLine=7208965;
 //BA.debugLineNum = 7208965;BA.debugLine="cur = SQL.ExecQuery2(Query, StringArgs)";
_cur = _sql.ExecQuery2(_query,anywheresoftware.b4a.keywords.Common.ArrayToList(_stringargs));
RDebugUtils.currentLine=7208967;
 //BA.debugLineNum = 7208967;BA.debugLine="Log(\"ExecuteMemoryTable: \" & Query)";
anywheresoftware.b4a.keywords.Common.LogImpl("97208967","ExecuteMemoryTable: "+_query,0);
RDebugUtils.currentLine=7208969;
 //BA.debugLineNum = 7208969;BA.debugLine="Dim table As List";
_table = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=7208970;
 //BA.debugLineNum = 7208970;BA.debugLine="table.Initialize";
_table.Initialize();
RDebugUtils.currentLine=7208971;
 //BA.debugLineNum = 7208971;BA.debugLine="Do While cur.NextRow";
while (_cur.NextRow()) {
RDebugUtils.currentLine=7208972;
 //BA.debugLineNum = 7208972;BA.debugLine="Dim values(cur.ColumnCount) As String";
_values = new String[_cur.getColumnCount()];
java.util.Arrays.fill(_values,"");
RDebugUtils.currentLine=7208973;
 //BA.debugLineNum = 7208973;BA.debugLine="For col = 0 To cur.ColumnCount - 1";
{
final int step11 = 1;
final int limit11 = (int) (_cur.getColumnCount()-1);
_col = (int) (0) ;
for (;_col <= limit11 ;_col = _col + step11 ) {
RDebugUtils.currentLine=7208974;
 //BA.debugLineNum = 7208974;BA.debugLine="values(col) = cur.GetString2(col)";
_values[_col] = _cur.GetString2(_col);
 }
};
RDebugUtils.currentLine=7208976;
 //BA.debugLineNum = 7208976;BA.debugLine="table.Add(values)";
_table.Add((Object)(_values));
RDebugUtils.currentLine=7208977;
 //BA.debugLineNum = 7208977;BA.debugLine="If Limit > 0 And table.Size >= Limit Then Exit";
if (_limit>0 && _table.getSize()>=_limit) { 
if (true) break;};
 }
;
RDebugUtils.currentLine=7208979;
 //BA.debugLineNum = 7208979;BA.debugLine="cur.Close";
_cur.Close();
RDebugUtils.currentLine=7208980;
 //BA.debugLineNum = 7208980;BA.debugLine="Return table";
if (true) return _table;
RDebugUtils.currentLine=7208981;
 //BA.debugLineNum = 7208981;BA.debugLine="End Sub";
return null;
}
public static String  _executelist2(anywheresoftware.b4j.objects.SQL _sql,String _query,String[] _stringargs,int _limit,anywheresoftware.b4a.objects.collections.List _list) throws Exception{
RDebugUtils.currentModule="dbutils";
if (Debug.shouldDelegate(ba, "executelist2", true))
	 {return ((String) Debug.delegate(ba, "executelist2", new Object[] {_sql,_query,_stringargs,_limit,_list}));}
RDebugUtils.currentLine=7405568;
 //BA.debugLineNum = 7405568;BA.debugLine="Public Sub ExecuteList2(SQL As SQL, Query As Strin";
RDebugUtils.currentLine=7405569;
 //BA.debugLineNum = 7405569;BA.debugLine="List.Clear";
_list.Clear();
RDebugUtils.currentLine=7405570;
 //BA.debugLineNum = 7405570;BA.debugLine="List.AddAll(ExecuteList(SQL, Query, StringArgs, L";
_list.AddAll(_executelist(_sql,_query,_stringargs,_limit));
RDebugUtils.currentLine=7405571;
 //BA.debugLineNum = 7405571;BA.debugLine="End Sub";
return "";
}
public static anywheresoftware.b4a.objects.collections.Map  _executemap(anywheresoftware.b4j.objects.SQL _sql,String _query,String[] _stringargs) throws Exception{
RDebugUtils.currentModule="dbutils";
if (Debug.shouldDelegate(ba, "executemap", true))
	 {return ((anywheresoftware.b4a.objects.collections.Map) Debug.delegate(ba, "executemap", new Object[] {_sql,_query,_stringargs}));}
anywheresoftware.b4a.objects.collections.Map _res = null;
anywheresoftware.b4j.objects.SQL.ResultSetWrapper _cur = null;
int _i = 0;
RDebugUtils.currentLine=7274496;
 //BA.debugLineNum = 7274496;BA.debugLine="Public Sub ExecuteMap(SQL As SQL, Query As String,";
RDebugUtils.currentLine=7274497;
 //BA.debugLineNum = 7274497;BA.debugLine="Dim res As Map";
_res = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=7274498;
 //BA.debugLineNum = 7274498;BA.debugLine="Dim cur As ResultSet";
_cur = new anywheresoftware.b4j.objects.SQL.ResultSetWrapper();
RDebugUtils.currentLine=7274499;
 //BA.debugLineNum = 7274499;BA.debugLine="If StringArgs <> Null Then";
if (_stringargs!= null) { 
RDebugUtils.currentLine=7274500;
 //BA.debugLineNum = 7274500;BA.debugLine="cur = SQL.ExecQuery2(Query, StringArgs)";
_cur = _sql.ExecQuery2(_query,anywheresoftware.b4a.keywords.Common.ArrayToList(_stringargs));
 }else {
RDebugUtils.currentLine=7274502;
 //BA.debugLineNum = 7274502;BA.debugLine="cur = SQL.ExecQuery(Query)";
_cur = _sql.ExecQuery(_query);
 };
RDebugUtils.currentLine=7274505;
 //BA.debugLineNum = 7274505;BA.debugLine="Log(\"ExecuteMap: \" & Query)";
anywheresoftware.b4a.keywords.Common.LogImpl("97274505","ExecuteMap: "+_query,0);
RDebugUtils.currentLine=7274507;
 //BA.debugLineNum = 7274507;BA.debugLine="If cur.NextRow = False Then";
if (_cur.NextRow()==anywheresoftware.b4a.keywords.Common.False) { 
RDebugUtils.currentLine=7274509;
 //BA.debugLineNum = 7274509;BA.debugLine="Log(\"No records found.\")";
anywheresoftware.b4a.keywords.Common.LogImpl("97274509","No records found.",0);
RDebugUtils.currentLine=7274511;
 //BA.debugLineNum = 7274511;BA.debugLine="Return res";
if (true) return _res;
 };
RDebugUtils.currentLine=7274513;
 //BA.debugLineNum = 7274513;BA.debugLine="res.Initialize";
_res.Initialize();
RDebugUtils.currentLine=7274514;
 //BA.debugLineNum = 7274514;BA.debugLine="For i = 0 To cur.ColumnCount - 1";
{
final int step14 = 1;
final int limit14 = (int) (_cur.getColumnCount()-1);
_i = (int) (0) ;
for (;_i <= limit14 ;_i = _i + step14 ) {
RDebugUtils.currentLine=7274515;
 //BA.debugLineNum = 7274515;BA.debugLine="res.Put(cur.GetColumnName(i).ToLowerCase, cur.Ge";
_res.Put((Object)(_cur.GetColumnName(_i).toLowerCase()),(Object)(_cur.GetString2(_i)));
 }
};
RDebugUtils.currentLine=7274517;
 //BA.debugLineNum = 7274517;BA.debugLine="cur.Close";
_cur.Close();
RDebugUtils.currentLine=7274518;
 //BA.debugLineNum = 7274518;BA.debugLine="Return res";
if (true) return _res;
RDebugUtils.currentLine=7274519;
 //BA.debugLineNum = 7274519;BA.debugLine="End Sub";
return null;
}
public static String  _executetableview(anywheresoftware.b4j.objects.SQL _sql,String _query,String[] _stringargs,int _limit,anywheresoftware.b4j.objects.TableViewWrapper _tableview1) throws Exception{
RDebugUtils.currentModule="dbutils";
if (Debug.shouldDelegate(ba, "executetableview", true))
	 {return ((String) Debug.delegate(ba, "executetableview", new Object[] {_sql,_query,_stringargs,_limit,_tableview1}));}
anywheresoftware.b4j.objects.SQL.ResultSetWrapper _cur = null;
anywheresoftware.b4a.objects.collections.List _cols = null;
int _i = 0;
String[] _values = null;
int _col = 0;
RDebugUtils.currentLine=7340032;
 //BA.debugLineNum = 7340032;BA.debugLine="Public Sub ExecuteTableView(SQL As SQL, Query As S";
RDebugUtils.currentLine=7340034;
 //BA.debugLineNum = 7340034;BA.debugLine="TableView1.Items.Clear";
_tableview1.getItems().Clear();
RDebugUtils.currentLine=7340035;
 //BA.debugLineNum = 7340035;BA.debugLine="Dim cur As ResultSet";
_cur = new anywheresoftware.b4j.objects.SQL.ResultSetWrapper();
RDebugUtils.currentLine=7340036;
 //BA.debugLineNum = 7340036;BA.debugLine="If StringArgs = Null Then";
if (_stringargs== null) { 
RDebugUtils.currentLine=7340037;
 //BA.debugLineNum = 7340037;BA.debugLine="Dim StringArgs(0) As String";
_stringargs = new String[(int) (0)];
java.util.Arrays.fill(_stringargs,"");
 };
RDebugUtils.currentLine=7340039;
 //BA.debugLineNum = 7340039;BA.debugLine="cur = SQL.ExecQuery2(Query, StringArgs)";
_cur = _sql.ExecQuery2(_query,anywheresoftware.b4a.keywords.Common.ArrayToList(_stringargs));
RDebugUtils.currentLine=7340040;
 //BA.debugLineNum = 7340040;BA.debugLine="Dim cols As List";
_cols = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=7340041;
 //BA.debugLineNum = 7340041;BA.debugLine="cols.Initialize";
_cols.Initialize();
RDebugUtils.currentLine=7340042;
 //BA.debugLineNum = 7340042;BA.debugLine="For i = 0 To cur.ColumnCount - 1";
{
final int step9 = 1;
final int limit9 = (int) (_cur.getColumnCount()-1);
_i = (int) (0) ;
for (;_i <= limit9 ;_i = _i + step9 ) {
RDebugUtils.currentLine=7340043;
 //BA.debugLineNum = 7340043;BA.debugLine="cols.Add(cur.GetColumnName(i))";
_cols.Add((Object)(_cur.GetColumnName(_i)));
 }
};
RDebugUtils.currentLine=7340045;
 //BA.debugLineNum = 7340045;BA.debugLine="TableView1.SetColumns(cols)";
_tableview1.SetColumns(_cols);
RDebugUtils.currentLine=7340046;
 //BA.debugLineNum = 7340046;BA.debugLine="Do While cur.NextRow";
while (_cur.NextRow()) {
RDebugUtils.currentLine=7340047;
 //BA.debugLineNum = 7340047;BA.debugLine="Dim values(cur.ColumnCount) As String";
_values = new String[_cur.getColumnCount()];
java.util.Arrays.fill(_values,"");
RDebugUtils.currentLine=7340048;
 //BA.debugLineNum = 7340048;BA.debugLine="For col = 0 To cur.ColumnCount - 1";
{
final int step15 = 1;
final int limit15 = (int) (_cur.getColumnCount()-1);
_col = (int) (0) ;
for (;_col <= limit15 ;_col = _col + step15 ) {
RDebugUtils.currentLine=7340049;
 //BA.debugLineNum = 7340049;BA.debugLine="values(col) = cur.GetString2(col)";
_values[_col] = _cur.GetString2(_col);
 }
};
RDebugUtils.currentLine=7340051;
 //BA.debugLineNum = 7340051;BA.debugLine="TableView1.Items.Add(values)";
_tableview1.getItems().Add((Object)(_values));
RDebugUtils.currentLine=7340052;
 //BA.debugLineNum = 7340052;BA.debugLine="If Limit > 0 And TableView1.Items.Size >= Limit";
if (_limit>0 && _tableview1.getItems().getSize()>=_limit) { 
if (true) break;};
 }
;
RDebugUtils.currentLine=7340054;
 //BA.debugLineNum = 7340054;BA.debugLine="cur.Close";
_cur.Close();
RDebugUtils.currentLine=7340055;
 //BA.debugLineNum = 7340055;BA.debugLine="End Sub";
return "";
}
public static int  _getdbversion(anywheresoftware.b4j.objects.SQL _sql) throws Exception{
RDebugUtils.currentModule="dbutils";
if (Debug.shouldDelegate(ba, "getdbversion", true))
	 {return ((Integer) Debug.delegate(ba, "getdbversion", new Object[] {_sql}));}
int _version = 0;
anywheresoftware.b4a.objects.collections.Map _m = null;
RDebugUtils.currentLine=7667712;
 //BA.debugLineNum = 7667712;BA.debugLine="Public Sub GetDBVersion (SQL As SQL) As Int";
RDebugUtils.currentLine=7667713;
 //BA.debugLineNum = 7667713;BA.debugLine="Dim version As Int";
_version = 0;
RDebugUtils.currentLine=7667714;
 //BA.debugLineNum = 7667714;BA.debugLine="If TableExists(SQL, \"DBVersion\") Then";
if (_tableexists(_sql,"DBVersion")) { 
RDebugUtils.currentLine=7667715;
 //BA.debugLineNum = 7667715;BA.debugLine="version = SQL.ExecQuerySingleResult(\"SELECT vers";
_version = (int)(Double.parseDouble(_sql.ExecQuerySingleResult("SELECT version FROM DBVersion")));
 }else {
RDebugUtils.currentLine=7667721;
 //BA.debugLineNum = 7667721;BA.debugLine="Dim m As Map = CreateMap(\"version\": DB_INTEGER)";
_m = new anywheresoftware.b4a.objects.collections.Map();
_m = anywheresoftware.b4a.keywords.Common.createMap(new Object[] {(Object)("version"),(Object)(_db_integer)});
RDebugUtils.currentLine=7667722;
 //BA.debugLineNum = 7667722;BA.debugLine="CreateTable(SQL, \"DBVersion\", m, \"version\")";
_createtable(_sql,"DBVersion",_m,"version");
RDebugUtils.currentLine=7667724;
 //BA.debugLineNum = 7667724;BA.debugLine="SQL.ExecNonQuery(\"INSERT INTO DBVersion VALUES (";
_sql.ExecNonQuery("INSERT INTO DBVersion VALUES (1)");
RDebugUtils.currentLine=7667725;
 //BA.debugLineNum = 7667725;BA.debugLine="version = 1";
_version = (int) (1);
 };
RDebugUtils.currentLine=7667727;
 //BA.debugLineNum = 7667727;BA.debugLine="Return version";
if (true) return _version;
RDebugUtils.currentLine=7667728;
 //BA.debugLineNum = 7667728;BA.debugLine="End Sub";
return 0;
}
public static boolean  _tableexists(anywheresoftware.b4j.objects.SQL _sql,String _tablename) throws Exception{
RDebugUtils.currentModule="dbutils";
if (Debug.shouldDelegate(ba, "tableexists", true))
	 {return ((Boolean) Debug.delegate(ba, "tableexists", new Object[] {_sql,_tablename}));}
int _count = 0;
RDebugUtils.currentLine=7995392;
 //BA.debugLineNum = 7995392;BA.debugLine="Public Sub TableExists(SQL As SQL, TableName As St";
RDebugUtils.currentLine=7995393;
 //BA.debugLineNum = 7995393;BA.debugLine="Dim count As Int = SQL.ExecQuerySingleResult2(\"SE";
_count = (int)(Double.parseDouble(_sql.ExecQuerySingleResult2("SELECT count(name) FROM sqlite_master WHERE type='table' AND name=? COLLATE NOCASE",anywheresoftware.b4a.keywords.Common.ArrayToList(new String[]{_tablename}))));
RDebugUtils.currentLine=7995394;
 //BA.debugLineNum = 7995394;BA.debugLine="Return count > 0";
if (true) return _count>0;
RDebugUtils.currentLine=7995395;
 //BA.debugLineNum = 7995395;BA.debugLine="End Sub";
return false;
}
public static anywheresoftware.b4a.objects.collections.List  _getfieldsinfo(anywheresoftware.b4j.objects.SQL _db,String _tablename) throws Exception{
RDebugUtils.currentModule="dbutils";
if (Debug.shouldDelegate(ba, "getfieldsinfo", true))
	 {return ((anywheresoftware.b4a.objects.collections.List) Debug.delegate(ba, "getfieldsinfo", new Object[] {_db,_tablename}));}
anywheresoftware.b4a.objects.collections.List _lstfieldsinfo = null;
anywheresoftware.b4a.objects.collections.List _fieldslist = null;
String[] _values = null;
b4j.example.dbutils._dbfieldinfo _fieldinfo = null;
RDebugUtils.currentLine=8126464;
 //BA.debugLineNum = 8126464;BA.debugLine="Public Sub GetFieldsInfo(DB As SQL, TableName As S";
RDebugUtils.currentLine=8126465;
 //BA.debugLineNum = 8126465;BA.debugLine="Dim lstFieldsInfo As List";
_lstfieldsinfo = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=8126466;
 //BA.debugLineNum = 8126466;BA.debugLine="lstFieldsInfo.Initialize";
_lstfieldsinfo.Initialize();
RDebugUtils.currentLine=8126467;
 //BA.debugLineNum = 8126467;BA.debugLine="Dim FieldsList As List = ExecuteMemoryTable(DB, \"";
_fieldslist = new anywheresoftware.b4a.objects.collections.List();
_fieldslist = _executememorytable(_db,"PRAGMA table_info ('"+_tablename+"')",(String[])(anywheresoftware.b4a.keywords.Common.Null),(int) (0));
RDebugUtils.currentLine=8126468;
 //BA.debugLineNum = 8126468;BA.debugLine="For Each values() As String In FieldsList";
{
final anywheresoftware.b4a.BA.IterableList group4 = _fieldslist;
final int groupLen4 = group4.getSize()
;int index4 = 0;
;
for (; index4 < groupLen4;index4++){
_values = (String[])(group4.Get(index4));
RDebugUtils.currentLine=8126469;
 //BA.debugLineNum = 8126469;BA.debugLine="Dim FieldInfo As DBFieldInfo";
_fieldinfo = new b4j.example.dbutils._dbfieldinfo();
RDebugUtils.currentLine=8126470;
 //BA.debugLineNum = 8126470;BA.debugLine="FieldInfo.Initialize";
_fieldinfo.Initialize();
RDebugUtils.currentLine=8126471;
 //BA.debugLineNum = 8126471;BA.debugLine="FieldInfo.FieldName = values(1)";
_fieldinfo.FieldName /*String*/  = _values[(int) (1)];
RDebugUtils.currentLine=8126472;
 //BA.debugLineNum = 8126472;BA.debugLine="FieldInfo.DataType = values(2)";
_fieldinfo.DataType /*String*/  = _values[(int) (2)];
RDebugUtils.currentLine=8126473;
 //BA.debugLineNum = 8126473;BA.debugLine="FieldInfo.CanBeNull = (values(3) = 1)";
_fieldinfo.CanBeNull /*boolean*/  = ((_values[(int) (3)]).equals(BA.NumberToString(1)));
RDebugUtils.currentLine=8126474;
 //BA.debugLineNum = 8126474;BA.debugLine="FieldInfo.DefValue = values(4)";
_fieldinfo.DefValue /*Object*/  = (Object)(_values[(int) (4)]);
RDebugUtils.currentLine=8126475;
 //BA.debugLineNum = 8126475;BA.debugLine="lstFieldsInfo.Add(FieldInfo)";
_lstfieldsinfo.Add((Object)(_fieldinfo));
 }
};
RDebugUtils.currentLine=8126478;
 //BA.debugLineNum = 8126478;BA.debugLine="Return lstFieldsInfo";
if (true) return _lstfieldsinfo;
RDebugUtils.currentLine=8126479;
 //BA.debugLineNum = 8126479;BA.debugLine="End Sub";
return null;
}
public static anywheresoftware.b4a.objects.collections.List  _gettables(anywheresoftware.b4j.objects.SQL _db) throws Exception{
RDebugUtils.currentModule="dbutils";
if (Debug.shouldDelegate(ba, "gettables", true))
	 {return ((anywheresoftware.b4a.objects.collections.List) Debug.delegate(ba, "gettables", new Object[] {_db}));}
RDebugUtils.currentLine=8060928;
 //BA.debugLineNum = 8060928;BA.debugLine="Public Sub GetTables(DB As SQL) As List";
RDebugUtils.currentLine=8060929;
 //BA.debugLineNum = 8060929;BA.debugLine="Return ExecuteList(DB, \"SELECT name FROM sqlite_m";
if (true) return _executelist(_db,"SELECT name FROM sqlite_master WHERE type = 'table'",(String[])(anywheresoftware.b4a.keywords.Common.Null),(int) (0));
RDebugUtils.currentLine=8060930;
 //BA.debugLineNum = 8060930;BA.debugLine="End Sub";
return null;
}
public static boolean  _insertmaps(anywheresoftware.b4j.objects.SQL _sql,String _tablename,anywheresoftware.b4a.objects.collections.List _listofmaps) throws Exception{
RDebugUtils.currentModule="dbutils";
if (Debug.shouldDelegate(ba, "insertmaps", true))
	 {return ((Boolean) Debug.delegate(ba, "insertmaps", new Object[] {_sql,_tablename,_listofmaps}));}
anywheresoftware.b4a.keywords.StringBuilderWrapper _sb = null;
anywheresoftware.b4a.keywords.StringBuilderWrapper _columns = null;
anywheresoftware.b4a.keywords.StringBuilderWrapper _values = null;
boolean _res = false;
int _i1 = 0;
anywheresoftware.b4a.objects.collections.List _listofvalues = null;
anywheresoftware.b4a.objects.collections.Map _m = null;
String _col = "";
Object _value = null;
RDebugUtils.currentLine=7143424;
 //BA.debugLineNum = 7143424;BA.debugLine="Public Sub InsertMaps(SQL As SQL, TableName As Str";
RDebugUtils.currentLine=7143425;
 //BA.debugLineNum = 7143425;BA.debugLine="Dim sb, columns, values As StringBuilder";
_sb = new anywheresoftware.b4a.keywords.StringBuilderWrapper();
_columns = new anywheresoftware.b4a.keywords.StringBuilderWrapper();
_values = new anywheresoftware.b4a.keywords.StringBuilderWrapper();
RDebugUtils.currentLine=7143426;
 //BA.debugLineNum = 7143426;BA.debugLine="Dim res As Boolean = False";
_res = anywheresoftware.b4a.keywords.Common.False;
RDebugUtils.currentLine=7143428;
 //BA.debugLineNum = 7143428;BA.debugLine="If ListOfMaps.Size > 1 And ListOfMaps.Get(0) = Li";
if (_listofmaps.getSize()>1 && (_listofmaps.Get((int) (0))).equals(_listofmaps.Get((int) (1)))) { 
RDebugUtils.currentLine=7143429;
 //BA.debugLineNum = 7143429;BA.debugLine="Log(\"Same Map found twice in list. Each item in";
anywheresoftware.b4a.keywords.Common.LogImpl("97143429","Same Map found twice in list. Each item in the list should include a different map object.",0);
RDebugUtils.currentLine=7143430;
 //BA.debugLineNum = 7143430;BA.debugLine="Return res";
if (true) return _res;
 };
RDebugUtils.currentLine=7143432;
 //BA.debugLineNum = 7143432;BA.debugLine="SQL.BeginTransaction";
_sql.BeginTransaction();
RDebugUtils.currentLine=7143433;
 //BA.debugLineNum = 7143433;BA.debugLine="Try";
try {RDebugUtils.currentLine=7143434;
 //BA.debugLineNum = 7143434;BA.debugLine="For i1 = 0 To ListOfMaps.Size - 1";
{
final int step9 = 1;
final int limit9 = (int) (_listofmaps.getSize()-1);
_i1 = (int) (0) ;
for (;_i1 <= limit9 ;_i1 = _i1 + step9 ) {
RDebugUtils.currentLine=7143435;
 //BA.debugLineNum = 7143435;BA.debugLine="sb.Initialize";
_sb.Initialize();
RDebugUtils.currentLine=7143436;
 //BA.debugLineNum = 7143436;BA.debugLine="columns.Initialize";
_columns.Initialize();
RDebugUtils.currentLine=7143437;
 //BA.debugLineNum = 7143437;BA.debugLine="values.Initialize";
_values.Initialize();
RDebugUtils.currentLine=7143438;
 //BA.debugLineNum = 7143438;BA.debugLine="Dim listOfValues As List";
_listofvalues = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=7143439;
 //BA.debugLineNum = 7143439;BA.debugLine="listOfValues.Initialize";
_listofvalues.Initialize();
RDebugUtils.currentLine=7143440;
 //BA.debugLineNum = 7143440;BA.debugLine="sb.Append(\"INSERT INTO [\" & TableName & \"] (\")";
_sb.Append("INSERT INTO ["+_tablename+"] (");
RDebugUtils.currentLine=7143441;
 //BA.debugLineNum = 7143441;BA.debugLine="Dim m As Map = ListOfMaps.Get(i1)";
_m = new anywheresoftware.b4a.objects.collections.Map();
_m = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (anywheresoftware.b4a.objects.collections.Map.MyMap)(_listofmaps.Get(_i1)));
RDebugUtils.currentLine=7143442;
 //BA.debugLineNum = 7143442;BA.debugLine="For Each col As String In m.Keys";
{
final anywheresoftware.b4a.BA.IterableList group17 = _m.Keys();
final int groupLen17 = group17.getSize()
;int index17 = 0;
;
for (; index17 < groupLen17;index17++){
_col = BA.ObjectToString(group17.Get(index17));
RDebugUtils.currentLine=7143443;
 //BA.debugLineNum = 7143443;BA.debugLine="Dim value As Object = m.Get(col)";
_value = _m.Get((Object)(_col));
RDebugUtils.currentLine=7143444;
 //BA.debugLineNum = 7143444;BA.debugLine="If listOfValues.Size > 0 Then";
if (_listofvalues.getSize()>0) { 
RDebugUtils.currentLine=7143445;
 //BA.debugLineNum = 7143445;BA.debugLine="columns.Append(\", \")";
_columns.Append(", ");
RDebugUtils.currentLine=7143446;
 //BA.debugLineNum = 7143446;BA.debugLine="values.Append(\", \")";
_values.Append(", ");
 };
RDebugUtils.currentLine=7143448;
 //BA.debugLineNum = 7143448;BA.debugLine="columns.Append(EscapeField(col))";
_columns.Append(_escapefield(_col));
RDebugUtils.currentLine=7143449;
 //BA.debugLineNum = 7143449;BA.debugLine="values.Append(\"?\")";
_values.Append("?");
RDebugUtils.currentLine=7143450;
 //BA.debugLineNum = 7143450;BA.debugLine="listOfValues.Add(value)";
_listofvalues.Add(_value);
 }
};
RDebugUtils.currentLine=7143452;
 //BA.debugLineNum = 7143452;BA.debugLine="sb.Append(columns.ToString).Append(\") VALUES (\"";
_sb.Append(_columns.ToString()).Append(") VALUES (").Append(_values.ToString()).Append(")");
RDebugUtils.currentLine=7143454;
 //BA.debugLineNum = 7143454;BA.debugLine="If i1 = 0 Then Log(\"InsertMaps (first query out";
if (_i1==0) { 
anywheresoftware.b4a.keywords.Common.LogImpl("97143454","InsertMaps (first query out of "+BA.NumberToString(_listofmaps.getSize())+"): "+_sb.ToString(),0);};
RDebugUtils.currentLine=7143456;
 //BA.debugLineNum = 7143456;BA.debugLine="SQL.ExecNonQuery2(sb.ToString, listOfValues)";
_sql.ExecNonQuery2(_sb.ToString(),_listofvalues);
 }
};
RDebugUtils.currentLine=7143458;
 //BA.debugLineNum = 7143458;BA.debugLine="SQL.TransactionSuccessful";
_sql.TransactionSuccessful();
RDebugUtils.currentLine=7143459;
 //BA.debugLineNum = 7143459;BA.debugLine="res = True";
_res = anywheresoftware.b4a.keywords.Common.True;
 } 
       catch (Exception e34) {
			ba.setLastException(e34);RDebugUtils.currentLine=7143461;
 //BA.debugLineNum = 7143461;BA.debugLine="Log(LastException)";
anywheresoftware.b4a.keywords.Common.LogImpl("97143461",BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(ba)),0);
RDebugUtils.currentLine=7143463;
 //BA.debugLineNum = 7143463;BA.debugLine="SQL.Rollback";
_sql.Rollback();
 };
RDebugUtils.currentLine=7143469;
 //BA.debugLineNum = 7143469;BA.debugLine="Return res";
if (true) return _res;
RDebugUtils.currentLine=7143470;
 //BA.debugLineNum = 7143470;BA.debugLine="End Sub";
return false;
}
public static String  _setdbversion(anywheresoftware.b4j.objects.SQL _sql,int _version) throws Exception{
RDebugUtils.currentModule="dbutils";
if (Debug.shouldDelegate(ba, "setdbversion", true))
	 {return ((String) Debug.delegate(ba, "setdbversion", new Object[] {_sql,_version}));}
RDebugUtils.currentLine=7733248;
 //BA.debugLineNum = 7733248;BA.debugLine="Public Sub SetDBVersion (SQL As SQL, Version As In";
RDebugUtils.currentLine=7733249;
 //BA.debugLineNum = 7733249;BA.debugLine="SQL.ExecNonQuery2(\"UPDATE DBVersion set version =";
_sql.ExecNonQuery2("UPDATE DBVersion set version = ?",anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)(_version)}));
RDebugUtils.currentLine=7733250;
 //BA.debugLineNum = 7733250;BA.debugLine="End Sub";
return "";
}
public static String  _updaterecord(anywheresoftware.b4j.objects.SQL _sql,String _tablename,String _field,Object _newvalue,anywheresoftware.b4a.objects.collections.Map _wherefieldequals) throws Exception{
RDebugUtils.currentModule="dbutils";
if (Debug.shouldDelegate(ba, "updaterecord", true))
	 {return ((String) Debug.delegate(ba, "updaterecord", new Object[] {_sql,_tablename,_field,_newvalue,_wherefieldequals}));}
RDebugUtils.currentLine=7798784;
 //BA.debugLineNum = 7798784;BA.debugLine="Public Sub UpdateRecord(SQL As SQL, TableName As S";
RDebugUtils.currentLine=7798786;
 //BA.debugLineNum = 7798786;BA.debugLine="UpdateRecord2(SQL, TableName, CreateMap(Field: Ne";
_updaterecord2(_sql,_tablename,anywheresoftware.b4a.keywords.Common.createMap(new Object[] {(Object)(_field),_newvalue}),_wherefieldequals);
RDebugUtils.currentLine=7798787;
 //BA.debugLineNum = 7798787;BA.debugLine="End Sub";
return "";
}
public static String  _updaterecord2(anywheresoftware.b4j.objects.SQL _sql,String _tablename,anywheresoftware.b4a.objects.collections.Map _fields,anywheresoftware.b4a.objects.collections.Map _wherefieldequals) throws Exception{
RDebugUtils.currentModule="dbutils";
if (Debug.shouldDelegate(ba, "updaterecord2", true))
	 {return ((String) Debug.delegate(ba, "updaterecord2", new Object[] {_sql,_tablename,_fields,_wherefieldequals}));}
anywheresoftware.b4a.keywords.StringBuilderWrapper _sb = null;
anywheresoftware.b4a.objects.collections.List _args = null;
String _col = "";
RDebugUtils.currentLine=7864320;
 //BA.debugLineNum = 7864320;BA.debugLine="Public Sub UpdateRecord2(SQL As SQL, TableName As";
RDebugUtils.currentLine=7864321;
 //BA.debugLineNum = 7864321;BA.debugLine="If WhereFieldEquals.Size = 0 Then";
if (_wherefieldequals.getSize()==0) { 
RDebugUtils.currentLine=7864322;
 //BA.debugLineNum = 7864322;BA.debugLine="Log(\"WhereFieldEquals map empty!\")";
anywheresoftware.b4a.keywords.Common.LogImpl("97864322","WhereFieldEquals map empty!",0);
RDebugUtils.currentLine=7864323;
 //BA.debugLineNum = 7864323;BA.debugLine="Return";
if (true) return "";
 };
RDebugUtils.currentLine=7864325;
 //BA.debugLineNum = 7864325;BA.debugLine="If Fields.Size = 0 Then";
if (_fields.getSize()==0) { 
RDebugUtils.currentLine=7864326;
 //BA.debugLineNum = 7864326;BA.debugLine="Log(\"Fields empty\")";
anywheresoftware.b4a.keywords.Common.LogImpl("97864326","Fields empty",0);
RDebugUtils.currentLine=7864327;
 //BA.debugLineNum = 7864327;BA.debugLine="Return";
if (true) return "";
 };
RDebugUtils.currentLine=7864329;
 //BA.debugLineNum = 7864329;BA.debugLine="Dim sb As StringBuilder";
_sb = new anywheresoftware.b4a.keywords.StringBuilderWrapper();
RDebugUtils.currentLine=7864330;
 //BA.debugLineNum = 7864330;BA.debugLine="sb.Initialize";
_sb.Initialize();
RDebugUtils.currentLine=7864331;
 //BA.debugLineNum = 7864331;BA.debugLine="sb.Append(\"UPDATE \").Append(EscapeField(TableName";
_sb.Append("UPDATE ").Append(_escapefield(_tablename)).Append(" SET ");
RDebugUtils.currentLine=7864332;
 //BA.debugLineNum = 7864332;BA.debugLine="Dim args As List";
_args = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=7864333;
 //BA.debugLineNum = 7864333;BA.debugLine="args.Initialize";
_args.Initialize();
RDebugUtils.currentLine=7864334;
 //BA.debugLineNum = 7864334;BA.debugLine="For Each col As String In Fields.Keys";
{
final anywheresoftware.b4a.BA.IterableList group14 = _fields.Keys();
final int groupLen14 = group14.getSize()
;int index14 = 0;
;
for (; index14 < groupLen14;index14++){
_col = BA.ObjectToString(group14.Get(index14));
RDebugUtils.currentLine=7864335;
 //BA.debugLineNum = 7864335;BA.debugLine="sb.Append(EscapeField(col)).Append(\"=?\")";
_sb.Append(_escapefield(_col)).Append("=?");
RDebugUtils.currentLine=7864336;
 //BA.debugLineNum = 7864336;BA.debugLine="sb.Append(\",\")";
_sb.Append(",");
RDebugUtils.currentLine=7864337;
 //BA.debugLineNum = 7864337;BA.debugLine="args.Add(Fields.Get(col))";
_args.Add(_fields.Get((Object)(_col)));
 }
};
RDebugUtils.currentLine=7864339;
 //BA.debugLineNum = 7864339;BA.debugLine="sb.Remove(sb.Length - 1, sb.Length)";
_sb.Remove((int) (_sb.getLength()-1),_sb.getLength());
RDebugUtils.currentLine=7864340;
 //BA.debugLineNum = 7864340;BA.debugLine="sb.Append(\" WHERE \")";
_sb.Append(" WHERE ");
RDebugUtils.currentLine=7864341;
 //BA.debugLineNum = 7864341;BA.debugLine="For Each col As String In WhereFieldEquals.Keys";
{
final anywheresoftware.b4a.BA.IterableList group21 = _wherefieldequals.Keys();
final int groupLen21 = group21.getSize()
;int index21 = 0;
;
for (; index21 < groupLen21;index21++){
_col = BA.ObjectToString(group21.Get(index21));
RDebugUtils.currentLine=7864342;
 //BA.debugLineNum = 7864342;BA.debugLine="sb.Append(EscapeField(col)).Append(\" = ?\")";
_sb.Append(_escapefield(_col)).Append(" = ?");
RDebugUtils.currentLine=7864343;
 //BA.debugLineNum = 7864343;BA.debugLine="sb.Append(\" AND \")";
_sb.Append(" AND ");
RDebugUtils.currentLine=7864344;
 //BA.debugLineNum = 7864344;BA.debugLine="args.Add(WhereFieldEquals.Get(col))";
_args.Add(_wherefieldequals.Get((Object)(_col)));
 }
};
RDebugUtils.currentLine=7864346;
 //BA.debugLineNum = 7864346;BA.debugLine="sb.Remove(sb.Length - \" AND \".Length, sb.Length)";
_sb.Remove((int) (_sb.getLength()-" AND ".length()),_sb.getLength());
RDebugUtils.currentLine=7864348;
 //BA.debugLineNum = 7864348;BA.debugLine="Log(\"UpdateRecord: \" & sb.ToString)";
anywheresoftware.b4a.keywords.Common.LogImpl("97864348","UpdateRecord: "+_sb.ToString(),0);
RDebugUtils.currentLine=7864350;
 //BA.debugLineNum = 7864350;BA.debugLine="SQL.ExecNonQuery2(sb.ToString, args)";
_sql.ExecNonQuery2(_sb.ToString(),_args);
RDebugUtils.currentLine=7864351;
 //BA.debugLineNum = 7864351;BA.debugLine="End Sub";
return "";
}
}