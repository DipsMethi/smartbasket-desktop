B4J=true
Group=Default Group
ModulesStructureVersion=1
Type=Class
Version=9.3
@EndOfDesignText@
Sub Class_Globals
	Private fx As JFX
	Public sql As JdbcSQL
	Private xui As XUI
End Sub

'Initializes the object. You can add parameters to this method if needed.
Public Sub Initialize
	
	Try
		' Connect to database
		sql.Initialize2("com.mysql.cj.jdbc.Driver", "jdbc:mysql://127.0.0.1:3306/smartbasket_db", "root", "")
	Catch
		Main.log.write("[" & LoginForm.lgService.userDetails.GetString2(0) & "] " & "Exception: " & LastException.Message)
		xui.MsgboxAsync(LastException, "Exception")
	End Try
	
End Sub

Public Sub IsConnected As Boolean
	If sql.IsInitialized = True Then
		Return True
	Else
		Return False
	End If
End Sub

Public Sub Disconnect
	sql = Null
End Sub

' Returns every column in table:table if colIndex < 0
' Else it returns the indexed column
Public Sub GetAll(table As String, colIndex As Int) As JdbcResultSet
	Dim result As JdbcResultSet = Null
	 
	Try
		If (sql.IsInitialized = True) Then
			If( colIndex < 0 ) Then
				result = sql.ExecQuery($"SELECT DISTINCT id FROM ${table}"$)
			End If
		End If
	Catch
		Main.log.write("[" & LoginForm.lgService.userDetails.GetString2(0) & "] " & LastException.Message)
		xui.MsgboxAsync(LastException, "Exception")
	End Try

	Return result
End Sub

Public Sub GetPurchaseDetails(table As String, id As String) As JdbcResultSet
	Dim result As JdbcResultSet = Null
	
	Try
		If(sql.IsInitialized = True) Then
			result = sql.ExecQuery($"SELECT * FROM ${table} WHERE id = ${id}"$)
		End If
	Catch
		Main.log.write("[" & LoginForm.lgService.userDetails.GetString2(0) & "] " & LastException.Message)
		xui.MsgboxAsync($"Exception: ${LastException}"$, "Exception")
	End Try
	
	Return result
End Sub

Public Sub GetRoles() As JdbcResultSet
	Dim result As JdbcResultSet = Null
	
	Try
		If (sql.IsInitialized = True) Then
			result = sql.ExecQuery($"SELECT * FROM roles"$)
		End If
	Catch
		Main.log.write("[" & LoginForm.lgService.userDetails.GetString2(0) & "] " & LastException.Message)
		xui.MsgboxAsync($"Exception: ${LastException}"$, "Exception")
	End Try
	
	Return result
End Sub

Public Sub DeleteUser(uid As String) As Boolean
	Dim flag As Boolean = False
	Try
		If(sql.IsInitialized) Then
			sql.ExecNonQuery($"DELETE FROM users WHERE id = ${uid}"$)
				flag = True
		Else
				flag = False
		End If
	Catch
		Main.log.write("[" & LoginForm.lgService.userDetails.GetString2(0) & "] " & LastException.Message)
		xui.MsgboxAsync($"Exception: ${LastException}"$, "Exception")
	End Try
	
	Return flag
End Sub