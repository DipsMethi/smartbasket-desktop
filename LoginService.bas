B4J=true
Group=Default Group
ModulesStructureVersion=1
Type=Class
Version=9.3
@EndOfDesignText@
Sub Class_Globals
	Private fx As JFX
	Private xui As XUI
	
	Private dbService As DatabaseService
	Public userDetails As JdbcResultSet
End Sub

'Initializes the object. You can add parameters to this method if needed.
Public Sub Initialize
	dbService.Initialize
End Sub

Public Sub Login(username As String, password As String) As Boolean
	Dim userExist As Boolean = False
	
	Try
		If ( dbService.sql.IsInitialized = True) Then
			userDetails = dbService.sql.ExecQuery($"SELECT * FROM users WHERE email='${username}' AND password='${password}'"$)
			If (userDetails.NextRow = True) Then
				userExist = True
			End If
		End If
	Catch
		Main.log.write(LastException.Message)
		xui.MsgboxAsync($"Exception: ${LastException}"$, "Exception")
	End Try
	dbService.Disconnect
	
	Return userExist
	
End Sub

Public Sub Logout() As Boolean
	Dim session_active As Boolean = False
	
	Try
		If (dbService.IsInitialized) Then
			dbService.Disconnect
			session_active = False
		Else
			session_active = True
			Main.log.write("Exception: System logout unsuccessful" & CRLF & "Please contact helpdesk")
			xui.MsgboxAsync("Exception: System logout unsuccessful" & CRLF & "Please contact helpdesk", "Exception")
		End If
	Catch
		Main.log.write(LastException.Message)
		xui.MsgboxAsync(LastException.Message,"Exception")
	End Try
	
	Return session_active
End Sub