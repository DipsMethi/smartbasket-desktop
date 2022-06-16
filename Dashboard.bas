B4J=true
Group=Default Group
ModulesStructureVersion=1
Type=StaticCode
Version=9.3
@EndOfDesignText@
'Static code module
Sub Process_Globals
	Private fx As JFX
	Private frmDashboard As Form
	Private xui As XUI
	Private btnLogout As Button
	Private lblDirective As Label
	
End Sub

Public Sub Show
	
	If (frmDashboard.IsInitialized = False) Then
		frmDashboard.Initialize("dashboard", 1536, 770)
		frmDashboard.RootPane.LoadLayout("Dashboard")
	End If	
	
	lblDirective.Text = $"Hello ${LoginForm.lgService.userDetails.GetString2( 1 ) & _
				 			" " & LoginForm.lgService.userDetails.GetString2( 2 ) }, this is your dashboard"$
	' Show dashboard
	frmDashboard.Show
	
End Sub

Public Sub Close
	frmDashboard.Close
End Sub

Private Sub btnUsers_Click
	CustomerView.Show
End Sub

Private Sub btnLogout_Click
	' Destroy login session
	' Close dashboard
	' Show login form
	Try
		If(LoginForm.lgService.IsInitialized) Then
			' Attempt logout
			If(LoginForm.lgService.Logout = False) Then
				' Close dashboard
				Close
				' Show login form
				LoginForm.Show
			End If
		End If	
	Catch
		Main.log.write(LastException.Message)
		xui.MsgboxAsync(LastException.Message, "Exception")
	End Try
End Sub