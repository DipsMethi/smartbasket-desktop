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
RDebugUtils.currentLine=8781824;
 //BA.debugLineNum = 8781824;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=8781825;
 //BA.debugLineNum = 8781825;BA.debugLine="Private fx As JFX";
_fx = new anywheresoftware.b4j.objects.JFX();
RDebugUtils.currentLine=8781827;
 //BA.debugLineNum = 8781827;BA.debugLine="Private id_ As Int";
_id_ = 0;
RDebugUtils.currentLine=8781828;
 //BA.debugLineNum = 8781828;BA.debugLine="Private name_ As String";
_name_ = "";
RDebugUtils.currentLine=8781829;
 //BA.debugLineNum = 8781829;BA.debugLine="Private price_ As Double";
_price_ = 0;
RDebugUtils.currentLine=8781831;
 //BA.debugLineNum = 8781831;BA.debugLine="End Sub";
return "";
}
public int  _getid(b4j.example.item __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="item";
if (Debug.shouldDelegate(ba, "getid", false))
	 {return ((Integer) Debug.delegate(ba, "getid", null));}
RDebugUtils.currentLine=8912896;
 //BA.debugLineNum = 8912896;BA.debugLine="Public Sub GetID() As Int";
RDebugUtils.currentLine=8912897;
 //BA.debugLineNum = 8912897;BA.debugLine="Return id_";
if (true) return __ref._id_ /*int*/ ;
RDebugUtils.currentLine=8912898;
 //BA.debugLineNum = 8912898;BA.debugLine="End Sub";
return 0;
}
public String  _getname(b4j.example.item __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="item";
if (Debug.shouldDelegate(ba, "getname", false))
	 {return ((String) Debug.delegate(ba, "getname", null));}
RDebugUtils.currentLine=8978432;
 //BA.debugLineNum = 8978432;BA.debugLine="Public Sub GetName() As String";
RDebugUtils.currentLine=8978433;
 //BA.debugLineNum = 8978433;BA.debugLine="Return name_";
if (true) return __ref._name_ /*String*/ ;
RDebugUtils.currentLine=8978434;
 //BA.debugLineNum = 8978434;BA.debugLine="End Sub";
return "";
}
public String  _getprice(b4j.example.item __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="item";
if (Debug.shouldDelegate(ba, "getprice", false))
	 {return ((String) Debug.delegate(ba, "getprice", null));}
RDebugUtils.currentLine=9043968;
 //BA.debugLineNum = 9043968;BA.debugLine="Public Sub GetPrice() As String";
RDebugUtils.currentLine=9043969;
 //BA.debugLineNum = 9043969;BA.debugLine="Return price_";
if (true) return BA.NumberToString(__ref._price_ /*double*/ );
RDebugUtils.currentLine=9043970;
 //BA.debugLineNum = 9043970;BA.debugLine="End Sub";
return "";
}
public String  _initialize(b4j.example.item __ref,anywheresoftware.b4a.BA _ba,int _id,String _name,double _price) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="item";
if (Debug.shouldDelegate(ba, "initialize", false))
	 {return ((String) Debug.delegate(ba, "initialize", new Object[] {_ba,_id,_name,_price}));}
RDebugUtils.currentLine=8847360;
 //BA.debugLineNum = 8847360;BA.debugLine="Public Sub Initialize(id As Int, name As String, p";
RDebugUtils.currentLine=8847361;
 //BA.debugLineNum = 8847361;BA.debugLine="If( Not ( id = Null And name = Null And price = N";
if ((__c.Not(_id==(double)(BA.ObjectToNumber(__c.Null)) && _name== null && _price==(double)(BA.ObjectToNumber(__c.Null))))) { 
RDebugUtils.currentLine=8847362;
 //BA.debugLineNum = 8847362;BA.debugLine="id_ = id";
__ref._id_ /*int*/  = _id;
RDebugUtils.currentLine=8847363;
 //BA.debugLineNum = 8847363;BA.debugLine="name_ = name";
__ref._name_ /*String*/  = _name;
RDebugUtils.currentLine=8847364;
 //BA.debugLineNum = 8847364;BA.debugLine="price_ = price";
__ref._price_ /*double*/  = _price;
 }else {
RDebugUtils.currentLine=8847366;
 //BA.debugLineNum = 8847366;BA.debugLine="id_ = 0";
__ref._id_ /*int*/  = (int) (0);
RDebugUtils.currentLine=8847367;
 //BA.debugLineNum = 8847367;BA.debugLine="name_ = \"\"";
__ref._name_ /*String*/  = "";
RDebugUtils.currentLine=8847368;
 //BA.debugLineNum = 8847368;BA.debugLine="price_ = 0.0";
__ref._price_ /*double*/  = 0.0;
 };
RDebugUtils.currentLine=8847370;
 //BA.debugLineNum = 8847370;BA.debugLine="End Sub";
return "";
}
}