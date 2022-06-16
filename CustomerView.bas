B4J=true
Group=Default Group
ModulesStructureVersion=1
Type=StaticCode
Version=9.3
@EndOfDesignText@
'Static code module
Sub Process_Globals
	Private fx As JFX
	Private xui As XUI
	Private frmCustomerView As Form
	Private lstCustomers As ListView
	Private tblViewExpenditure As TableView
	Private btnSuspend As Button
	Private btnDelete As Button
	Private selectedIndex As Int = 0
	
	Private dbManager As DatabaseService		
	Private customerRecords As JdbcResultSet

End Sub

Public Sub Show
	If frmCustomerView.IsInitialized = False Then
		frmCustomerView.Initialize("frmCustomerView", 800, 600)
		frmCustomerView.RootPane.LoadLayout("CustomerView")
	End If
	
	' Add customer ids
	AddCustomerID
	'Add column headings
	AddColumnHeadings
	' Add customer details
	AddCustDetailsToTable
	'Show customer view
	frmCustomerView.Show
End Sub

Public Sub Close
	frmCustomerView.Close
End Sub

Private Sub btnSuspend_Click
	dbManager.Initialize
	If(dbManager.DeleteUser(lstCustomers.Items.Get(selectedIndex))) Then
		xui.MsgboxAsync("User deleted", "Success")
	Else
		xui.MsgboxAsync("Could not delete user", "Fail")
	End If
End Sub

Private Sub lstCustomers_SelectedIndexChanged(index As Int)
	
	selectedIndex = index
	AddCustDetailsToTable
	
End Sub

Private Sub AddCustomerID
	
	Try
		' Init database manager
		dbManager.Initialize
		' Get all records in customers table
		customerRecords = dbManager.GetAll("customers", -1) ' get all IDs from users table
		' Clear list
		lstCustomers.Items.Clear
		' Add customer id
		Do While customerRecords.NextRow
			lstCustomers.Items.Add(customerRecords.GetString("id").As(String))
		Loop		
	Catch
		Main.log.write(LastException.Message)
		xui.MsgboxAsync($"Exception: ${LastException}"$, "Exception")
	
	End Try
	dbManager.Disconnect
	
End Sub

Private Sub AddCustDetailsToTable
	
	Try
		' Init database manager
		dbManager.Initialize
		' Get all records associated with customer id
		customerRecords = dbManager.GetPurchaseDetails( "customers", lstCustomers.Items.Get( selectedIndex) )
		' Clear table
		tblViewExpenditure.Items.Clear
		' Set customer purchase info
		Do While customerRecords.NextRow		
			
			Dim strID As String = customerRecords.GetString2( 0 )
			Dim strDateTime As String =  LongToDate(customerRecords.GetLong2( 1 ) )
			Dim strEndTime As String = LongToDate(customerRecords.GetLong2( 2 ) )
			Dim strTotalAmt As String = customerRecords.GetString2( 3 )
			
			tblViewExpenditure.Items.Add( Array As String( strID, strDateTime, strEndTime, strTotalAmt ) )
		Loop			
	Catch
		Main.log.write("[" & LoginForm.lgService.userDetails.GetString2(0) & "] " & LastException.Message)
		xui.MsgboxAsync($"Exception: ${LastException}"$, "Exception")
	End Try
	dbManager.Disconnect
	
End Sub

Private Sub AddColumnHeadings
	
	Try
		' Init database manager
		dbManager.Initialize
		' Get all records associated with customer id
		customerRecords = dbManager.GetPurchaseDetails( "customers", lstCustomers.Items.Get(selectedIndex) )
		
		' Set column headers
		For n = 0 To customerRecords.ColumnCount - 2
			Dim colName As String = customerRecords.GetColumnName( n )
			tblViewExpenditure.SetColumnHeader( n , colName )
		Next
			
	Catch
		Main.log.write("[UID:" & LoginForm.lgService.userDetails.GetString2( 0 ) & "] " & LastException.Message)
		xui.MsgboxAsync( LastException.Message, "Exception" )
	End Try
	dbManager.Disconnect
	
End Sub

Private Sub LongToDate(ld As Long) As String
	
	DateTime.DateFormat = "yyyy/MM/dd"
	DateTime.TimeFormat = "HH:mm:ss"
	Dim str_date_up As String = DateTime.Date( ld ) & " " & DateTime.Time( ld )
	Return str_date_up
	
End Sub