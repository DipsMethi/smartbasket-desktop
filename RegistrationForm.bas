B4J=true
Group=Default Group
ModulesStructureVersion=1
Type=StaticCode
Version=9.3
@EndOfDesignText@

'Static code module
Sub Process_Globals
	
	' Forms and UI
	Private fx As JFX
	Private ui As XUI
	Private frmRegistration As Form 
	' Textfields
	Private txtID As TextField
	Private txtFirstname As TextField
	Private txtLastname As TextField
	Private txtEmail As TextField
	Private txtCell As TextField
	Private txtAddress As TextField
	Private txtPassword As TextField
	' Combobox
	Private cbGender As ComboBox
	Private cbRole As ComboBox
	Private tbShow As ToggleButton 
	' Services
	Private regService As RegistrationService
	Private dbService As DatabaseService
	
End Sub

Public Sub Show
	
	If frmRegistration.IsInitialized = False Then
		frmRegistration.Initialize("frmFegistration", 600, 600)
		frmRegistration.RootPane.LoadLayout("RegistrationForm")
	End If
	' Init DatabaseService
	dbService.Initialize
	' Add gender items to gender ombobox
	cbGender.Items.AddAll( Array As String("Male", "Female") )
	' Clear registration form
	ClearForm
	' Add roles to role combobox
	AddRoles
	' Show registration form
	frmRegistration.Show
	
End Sub

Public Sub Close
	frmRegistration.Close
End Sub

Private Sub btnRegister_Click
	
	Dim strID As String = txtID.Text.As(String)
	Dim strFirstname As String = txtFirstname.Text.As(String)
	Dim strLastname As String = txtLastname.Text.As(String)
	Dim strGender As String = cbGender.Value.As(String)
	Dim strEmail As String = txtEmail.Text.As(String)
	Dim strCell As String = txtCell.Text.As(String)
	Dim strAddr As String = txtAddress.Text.As(String)
	Dim strPassword As String = txtPassword.Text.As(String)
	Dim bytRoleID As Byte = cbRole.SelectedIndex.As(Byte)
	
	Try
		' Initialize registration manager
		regService.Initialize
		' Insert user details in database
		Dim registerSuccess As Boolean = regService.RegisterUser(strID, strFirstname, strLastname, strEmail, strGender, strCell, strAddr, strPassword, bytRoleID)
		' Check if user's details were successfully recorded
		If(registerSuccess = True) Then
			ui.MsgboxAsync("Registration successful", "Success")
			Main.log.write("[" & LoginForm.lgService.userDetails.GetString2(0) & "] Registration successful")
			ClearForm
			Close
		Else
			ui.MsgboxAsync($"System could not register ${strFirstname} "$ & CRLF & " Kindly contact help desk.", "Hold on!") ' Make it a message box with response buttons
		End If
	Catch
		Main.log.write("[" & LoginForm.lgService.userDetails.GetString2(0) & "] " & LastException.Message)
		ui.MsgboxAsync($"Exception: ${LastException.Message}"$, "Exception")
	End Try
		
End Sub

Private Sub btnClear_Click
	' Reset all form inputs to initial values
	ClearForm
End Sub

Private Sub ClearForm
	txtID.Text = ""
	txtFirstname.Text = ""
	txtLastname.Text = ""
	txtEmail.Text = ""
	txtCell.Text = ""
	txtAddress.Text = ""
	txtPassword.Text = ""
	
	cbGender.SelectedIndex = 0
End Sub

Private Sub tbShow_SelectedChange(Selected As Boolean)
		
End Sub

Private Sub AddRoles
	
	Dim records As JdbcResultSet = dbService.GetRoles
	
	Do While records.NextRow
		cbRole.Items.Add(records.GetString("type"))
	Loop
	cbRole.SelectedIndex = 0
End Sub