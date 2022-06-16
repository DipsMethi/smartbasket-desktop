package b4j.example;

import anywheresoftware.b4a.debug.*;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;

public class user extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4a.shell.ShellBA("b4j.example", "b4j.example.user", this);
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            ba.htSubs = htSubs;
             
        }
        if (BA.isShellModeRuntimeCheck(ba))
                this.getClass().getMethod("_class_globals", b4j.example.user.class).invoke(this, new Object[] {null});
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
public String _id_ = "";
public String _name_ = "";
public String _surname_ = "";
public String _email_ = "";
public String _gender_ = "";
public String _cell_ = "";
public String _addr_ = "";
public String _password_ = "";
public byte _roleid_ = (byte)0;
public b4j.example.main _main = null;
public b4j.example.loginform _loginform = null;
public b4j.example.dashboard _dashboard = null;
public b4j.example.registrationform _registrationform = null;
public b4j.example.customerview _customerview = null;
public b4j.example.b4xcollections _b4xcollections = null;
public b4j.example.dbutils _dbutils = null;
public String  _class_globals(b4j.example.user __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="user";
RDebugUtils.currentLine=9240576;
 //BA.debugLineNum = 9240576;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=9240577;
 //BA.debugLineNum = 9240577;BA.debugLine="Private fx As JFX";
_fx = new anywheresoftware.b4j.objects.JFX();
RDebugUtils.currentLine=9240579;
 //BA.debugLineNum = 9240579;BA.debugLine="Private ID_ As String";
_id_ = "";
RDebugUtils.currentLine=9240580;
 //BA.debugLineNum = 9240580;BA.debugLine="Private name_ As String";
_name_ = "";
RDebugUtils.currentLine=9240581;
 //BA.debugLineNum = 9240581;BA.debugLine="Private surname_ As String";
_surname_ = "";
RDebugUtils.currentLine=9240582;
 //BA.debugLineNum = 9240582;BA.debugLine="Private email_ As String";
_email_ = "";
RDebugUtils.currentLine=9240583;
 //BA.debugLineNum = 9240583;BA.debugLine="Private gender_ As String";
_gender_ = "";
RDebugUtils.currentLine=9240584;
 //BA.debugLineNum = 9240584;BA.debugLine="Private cell_ As String";
_cell_ = "";
RDebugUtils.currentLine=9240585;
 //BA.debugLineNum = 9240585;BA.debugLine="Private addr_ As String";
_addr_ = "";
RDebugUtils.currentLine=9240586;
 //BA.debugLineNum = 9240586;BA.debugLine="Private password_ As String";
_password_ = "";
RDebugUtils.currentLine=9240587;
 //BA.debugLineNum = 9240587;BA.debugLine="Private roleID_ As Byte";
_roleid_ = (byte)0;
RDebugUtils.currentLine=9240589;
 //BA.debugLineNum = 9240589;BA.debugLine="End Sub";
return "";
}
public String  _create(b4j.example.user __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="user";
if (Debug.shouldDelegate(ba, "create", false))
	 {return ((String) Debug.delegate(ba, "create", null));}
RDebugUtils.currentLine=9961472;
 //BA.debugLineNum = 9961472;BA.debugLine="Public Sub Create()";
RDebugUtils.currentLine=9961474;
 //BA.debugLineNum = 9961474;BA.debugLine="End Sub";
return "";
}
public String  _delete(b4j.example.user __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="user";
if (Debug.shouldDelegate(ba, "delete", false))
	 {return ((String) Debug.delegate(ba, "delete", null));}
RDebugUtils.currentLine=10158080;
 //BA.debugLineNum = 10158080;BA.debugLine="Public Sub Delete()";
RDebugUtils.currentLine=10158082;
 //BA.debugLineNum = 10158082;BA.debugLine="End Sub";
return "";
}
public String  _get(b4j.example.user __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="user";
if (Debug.shouldDelegate(ba, "get", false))
	 {return ((String) Debug.delegate(ba, "get", null));}
RDebugUtils.currentLine=10027008;
 //BA.debugLineNum = 10027008;BA.debugLine="Public Sub Get()";
RDebugUtils.currentLine=10027010;
 //BA.debugLineNum = 10027010;BA.debugLine="End Sub";
return "";
}
public String  _getaddr(b4j.example.user __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="user";
if (Debug.shouldDelegate(ba, "getaddr", false))
	 {return ((String) Debug.delegate(ba, "getaddr", null));}
RDebugUtils.currentLine=9764864;
 //BA.debugLineNum = 9764864;BA.debugLine="Sub GetAddr() As String";
RDebugUtils.currentLine=9764865;
 //BA.debugLineNum = 9764865;BA.debugLine="Return addr_";
if (true) return __ref._addr_ /*String*/ ;
RDebugUtils.currentLine=9764866;
 //BA.debugLineNum = 9764866;BA.debugLine="End Sub";
return "";
}
public String  _getcellno(b4j.example.user __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="user";
if (Debug.shouldDelegate(ba, "getcellno", false))
	 {return ((String) Debug.delegate(ba, "getcellno", null));}
RDebugUtils.currentLine=9699328;
 //BA.debugLineNum = 9699328;BA.debugLine="Sub GetCellNo() As String";
RDebugUtils.currentLine=9699329;
 //BA.debugLineNum = 9699329;BA.debugLine="Return cell_";
if (true) return __ref._cell_ /*String*/ ;
RDebugUtils.currentLine=9699330;
 //BA.debugLineNum = 9699330;BA.debugLine="End Sub";
return "";
}
public String  _getemail(b4j.example.user __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="user";
if (Debug.shouldDelegate(ba, "getemail", false))
	 {return ((String) Debug.delegate(ba, "getemail", null));}
RDebugUtils.currentLine=9568256;
 //BA.debugLineNum = 9568256;BA.debugLine="Sub GetEmail() As String";
RDebugUtils.currentLine=9568257;
 //BA.debugLineNum = 9568257;BA.debugLine="Return email_";
if (true) return __ref._email_ /*String*/ ;
RDebugUtils.currentLine=9568258;
 //BA.debugLineNum = 9568258;BA.debugLine="End Sub";
return "";
}
public String  _getgender(b4j.example.user __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="user";
if (Debug.shouldDelegate(ba, "getgender", false))
	 {return ((String) Debug.delegate(ba, "getgender", null));}
RDebugUtils.currentLine=9633792;
 //BA.debugLineNum = 9633792;BA.debugLine="Sub GetGender() As String";
RDebugUtils.currentLine=9633793;
 //BA.debugLineNum = 9633793;BA.debugLine="Return gender_";
if (true) return __ref._gender_ /*String*/ ;
RDebugUtils.currentLine=9633794;
 //BA.debugLineNum = 9633794;BA.debugLine="End Sub";
return "";
}
public String  _getid(b4j.example.user __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="user";
if (Debug.shouldDelegate(ba, "getid", false))
	 {return ((String) Debug.delegate(ba, "getid", null));}
RDebugUtils.currentLine=9371648;
 //BA.debugLineNum = 9371648;BA.debugLine="Sub GetID() As String";
RDebugUtils.currentLine=9371649;
 //BA.debugLineNum = 9371649;BA.debugLine="Return ID_";
if (true) return __ref._id_ /*String*/ ;
RDebugUtils.currentLine=9371650;
 //BA.debugLineNum = 9371650;BA.debugLine="End Sub";
return "";
}
public String  _getlastname(b4j.example.user __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="user";
if (Debug.shouldDelegate(ba, "getlastname", false))
	 {return ((String) Debug.delegate(ba, "getlastname", null));}
RDebugUtils.currentLine=9502720;
 //BA.debugLineNum = 9502720;BA.debugLine="Sub GetLastname() As String";
RDebugUtils.currentLine=9502721;
 //BA.debugLineNum = 9502721;BA.debugLine="Return surname_";
if (true) return __ref._surname_ /*String*/ ;
RDebugUtils.currentLine=9502722;
 //BA.debugLineNum = 9502722;BA.debugLine="End Sub";
return "";
}
public String  _getname(b4j.example.user __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="user";
if (Debug.shouldDelegate(ba, "getname", false))
	 {return ((String) Debug.delegate(ba, "getname", null));}
RDebugUtils.currentLine=9437184;
 //BA.debugLineNum = 9437184;BA.debugLine="Sub GetName() As String";
RDebugUtils.currentLine=9437185;
 //BA.debugLineNum = 9437185;BA.debugLine="Return name_";
if (true) return __ref._name_ /*String*/ ;
RDebugUtils.currentLine=9437186;
 //BA.debugLineNum = 9437186;BA.debugLine="End Sub";
return "";
}
public String  _getpassword(b4j.example.user __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="user";
if (Debug.shouldDelegate(ba, "getpassword", false))
	 {return ((String) Debug.delegate(ba, "getpassword", null));}
RDebugUtils.currentLine=9830400;
 //BA.debugLineNum = 9830400;BA.debugLine="Sub GetPassword() As String";
RDebugUtils.currentLine=9830401;
 //BA.debugLineNum = 9830401;BA.debugLine="Return password_";
if (true) return __ref._password_ /*String*/ ;
RDebugUtils.currentLine=9830402;
 //BA.debugLineNum = 9830402;BA.debugLine="End Sub";
return "";
}
public byte  _getroleid(b4j.example.user __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="user";
if (Debug.shouldDelegate(ba, "getroleid", false))
	 {return ((Byte) Debug.delegate(ba, "getroleid", null));}
RDebugUtils.currentLine=9895936;
 //BA.debugLineNum = 9895936;BA.debugLine="Sub GetRoleID() As Byte";
RDebugUtils.currentLine=9895937;
 //BA.debugLineNum = 9895937;BA.debugLine="Return roleID_";
if (true) return __ref._roleid_ /*byte*/ ;
RDebugUtils.currentLine=9895938;
 //BA.debugLineNum = 9895938;BA.debugLine="End Sub";
return (byte)0;
}
public String  _initialize(b4j.example.user __ref,anywheresoftware.b4a.BA _ba,String _id,String _firstname,String _lastname,String _email,String _gender,String _cell,String _addr,String _password,byte _roleid) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="user";
if (Debug.shouldDelegate(ba, "initialize", false))
	 {return ((String) Debug.delegate(ba, "initialize", new Object[] {_ba,_id,_firstname,_lastname,_email,_gender,_cell,_addr,_password,_roleid}));}
