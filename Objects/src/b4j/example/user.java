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
RDebugUtils.currentLine=3080192;
 //BA.debugLineNum = 3080192;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=3080193;
 //BA.debugLineNum = 3080193;BA.debugLine="Private fx As JFX";
_fx = new anywheresoftware.b4j.objects.JFX();
RDebugUtils.currentLine=3080195;
 //BA.debugLineNum = 3080195;BA.debugLine="Private ID_ As String";
_id_ = "";
RDebugUtils.currentLine=3080196;
 //BA.debugLineNum = 3080196;BA.debugLine="Private name_ As String";
_name_ = "";
RDebugUtils.currentLine=3080197;
 //BA.debugLineNum = 3080197;BA.debugLine="Private surname_ As String";
_surname_ = "";
RDebugUtils.currentLine=3080198;
 //BA.debugLineNum = 3080198;BA.debugLine="Private email_ As String";
_email_ = "";
RDebugUtils.currentLine=3080199;
 //BA.debugLineNum = 3080199;BA.debugLine="Private gender_ As String";
_gender_ = "";
RDebugUtils.currentLine=3080200;
 //BA.debugLineNum = 3080200;BA.debugLine="Private cell_ As String";
_cell_ = "";
RDebugUtils.currentLine=3080201;
 //BA.debugLineNum = 3080201;BA.debugLine="Private addr_ As String";
_addr_ = "";
RDebugUtils.currentLine=3080202;
 //BA.debugLineNum = 3080202;BA.debugLine="Private password_ As String";
_password_ = "";
RDebugUtils.currentLine=3080203;
 //BA.debugLineNum = 3080203;BA.debugLine="Private roleID_ As Byte";
_roleid_ = (byte)0;
RDebugUtils.currentLine=3080205;
 //BA.debugLineNum = 3080205;BA.debugLine="End Sub";
