B4J=true
Group=Default Group
ModulesStructureVersion=1
Type=Class
Version=9.3
@EndOfDesignText@
Sub Class_Globals
	Private fx As JFX
	
	Private id_ As Int
	Private name_ As String
	Private price_ As Double
	
End Sub

'Initializes the object. You can add parameters to this method if needed.
Public Sub Initialize(id As Int, name As String, price As Double)
	If( Not ( id = Null And name = Null And price = Null) ) Then
		id_ = id
		name_ = name
		price_ = price
	Else
		id_ = 0
		name_ = ""
		price_ = 0.0
	End If
End Sub

Public Sub GetID() As Int
	Return id_
End Sub
Public Sub GetName() As String
	Return name_
End Sub
Public Sub GetPrice() As String
	Return price_
End Sub