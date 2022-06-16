B4J=true
Group=Default Group
ModulesStructureVersion=1
Type=StaticCode
Version=9.3
@EndOfDesignText@
#Region Project Attributes 
#End Region
'Static code module
Sub Process_Globals
	
	Private fx As JFX
	Private frmLogin As Form
	Private txtUsername As TextField
	Private txtPassword As TextField
	Public username As String
	
	Public lgService As LoginService
	Private xui As XUI
	
End Sub

Public Sub Show
	If frmLogin.IsInitialized = False Then
		frmLogin.Initialize("LoginForm", 600, 600)
		frmLogin.RootPane.LoadLayout("LoginForm")	
	End If
	' Init logger
	Main.Log.Initialize
	' Show login form
	frmLogin.Show
End Sub

Public Sub Close
	
	frmLogin.Close
	
End Sub

Private Sub btnLogin_Click
	
	Dim username As String = txtUsername.Text
	Dim password As String = txtPassword.Text
	
	Try
		' Initialise LoginManager
		lgService.Initialize
		' Check if credentials are entered
		If(username.Length < 1 And password.Length < 1) Then
			xui.MsgboxAsync("Please enter username and/password", "Please enter credentials")
			Main.log.write("Please enter username and/password")
		Else
			' Attempt login
			If( lgService.Login( username, password ) ) Then
				' Close login form
				Close
				' Show dashboard form
				Dashboard.Show
			Else
				' User does not exist
				xui.MsgboxAsync("Incorrect username and/ password"& CRLF &"Please varify your credentials", "Information")
				Main.log.write("Incorrect username and/ password"& CRLF &"Please varify your credentials")
			End If
		End If
		
	Catch
		'Log(LastException)
		xui.MsgboxAsync(LastException.Message, "Exception")
		Main.log.write("[" & lgService.userDetails.GetString2(0) & "]" & LastException.Message)
	End Try
	
End Sub

Private Sub lblRegister_MouseClicked (EventData As MouseEvent)
	If(EventData.PrimaryButtonPressed = True) Then
		RegistrationForm.Show
	End If
End Sub

Private Sub btnClear_Click
	clearForm
End Sub

Private Sub clearForm
	txtUsername.Text = ""
	txtPassword.Text = ""
End Sub