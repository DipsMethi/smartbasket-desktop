B4J=true
Group=Default Group
ModulesStructureVersion=1
Type=Class
Version=9.3
@EndOfDesignText@
Sub Class_Globals
	Private fx As JFX
	
	Private ID_ As String
	Private name_ As String
	Private surname_ As String
	Private email_ As String
	Private gender_ As String
	Private cell_ As String
	Private addr_ As String
	Private password_ As String
	Private roleID_ As Byte
	
End Sub

'Initializes the object. You can add parameters to this method if needed.
Public Sub Initialize(id As String, firstname As String, lastname As String	_
						, email As String, gender As String, cell As String _
						, addr As String, password As String, roleID As Byte)
	id = ID_
	name_ = firstname
	surname_ = lastname
	email_ = email
	gender_ = gender
	cell_ = cell
	addr_ = addr
	password_ = password
	roleID_ = roleID
	
End Sub

Sub GetID() As String 
	Return ID_ 
End Sub
Sub GetName() As String 
	Return name_ 
End Sub
Sub GetLastname() As String 
	Return surname_ 
End Sub
Sub GetEmail() As String 
	Return email_
End Sub
Sub GetGender() As String
	Return gender_ 
End Sub
Sub GetCellNo() As String
	Return cell_ 
End Sub
Sub GetAddr() As String 
	Return addr_
End Sub
Sub GetPassword() As String 
	Return password_
End Sub
Sub GetRoleID() As Byte 
	Return roleID_
End Sub

Public Sub Create()
	
End Sub
Public Sub Get()
	
End Sub
Public Sub Update()
	
End Sub
Public Sub Delete()
	
End Sub