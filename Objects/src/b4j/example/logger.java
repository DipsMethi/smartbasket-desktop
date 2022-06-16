package b4j.example;

import anywheresoftware.b4a.debug.*;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;

public class logger extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4a.shell.ShellBA("b4j.example", "b4j.example.logger", this);
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            ba.htSubs = htSubs;
             
        }
        if (BA.isShellModeRuntimeCheck(ba))
                this.getClass().getMethod("_class_globals", b4j.example.logger.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 
    public void  innerInitializeHelper(anywheresoftware.b4a.BA _ba) throws Exception{
        innerInitialize(_ba);
    }
    public Object callSub(String sub, Object sender, Object[] args) throws Exception {
        return BA.SubDelegator.SubNotFound;
    }
public anywheresoftware.b4a.keywords.Common __c = null;
public anywheresoftware.b4j.objects.JFX _fx = null;
public b4j.example.main _main = null;
public b4j.example.loginform _loginform = null;
public b4j.example.dashboard _dashboard = null;
public b4j.example.registrationform _registrationform = null;
public b4j.example.customerview _customerview = null;
public b4j.example.b4xcollections _b4xcollections = null;
public b4j.example.dbutils _dbutils = null;
public String  _write(b4j.example.logger __ref,String _message) throws Exception{
__ref = this;
RDebugUtils.currentModule="logger";
if (Debug.shouldDelegate(ba, "write", false))
	 {return ((String) Debug.delegate(ba, "write", new Object[] {_message}));}
long _now = 0L;
String _dir = "";
String _filename = "";
String _err = "";
anywheresoftware.b4a.objects.streams.File.OutputStreamWrapper _out = null;
byte[] _b = null;
RDebugUtils.currentLine=4521984;
 //BA.debugLineNum = 4521984;BA.debugLine="Public Sub write(message As String)";
RDebugUtils.currentLine=4521986;
 //BA.debugLineNum = 4521986;BA.debugLine="Dim now As Long = DateTime.Now";
_now = __c.DateTime.getNow();
RDebugUtils.currentLine=4521988;
 //BA.debugLineNum = 4521988;BA.debugLine="DateTime.DateFormat = \"dd/MM/yyyy\"";
__c.DateTime.setDateFormat("dd/MM/yyyy");
RDebugUtils.currentLine=4521989;
 //BA.debugLineNum = 4521989;BA.debugLine="DateTime.TimeFormat = \"HH:mm:ss\"";
__c.DateTime.setTimeFormat("HH:mm:ss");
RDebugUtils.currentLine=4521991;
 //BA.debugLineNum = 4521991;BA.debugLine="Dim dir As String = File.DirApp";
_dir = __c.File.getDirApp();
RDebugUtils.currentLine=4521992;
 //BA.debugLineNum = 4521992;BA.debugLine="Dim fileName As String = \"log.txt\"";
_filename = "log.txt";
RDebugUtils.currentLine=4521994;
 //BA.debugLineNum = 4521994;BA.debugLine="Dim err As String = DateTime.Time(now) & \" \" & Da";
_err = __c.DateTime.Time(_now)+" "+__c.DateTime.Date(_now)+" - "+_message+__c.CRLF+"----------------------------------------------------------------------"+"--------------------------------------------------------------"+__c.CRLF;
RDebugUtils.currentLine=4521997;
 //BA.debugLineNum = 4521997;BA.debugLine="Try";
try {RDebugUtils.currentLine=4521998;
 //BA.debugLineNum = 4521998;BA.debugLine="If ( Not ( File.Exists(dir, fileName) ) ) Then";
if ((__c.Not(__c.File.Exists(_dir,_filename)))) { 
RDebugUtils.currentLine=4521999;
 //BA.debugLineNum = 4521999;BA.debugLine="File.WriteString(dir, fileName, err)";
__c.File.WriteString(_dir,_filename,_err);
 }else {
RDebugUtils.currentLine=4522001;
 //BA.debugLineNum = 4522001;BA.debugLine="Dim out As OutputStream = File.OpenOutput(dir,";
_out = new anywheresoftware.b4a.objects.streams.File.OutputStreamWrapper();
_out = __c.File.OpenOutput(_dir,_filename,__c.True);
RDebugUtils.currentLine=4522002;
 //BA.debugLineNum = 4522002;BA.debugLine="Dim b() As Byte = err.GetBytes(\"utf8\")";
_b = _err.getBytes("utf8");
RDebugUtils.currentLine=4522003;
 //BA.debugLineNum = 4522003;BA.debugLine="out.WriteBytes(b, 0, b.Length)";
_out.WriteBytes(_b,(int) (0),_b.length);
RDebugUtils.currentLine=4522004;
 //BA.debugLineNum = 4522004;BA.debugLine="out.Close";
_out.Close();
 };
 } 
       catch (Exception e17) {
			ba.setLastException(e17);RDebugUtils.currentLine=4522007;
 //BA.debugLineNum = 4522007;BA.debugLine="write(LastException.Message)";
__ref._write /*String*/ (null,__c.LastException(ba).getMessage());
 };
RDebugUtils.currentLine=4522012;
 //BA.debugLineNum = 4522012;BA.debugLine="End Sub";
return "";
}
public String  _initialize(b4j.example.logger __ref,anywheresoftware.b4a.BA _ba) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="logger";
if (Debug.shouldDelegate(ba, "initialize", false))
	 {return ((String) Debug.delegate(ba, "initialize", new Object[] {_ba}));}
RDebugUtils.currentLine=4456448;
 //BA.debugLineNum = 4456448;BA.debugLine="Public Sub Initialize";
RDebugUtils.currentLine=4456450;
 //BA.debugLineNum = 4456450;BA.debugLine="End Sub";
return "";
}
public String  _class_globals(b4j.example.logger __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="logger";
RDebugUtils.currentLine=4390912;
 //BA.debugLineNum = 4390912;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=4390914;
 //BA.debugLineNum = 4390914;BA.debugLine="Private fx As JFX";
_fx = new anywheresoftware.b4j.objects.JFX();
RDebugUtils.currentLine=4390916;
 //BA.debugLineNum = 4390916;BA.debugLine="End Sub";
return "";
}
}