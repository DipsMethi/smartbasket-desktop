package b4j.example;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class user_subs_0 {


public static RemoteObject  _class_globals(RemoteObject __ref) throws Exception{
 //BA.debugLineNum = 1;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 2;BA.debugLine="Private fx As JFX";
user._fx = RemoteObject.createNew ("anywheresoftware.b4j.objects.JFX");__ref.setField("_fx",user._fx);
 //BA.debugLineNum = 4;BA.debugLine="Private ID_ As String";
user._id_ = RemoteObject.createImmutable("");__ref.setField("_id_",user._id_);
 //BA.debugLineNum = 5;BA.debugLine="Private name_ As String";
user._name_ = RemoteObject.createImmutable("");__ref.setField("_name_",user._name_);
 //BA.debugLineNum = 6;BA.debugLine="Private surname_ As String";
user._surname_ = RemoteObject.createImmutable("");__ref.setField("_surname_",user._surname_);
 //BA.debugLineNum = 7;BA.debugLine="Private email_ As String";
user._email_ = RemoteObject.createImmutable("");__ref.setField("_email_",user._email_);
 //BA.debugLineNum = 8;BA.debugLine="Private gender_ As String";
user._gender_ = RemoteObject.createImmutable("");__ref.setField("_gender_",user._gender_);
 //BA.debugLineNum = 9;BA.debugLine="Private cell_ As String";
user._cell_ = RemoteObject.createImmutable("");__ref.setField("_cell_",user._cell_);
 //BA.debugLineNum = 10;BA.debugLine="Private addr_ As String";
user._addr_ = RemoteObject.createImmutable("");__ref.setField("_addr_",user._addr_);
 //BA.debugLineNum = 11;BA.debugLine="Private password_ As String";
user._password_ = RemoteObject.createImmutable("");__ref.setField("_password_",user._password_);
 //BA.debugLineNum = 12;BA.debugLine="Private roleID_ As Byte";
user._roleid_ = RemoteObject.createImmutable((byte)0);__ref.setField("_roleid_",user._roleid_);
 //BA.debugLineNum = 14;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _create(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("Create (user) ","user",8,__ref.getField(false, "ba"),__ref,60);
if (RapidSub.canDelegate("create")) { return __ref.runUserSub(false, "user","create", __ref);}
 BA.debugLineNum = 60;BA.debugLine="Public Sub Create()";
Debug.ShouldStop(134217728);
 BA.debugLineNum = 62;BA.debugLine="End Sub";
Debug.ShouldStop(536870912);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _delete(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("Delete (user) ","user",8,__ref.getField(false, "ba"),__ref,69);
if (RapidSub.canDelegate("delete")) { return __ref.runUserSub(false, "user","delete", __ref);}
 BA.debugLineNum = 69;BA.debugLine="Public Sub Delete()";
Debug.ShouldStop(16);
 BA.debugLineNum = 71;BA.debugLine="End Sub";
Debug.ShouldStop(64);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _get(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("Get (user) ","user",8,__ref.getField(false, "ba"),__ref,63);
if (RapidSub.canDelegate("get")) { return __ref.runUserSub(false, "user","get", __ref);}
 BA.debugLineNum = 63;BA.debugLine="Public Sub Get()";
Debug.ShouldStop(1073741824);
 BA.debugLineNum = 65;BA.debugLine="End Sub";
Debug.ShouldStop(1);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getaddr(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("GetAddr (user) ","user",8,__ref.getField(false, "ba"),__ref,50);
if (RapidSub.canDelegate("getaddr")) { return __ref.runUserSub(false, "user","getaddr", __ref);}
 BA.debugLineNum = 50;BA.debugLine="Sub GetAddr() As String";
Debug.ShouldStop(131072);
 BA.debugLineNum = 51;BA.debugLine="Return addr_";
Debug.ShouldStop(262144);
if (true) return __ref.getField(true,"_addr_" /*RemoteObject*/ );
 BA.debugLineNum = 52;BA.debugLine="End Sub";
Debug.ShouldStop(524288);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getcellno(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("GetCellNo (user) ","user",8,__ref.getField(false, "ba"),__ref,47);
if (RapidSub.canDelegate("getcellno")) { return __ref.runUserSub(false, "user","getcellno", __ref);}
 BA.debugLineNum = 47;BA.debugLine="Sub GetCellNo() As String";
Debug.ShouldStop(16384);
 BA.debugLineNum = 48;BA.debugLine="Return cell_";
Debug.ShouldStop(32768);
if (true) return __ref.getField(true,"_cell_" /*RemoteObject*/ );
 BA.debugLineNum = 49;BA.debugLine="End Sub";
Debug.ShouldStop(65536);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getemail(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("GetEmail (user) ","user",8,__ref.getField(false, "ba"),__ref,41);
if (RapidSub.canDelegate("getemail")) { return __ref.runUserSub(false, "user","getemail", __ref);}
 BA.debugLineNum = 41;BA.debugLine="Sub GetEmail() As String";
Debug.ShouldStop(256);
 BA.debugLineNum = 42;BA.debugLine="Return email_";
Debug.ShouldStop(512);
if (true) return __ref.getField(true,"_email_" /*RemoteObject*/ );
 BA.debugLineNum = 43;BA.debugLine="End Sub";
Debug.ShouldStop(1024);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getgender(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("GetGender (user) ","user",8,__ref.getField(false, "ba"),__ref,44);
if (RapidSub.canDelegate("getgender")) { return __ref.runUserSub(false, "user","getgender", __ref);}
 BA.debugLineNum = 44;BA.debugLine="Sub GetGender() As String";
Debug.ShouldStop(2048);
 BA.debugLineNum = 45;BA.debugLine="Return gender_";
Debug.ShouldStop(4096);
if (true) return __ref.getField(true,"_gender_" /*RemoteObject*/ );
 BA.debugLineNum = 46;BA.debugLine="End Sub";
Debug.ShouldStop(8192);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getid(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("GetID (user) ","user",8,__ref.getField(false, "ba"),__ref,32);
if (RapidSub.canDelegate("getid")) { return __ref.runUserSub(false, "user","getid", __ref);}
 BA.debugLineNum = 32;BA.debugLine="Sub GetID() As String";
Debug.ShouldStop(-2147483648);
 BA.debugLineNum = 33;BA.debugLine="Return ID_";
Debug.ShouldStop(1);
if (true) return __ref.getField(true,"_id_" /*RemoteObject*/ );
 BA.debugLineNum = 34;BA.debugLine="End Sub";
Debug.ShouldStop(2);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getlastname(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("GetLastname (user) ","user",8,__ref.getField(false, "ba"),__ref,38);
if (RapidSub.canDelegate("getlastname")) { return __ref.runUserSub(false, "user","getlastname", __ref);}
 BA.debugLineNum = 38;BA.debugLine="Sub GetLastname() As String";
Debug.ShouldStop(32);
 BA.debugLineNum = 39;BA.debugLine="Return surname_";
Debug.ShouldStop(64);
if (true) return __ref.getField(true,"_surname_" /*RemoteObject*/ );
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
public static RemoteObject  _getname(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("GetName (user) ","user",8,__ref.getField(false, "ba"),__ref,35);
if (RapidSub.canDelegate("getname")) { return __ref.runUserSub(false, "user","getname", __ref);}
 BA.debugLineNum = 35;BA.debugLine="Sub GetName() As String";
Debug.ShouldStop(4);
 BA.debugLineNum = 36;BA.debugLine="Return name_";
Debug.ShouldStop(8);
if (true) return __ref.getField(true,"_name_" /*RemoteObject*/ );
 BA.debugLineNum = 37;BA.debugLine="End Sub";
Debug.ShouldStop(16);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getpassword(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("GetPassword (user) ","user",8,__ref.getField(false, "ba"),__ref,53);
if (RapidSub.canDelegate("getpassword")) { return __ref.runUserSub(false, "user","getpassword", __ref);}
 BA.debugLineNum = 53;BA.debugLine="Sub GetPassword() As String";
Debug.ShouldStop(1048576);
 BA.debugLineNum = 54;BA.debugLine="Return password_";
Debug.ShouldStop(2097152);
if (true) return __ref.getField(true,"_password_" /*RemoteObject*/ );
 BA.debugLineNum = 55;BA.debugLine="End Sub";
Debug.ShouldStop(4194304);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getroleid(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("GetRoleID (user) ","user",8,__ref.getField(false, "ba"),__ref,56);
if (RapidSub.canDelegate("getroleid")) { return __ref.runUserSub(false, "user","getroleid", __ref);}
 BA.debugLineNum = 56;BA.debugLine="Sub GetRoleID() As Byte";
Debug.ShouldStop(8388608);
 BA.debugLineNum = 57;BA.debugLine="Return roleID_";
Debug.ShouldStop(16777216);
if (true) return __ref.getField(true,"_roleid_" /*RemoteObject*/ );
 BA.debugLineNum = 58;BA.debugLine="End Sub";
Debug.ShouldStop(33554432);
return RemoteObject.createImmutable((byte)0);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _initialize(RemoteObject __ref,RemoteObject _ba,RemoteObject _id,RemoteObject _firstname,RemoteObject _lastname,RemoteObject _email,RemoteObject _gender,RemoteObject _cell,RemoteObject _addr,RemoteObject _password,RemoteObject _roleid) throws Exception{
try {
		Debug.PushSubsStack("Initialize (user) ","user",8,__ref.getField(false, "ba"),__ref,17);
if (RapidSub.canDelegate("initialize")) { return __ref.runUserSub(false, "user","initialize", __ref, _ba, _id, _firstname, _lastname, _email, _gender, _cell, _addr, _password, _roleid);}
__ref.runVoidMethodAndSync("innerInitializeHelper", _ba);
Debug.locals.put("ba", _ba);
Debug.locals.put("id", _id);
Debug.locals.put("firstname", _firstname);
Debug.locals.put("lastname", _lastname);
Debug.locals.put("email", _email);
Debug.locals.put("gender", _gender);
Debug.locals.put("cell", _cell);
Debug.locals.put("addr", _addr);
Debug.locals.put("password", _password);
Debug.locals.put("roleID", _roleid);
 BA.debugLineNum = 17;BA.debugLine="Public Sub Initialize(id As String, firstname As S";
Debug.ShouldStop(65536);
 BA.debugLineNum = 20;BA.debugLine="id = ID_";
Debug.ShouldStop(524288);
_id = __ref.getField(true,"_id_" /*RemoteObject*/ );Debug.locals.put("id", _id);
 BA.debugLineNum = 21;BA.debugLine="name_ = firstname";
Debug.ShouldStop(1048576);
__ref.setField ("_name_" /*RemoteObject*/ ,_firstname);
 BA.debugLineNum = 22;BA.debugLine="surname_ = lastname";
Debug.ShouldStop(2097152);
__ref.setField ("_surname_" /*RemoteObject*/ ,_lastname);
 BA.debugLineNum = 23;BA.debugLine="email_ = email";
Debug.ShouldStop(4194304);
__ref.setField ("_email_" /*RemoteObject*/ ,_email);
 BA.debugLineNum = 24;BA.debugLine="gender_ = gender";
Debug.ShouldStop(8388608);
__ref.setField ("_gender_" /*RemoteObject*/ ,_gender);
 BA.debugLineNum = 25;BA.debugLine="cell_ = cell";
Debug.ShouldStop(16777216);
__ref.setField ("_cell_" /*RemoteObject*/ ,_cell);
 BA.debugLineNum = 26;BA.debugLine="addr_ = addr";
Debug.ShouldStop(33554432);
__ref.setField ("_addr_" /*RemoteObject*/ ,_addr);
 BA.debugLineNum = 27;BA.debugLine="password_ = password";
Debug.ShouldStop(67108864);
__ref.setField ("_password_" /*RemoteObject*/ ,_password);
 BA.debugLineNum = 28;BA.debugLine="roleID_ = roleID";
Debug.ShouldStop(134217728);
__ref.setField ("_roleid_" /*RemoteObject*/ ,_roleid);
 BA.debugLineNum = 30;BA.debugLine="End Sub";
Debug.ShouldStop(536870912);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _update(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("Update (user) ","user",8,__ref.getField(false, "ba"),__ref,66);
if (RapidSub.canDelegate("update")) { return __ref.runUserSub(false, "user","update", __ref);}
 BA.debugLineNum = 66;BA.debugLine="Public Sub Update()";
Debug.ShouldStop(2);
 BA.debugLineNum = 68;BA.debugLine="End Sub";
Debug.ShouldStop(8);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}