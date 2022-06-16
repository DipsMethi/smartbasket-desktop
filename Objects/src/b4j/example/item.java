package b4j.example;

import anywheresoftware.b4a.debug.*;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;

public class item extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4a.shell.ShellBA("b4j.example", "b4j.example.item", this);
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            ba.htSubs = htSubs;
             
        }
        if (BA.isShellModeRuntimeCheck(ba))
                this.getClass().getMethod("_class_globals", b4j.example.item.class).invoke(this, new Object[] {null});
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
public int _id_ = 0;
public String _name_ = "";
public double _price_ = 0;
public b4j.example.main _main = null;
public b4j.example.loginform _loginform = null;
public b4j.example.dashboard _dashboard = null;
public b4j.example.registrationform _registrationform = null;
public b4j.example.customerview _customerview = null;
public b4j.example.b4xcollections _b4xcollections = null;
public b4j.example.dbutils _dbutils = null;
public String  _class_globals(b4j.example.item __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="item";
RDebugUtils.currentLine=10223616;
 //BA.debugLineNum = 10223616;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=10223617;
 //BA.debugLineNum = 10223617;BA.debugLine="Private fx As JFX";
_fx = new anywheresoftware.b4j.objects.JFX();
RDebugUtils.currentLine=10223619;
 //BA.debugLineNum = 10223619;BA.debugLine="Private id_ As Int";
_id_ = 0;
RDebugUtils.currentLine=10223620;
 //BA.debugLineNum = 10223620;BA.debugLine="Private name_ As String";
_name_ = "";
RDebugUtils.currentLine=10223621;
 //BA.debugLineNum = 10223621;BA.debugLine="Private price_ As Double";
_price_ = 0;
RDebugUtils.currentLine=10223623;
 //BA.debugLineNum = 10223623;BA.debugLine="End Sub";
return "";
}
public int  _getid(b4j.example.item __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="item";
if (Debug.shouldDelegate(ba, "getid", false))
	 {return ((Integer) Debug.delegate(ba, "getid", null));}
RDebugUtils.currentLine=10354688;
 //BA.debugLineNum = 10354688;BA.debugLine="Public Sub GetID() As Int";
RDebugUtils.currentLine=10354689;
 //BA.debugLineNum = 10354689;BA.debugLine="Return id_";
if (true) return __ref._id_ /*int*/ ;
RDebugUtils.currentLine=10354690;
 //BA.debugLineNum = 10354690;BA.debugLine="End Sub";
return 0;
}
public String  _getname(b4j.example.item __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="item";
if (Debug.shouldDelegate(ba, "getname", false))
	 {return ((String) Debug.delegate(ba, "getname", null));}
RDebugUtils.currentLine=10420224;
 //BA.debugLineNum = 10420224;BA.debugLine="Public Sub GetName() As String";
RDebugUtils.currentLine=10420225;
 //BA.debugLineNum = 10420225;BA.debugLine="Return name_";
if (true) return __ref._name_ /*String*/ ;
RDebugUtils.currentLine=10420226;
 //BA.debugLineNum = 10420226;BA.debugLine="End Sub";
return "";
}
public String  _getprice(b4j.example.item __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="item";
if (Debug.shouldDelegate(ba, "getprice", false))
	 {return ((String) Debug.delegate(ba, "getprice", null));}
RDebugUtils.currentLine=10485760;
 //BA.debugLineNum = 10485760;BA.debugLine="Public Sub GetPrice() As String";
RDebugUtils.currentLine=10485761;
 //BA.debugLineNum = 10485761;BA.debugLine="Return price_";
if (true) return BA.NumberToString(__ref._price_ /*double*/ );
RDebugUtils.currentLine=10485762;
 //BA.debugLineNum = 10485762;BA.debugLine="End Sub";
return "";
}
public String  _initialize(b4j.example.item __ref,anywheresoftware.b4a.BA _ba,int _id,String _name,double _price) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="item";
if (Debug.shouldDelegate(ba, "initialize", false))
	 {return ((String) Debug.delegate(ba, "initialize", new Object[] {_ba,_id,_name,_price}));}
RDebugUtils.currentLine=10289152;
 //BA.debugLineNum = 10289152;BA.debugLine="Public Sub Initialize(id As Int, name As String, p";
RDebugUtils.currentLine=10289153;
 //BA.debugLineNum = 10289153;BA.debugLine="If( Not ( id = Null And name = Null And price = N";
if ((__c.Not(_id==(double)(BA.ObjectToNumber(__c.Null)) && _name== null && _price==(double)(BA.ObjectToNumber(__c.Null))))) { 
RDebugUtils.currentLine=10289154;
 //BA.debugLineNum = 10289154;BA.debugLine="id_ = id";
__ref._id_ /*int*/  = _id;
RDebugUtils.currentLine=10289155;
 //BA.debugLineNum = 10289155;BA.debugLine="name_ = name";
__ref._name_ /*String*/  = _name;
RDebugUtils.currentLine=10289156;
 //BA.debugLineNum = 10289156;BA.debugLine="price_ = price";
__ref._price_ /*double*/  = _price;
 }else {
RDebugUtils.currentLine=10289158;
 //BA.debugLineNum = 10289158;BA.debugLine="id_ = 0";
__ref._id_ /*int*/  = (int) (0);
RDebugUtils.currentLine=10289159;
 //BA.debugLineNum = 10289159;BA.debugLine="name_ = \"\"";
__ref._name_ /*String*/  = "";
RDebugUtils.currentLine=10289160;
 //BA.debugLineNum = 10289160;BA.debugLine="price_ = 0.0";
__ref._price_ /*double*/  = 0.0;
 };
RDebugUtils.currentLine=10289162;
 //BA.debugLineNum = 10289162;BA.debugLine="End Sub";
return "";
}
}