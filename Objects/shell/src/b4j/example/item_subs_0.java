package b4j.example;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class item_subs_0 {


public static RemoteObject  _class_globals(RemoteObject __ref) throws Exception{
 //BA.debugLineNum = 1;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 2;BA.debugLine="Private fx As JFX";
item._fx = RemoteObject.createNew ("anywheresoftware.b4j.objects.JFX");__ref.setField("_fx",item._fx);
 //BA.debugLineNum = 4;BA.debugLine="Private id_ As Int";
item._id_ = RemoteObject.createImmutable(0);__ref.setField("_id_",item._id_);
 //BA.debugLineNum = 5;BA.debugLine="Private name_ As String";
item._name_ = RemoteObject.createImmutable("");__ref.setField("_name_",item._name_);
 //BA.debugLineNum = 6;BA.debugLine="Private price_ As Double";
item._price_ = RemoteObject.createImmutable(0);__ref.setField("_price_",item._price_);
 //BA.debugLineNum = 8;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _getid(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("GetID (item) ","item",9,__ref.getField(false, "ba"),__ref,23);
if (RapidSub.canDelegate("getid")) { return __ref.runUserSub(false, "item","getid", __ref);}
 BA.debugLineNum = 23;BA.debugLine="Public Sub GetID() As Int";
Debug.ShouldStop(4194304);
 BA.debugLineNum = 24;BA.debugLine="Return id_";
Debug.ShouldStop(8388608);
if (true) return __ref.getField(true,"_id_" /*RemoteObject*/ );
 BA.debugLineNum = 25;BA.debugLine="End Sub";
Debug.ShouldStop(16777216);
return RemoteObject.createImmutable(0);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getname(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("GetName (item) ","item",9,__ref.getField(false, "ba"),__ref,26);
if (RapidSub.canDelegate("getname")) { return __ref.runUserSub(false, "item","getname", __ref);}
 BA.debugLineNum = 26;BA.debugLine="Public Sub GetName() As String";
Debug.ShouldStop(33554432);
 BA.debugLineNum = 27;BA.debugLine="Return name_";
Debug.ShouldStop(67108864);
if (true) return __ref.getField(true,"_name_" /*RemoteObject*/ );
 BA.debugLineNum = 28;BA.debugLine="End Sub";
Debug.ShouldStop(134217728);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getprice(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("GetPrice (item) ","item",9,__ref.getField(false, "ba"),__ref,29);
if (RapidSub.canDelegate("getprice")) { return __ref.runUserSub(false, "item","getprice", __ref);}
 BA.debugLineNum = 29;BA.debugLine="Public Sub GetPrice() As String";
Debug.ShouldStop(268435456);
 BA.debugLineNum = 30;BA.debugLine="Return price_";
Debug.ShouldStop(536870912);
if (true) return BA.NumberToString(__ref.getField(true,"_price_" /*RemoteObject*/ ));
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
public static RemoteObject  _initialize(RemoteObject __ref,RemoteObject _ba,RemoteObject _id,RemoteObject _name,RemoteObject _price) throws Exception{
try {
		Debug.PushSubsStack("Initialize (item) ","item",9,__ref.getField(false, "ba"),__ref,11);
if (RapidSub.canDelegate("initialize")) { return __ref.runUserSub(false, "item","initialize", __ref, _ba, _id, _name, _price);}
__ref.runVoidMethodAndSync("innerInitializeHelper", _ba);
Debug.locals.put("ba", _ba);
Debug.locals.put("id", _id);
Debug.locals.put("name", _name);
Debug.locals.put("price", _price);
 BA.debugLineNum = 11;BA.debugLine="Public Sub Initialize(id As Int, name As String, p";
Debug.ShouldStop(1024);
 BA.debugLineNum = 12;BA.debugLine="If( Not ( id = Null And name = Null And price = N";
Debug.ShouldStop(2048);
if ((item.__c.runMethod(true,"Not",(Object)(BA.ObjectToBoolean(RemoteObject.solveBoolean("=",_id,BA.numberCast(double.class, item.__c.getField(false,"Null"))) && RemoteObject.solveBoolean("n",_name) && RemoteObject.solveBoolean("=",_price,BA.numberCast(double.class, item.__c.getField(false,"Null"))))))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 13;BA.debugLine="id_ = id";
Debug.ShouldStop(4096);
__ref.setField ("_id_" /*RemoteObject*/ ,_id);
 BA.debugLineNum = 14;BA.debugLine="name_ = name";
Debug.ShouldStop(8192);
__ref.setField ("_name_" /*RemoteObject*/ ,_name);
 BA.debugLineNum = 15;BA.debugLine="price_ = price";
Debug.ShouldStop(16384);
__ref.setField ("_price_" /*RemoteObject*/ ,_price);
 }else {
 BA.debugLineNum = 17;BA.debugLine="id_ = 0";
Debug.ShouldStop(65536);
__ref.setField ("_id_" /*RemoteObject*/ ,BA.numberCast(int.class, 0));
 BA.debugLineNum = 18;BA.debugLine="name_ = \"\"";
Debug.ShouldStop(131072);
__ref.setField ("_name_" /*RemoteObject*/ ,BA.ObjectToString(""));
 BA.debugLineNum = 19;BA.debugLine="price_ = 0.0";
Debug.ShouldStop(262144);
__ref.setField ("_price_" /*RemoteObject*/ ,BA.numberCast(double.class, 0.0));
 };
 BA.debugLineNum = 21;BA.debugLine="End Sub";
Debug.ShouldStop(1048576);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}