return "";
}
public String  _create(b4j.example.user __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="user";
if (Debug.shouldDelegate(ba, "create", false))
	 {return ((String) Debug.delegate(ba, "create", null));}
RDebugUtils.currentLine=3801088;
 //BA.debugLineNum = 3801088;BA.debugLine="Public Sub Create()";
RDebugUtils.currentLine=3801090;
 //BA.debugLineNum = 3801090;BA.debugLine="End Sub";
return "";
}
public String  _delete(b4j.example.user __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="user";
if (Debug.shouldDelegate(ba, "delete", false))
	 {return ((String) Debug.delegate(ba, "delete", null));}
RDebugUtils.currentLine=3997696;
 //BA.debugLineNum = 3997696;BA.debugLine="Public Sub Delete()";
RDebugUtils.currentLine=3997698;
 //BA.debugLineNum = 3997698;BA.debugLine="End Sub";
return "";
}
public String  _get(b4j.example.user __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="user";
if (Debug.shouldDelegate(ba, "get", false))
	 {return ((String) Debug.delegate(ba, "get", null));}
RDebugUtils.currentLine=3866624;
 //BA.debugLineNum = 3866624;BA.debugLine="Public Sub Get()";
RDebugUtils.currentLine=3866626;
 //BA.debugLineNum = 3866626;BA.debugLine="End Sub";
return "";
}
public String  _getaddr(b4j.example.user __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="user";
if (Debug.shouldDelegate(ba, "getaddr", false))
	 {return ((String) Debug.delegate(ba, "getaddr", null));}
RDebugUtils.currentLine=3604480;
 //BA.debugLineNum = 3604480;BA.debugLine="Sub GetAddr() As String";
RDebugUtils.currentLine=3604481;
 //BA.debugLineNum = 3604481;BA.debugLine="Return addr_";
if (true) return __ref._addr_ /*String*/ ;
RDebugUtils.currentLine=3604482;
 //BA.debugLineNum = 3604482;BA.debugLine="End Sub";
return "";
}
public String  _getcellno(b4j.example.user __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="user";
if (Debug.shouldDelegate(ba, "getcellno", false))
	 {return ((String) Debug.delegate(ba, "getcellno", null));}
RDebugUtils.currentLine=3538944;
 //BA.debugLineNum = 3538944;BA.debugLine="Sub GetCellNo() As String";
RDebugUtils.currentLine=3538945;
 //BA.debugLineNum = 3538945;BA.debugLine="Return cell_";
if (true) return __ref._cell_ /*String*/ ;
RDebugUtils.currentLine=3538946;
 //BA.debugLineNum = 3538946;BA.debugLine="End Sub";
return "";
}
public String  _getemail(b4j.example.user __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="user";
if (Debug.shouldDelegate(ba, "getemail", false))
	 {return ((String) Debug.delegate(ba, "getemail", null));}
RDebugUtils.currentLine=3407872;
 //BA.debugLineNum = 3407872;BA.debugLine="Sub GetEmail() As String";
RDebugUtils.currentLine=3407873;
 //BA.debugLineNum = 3407873;BA.debugLine="Return email_";
if (true) return __ref._email_ /*String*/ ;
RDebugUtils.currentLine=3407874;
 //BA.debugLineNum = 3407874;BA.debugLine="End Sub";
return "";
}
public String  _getgender(b4j.example.user __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="user";
if (Debug.shouldDelegate(ba, "getgender", false))
	 {return ((String) Debug.delegate(ba, "getgender", null));}
RDebugUtils.currentLine=3473408;
 //BA.debugLineNum = 3473408;BA.debugLine="Sub GetGender() As String";
RDebugUtils.currentLine=3473409;
 //BA.debugLineNum = 3473409;BA.debugLine="Return gender_";
if (true) return __ref._gender_ /*String*/ ;
RDebugUtils.currentLine=3473410;
 //BA.debugLineNum = 3473410;BA.debugLine="End Sub";
return "";
}
public String  _getid(b4j.example.user __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="user";
if (Debug.shouldDelegate(ba, "getid", false))
	 {return ((String) Debug.delegate(ba, "getid", null));}
RDebugUtils.currentLine=3211264;
 //BA.debugLineNum = 3211264;BA.debugLine="Sub GetID() As String";
RDebugUtils.currentLine=3211265;
 //BA.debugLineNum = 3211265;BA.debugLine="Return ID_";
if (true) return __ref._id_ /*String*/ ;
RDebugUtils.currentLine=3211266;
 //BA.debugLineNum = 3211266;BA.debugLine="End Sub";
return "";
}
public String  _getlastname(b4j.example.user __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="user";
if (Debug.shouldDelegate(ba, "getlastname", false))
	 {return ((String) Debug.delegate(ba, "getlastname", null));}
RDebugUtils.currentLine=3342336;
 //BA.debugLineNum = 3342336;BA.debugLine="Sub GetLastname() As String";
RDebugUtils.currentLine=3342337;
 //BA.debugLineNum = 3342337;BA.debugLine="Return surname_";
if (true) return __ref._surname_ /*String*/ ;
RDebugUtils.currentLine=3342338;
 //BA.debugLineNum = 3342338;BA.debugLine="End Sub";
return "";
}
public String  _getname(b4j.example.user __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="user";
if (Debug.shouldDelegate(ba, "getname", false))
	 {return ((String) Debug.delegate(ba, "getname", null));}
RDebugUtils.currentLine=3276800;
 //BA.debugLineNum = 3276800;BA.debugLine="Sub GetName() As String";
RDebugUtils.currentLine=3276801;
 //BA.debugLineNum = 3276801;BA.debugLine="Return name_";
if (true) return __ref._name_ /*String*/ ;
RDebugUtils.currentLine=3276802;
 //BA.debugLineNum = 3276802;BA.debugLine="End Sub";
return "";
}
public String  _getpassword(b4j.example.user __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="user";
if (Debug.shouldDelegate(ba, "getpassword", false))
	 {return ((String) Debug.delegate(ba, "getpassword", null));}
RDebugUtils.currentLine=3670016;
 //BA.debugLineNum = 3670016;BA.debugLine="Sub GetPassword() As String";
RDebugUtils.currentLine=3670017;
 //BA.debugLineNum = 3670017;BA.debugLine="Return password_";
if (true) return __ref._password_ /*String*/ ;
RDebugUtils.currentLine=3670018;
 //BA.debugLineNum = 3670018;BA.debugLine="End Sub";
return "";
}
public byte  _getroleid(b4j.example.user __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="user";
if (Debug.shouldDelegate(ba, "getroleid", false))
	 {return ((Byte) Debug.delegate(ba, "getroleid", null));}
RDebugUtils.currentLine=3735552;
 //BA.debugLineNum = 3735552;BA.debugLine="Sub GetRoleID() As Byte";
RDebugUtils.currentLine=3735553;
 //BA.debugLineNum = 3735553;BA.debugLine="Return roleID_";
if (true) return __ref._roleid_ /*byte*/ ;
RDebugUtils.currentLine=3735554;
 //BA.debugLineNum = 3735554;BA.debugLine="End Sub";
return (byte)0;
}
public String  _initialize(b4j.example.user __ref,anywheresoftware.b4a.BA _ba,String _id,String _firstname,String _lastname,String _email,String _gender,String _cell,String _addr,String _password,byte _roleid) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="user";
if (Debug.shouldDelegate(ba, "initialize", false))
	 {return ((String) Debug.delegate(ba, "initialize", new Object[] {_ba,_id,_firstname,_lastname,_email,_gender,_cell,_addr,_password,_roleid}));}
