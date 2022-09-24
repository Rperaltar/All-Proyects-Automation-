Imports Microsoft.VisualBasic

Public Class Example

    Private _count As Integer

    Public Property Number() As Integer
        Get
            Return _count
        End Get
        Set(ByVal value As Integer)
            _count = value
        End Set
    End Property

    Sub Main()
        Dim item As Example = New Example()

        ' Step 1: set property.
        item.Number = 4

        ' Step 2: get property.
        Console.WriteLine("NUMBER: {0}", item.Number)
    End Sub

End Class
