B4J=true
Group=Default Group
ModulesStructureVersion=1
Type=Class
Version=9.3
@EndOfDesignText@
Sub Class_Globals
	Private fx As JFX
	Private xui As XUI
	Private database As DatabaseService
End Sub

'Initializes the object. You can add parameters to this method if needed.
Public Sub Initialize
	database.Initialize
End Sub

Public Sub RegisterUser( id As String, firstname As String, lastname As String, email As String, gender As String, cell As String, addr As String, password As String, role_id As Byte) As Boolean
	
	Dim success As Boolean = False
	
	Try
		If database.IsConnected = True Then
			database.sql.ExecNonQuery2("INSERT INTO users VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)", Array As Object(id, firstname, lastname, email, gender, cell, addr, password, role_id))
			success = True
		End If
	Catch
		Main.log.write(LastException.Message)
		xui.MsgboxAsync(LastException, "Exception")
	End Try
	database.Disconnect
	
	Return success
End Sub

' Allows the system admin register a tag and assign values to it
Public Sub RegisterTag(tagID As String)
	
End Sub

