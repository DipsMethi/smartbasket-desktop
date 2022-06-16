package b4j.example;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class logger_subs_0 {


public static RemoteObject  _class_globals(RemoteObject __ref) throws Exception{
 //BA.debugLineNum = 1;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 3;BA.debugLine="Private fx As JFX";
logger._fx = RemoteObject.createNew ("anywheresoftware.b4j.objects.JFX");__ref.setField("_fx",logger._fx);
 //BA.debugLineNum = 5;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _initialize(RemoteObject __ref,RemoteObject _ba) throws Exception{
try {
		Debug.PushSubsStack("Initialize (logger) ","logger",10,__ref.getField(false, "ba"),__ref,8);
if (RapidSub.canDelegate("initialize")) { return __ref.runUserSub(false, "logger","initialize", __ref, _ba);}
__ref.runVoidMethodAndSync("innerInitializeHelper", _ba);
Debug.locals.put("ba", _ba);
 BA.debugLineNum = 8;BA.debugLine="Public Sub Initialize";
Debug.ShouldStop(128);
 BA.debugLineNum = 10;BA.debugLine="End Sub";
Debug.ShouldStop(512);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _write(RemoteObject __ref,RemoteObject _message) throws Exception{
try {
		Debug.PushSubsStack("write (logger) ","logger",10,__ref.getField(false, "ba"),__ref,12);
if (RapidSub.canDelegate("write")) { return __ref.runUserSub(false, "logger","write", __ref, _message);}
RemoteObject _now = RemoteObject.createImmutable(0L);
RemoteObject _dir = RemoteObject.createImmutable("");
RemoteObject _filename = RemoteObject.createImmutable("");
RemoteObject _err = RemoteObject.createImmutable("");
RemoteObject _out = RemoteObject.declareNull("anywheresoftware.b4a.objects.streams.File.OutputStreamWrapper");
RemoteObject _b = null;
Debug.locals.put("message", _message);
 BA.debugLineNum = 12;BA.debugLine="Public Sub write(message As String)";
Debug.ShouldStop(2048);
 BA.debugLineNum = 14;BA.debugLine="Dim now As Long = DateTime.Now";
Debug.ShouldStop(8192);
_now = logger.__c.getField(false,"DateTime").runMethod(true,"getNow");Debug.locals.put("now", _now);Debug.locals.put("now", _now);
 BA.debugLineNum = 16;BA.debugLine="DateTime.DateFormat = \"dd/MM/yyyy\"";
Debug.ShouldStop(32768);
logger.__c.getField(false,"DateTime").runMethod(true,"setDateFormat",BA.ObjectToString("dd/MM/yyyy"));
 BA.debugLineNum = 17;BA.debugLine="DateTime.TimeFormat = \"HH:mm:ss\"";
Debug.ShouldStop(65536);
logger.__c.getField(false,"DateTime").runMethod(true,"setTimeFormat",BA.ObjectToString("HH:mm:ss"));
 BA.debugLineNum = 19;BA.debugLine="Dim dir As String = File.DirApp";
Debug.ShouldStop(262144);
_dir = logger.__c.getField(false,"File").runMethod(true,"getDirApp");Debug.locals.put("dir", _dir);Debug.locals.put("dir", _dir);
 BA.debugLineNum = 20;BA.debugLine="Dim fileName As String = \"log.txt\"";
Debug.ShouldStop(524288);
_filename = BA.ObjectToString("log.txt");Debug.locals.put("fileName", _filename);Debug.locals.put("fileName", _filename);
 BA.debugLineNum = 22;BA.debugLine="Dim err As String = DateTime.Time(now) & \" \" & Da";
Debug.ShouldStop(2097152);
_err = RemoteObject.concat(logger.__c.getField(false,"DateTime").runMethod(true,"Time",(Object)(_now)),RemoteObject.createImmutable(" "),logger.__c.getField(false,"DateTime").runMethod(true,"Date",(Object)(_now)),RemoteObject.createImmutable(" - "),_message,logger.__c.getField(true,"CRLF"),RemoteObject.createImmutable("----------------------------------------------------------------------"),RemoteObject.createImmutable("--------------------------------------------------------------"),logger.__c.getField(true,"CRLF"));Debug.locals.put("err", _err);Debug.locals.put("err", _err);
 BA.debugLineNum = 25;BA.debugLine="Try";
Debug.ShouldStop(16777216);
try { BA.debugLineNum = 26;BA.debugLine="If ( Not ( File.Exists(dir, fileName) ) ) Then";
Debug.ShouldStop(33554432);
if ((logger.__c.runMethod(true,"Not",(Object)(logger.__c.getField(false,"File").runMethod(true,"Exists",(Object)(_dir),(Object)(_filename))))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 27;BA.debugLine="File.WriteString(dir, fileName, err)";
Debug.ShouldStop(67108864);
logger.__c.getField(false,"File").runVoidMethod ("WriteString",(Object)(_dir),(Object)(_filename),(Object)(_err));
 }else {
 BA.debugLineNum = 29;BA.debugLine="Dim out As OutputStream = File.OpenOutput(dir,";
Debug.ShouldStop(268435456);
_out = RemoteObject.createNew ("anywheresoftware.b4a.objects.streams.File.OutputStreamWrapper");
_out = logger.__c.getField(false,"File").runMethod(false,"OpenOutput",(Object)(_dir),(Object)(_filename),(Object)(logger.__c.getField(true,"True")));Debug.locals.put("out", _out);Debug.locals.put("out", _out);
 BA.debugLineNum = 30;BA.debugLine="Dim b() As Byte = err.GetBytes(\"utf8\")";
Debug.ShouldStop(536870912);
_b = _err.runMethod(false,"getBytes",(Object)(RemoteObject.createImmutable("utf8")));Debug.locals.put("b", _b);Debug.locals.put("b", _b);
 BA.debugLineNum = 31;BA.debugLine="out.WriteBytes(b, 0, b.Length)";
Debug.ShouldStop(1073741824);
_out.runVoidMethod ("WriteBytes",(Object)(_b),(Object)(BA.numberCast(int.class, 0)),(Object)(_b.getField(true,"length")));
 BA.debugLineNum = 32;BA.debugLine="out.Close";
Debug.ShouldStop(-2147483648);
_out.runVoidMethod ("Close");
 };
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e17) {
			BA.rdebugUtils.runVoidMethod("setLastException",__ref.getField(false, "ba"), e17.toString()); BA.debugLineNum = 35;BA.debugLine="write(LastException.Message)";
Debug.ShouldStop(4);
__ref.runClassMethod (b4j.example.logger.class, "_write" /*RemoteObject*/ ,(Object)(logger.__c.runMethod(false,"LastException",__ref.getField(false, "ba")).runMethod(true,"getMessage")));
 };
 BA.debugLineNum = 40;BA.debugLine="End Sub";
Debug.ShouldStop(128);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}