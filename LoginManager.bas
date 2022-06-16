B4J=true
Group=Default Group
ModulesStructureVersion=1
Type=Class
Version=9.3
@EndOfDesignText@
Sub Class_Globals
	Private fx As JFX
	Private xui As XUI
	Private dbManager As DatabaseManager
	
	Public userDetails As JdbcResultSet
End Sub

'Initializes the object. You can add parameters to this method if needed.
Public Sub Initialize
	dbManager.Initialize
End Sub

Public Sub Login(username As String, password As String) As Boolean
	Dim userExist As Boolean = False
	
	Try
		If ( dbManager.sql.IsInitialized = True) Then
			userDetails = dbManager.sql.ExecQuery($"SELECT * FROM users WHERE email='${username}' AND password='${password}'"$)
			If (userDetails.NextRow = True) Then
				userExist = True
			End If
		End If
	Catch
		Log(LastException)
		xui.MsgboxAsync($"Exception: ${LastException}"$, "Exception")
	End Try
	dbManager.Disconnect
	
	Return userExist
End Sub

Public Sub Logout() As Boolean
	Dim session_active As Boolean = False
	
	Try
		If (dbManager.IsInitialized) Then
			dbManager.Disconnect
			session_active = False
		Else
			session_active = True
			xui.MsgboxAsync("Exception: System logout unsuccessful" & CRLF & "Please contact helpdesk", "Exception")
		End If
	Catch
		Log(LastException)
	End Try
	
	Return session_active
End Sub