RDebugUtils.currentLine=3145728;
 //BA.debugLineNum = 3145728;BA.debugLine="Public Sub Initialize(id As String, firstname As S";
RDebugUtils.currentLine=3145731;
 //BA.debugLineNum = 3145731;BA.debugLine="id = ID_";
_id = __ref._id_ /*String*/ ;
RDebugUtils.currentLine=3145732;
 //BA.debugLineNum = 3145732;BA.debugLine="name_ = firstname";
__ref._name_ /*String*/  = _firstname;
RDebugUtils.currentLine=3145733;
 //BA.debugLineNum = 3145733;BA.debugLine="surname_ = lastname";
__ref._surname_ /*String*/  = _lastname;
RDebugUtils.currentLine=3145734;
 //BA.debugLineNum = 3145734;BA.debugLine="email_ = email";
__ref._email_ /*String*/  = _email;
RDebugUtils.currentLine=3145735;
 //BA.debugLineNum = 3145735;BA.debugLine="gender_ = gender";
__ref._gender_ /*String*/  = _gender;
RDebugUtils.currentLine=3145736;
 //BA.debugLineNum = 3145736;BA.debugLine="cell_ = cell";
__ref._cell_ /*String*/  = _cell;
RDebugUtils.currentLine=3145737;
 //BA.debugLineNum = 3145737;BA.debugLine="addr_ = addr";
__ref._addr_ /*String*/  = _addr;
RDebugUtils.currentLine=3145738;
 //BA.debugLineNum = 3145738;BA.debugLine="password_ = password";
__ref._password_ /*String*/  = _password;
RDebugUtils.currentLine=3145739;
 //BA.debugLineNum = 3145739;BA.debugLine="roleID_ = roleID";
__ref._roleid_ /*byte*/  = _roleid;
RDebugUtils.currentLine=3145741;
 //BA.debugLineNum = 3145741;BA.debugLine="End Sub";
return "";
}
public String  _update(b4j.example.user __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="user";
if (Debug.shouldDelegate(ba, "update", false))
	 {return ((String) Debug.delegate(ba, "update", null));}
RDebugUtils.currentLine=3932160;
 //BA.debugLineNum = 3932160;BA.debugLine="Public Sub Update()";
RDebugUtils.currentLine=3932162;
 //BA.debugLineNum = 3932162;BA.debugLine="End Sub";
return "";
}
}