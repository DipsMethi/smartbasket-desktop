B4J=true
Group=Default Group
ModulesStructureVersion=1
Type=Class
Version=9.3
@EndOfDesignText@
Sub Class_Globals
	
	Private fx As JFX
	
End Sub

'Initializes the object. You can add parameters to this method if needed.
Public Sub Initialize
		
End Sub

Public Sub write(message As String)
	
	Dim now As Long = DateTime.Now
	
	DateTime.DateFormat = "dd/MM/yyyy"
	DateTime.TimeFormat = "HH:mm:ss"
	
	Dim dir As String = File.DirApp
	Dim fileName As String = "log.txt"
	
	Dim err As String = DateTime.Time(now) & " " & DateTime.Date(now) & " - " & message & CRLF _
					&  "----------------------------------------------------------------------" _
					& "--------------------------------------------------------------" & CRLF
	Try
		If ( Not ( File.Exists(dir, fileName) ) ) Then
			File.WriteString(dir, fileName, err)
		Else
			Dim out As OutputStream = File.OpenOutput(dir, fileName, True)
			Dim b() As Byte = err.GetBytes("utf8") 
			out.WriteBytes(b, 0, b.Length)
			out.Close
		End If
	Catch
		write(LastException.Message)
		'Log(LastException)
	End Try
	
	
End Sub