RDebugUtils.currentLine=9306112;
 //BA.debugLineNum = 9306112;BA.debugLine="Public Sub Initialize(id As String, firstname As S";
RDebugUtils.currentLine=9306115;
 //BA.debugLineNum = 9306115;BA.debugLine="id = ID_";
_id = __ref._id_ /*String*/ ;
RDebugUtils.currentLine=9306116;
 //BA.debugLineNum = 9306116;BA.debugLine="name_ = firstname";
__ref._name_ /*String*/  = _firstname;
RDebugUtils.currentLine=9306117;
 //BA.debugLineNum = 9306117;BA.debugLine="surname_ = lastname";
__ref._surname_ /*String*/  = _lastname;
RDebugUtils.currentLine=9306118;
 //BA.debugLineNum = 9306118;BA.debugLine="email_ = email";
__ref._email_ /*String*/  = _email;
RDebugUtils.currentLine=9306119;
 //BA.debugLineNum = 9306119;BA.debugLine="gender_ = gender";
__ref._gender_ /*String*/  = _gender;
RDebugUtils.currentLine=9306120;
 //BA.debugLineNum = 9306120;BA.debugLine="cell_ = cell";
__ref._cell_ /*String*/  = _cell;
RDebugUtils.currentLine=9306121;
 //BA.debugLineNum = 9306121;BA.debugLine="addr_ = addr";
__ref._addr_ /*String*/  = _addr;
RDebugUtils.currentLine=9306122;
 //BA.debugLineNum = 9306122;BA.debugLine="password_ = password";
__ref._password_ /*String*/  = _password;
RDebugUtils.currentLine=9306123;
 //BA.debugLineNum = 9306123;BA.debugLine="roleID_ = roleID";
__ref._roleid_ /*byte*/  = _roleid;
RDebugUtils.currentLine=9306125;
 //BA.debugLineNum = 9306125;BA.debugLine="End Sub";
return "";
}
public String  _update(b4j.example.user __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="user";
if (Debug.shouldDelegate(ba, "update", false))
	 {return ((String) Debug.delegate(ba, "update", null));}
RDebugUtils.currentLine=10092544;
 //BA.debugLineNum = 10092544;BA.debugLine="Public Sub Update()";
RDebugUtils.currentLine=10092546;
 //BA.debugLineNum = 10092546;BA.debugLine="End Sub";
return "";
}
}